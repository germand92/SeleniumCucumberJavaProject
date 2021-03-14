package steps;

import org.junit.Assert;

import cucumber.api.java.en.*;
import pages.GridPage;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the static table*")
    public void navigateToGridPage(){
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted*")
    public void returnWantedValue(){
        String value = grid.getValueFromGrid(3, 2);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then("^I can validate the table is displayed$")
    public void theTableIsThere(){
        //.isDisplayed() is (mostly) used for negative test cases
        Assert.assertTrue("The element is displayed",grid.tableStatus());
    }
    
}
