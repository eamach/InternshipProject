package Parsers;

import Model.FindSecBugs.BugCollection;
import Model.FindSecBugs.BugHandler;
import Model.FindSecBugs.BugInstance;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;
import java.util.List;

public class FindSecBugsXMLParser {

    public BugHandler XMLParser(String filename) {
        try {
            BugHandler bh = new BugHandler();
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(filename, bh);
            return bh;
        } catch (Exception e) {
            System.out.println("AN ERROR OCCURRED DURING XML PARSING");
        }
        return null;
    }

    public String XMLtoGitlabComment(BugHandler bh) {
        StringBuilder report = new StringBuilder("# Vulnerability Report do Commit\n\n\n\n");
        if (bh != null) {
            BugCollection bc = bh.getBc();
            List<BugInstance> bil = bc.getBugList();
            report.append("**Número de Vulnerabilidades encontradas:** " + bil.size() + "\n\n\n\n");
            for (BugInstance bi : bil) {
                report.append(":warning: **" + bi.getType() + "**\n\n\n\n");
                report.append("- Descrição da vulnerabilidade : " + bi.getAbbrev() + "\n\n");
                report.append("- Prioridade : " + bi.getPriority() + "\n\n");
                report.append("- Scanner : FindSecBugs" + "\n\n");
                report.append("- Ficheiro afetado : " + bi.getSourceLine().getSourceFile() + "\n\n");
                if (!bi.getSourceLine().getStartLine().equals(bi.getSourceLine().getEndLine())) {
                    report.append("- Linha : " + bi.getSourceLine().getStartLine() + " a " + bi.getSourceLine().getEndLine() + "\n\n");
                } else {
                    report.append("- Linha : " + bi.getSourceLine().getStartLine() + "\n\n");
                }
            }
        }
        return report.toString();
    }
}
