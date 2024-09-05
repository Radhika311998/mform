package TestPackage;

import java.util.*;


public class Utils 
{
			
	String	baseUrl = "https://stgmformservices.dhwaniris.in";
	String	falseBaseurl = "https://stgmformservices.dhwaniris.com";
	String	loginUrl = "/auth-service/login?timestamp=1717061190483";
	String	tokenAuthenticatorUrl = "/auth-service/login-history?token=";
	String	logoutUrl = "/auth-service/logout";
	
	// Initialize the main payload map
    Map<String, Map<String, Object>> payload = new HashMap<>();
    Map<String, Map<String, Object>> dummyPayload = new HashMap<>();

    {
        // Populate payloads
        populatePayload(payload, "Super Admin", "Pass@123", "sarthak.srivastava@dhwaniris.com");
        populatePayload(payload, "Org Admin", "Pass@123", "sarthak.orgadmin@dhwaniris.com");
        populatePayload(payload, "Web User", "Pass@123", "SarthakWebuser@dhwaniris.com");

        populatePayload(dummyPayload, "Super Admin", "123456789", "zxcx@dhwaniris.com");
    }

    private void populatePayload(Map<String, Map<String, Object>> map, String role, String password, String email) {
        Map<String, Object> userDetails = new HashMap<>();
        userDetails.put("password", password);
        userDetails.put("lng", 77.0679477);
        userDetails.put("lat", 28.459899);
        userDetails.put("captcha", "zHYr4q");
        userDetails.put("captchaUniqueId", "lwt1vw01kdy6qr3434s");
        userDetails.put("email", email);
        
        map.put(role, userDetails);
    }
	

}
