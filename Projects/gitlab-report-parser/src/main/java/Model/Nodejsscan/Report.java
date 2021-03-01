package Model.Nodejsscan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Report {

    private List<String> errors;
    private Map<String, Vulnerability> nodejs;
    private Templates templates; //should be always empty

    public Report() {
        this.errors = new ArrayList<>();
        this.nodejs = new HashMap<>();
        this.templates = new Templates();
    }

    public Map<String, Vulnerability> getNodejs() {
        return nodejs;
    }
}
