package Model.Nodejsscan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetadataTest {

    private Metadata m;

    @BeforeEach
    void setUp() {
        m = new Metadata();
    }

    @Test
    void getCwe() {
        assertEquals("", m.getCwe());
    }

    @Test
    void getDescription() {
        assertEquals("", m.getDescription());
    }

    @Test
    void getOwasp() {
        assertEquals("", m.getOwasp());
    }

    @Test
    void getSeverity() {
        assertEquals("", m.getSeverity());
    }

    @Test
    void testEquals() {
        assertEquals(new Metadata() , m);
    }

    @Test
    void testHashCode() {
        assertEquals(new Metadata().hashCode(), m.hashCode());
    }
}