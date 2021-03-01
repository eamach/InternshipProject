package Model.FindSecBugs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SourceLineTest {

    private SourceLine sl;
    @BeforeEach
    void setUp() {
        sl = new SourceLine();
    }

    @Test
    void getClassname() {
        assertEquals("", sl.getClassname());
    }

    @Test
    void getStartLine() {
        assertEquals("", sl.getStartLine());
    }

    @Test
    void getEndLine() {
        assertEquals("", sl.getEndLine());
    }

    @Test
    void getSourceFile() {
        assertEquals("", sl.getSourceFile());
    }

    @Test
    void addNullAttributes() {
        assertFalse(sl.addAttributes(null));
    }

    @Test
    void testEquals() {
        SourceLine copy = sl;
        assertEquals(copy, sl);
    }

    @Test
    void testHashCode() {
        SourceLine copy = sl;
        assertEquals(copy.hashCode(), sl.hashCode());
    }
}