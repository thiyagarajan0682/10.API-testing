package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

public class HttpURLConnectionExample {

	public void getRequestExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();

		int StatusCode = connection.getResponseCode();
		System.out.println(StatusCode);

		String StatusMessage = connection.getResponseMessage();
		System.out.println(StatusMessage);

		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();

		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);

	}
	
	public void postRequestExample() throws IOException {
		URL url = new URL("https://dummy.restapiexample.com/api/v1/create");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonbody = "{\"name\":\"AgniPrasath\",\"salary\":\"28000\",\"Age\":\"22\"}";
		byte[] inputJson = jsonbody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(inputJson);
		
		int StatusCode = connection.getResponseCode();
		System.out.println(StatusCode);
		
		String StatusMessage = connection.getResponseMessage();
		System.out.println(StatusMessage);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}
	
	public void putRequestExample() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/update/3769");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("PUT");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		String jsonBody = "{\"name\":\"AgniPrasath\",\"salary\":\"8000\",\"Age\":\"30\"}";
		byte[] jsonInput = jsonBody.getBytes();
		
		OutputStream outputStream = connection.getOutputStream();
		outputStream.write(jsonInput);
		
		int k1 = connection.getResponseCode();
		System.out.println(k1);
		String k2 = connection.getResponseMessage();
		System.out.println(k2);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while ((line=bufferedReader.readLine())!=null) {
			buffer.append(line);		
		}
		System.out.println(buffer);
	}
	
	
	public void deleteRequestExample() throws IOException {
		
		URL url = new URL("https://dummy.restapiexample.com/api/v1/delete/3769");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		
		connection.setRequestMethod("DELETE");
		connection.setRequestProperty("Content-Type", "application/json");
		connection.setDoOutput(true);
		
		int k1 = connection.getResponseCode();
		System.out.println(k1);
		
		String k2 = connection.getResponseMessage();
		System.out.println(k2);
		
		InputStream inputStream = connection.getInputStream();
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String line;
		StringBuffer buffer = new StringBuffer();
		while((line=bufferedReader.readLine())!=null) {
			buffer.append(line);
		}
		System.out.println(buffer);
	}

	public static void main(String[] args) throws IOException {
		HttpURLConnectionExample connectionExample = new HttpURLConnectionExample();
		connectionExample.getRequestExample();
		//connectionExample.postRequestExample();
		//connectionExample.putRequestExample();
		//connectionExample.deleteRequestExample();
	}




}
