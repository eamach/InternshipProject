package Jobs;

import Model.GitlabAutoSAST.Jobs.*;
import com.google.gson.*;

public class JobsAPIResponseParser {

    /**
     * DEPRECATED
     **/

    public String parseJobsApiResponse(String jobsapiresponse) {
        if (jobsapiresponse != null && !jobsapiresponse.isEmpty()) {
            Gson gson = new Gson();
            try {
                Job[] jobsarray = gson.fromJson(jobsapiresponse, Job[].class);
                for (Job j : jobsarray) {
                    if (j.getName().equals("sast")) {
                        return Integer.toString(j.getId());
                    }
                }
            } catch (Exception ex) {
                System.out.println("Invalid api response.");
                return null;
            }
        }
        return null;
    }
}