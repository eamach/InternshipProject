package Model.eslint_security;

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
    void getRuleId() {
        assertEquals("", m.getRuleId());
    }

    @Test
    void isFatal() {
        assertFalse(m.isFatal());
    }

    @Test
    void getSeverity() {
        assertEquals(0, m.getSeverity());
    }

    @Test
    void getMessage() {
        assertEquals("", m.getMessage());
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