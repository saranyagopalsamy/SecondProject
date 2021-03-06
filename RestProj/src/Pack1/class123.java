package Pack1;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class class123 {
	
	@Test
	public void getResponse()
	{
		// Specify the base URL to the RESTful web service
				RestAssured.baseURI  = "https://demoqa.com/utilities/weather/city";

				// Get the RequestSpecification of the request that you want to sent
				// to the server. The server is specified by the BaseURI that we have
				// specified in the above step.
				RequestSpecification httpRequest = RestAssured.given();

				// Make a GET request call directly by using RequestSpecification.get() method.
				// Make sure you specify the resource name.
				Response response = httpRequest.get("/Hyderabad");

				// Response.asString method will directly return the content of the body
				// as String.
				System.out.println("Response Body is =>  " + response.asString());
	}

}
