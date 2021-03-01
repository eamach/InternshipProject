package Parsers;

import Model.phpcs_security_audit.Report;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Phpcs_Security_AuditParserTest {

    Phpcs_Security_AuditParser psa;

    @BeforeEach
    void setUp() {
        psa = new Phpcs_Security_AuditParser();
    }

    @Test
    void PHPCS_Security_Audit_ReportToJson() {
        String expected = "# Vulnerability Report do Commit\n" +
                "\n" +
                "\n" +
                "\n" +
                "**Número de Vulnerabilidades encontradas:** 48\n" +
                "\n" +
                "\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyRFI.WarnEasyRFI**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible RFI detected with __DIR__ on require_once\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 2\n" +
                "\n" +
                "- Coluna : 18\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.CallbackFunctions.WarnCallbackFunctions**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Function array_map() that supports callback detected\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 78\n" +
                "\n" +
                "- Coluna : 33\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 101\n" +
                "\n" +
                "- Coluna : 18\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with key on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 113\n" +
                "\n" +
                "- Coluna : 16\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.CallbackFunctions.WarnCallbackFunctions**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Function array_map() that supports callback detected\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 124\n" +
                "\n" +
                "- Coluna : 29\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 130\n" +
                "\n" +
                "- Coluna : 22\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 132\n" +
                "\n" +
                "- Coluna : 85\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 138\n" +
                "\n" +
                "- Coluna : 41\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 141\n" +
                "\n" +
                "- Coluna : 22\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 150\n" +
                "\n" +
                "- Coluna : 113\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 150\n" +
                "\n" +
                "- Coluna : 185\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 152\n" +
                "\n" +
                "- Coluna : 60\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 156\n" +
                "\n" +
                "- Coluna : 72\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 164\n" +
                "\n" +
                "- Coluna : 48\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $url on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 168\n" +
                "\n" +
                "- Coluna : 119\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 168\n" +
                "\n" +
                "- Coluna : 143\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 183\n" +
                "\n" +
                "- Coluna : 25\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 185\n" +
                "\n" +
                "- Coluna : 51\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 189\n" +
                "\n" +
                "- Coluna : 72\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with getLastErrors on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 195\n" +
                "\n" +
                "- Coluna : 20\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 207\n" +
                "\n" +
                "- Coluna : 57\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 211\n" +
                "\n" +
                "- Coluna : 57\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 227\n" +
                "\n" +
                "- Coluna : 82\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 227\n" +
                "\n" +
                "- Coluna : 146\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $keyService on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 228\n" +
                "\n" +
                "- Coluna : 24\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $expanded on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 234\n" +
                "\n" +
                "- Coluna : 53\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $zone on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 234\n" +
                "\n" +
                "- Coluna : 102\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $keyWorker on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 251\n" +
                "\n" +
                "- Coluna : 44\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $keyComponent on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 278\n" +
                "\n" +
                "- Coluna : 60\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $keyComponent on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 284\n" +
                "\n" +
                "- Coluna : 60\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $Key on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 297\n" +
                "\n" +
                "- Coluna : 64\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with $Key on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 303\n" +
                "\n" +
                "- Coluna : 64\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with date on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/index.php\n" +
                "\n" +
                "- Linha : 334\n" +
                "\n" +
                "- Coluna : 22\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyRFI.WarnEasyRFI**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible RFI detected with __DIR__ on require_once\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/requests.php\n" +
                "\n" +
                "- Linha : 3\n" +
                "\n" +
                "- Coluna : 14\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with getZoneMaintenanceStatus on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/requests.php\n" +
                "\n" +
                "- Linha : 9\n" +
                "\n" +
                "- Coluna : 14\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 27\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 30\n" +
                "\n" +
                "- Coluna : 39\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 57\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 85\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 88\n" +
                "\n" +
                "- Coluna : 39\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 115\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 118\n" +
                "\n" +
                "- Coluna : 39\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 138\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 141\n" +
                "\n" +
                "- Coluna : 39\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 163\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 166\n" +
                "\n" +
                "- Coluna : 39\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.FilesystemFunctions.WarnFilesystem**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Filesystem function curl_exec() detected with dynamic parameter\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 186\n" +
                "\n" +
                "- Coluna : 19\n" +
                "\n" +
                ":warning: **PHPCS_SecurityAudit.BadFunctions.EasyXSS.EasyXSSwarn**\n" +
                "\n" +
                "\n" +
                "\n" +
                "- Descrição da vulnerabilidade : Possible XSS detected with . on echo\n" +
                "\n" +
                "- Severity : Low \n" +
                "\n" +
                "- Scanner : PHPCS-Security-Audit\n" +
                "\n" +
                "- Ficheiro afetado : /src/utils.php\n" +
                "\n" +
                "- Linha : 189\n" +
                "\n" +
                "- Coluna : 39\n" +
                "\n";
        assertEquals(expected, psa.PHPCS_Security_Audit_ReportToJson("example_files/out.json"));
    }

    @Test
    void PHPCS_Security_Audit_ReportToJsonNull() {
        assertEquals(null, psa.PHPCS_Security_Audit_ReportToJson(null));
    }

    @Test
    void PHPCS_Security_Audit_ReportToJsonEmpty() {
        assertEquals(null, psa.PHPCS_Security_Audit_ReportToJson(""));
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
        assertEquals(expected, psa.JSONReportToComment(new Report()));
    }

    @Test
    void JSONReportToCommentNull() {
        assertEquals(null, psa.JSONReportToComment(null));
    }
}