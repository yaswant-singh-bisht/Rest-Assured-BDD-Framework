package com.qa.rest.test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetCallBDD {

	@Test
	public void test_numberOfCircuitsIn2021() {
		given().
		when().
			get("http://ergast.com/api/f1/2010/circuits.json").
		then().
			assertThat().
			statusCode(200).
			and().
			body("MRData.CircuitTable.Circuits.circuitId", hasSize(19)).
			and().
			header("Content-Length",equalTo("4350"));
		
		
	}
	
}
