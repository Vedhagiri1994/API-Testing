package usingJAVANet;

import static io.restassured.RestAssured.given;

import java.util.concurrent.TimeUnit;

import io.restassured.http.Headers;
import io.restassured.response.ResponseBody;

public class RestAssuredExample {

	public void getMethodExample() {

		ResponseBody responseBody = given()
				.queryParam("Cutomer_ID", "68195")
				.queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").getBody();
		System.out.println("Response Body is : " + responseBody);
		
		int responseCode = given()
				.queryParam("Cutomer_ID", "68195")
				.queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();
		System.out.println("Response Code is : " + responseCode);
		
		String responseText = given()
				.queryParam("Cutomer_ID", "68195")
				.queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusLine();
		System.out.println("Response Text is : " + responseText);
		
		long responceTime= given()
				.queryParam("Cutomer_ID", "68195")
				.queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").timeIn(TimeUnit.MILLISECONDS);
		System.out.println("Response Time is : " + responceTime);
		
		Headers header = given()
				.queryParam("Cutomer_ID", "68195")
				.queryParam("PASSWORD", "1234!")
				.queryParam("Account_No", "1")
				.when().get("http://demo.guru99.com/V4/sinkministatement.php").then().extract().headers();
		System.out.println("The headers in the response is " + header);

	//	given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().all();

	}

	public void postMethodExample(){
		
		
		
	}
	
	   
		
	

	public static void main(String[] args) {

		RestAssuredExample restAssuredHttpExample = new RestAssuredExample();
	  restAssuredHttpExample.getMethodExample();
	//	restAssuredHttpExample.getResponseStatus();

	}

}
