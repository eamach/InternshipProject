package Utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderTest {

    private String testString;
    @BeforeEach
    void setUp() {
        testString = "test encoding";
    }

    @Test
    void encodeValue() {
        assertEquals("test+encoding", Encoder.encodeValue(testString));
    }

    @Test
    void encodeValueNull() {
        assertEquals(null, Encoder.encodeValue(null));
    }
}