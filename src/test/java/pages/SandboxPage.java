package pages;

public class SandboxPage extends BasePage {

    String categoryDropdown = "//select[@id='testingDropdown']";

    public SandboxPage(){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://www.testandquiz.com/selenium/testing.html");
    }

    public void selectCategory(String category){
        selectFromDropdownByValue(categoryDropdown, category);

    }
    
}
