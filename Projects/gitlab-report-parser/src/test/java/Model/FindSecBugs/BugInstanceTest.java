package Model.FindSecBugs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugInstanceTest {

    private BugInstance bi;
    private SourceLine sl;

    @BeforeEach
    void setUp() {
        bi = new BugInstance();
        sl = new SourceLine();
    }

    @Test
    void getType() {
        assertEquals("", bi.getType());
    }

    @Test
    void getPriority() {
        assertEquals("", bi.getPriority());
    }

    @Test
    void getRank() {
        assertEquals("", bi.getRank());
    }

    @Test
    void getAbbrev() {
        assertEquals("", bi.getAbbrev());
    }

    @Test
    void getCategory() {
        assertEquals("", bi.getCategory());
    }

    @Test
    void getSourceLine() {
        assertEquals(new SourceLine(), bi.getSourceLine());
    }

    @Test
    void addBugInstanceAttributes() {
        assertFalse(bi.addBugInstanceAttributes(null));
    }

    @Test
    void setSourceLine() {
        bi.setSourceLine(sl);
        assertEquals(sl, bi.getSourceLine());
    }
}