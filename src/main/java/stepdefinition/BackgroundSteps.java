package stepdefinition;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import pages.CommonUtils;

/**
 * Created by Jatin on 4/3/2019.
 */
public class BackgroundSteps {

    @Given("User has set the Request Base URI")
    public void setBaseURI() throws Throwable{
        RestAssured.baseURI= CommonUtils.getCentralData("BaseUri");
    }
}
