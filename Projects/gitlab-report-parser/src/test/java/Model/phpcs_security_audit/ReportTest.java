package Model.phpcs_security_audit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class ReportTest {

    private Report r;

    @BeforeEach
    void setUp() {
        r = new Report();
    }

    @Test
    void getTotals() {
        assertEquals(new Totals(), r.getTotals());
    }

    @Test
    void getFiles() {
        assertEquals(new HashMap<>(), r.getFiles());
    }
}