package Model.phpcs_security_audit;

public class Messages {

    private String message;
    private String source;
    private int severity;
    private boolean fixable;
    private String type;
    private int line;
    private int column;

    public Messages() {
        this.message = "";
        this.source = "";
        this.severity = 0;
        this.fixable = false;
        this.type = "";
        this.line = 0;
        this.column = 0;
    }

    public String getMessage() {
        return message;
    }

    public String getSource() {
        return source;
    }

    public int getSeverity() {
        return severity;
    }

    public boolean isFixable() {
        return fixable;
    }

    public String getType() {
        return type;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
