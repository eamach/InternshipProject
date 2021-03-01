package Model.Nodejsscan;

import java.util.ArrayList;
import java.util.List;

public class Files {
    private String file_path;
    private List<Integer> match_lines;
    private List<Integer> match_position;
    private String match_string;

    public Files() {
        this.file_path = "path";
        this.match_lines = new ArrayList<>();
        this.match_position = new ArrayList<>();
        this.match_string = "match";
    }

    public String getFile_path() {
        return file_path;
    }

    public List<Integer> getMatch_lines() {
        return match_lines;
    }

    public List<Integer> getMatch_position() {
        return match_position;
    }

    public String getMatch_string() {
        return match_string;
    }
}
