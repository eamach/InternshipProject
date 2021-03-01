package Model.phpcs_security_audit;

import java.util.HashMap;
import java.util.Map;

public class Report {

    private Totals totals;
    private Map<String, Vulnerability> files;

    public Report() {
        this.totals = new Totals();
        this.files = new HashMap<>();
    }

    public Totals getTotals() {
        return totals;
    }

    public Map<String, Vulnerability> getFiles() {
        return files;
    }
}
