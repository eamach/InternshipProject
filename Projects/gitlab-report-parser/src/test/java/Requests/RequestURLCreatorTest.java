package Requests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static com.github.stefanbirkner.systemlambda.SystemLambda.*;

class RequestURLCreatorTest {

    private RequestURLCreator ruc;

    @BeforeEach
    void setUp() {
        ruc = new RequestURLCreator();
    }

    @Test
    void buildPostRequestCommentUrlNull() {
        assertEquals(null,ruc.buildPostRequestCommentUrl());
    }

    @Test
    void buildPostRequestCommentUrl() throws Exception {
        withEnvironmentVariable("CI_PROJECT_ID", "value").and("CI_COMMIT_REF_NAME", "value")
                .execute(() -> {
                    assertEquals("(REDACTED)/api/v4/projects/value/repository/commits/value/comments",ruc.buildPostRequestCommentUrl());
                });
    }
}