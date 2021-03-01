package Model.eslint_security;

public class Messages {

    public Messages() {
        this.ruleId = "";
        this.fatal = false;
        this.severity = 0;
        this.message = "";
        this.line = 0;
        this.column = 0;
    }

    private String ruleId;
    private boolean fatal;
    private int severity;
    private String message;
    private int line;
    private int column;

    public String getRuleId() {
        return ruleId;
    }

    public boolean isFatal() {
        return fatal;
    }

    public int getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
