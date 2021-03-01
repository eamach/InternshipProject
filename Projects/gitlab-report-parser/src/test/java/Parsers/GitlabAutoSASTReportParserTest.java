package Parsers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GitlabAutoSASTReportParserTest {

    private GitlabAutoSASTReportParser gasrp;
    private String report = "{\n" +
            "  \"version\": \"2.3\",\n" +
            "  \"vulnerabilities\": [\n" +
            "    {\n" +
            "      \"category\": \"sast\",\n" +
            "      \"name\": \"Found non-literal argument in require\",\n" +
            "      \"message\": \"Found non-literal argument in require\",\n" +
            "      \"description\": \"require() called with a variable, this might allow an attacker to load and run arbitrary code, or access arbitrary files on disk.\",\n" +
            "      \"cve\": \"lib/api/api.js:e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855:security/detect-non-literal-require\",\n" +
            "      \"severity\": \"Unknown\",\n" +
            "      \"confidence\": \"Unknown\",\n" +
            "      \"scanner\": {\n" +
            "        \"id\": \"eslint\",\n" +
            "        \"name\": \"ESLint\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"remediations\": []\n" +
            "}";

    @BeforeEach
    void setUp() {
        gasrp = new GitlabAutoSASTReportParser();
    }

    @Test
    void SASTReportToJsonNull() {
        assertEquals(null, gasrp.SASTReportToJson(null));
    }

    @Test
    void SASTReportToJson() {
        assertEquals(null, gasrp.SASTReportToJson(report));
    }

    @Test
    void JSONReportToComment() {
        assertEquals(null, gasrp.JSONReportToComment(null));
    }
}