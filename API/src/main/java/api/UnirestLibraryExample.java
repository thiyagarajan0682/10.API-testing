package api;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestLibraryExample {

	public void getRequestExample() throws UnirestException {

		HttpResponse<JsonNode> json = Unirest.get("https://dummy.restapiexample.com/api/v1/employees").asJson();

		System.out.println(json.getStatus());
		System.out.println(json.getStatusText());
		System.out.println(json.getBody());
	}

	public void postRequestExample() throws UnirestException {

		HttpResponse<JsonNode> json = Unirest.post("https://dummy.restapiexample.com/api/v1/create")
				.body("{\"name\":\"vennila\",\"salary\":\"200\",\"age\":\"6\"}").asJson();

		System.out.println(json.getStatus());
		System.out.println(json.getStatusText());
		System.out.println(json.getBody());

	}

	public void putRequestExample() throws UnirestException {

		HttpResponse<JsonNode> json = Unirest.put("https://dummy.restapiexample.com/api/v1/update/285")
				.body("{\"name\":\"vennilaaa\",\"salary\":\"20000\",\"age\":\"60\"}").asJson();

		System.out.println(json.getStatus());
		System.out.println(json.getStatusText());
		System.out.println(json.getBody());
	}

	public void deleteRequestExample() throws UnirestException {

		HttpResponse<JsonNode> json = Unirest.delete("https://dummy.restapiexample.com/api/v1/delete/3769").asJson();

		System.out.println(json.getStatus());
		System.out.println(json.getStatusText());
		System.out.println(json.getBody());
	}

	public static void main(String[] args) throws UnirestException {
		UnirestLibraryExample example = new UnirestLibraryExample();
		// example.getRequestExample();
		// example.postRequestExample();
		//example.putRequestExample();
		example.deleteRequestExample();
	}

}
