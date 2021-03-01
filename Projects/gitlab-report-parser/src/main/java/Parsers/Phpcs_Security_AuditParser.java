package Parsers;

import Model.phpcs_security_audit.Messages;
import Model.phpcs_security_audit.Report;
import Model.phpcs_security_audit.Vulnerability;
import com.google.gson.Gson;

import java.io.FileReader;
import java.util.Map;

public class Phpcs_Security_AuditParser {
    public String PHPCS_Security_Audit_ReportToJson(String report) {
        Report jsonReport = null;
        try {
            Gson gson = new Gson();
            jsonReport = gson.fromJson(new FileReader(report), Report.class);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return JSONReportToComment(jsonReport);
    }

    public String JSONReportToComment(Report jsonReport) {
        if (jsonReport == null) {
            return null;
        }
        StringBuilder report = new StringBuilder("# Vulnerability Report do Commit\n\n\n\n");
        //report.append("**Número de Vulnerabilidades encontradas:** " + jsonReport.getFiles().size() + "\n\n\n\n");
        int counter = 0;
        try {
            for (Map.Entry<String, Vulnerability> entry : jsonReport.getFiles().entrySet()) {
                for (Messages m : entry.getValue().getMessages()) {
                    report.append(":warning: **" + m.getSource() + "**\n\n\n\n");
                    report.append("- Descrição da vulnerabilidade : " + m.getMessage() + "\n\n");
                    switch (m.getType()) {
                        case "WARNING":
                            report.append("- Severity : Low " + "\n\n");
                            break;
                        case "ERROR":
                            report.append("- Severity : High " + "\n\n");
                            break;
                        default:
                            report.append("- Severity not accessed. " + "\n\n");
                            break;
                    }
                    report.append("- Scanner : PHPCS-Security-Audit" + "\n\n");
                    report.append("- Ficheiro afetado : " + entry.getKey().replace("/var", "") + "\n\n");
                    report.append("- Linha : " + m.getLine() + "\n\n");
                    report.append("- Coluna : " + m.getColumn() + "\n\n");
                    counter++;
                }
            }
            report.insert(36, "**Número de Vulnerabilidades encontradas:** " + counter + "\n\n\n\n");
            return report.toString();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
