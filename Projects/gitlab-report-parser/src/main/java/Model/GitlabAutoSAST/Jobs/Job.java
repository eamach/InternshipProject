package Model.GitlabAutoSAST.Jobs;

public class Job {

    /** DEPRECATED **/

    public Job(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /** we only need the id and the name from the response **/
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}