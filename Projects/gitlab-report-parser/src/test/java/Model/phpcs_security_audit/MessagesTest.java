package Model.phpcs_security_audit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagesTest {

    private Messages m;

    @BeforeEach
    void setUp() {
        m = new Messages();
    }

    @Test
    void getMessage() {
        assertEquals("", m.getMessage());
    }

    @Test
    void getSource() {
        assertEquals("", m.getSource());
    }

    @Test
    void getSeverity() {
        assertEquals(0, m.getSeverity());
    }

    @Test
    void isFixable() {
        assertFalse(m.isFixable());
    }

    @Test
    void getType() {
        assertEquals("", m.getType());
    }

    @Test
    void getLine() {
        assertEquals(0, m.getLine());
    }

    @Test
    void getColumn() {
        assertEquals(0, m.getColumn());
    }
}