package Model.phpcs_security_audit;

public class Totals {

    private int errors;
    private int warnings;
    private int fixable;

    public Totals() {
        this.errors = 0;
        this.warnings = 0;
        this.fixable = 0;
    }

    public int getErrors() {
        return errors;
    }

    public int getWarnings() {
        return warnings;
    }

    public int getFixable() {
        return fixable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Totals)) return false;

        Totals totals = (Totals) o;

        if (getErrors() != totals.getErrors()) return false;
        if (getWarnings() != totals.getWarnings()) return false;
        return getFixable() == totals.getFixable();
    }

    @Override
    public int hashCode() {
        int result = getErrors();
        result = 31 * result + getWarnings();
        result = 31 * result + getFixable();
        return result;
    }
}
