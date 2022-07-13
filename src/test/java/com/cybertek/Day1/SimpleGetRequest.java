package com.cybertek.Day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {

    String url = "http://54.159.232.38:8000/api/spartans";

    @Test
    public void Test1(){
        //send a get request and save response inside the Response object
        Response response=RestAssured.get(url);

        //print response status code
        System.out.println(response.statusCode());

        //printing response body
        response.prettyPrint();


    }


}
