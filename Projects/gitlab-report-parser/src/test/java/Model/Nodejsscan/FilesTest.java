package Model.Nodejsscan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilesTest {

    private Files f;

    @BeforeEach
    void setUp() {
        f = new Files();
    }

    @Test
    void getFile_path() {
        assertEquals("path", f.getFile_path());
    }

    @Test
    void getMatch_lines() {
        assertEquals(new ArrayList<>(), f.getMatch_lines());
    }

    @Test
    void getMatch_position() {
        assertEquals(new ArrayList<>(), f.getMatch_position());
    }

    @Test
    void getMatch_string() {
        assertEquals("match", f.getMatch_string());
    }
}