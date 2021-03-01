package Requests;

public class RequestURLCreator {
    private final String url = "(REDACTED)/api/v4/projects/";

    /** DEPRECATED **/
    /**
     * SAST IS HARDCODED IN ALL GET REQUESTS
     **/

    /*
    public String buildGetRequestSuccessfulJobsCurrentPipelineRequest(){
        String requestUrl = url;
        requestUrl += System.getenv("CI_PROJECT_ID") + "/pipelines/" + System.getenv("CI_PIPELINE_ID")  + "/jobs?scope=success";
        return requestUrl;
    }

    public String buildGetRequestReportUrlCurrentCommit(String job_id){
        String requestUrl = url;
        requestUrl += System.getenv("CI_PROJECT_ID") + "/jobs/" + job_id +  "/artifacts/gl-sast-report.json";
        return requestUrl;
    }

    public String buildGetRequestReportUrlLastCommit(){
        String requestUrl = url;
        requestUrl += System.getenv("CI_PROJECT_ID") + "/jobs/artifacts/" + System.getenv("CI_COMMIT_REF_NAME")  + "/raw/gl-sast-report.json?job=sast";
        return requestUrl;
    }
    */
    public String buildPostRequestCommentUrl() {
        if (System.getenv("CI_PROJECT_ID") == null || (System.getenv("CI_COMMIT_REF_NAME") == null)) {
            return null;
        }
        String requestUrl = url;
        requestUrl += System.getenv("CI_PROJECT_ID") + "/repository/commits/" + System.getenv("CI_COMMIT_REF_NAME") + "/comments";
        return requestUrl;
    }
}
