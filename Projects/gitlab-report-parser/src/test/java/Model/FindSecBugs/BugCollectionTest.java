package Model.FindSecBugs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BugCollectionTest {

    private BugCollection bc;
    private BugInstance bi;
    @BeforeEach
    void setUp() {
        bc = new BugCollection();
        bi = new BugInstance();
    }

    @Test
    void getBugList() {
        assertEquals(new ArrayList<>(), bc.getBugList());
    }

    @Test
    void addToBugList() {
        assertTrue(bc.addToBugList(bi));
    }

    @Test
    void testEquals() {
        assertEquals(bc, new BugCollection());
    }

    @Test
    void testHashCode() {
        assertEquals(bc.hashCode(), new BugCollection().hashCode());
    }
}