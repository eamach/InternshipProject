import Model.FindSecBugs.BugHandler;
import Parsers.*;
import Utils.Encoder;
import Requests.RequestSender;
import Requests.RequestURLCreator;

public class main {
    public static void main(String[] args) {
        if (args != null && args.length == 0) {
            System.out.println("No args supplied.\nAvailable args:\n-java : Execute a parser for the FindSecBugsParser for Java Security Analysis");
            System.exit(1);
        }
        if (args.length != 2) {
            System.out.print("Invalid number of args supplied");
            System.exit(1);
        }

        Encoder UE = new Encoder();
        String encodedComment = "";

        if (args[0].equals("-java")) {
            FindSecBugsXMLParser xp = new FindSecBugsXMLParser();
            BugHandler bh = xp.XMLParser(args[1]);
            String comment = xp.XMLtoGitlabComment(bh);
            /* gitlab needs contents to be url encoded */
            encodedComment = UE.encodeValue(comment);
        } else if (args[0].equals("-php")) {
            Phpcs_Security_AuditParser psa = new Phpcs_Security_AuditParser();
            String comment = psa.PHPCS_Security_Audit_ReportToJson(args[1]);
            /* gitlab needs contents to be url encoded */
            encodedComment = UE.encodeValue(comment);
        } else if (args[0].equals("-js")) {
            EslintSecurityParser esp = new EslintSecurityParser();
            String comment = esp.EslintSecurity_ReportToJson(args[1]);
            /* gitlab needs contents to be url encoded */
            encodedComment = UE.encodeValue(comment);
        } else if (args[0].equals("-node")) {
            NodeParser np = new NodeParser();
            String comment = np.Nodejsscan_ReportToJson(args[1]);
            /* gitlab needs contents to be url encoded */
            encodedComment = UE.encodeValue(comment);
        } else {
            System.out.print("Invalid arg " + args[0]);
            System.exit(1);
        }

        /**DEPRECATED **/
        /* parse the artifact to a human readable form */
        //GitlabAutoSASTReportParser RP = new GitlabAutoSASTReportParser();
        //String gitlab_comment = RP.SASTReportToJson(response);


        /* build the post url */
        RequestURLCreator ruc = new RequestURLCreator();
        String urltopostcomment = ruc.buildPostRequestCommentUrl();

        /* post it! */
        RequestSender r = new RequestSender();
        r.sendPost(urltopostcomment, "note=" + encodedComment);
    }
}
