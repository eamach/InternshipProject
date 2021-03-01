package Model.FindSecBugs;

import javax.management.Attribute;

import org.xml.sax.Attributes;

public class SourceLine {

    private String classname;
    private String startLine;
    private String endLine;
    private String sourceFile;

    public SourceLine() {
        this.classname = "";
        this.startLine = "";
        this.endLine = "";
        this.sourceFile = "";
    }

    /** the name of the class where the bug was found **/
    public String getClassname() {
        return classname;
    }

    public String getStartLine() {
        return startLine;
    }

    public String getEndLine() {
        return endLine;
    }

    /** the location of the file where the bug was found **/
    public String getSourceFile() {
        return sourceFile;
    }


    public boolean addAttributes(Attributes attr) {
        if(attr != null) {
            for (int i = 0; i < attr.getLength(); i++) {
                switch (attr.getQName(i)) {
                    case "classname":
                        this.classname = attr.getValue(i);
                        break;
                    case "start":
                        this.startLine = attr.getValue(i);
                        break;
                    case "end":
                        this.endLine = attr.getValue(i);
                        break;
                    case "sourcefile":
                        this.sourceFile = attr.getValue(i);
                        break;
                    default:
                        break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SourceLine)) return false;

        SourceLine that = (SourceLine) o;

        if (!getClassname().equals(that.getClassname())) return false;
        if (!getStartLine().equals(that.getStartLine())) return false;
        if (!getEndLine().equals(that.getEndLine())) return false;
        return getSourceFile().equals(that.getSourceFile());
    }

    @Override
    public int hashCode() {
        int result = getClassname().hashCode();
        result = 31 * result + getStartLine().hashCode();
        result = 31 * result + getEndLine().hashCode();
        result = 31 * result + getSourceFile().hashCode();
        return result;
    }
}
