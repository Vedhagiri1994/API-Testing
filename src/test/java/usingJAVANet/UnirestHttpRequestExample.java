package usingJAVANet;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpRequestExample {

	public void getRequestExample() throws UnirestException {

		HttpResponse<JsonNode> jsonResponse = Unirest.
				get("http://dummy.restapiexample.com/api/v1/employees").asJson();

		System.out.println("Status code: " + jsonResponse.getStatus());
		System.out.println("Status message: " + jsonResponse.getStatusText());
		System.out.println("Response Body: " + jsonResponse.getBody());
	}

	public void postRequestExample() throws UnirestException {

		HttpResponse<JsonNode> jsonResponse = Unirest.
				post("http://dummy.restapiexample.com/api/v1/create")
				.body("{\"name\":\"Kumaran\",\"salary\":\"100000000\",\"age\":\"4\"}").asJson();

		System.out.println("Status code: " + jsonResponse.getStatus());
		System.out.println("Status message: " + jsonResponse.getStatusText());
		System.out.println("Response Body: " + jsonResponse.getBody());
	}

	public void putRequestExample() throws UnirestException{
		
		HttpResponse<JsonNode> jsonResponse = Unirest.put("http://dummy.restapiexample.com/api/v1/update/29")
				.body("{\"name\":\"Kumaran\",\"salary\":\"500000000\",\"age\":\"44\"}").asJson();

		System.out.println("Status code: " + jsonResponse.getStatus());
		System.out.println("Status message: " + jsonResponse.getStatusText());
		System.out.println("Response Body: " + jsonResponse.getBody());
	}
	
public void deleteRequestExample() throws UnirestException{
		
		HttpResponse<JsonNode> jsonResponse = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/29").asJson();

		System.out.println("Status code: " + jsonResponse.getStatus());
		System.out.println("Status message: " + jsonResponse.getStatusText());
		System.out.println("Response Body: " + jsonResponse.getBody());
	}
	public static void main(String[] args) throws UnirestException {

		UnirestHttpRequestExample example = new UnirestHttpRequestExample();
		// example.getRequestExample();
		// example.postRequestExample();
		// example.putRequestExample();
		example.deleteRequestExample();
	}

}
