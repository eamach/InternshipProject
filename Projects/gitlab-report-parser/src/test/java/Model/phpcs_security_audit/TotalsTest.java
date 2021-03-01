package Model.phpcs_security_audit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TotalsTest {

    private Totals t;

    @BeforeEach
    void setUp() {
        t = new Totals();
    }

    @Test
    void getErrors() {
        assertEquals(0, t.getErrors());
    }

    @Test
    void getWarnings() {
        assertEquals(0, t.getWarnings());
    }

    @Test
    void getFixable() {
        assertEquals(0, t.getFixable());
    }

    @Test
    void testEquals() {
        assertEquals(new Totals(), t);
    }

    @Test
    void testHashCode() {
        assertEquals(new Totals().hashCode(), t.hashCode());
    }
}