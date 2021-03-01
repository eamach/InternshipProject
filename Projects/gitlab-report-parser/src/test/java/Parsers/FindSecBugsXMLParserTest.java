package Parsers;

import Model.FindSecBugs.BugHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSecBugsXMLParserTest {

    private FindSecBugsXMLParser fsbxp;
    private BugHandler bh;

    @BeforeEach
    void setUp() {
        fsbxp = new FindSecBugsXMLParser();
        bh = new BugHandler();
    }

    @Test
    void XMLParserNull() {
        assertEquals(null, fsbxp.XMLParser(null));
    }

    @Test
    void XMLtoGitlabComment() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 0\n" +
                "\n" +
                "\n" +
                "\n";
        assertEquals(expected, fsbxp.XMLtoGitlabComment(bh));
    }

    @Test
    void XMLtoGitlabCommentWithStuff() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 2\n" +
                "\n" +
                "\n" +
                "\n" +
                ":warning: **PREDICTABLE_RANDOM**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : SECPR\n" +
                "\n" +
                "- Prioridade : Media\n" +
                "\n" +
                "- Scanner : FindSecBugs\n" +
                "\n" +
                "- Ficheiro afetado : GeneralUtils.java\n" +
                "\n" +
                "- Linha : 20\n" +
                "\n" +
                ":warning: **INFORMATION_EXPOSURE_THROUGH_AN_ERROR_MESSAGE**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : ERRMSG\n" +
                "\n" +
                "- Prioridade : Media\n" +
                "\n" +
                "- Scanner : FindSecBugs\n" +
                "\n" +
                "- Ficheiro afetado : LoggingUtils.java\n" +
                "\n" +
                "- Linha : 21\n" +
                "\n";
        BugHandler bht = fsbxp.XMLParser(System.getProperty("user.dir") + "\\example_files\\out.xml");
        assertEquals(expected, fsbxp.XMLtoGitlabComment(bht));
    }
}