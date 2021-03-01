package Model.GitlabAutoSAST;

import java.util.List;

/**
 * DEPRECATED
 **/

public class Report {
    private String version;
    private List<Vulnerability> vulnerabilities;
    private List<String> remediations; //how's this?

    public Report(String version, List<Vulnerability> vulnerabilities, List<String> remediations) {
        this.version = version;
        this.vulnerabilities = vulnerabilities;
        this.remediations = remediations;
    }

    public String getVersion() {
        return version;
    }

    public List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    public List<String> getRemediations() {
        return remediations;
    }
}
