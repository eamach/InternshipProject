package Parsers;

import Model.eslint_security.Vulnerability;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EslintSecurityParserTest {

    private EslintSecurityParser esp;
    private List<Vulnerability> lv;
    private Vulnerability v;

    @BeforeEach
    void setUp() {
        v = new Vulnerability();
        esp = new EslintSecurityParser();
        lv = new ArrayList<>();
        lv.add(v);
    }

    @Test
    void eslintSecurity_ReportToJsonNull() {
        assertEquals(null, esp.EslintSecurity_ReportToJson(null));
    }

    @Test
    void eslintSecurity_ReportToJsonInexistantFile() {
        assertEquals(null, esp.EslintSecurity_ReportToJson("Idontexist"));
    }
    @Test
    void eslintSecurity_ReportToJson() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 32\n" +
                "\n" +
                "\n" +
                "\n" +
                ":warning: **react/no-danger-with-children**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/jsx-no-target-blank**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unescaped-entities**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unsafe**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger-with-children**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/jsx-no-target-blank**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unescaped-entities**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unsafe**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **security/detect-non-literal-require**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Found non-literal argument in require\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 3\n" +
                "\n" +
                "- Coluna : 14\n" +
                "\n" +
                ":warning: **security/detect-non-literal-require**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Found non-literal argument in require\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 4\n" +
                "\n" +
                "- Coluna : 11\n" +
                "\n" +
                ":warning: **react/no-danger-with-children**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/evaluatorsObj_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/evaluatorsObj_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/jsx-no-target-blank**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/evaluatorsObj_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unescaped-entities**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/evaluatorsObj_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unsafe**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/evaluatorsObj_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger-with-children**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/jsx-no-target-blank**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unescaped-entities**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unsafe**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger-with-children**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/responseWithErrors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/responseWithErrors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/jsx-no-target-blank**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/responseWithErrors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unescaped-entities**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/responseWithErrors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unsafe**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/responseWithErrors_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger-with-children**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/response_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-danger**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/response_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/jsx-no-target-blank**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/response_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unescaped-entities**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/response_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **react/no-unsafe**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : Eslint Security\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/response_001.js\n" +
                "\n" +
                "- Linha : 1\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n";
        assertEquals(expected, esp.EslintSecurity_ReportToJson("example_files/eslint.json"));
    }

    @Test
    void JSONReportToComment() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 0\n" +
                "\n" +
                "\n" +
                "\n";
        assertEquals(expected, esp.JSONReportToComment(lv));
    }

    @Test
    void JSONReportToCommentNull() {
        assertEquals(null, esp.JSONReportToComment(null));
    }
}