package usingJAVANet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class HttpURLConnectionExample {

	public void getMethodExample() throws IOException {
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("GET");
		connection.connect();

		// Status code

		int statusCode = connection.getResponseCode();
		System.out.println("Status code is " + statusCode);

		// Response message

		String message = connection.getResponseMessage();
		System.out.println("Response message " + message);

		// Response body

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();

		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public void postMethodExample() throws IOException {

		URL url = new URL("http://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"Santhosh\",\"salary\":\"100000\",\"age\":\"25\"}";
		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);

		System.out.println("Response code: " + connection.getResponseCode());
		System.out.println("Response message: " + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();

		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}
	
	public void putRequestExample() throws IOException{
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/update/33");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("PUT");
		connection.setRequestProperty("content-type", "application/json");
		connection.setDoOutput(true);

		String jsonBody = "{\"name\":\"Vedhagiri\",\"salary\":\"100000000\",\"age\":\"37\"}";
		byte[] inputJson = jsonBody.getBytes();

		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);

		System.out.println("Response code: " + connection.getResponseCode());
		System.out.println("Response message: " + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();

		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}

	public void deleteRequestExample() throws IOException{
		
		URL url = new URL("http://dummy.restapiexample.com/api/v1/delete/33");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();

		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("content-type", "application/json");
		connection.setDoOutput(true);

		System.out.println("Response code: " + connection.getResponseCode());
		System.out.println("Response message: " + connection.getResponseMessage());

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();

		while ((line = bufferedReader.readLine()) != null) {
			buffer.append(line);
		}
		System.out.println(buffer);
		
	}
	public static void main(String[] args) throws IOException {

		HttpURLConnectionExample connectionExample = new HttpURLConnectionExample();
		 //connectionExample.getMethodExample();
		connectionExample.postMethodExample();
		// connectionExample.putRequestExample();
		// connectionExample.deleteRequestExample();
	}

}
