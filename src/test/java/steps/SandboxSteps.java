package steps;

import cucumber.api.java.en.*;
import pages.SandboxPage;

public class SandboxSteps {

    SandboxPage sandboxPage = new SandboxPage();

    @Given("^I navigate to the sandbox page$")
    public void navigateToSandboxPage(){
        sandboxPage.navigateToSandbox();
    }

    @And("^select a value from the dropdown$")
    public void selectValueFromDropdown(){
        sandboxPage.selectCategory("Manual");
    }
    
}
