package Parsers;

import Model.GitlabAutoSAST.Report;
import Model.GitlabAutoSAST.Vulnerability;
import com.google.gson.*;

/**
 * DEPRECATED
 **/

public class GitlabAutoSASTReportParser {
    public String SASTReportToJson(String report) {
        Report jsonReport = null;
        try {
            Gson gson = new Gson();
            jsonReport = gson.fromJson(report, Report.class);
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
        report.append("** Número de Vulnerabilidades encontradas: **" + jsonReport.getVulnerabilities().size() + "\n\n\n\n");
        try {
            for (Vulnerability v : jsonReport.getVulnerabilities()) {
                report.append(":warning: **" + v.getName() + "**\n\n\n\n");
                if (v.getDescription() != null) {
                    report.append("- Descrição da vulnerabilidade : " + v.getDescription() + "\n\n");
                } else {
                    report.append("- Descrição da vulnerabilidade : " + v.getMessage() + "\n\n");
                }
                report.append("- Scanner : " + v.getVulnerabilityScanner().getName() + "\n\n");
                report.append("- Ficheiro afetado : " + v.getVulnerabilityLocation().getFile() + "\n\n");
                report.append("- Linha : " + v.getVulnerabilityLocation().getStart_line() + "\n\n");
            }
        } catch (Exception ex) {
            return null;
        }
        return report.toString();
    }
}
