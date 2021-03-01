package Model.Nodejsscan;

public class Metadata {
    private String cwe;
    private String description;
    private String owasp;
    private String severity;

    public Metadata() {
        this.cwe = "";
        this.description = "";
        this.owasp = "";
        this.severity = "";
    }

    public String getCwe() {
        return cwe;
    }

    public String getDescription() {
        return description;
    }

    public String getOwasp() {
        return owasp;
    }

    public String getSeverity() {
        return severity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Metadata)) return false;

        Metadata metadata = (Metadata) o;

        if (getCwe() != null ? !getCwe().equals(metadata.getCwe()) : metadata.getCwe() != null) return false;
        if (getDescription() != null ? !getDescription().equals(metadata.getDescription()) : metadata.getDescription() != null)
            return false;
        if (getOwasp() != null ? !getOwasp().equals(metadata.getOwasp()) : metadata.getOwasp() != null) return false;
        return getSeverity() != null ? getSeverity().equals(metadata.getSeverity()) : metadata.getSeverity() == null;
    }

    @Override
    public int hashCode() {
        int result = getCwe() != null ? getCwe().hashCode() : 0;
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getOwasp() != null ? getOwasp().hashCode() : 0);
        result = 31 * result + (getSeverity() != null ? getSeverity().hashCode() : 0);
        return result;
    }
}
