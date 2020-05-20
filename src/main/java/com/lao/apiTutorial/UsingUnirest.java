package com.lao.apiTutorial;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UsingUnirest {

	public void getMethod() throws UnirestException {

		HttpResponse<JsonNode> jsonResoponse = Unirest.get("http://dummy.restapiexample.com/api/v1/employees").asJson();

		System.out.println("Status code is : " + jsonResoponse.getStatus());
		System.out.println("Status message is : " + jsonResoponse.getStatusText());
		System.out.println("Status Body is : " + jsonResoponse.getBody());
	}

	public void postMethod() throws UnirestException {

		HttpResponse<JsonNode> jsonResoponse = Unirest.post("http://dummy.restapiexample.com/api/v1/create")
				.body("{\"name\":\"Ganesha\",\"salary\":\"50000\",\"age\":\"25\"}").asJson();

		System.out.println("Status code is : " + jsonResoponse.getStatus());
		System.out.println("Status message is : " + jsonResoponse.getStatusText());
		System.out.println("Status Body is : " + jsonResoponse.getBody());
	}

	public void putMethod() throws UnirestException {

		HttpResponse<JsonNode> jsonResoponse = Unirest.put("http://dummy.restapiexample.com/api/v1/update/89")
				.body("{\"name\":\"Ganesha\",\"salary\":\"2500000\",\"age\":\"30\"}").asJson();

		System.out.println("Status code is : " + jsonResoponse.getStatus());
		System.out.println("Status message is : " + jsonResoponse.getStatusText());
		System.out.println("Status Body is : " + jsonResoponse.getBody());
	}

	public void deleteMethod() throws UnirestException{
		
		HttpResponse<JsonNode> jsonResoponse = Unirest.delete("http://dummy.restapiexample.com/api/v1/delete/89")
				.asJson();

		System.out.println("Status code is : " + jsonResoponse.getStatus());
		System.out.println("Status message is : " + jsonResoponse.getStatusText());
		System.out.println("Status Body is : " + jsonResoponse.getBody());
		
	}
	public static void main(String[] args) throws UnirestException  {
		
		
		UsingUnirest unirest= new UsingUnirest();
		
		unirest.getMethod();
		unirest.postMethod();
		unirest.putMethod();
		unirest.deleteMethod();

		

	}
	
	

}
