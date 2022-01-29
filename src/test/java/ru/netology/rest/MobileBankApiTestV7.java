package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class MobileBankApiTestV7 {

    @Test
    void shouldSubmitRequest() {
        given()
           .baseUri("https://postman-echo.com")
           .body("some data")
        .when()
           .post("/post")
        .then()
           .statusCode(200)
           .body("data", equalTo("some data"))
        ;
    }

}
