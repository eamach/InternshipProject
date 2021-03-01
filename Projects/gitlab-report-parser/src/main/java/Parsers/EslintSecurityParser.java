package Parsers;

import Model.eslint_security.Messages;
import Model.eslint_security.Vulnerability;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class EslintSecurityParser {
    public String EslintSecurity_ReportToJson(String report) {
        if (report == null) {
            return null;
        }
        try {
            List jsonReport = new ArrayList<Vulnerability>();
            Type type = new TypeToken<List<Vulnerability>>() {
            }.getType();
            Gson gson = new Gson();
            jsonReport = gson.fromJson(new FileReader(report), type);
            return JSONReportToComment(jsonReport);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public String JSONReportToComment(List<Vulnerability> jsonReport) {
        if (jsonReport == null) {
            return null;
        }
        StringBuilder report = new StringBuilder("# Vulnerability Report do Commit\n\n\n\n");
        int counter = 0;
        try {
            for (Vulnerability v : jsonReport) {
                for (Messages m : v.getMessages()) {
                    if (m.getRuleId() != null) {
                        report.append(":warning: **" + m.getRuleId() + "**\n\n\n\n");
                        if (!m.getMessage().contains("Definition for rule") && !m.getMessage().contains("was not found.")) {
                            report.append("- Descrição da vulnerabilidade : " + m.getMessage() + "\n\n");
                        }
                        if (!m.isFatal()) {
                            report.append("- Severity : Low " + "\n\n");
                        } else {
                            report.append("- Severity : High " + "\n\n");
                        }
                        report.append("- Scanner : Eslint Security" + "\n\n");
                        report.append("- Ficheiro afetado : " + v.getFilePath().replace("/var/analysis", "") + "\n\n");
                        report.append("- Linha : " + m.getLine() + "\n\n");
                        report.append("- Coluna : " + m.getColumn() + "\n\n");
                        counter++;
                    }
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
