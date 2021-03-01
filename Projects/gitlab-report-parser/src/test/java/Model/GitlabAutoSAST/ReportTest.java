package Model.GitlabAutoSAST;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReportTest {

    private Report r;
    private List<Vulnerability> lv;
    @BeforeEach
    void setUp() {
        lv = new ArrayList<>();
        r = new Report("1.0", lv , new ArrayList<>());
    }

    @Test
    void getVersion() {
        assertEquals("1.0", r.getVersion());
    }

    @Test
    void getVulnerabilities() {
        assertEquals(lv, r.getVulnerabilities());
    }

    @Test
    void getRemediations() {
        assertEquals(new ArrayList<>(), r.getRemediations());
    }
}