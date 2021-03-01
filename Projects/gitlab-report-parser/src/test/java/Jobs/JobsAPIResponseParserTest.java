package Jobs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JobsAPIResponseParserTest {

    private String JobsApiResponseWithoutSast;
    private String JobsApiResponseWithSast;
    private JobsAPIResponseParser jarp;
    @BeforeEach
    void setUp() {
        JobsApiResponseWithoutSast = "redacted";
        JobsApiResponseWithSast = "redacted";
        jarp = new JobsAPIResponseParser();
    }

    @Test
    void testParseJobsApiResponseStringWithoutSast() {
        String actual = jarp.parseJobsApiResponse(JobsApiResponseWithoutSast);

        assertEquals(null,actual);
    }

    @Test
    void testParseJobsApiResponseStringWithSast() {
        String actual = jarp.parseJobsApiResponse(JobsApiResponseWithSast);

        assertEquals("105109",actual);
    }

    @Test
    void testParseJobsApiResponseNULL() {
        String actual = jarp.parseJobsApiResponse(null);

        assertEquals(null,actual);
    }

    @Test
    void testParseJobsApiResponseEmpty() {
        String actual = jarp.parseJobsApiResponse("");

        assertEquals(null,actual);
    }

    @Test
    void testParseJobsApiException() {
        String actual = jarp.parseJobsApiResponse("Exception");

        assertEquals(null,actual);
    }
}