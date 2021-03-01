package Model.Nodejsscan;

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
    void getNodejs() {
        assertEquals(new HashMap<>(), r.getNodejs());
    }
}