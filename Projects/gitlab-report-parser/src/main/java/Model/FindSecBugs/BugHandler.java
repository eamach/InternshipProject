package Model.FindSecBugs;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BugHandler extends DefaultHandler {

    private static final String BugInstance = "BugInstance";
    private static final String SourceLine = "SourceLine";
    private static final String Method = "Method";

    private BugCollection bc;
    private BugInstance bi;
    private SourceLine sl;

    public BugHandler() {
        bc = new BugCollection();
        bi = new BugInstance();
        sl = new SourceLine();
    }

    /** flag for the proper sourceline - the one which has the source line for the file which has the vulnerability **/

    private static boolean flag = false;

    @Override
    public void startDocument() throws SAXException {
        bc = new BugCollection();
    }

    @Override
    public void startElement(String uri, String lName, String qName, Attributes attr) throws SAXException {
        switch (qName) {
            case BugInstance:
                bi = new BugInstance();
                bi.addBugInstanceAttributes(attr);
                bc.addToBugList(bi);
                break;
            case SourceLine:
                if (flag) {
                    sl = new SourceLine();
                    sl.addAttributes(attr);
                    bi.setSourceLine(sl);
                    flag = !flag;
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case Method:
                flag = true;
                break;
            default:
                break;
        }
    }

    /** returns the collection of bugs found **/

    public BugCollection getBc() {
        return bc;
    }
}
