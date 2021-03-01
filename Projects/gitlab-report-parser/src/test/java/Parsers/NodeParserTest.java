package Parsers;

import Model.Nodejsscan.Report;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeParserTest {

    private NodeParser np;

    @BeforeEach
    void setUp() {
        np = new NodeParser();
    }

    @Test
    void nodejsscan_ReportToJson() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 8\n" +
                "\n" +
                "\n" +
                "\n" +
                ":warning: **node_insecure_random_generator**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : crypto.pseudoRandomBytes()/Math.random() is a cryptographically weak random number generator.\n" +
                "\n" +
                "- Severity : WARNING\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /lib/api/monitors/redispubsubMonitor.js\n" +
                "\n" +
                "- Linha : 33\n" +
                "\n" +
                "- Coluna : 42\n" +
                "\n" +
                ":warning: **node_password**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : A hardcoded password in plain text is identified. Store it properly in an environment variable.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 76\n" +
                "\n" +
                "- Coluna : 29\n" +
                "\n" +
                ":warning: **node_password**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : A hardcoded password in plain text is identified. Store it properly in an environment variable.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 18\n" +
                "\n" +
                "- Coluna : 13\n" +
                "\n" +
                ":warning: **node_password**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : A hardcoded password in plain text is identified. Store it properly in an environment variable.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 27\n" +
                "\n" +
                "- Coluna : 13\n" +
                "\n" +
                ":warning: **node_tls_reject**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Setting 'NODE_TLS_REJECT_UNAUTHORIZED' to 0 will allow node server to accept self signed certificates and is not an secure behaviour.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /lib/index.js\n" +
                "\n" +
                "- Linha : 7\n" +
                "\n" +
                "- Coluna : 1\n" +
                "\n" +
                ":warning: **node_username**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : A hardcoded username in plain text is identified. Store it properly in an environment variable.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /config/test.js\n" +
                "\n" +
                "- Linha : 75\n" +
                "\n" +
                "- Coluna : 29\n" +
                "\n" +
                ":warning: **node_username**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : A hardcoded username in plain text is identified. Store it properly in an environment variable.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 17\n" +
                "\n" +
                "- Coluna : 13\n" +
                "\n" +
                ":warning: **node_username**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : A hardcoded username in plain text is identified. Store it properly in an environment variable.\n" +
                "\n" +
                "- Severity : ERROR\n" +
                "\n" +
                "- Scanner : NodeJSscan\n" +
                "\n" +
                "- Ficheiro afetado : /tests/resources/monitors_001.js\n" +
                "\n" +
                "- Linha : 26\n" +
                "\n" +
                "- Coluna : 13\n" +
                "\n";
        assertEquals(expected, np.Nodejsscan_ReportToJson("example_files/njsscan.json"));
    }

    @Test
    void nodejsscan_ReportToJsonNull() {
        assertEquals(null, np.Nodejsscan_ReportToJson(null));
    }

    @Test
    void JSONReportToCommentNull() {
        assertEquals(null, np.JSONReportToComment(null));
    }

    @Test
    void JSONReportToCommentEmpty() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 0\n" +
                "\n" +
                "\n" +
                "\n";
        assertEquals(expected, np.JSONReportToComment(new Report()));
    }
}