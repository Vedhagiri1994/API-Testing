package com.lao.apiTutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrlConnectionExampleAPI {
	
	public void getMethod() throws IOException{
		
		URL url= new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("GET");
		connection.connect();
		
		int statusCode= connection.getResponseCode();
		System.out.println("Status Code is : " + statusCode);
		
		String statusMessage= connection.getResponseMessage();
		System.out.println("Status Message is : " + statusMessage);
		
		InputStream stream= connection.getInputStream();
		InputStreamReader reader= new InputStreamReader(stream);
		BufferedReader bufferedReader= new BufferedReader(reader);
		
		String line;
		StringBuffer buffer= new StringBuffer();
		while((line=bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	
	public void postMethod() throws IOException{
		
		URL url= new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.connect();
		
		connection.setRequestProperty("Content-Type","application/json");
		connection.setDoOutput(true);
		
		String jsonBody= "{\"name\":\"Muruga\",\"salary\":\"100000\",\"age\":\"25\"}";
		byte[] inputjson= jsonBody.getBytes();
		
		OutputStream stream= connection.getOutputStream();
		stream.write(inputjson);
		
		System.out.println("Status code is : " + connection.getResponseCode());
		System.out.println("Status Message is : " + connection.getResponseMessage());
		
		InputStream inputStream= connection.getInputStream();
		InputStreamReader streamReader= new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader= new BufferedReader(streamReader);
		
		String line;
		StringBuffer buffer= new StringBuffer();
		while((line=bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	
	
	public void putMethod() throws IOException{
		
		URL url= new URL("http://dummy.restapiexample.com/api/v1/update/33");
		HttpURLConnection connection=(HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody= "{\"name\":\"Muruga\",\"salary\":\"100000\",\"age\":\"35\"}";
		byte[] inputJson= jsonBody.getBytes();

		OutputStream outputStream= connection.getOutputStream();
		outputStream.write(inputJson);
		
		System.out.println("Status code is : " + connection.getResponseCode());
		System.out.println("Status Message is : " + connection.getResponseMessage());
		
		
		InputStream inputStream= connection.getInputStream();
		InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer= new StringBuffer();
		
		while((line=bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	
	public void deleteMethod() throws IOException{
		
		URL url= new URL("http://dummy.restapiexample.com/api/v1/delete/33");
		HttpURLConnection connection= (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		System.out.println("Status code is : " + connection.getResponseCode());
		System.out.println("Status Message is : " + connection.getResponseMessage());
		
		
		InputStream inputStream= connection.getInputStream();
		InputStreamReader inputStreamReader= new InputStreamReader(inputStream);
		
		BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer= new StringBuffer();
		
		while((line=bufferedReader.readLine())!=null){
			buffer.append(line);
		}
		System.out.println(buffer);
		
		
	}

	public static void main(String[] args) throws IOException {
		
		HttpUrlConnectionExampleAPI connectionExampleAPI= new HttpUrlConnectionExampleAPI();
		connectionExampleAPI.getMethod();
		connectionExampleAPI.postMethod();
		connectionExampleAPI.putMethod();
		connectionExampleAPI.deleteMethod();
		
		
	}
}
