package org.acme;

import io.quarkus.test.InjectMock;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.acme.model.Country;
import org.acme.repository.CountryRepository;
import org.acme.service.CountryService;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class CountryControllerTest {



    @Test
    void testCountryEndpoint() {
        given()
          .when().get("/api/v1/practitioner/country")
          .then()
             .statusCode(200);
    }


    @Test
    void testCountryReloadEndpoint() {
        given()
                .when().get("/api/v1/practitioner/country/reload")
                .then()
                .statusCode(204);
    }

}