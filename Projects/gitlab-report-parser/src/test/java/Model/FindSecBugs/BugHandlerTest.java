package Model.FindSecBugs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BugHandlerTest {

    private BugHandler bh;
    private BugCollection bc;

    @BeforeEach
    void setUp() {
        bh = new BugHandler();
        bc = new BugCollection();
    }

    @Test
    void getBc() {
        assertEquals(bc, new BugCollection());
    }
}