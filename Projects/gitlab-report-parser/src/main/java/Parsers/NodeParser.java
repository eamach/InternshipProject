package Parsers;

import Model.Nodejsscan.Files;
import Model.Nodejsscan.Metadata;
import Model.Nodejsscan.Report;
import Model.Nodejsscan.Vulnerability;
import com.google.gson.Gson;

import java.io.FileReader;
import java.util.Map;

public class NodeParser {
    public String Nodejsscan_ReportToJson(String report) {
        Report jsonReport = null;
        try {
            Gson gson = new Gson();
            jsonReport = gson.fromJson(new FileReader(report), Report.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return JSONReportToComment(jsonReport);
    }

    public String JSONReportToComment(Report jsonReport) {
        if (jsonReport == null) {
            return null;
        }
        StringBuilder report = new StringBuilder("# Vulnerability Report do Commit\n\n\n\n");
        int counter = 0;
        try {
            for (Map.Entry<String, Vulnerability> entry : jsonReport.getNodejs().entrySet()) {
                Metadata m = entry.getValue().getMetadata();
                for (Files f : entry.getValue().getFiles()) {
                    report.append(":warning: **" + entry.getKey() + "**\n\n\n\n");
                    report.append("- Descrição da vulnerabilidade : " + m.getDescription() + "\n\n");
                    report.append("- Severity : " + m.getSeverity() + "\n\n");
                    report.append("- Scanner : NodeJSscan" + "\n\n");
                    report.append("- Ficheiro afetado : " + f.getFile_path().replace("/var/analysis", "") + "\n\n");
                    report.append("- Linha : " + f.getMatch_lines().get(0) + "\n\n");
                    report.append("- Coluna : " + f.getMatch_position().get(0) + "\n\n");
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
