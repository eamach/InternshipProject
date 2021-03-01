package Model.FindSecBugs;

import org.xml.sax.Attributes;

public class BugInstance {

    private String type;
    private String priority;
    private String rank;
    private String abbrev;
    private String category;
    private SourceLine sourceLine;

    /** prioridades **/

    private static final String BAIXA = "Baixa";
    private static final String MEDIA = "Media";
    private static final String ALTA = "Alta";

    /** atributos **/

    private static final String TYPE = "type";
    private static final String PRIORITY = "priority";
    private static final String RANK = "rank";
    private static final String ABBREV = "abbrev";
    private static final String CATEGORY = "category";

    /**
     * a bug instance is an object that contains all the info about a bug
     **/

    public BugInstance() {
        this.type = "";
        this.priority = "";
        this.rank = "";
        this.abbrev = "";
        this.category = "";
        this.sourceLine = new SourceLine();
    }

    /**
     * the type/description of the vulnerability
     **/
    public String getType() {
        return type;
    }

    /**
     * low - 1
     * medium - 2
     * high - 3
     */

    public String getPriority() {
        return priority;
    }

    /**
     * how scary is a bug
     **/

    public String getRank() {
        return rank;
    }

    /**
     * bug abbreviation
     **/

    public String getAbbrev() {
        return abbrev;
    }

    /**
     * type of bug
     **/

    public String getCategory() {
        return category;
    }

    /**
     * details about the line where the bug was found
     **/

    public SourceLine getSourceLine() {
        return sourceLine;
    }

    public boolean addBugInstanceAttributes(Attributes attr) {
        if(attr != null) {
            for (int i = 0; i < attr.getLength(); i++) {
                switch (attr.getQName(i)) {
                    case TYPE:
                        this.type = attr.getValue(i);
                        break;
                    case PRIORITY:
                        switch (attr.getValue(i)) {
                            case "1":
                                this.priority = BAIXA;
                                break;
                            case "2":
                                this.priority = MEDIA;
                                break;
                            case "3":
                                this.priority = ALTA;
                                break;
                            default:
                                break;
                        }
                        break;
                    case RANK:
                        this.rank = attr.getValue(i);
                        break;
                    case ABBREV:
                        this.abbrev = attr.getValue(i);
                        break;
                    case CATEGORY:
                        this.category = attr.getValue(i);
                        break;
                    default:
                        break;
                }
            }
            return true;
        }
        return false;
    }

    public void setSourceLine(SourceLine sourceLine) {
        this.sourceLine = sourceLine;
    }
}
