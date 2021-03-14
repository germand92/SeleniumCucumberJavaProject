package pages;

public class GooglePage extends BasePage {

    private String searchButton = "//input[@value='Google Suche']";
    private String searchTextField = "//input[@title='Suche']";
    private String iAgreeButton = "//*[@id='introAgreeButton']";
    private String firstResult = "//*[@id='rso']/div[1]/div[1]/div/div[1]/a/h3";



    public GooglePage (){
        super(driver);
    }

    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void focusOnGooglePrivacyPopUp(){
        switchToiFrame(0);
    }

    public void clickIAgree(){
        clickElement(iAgreeButton);
        swichtToParentFrame();
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }

    public String firstResult(){
        return textFromElement(firstResult);
    }
    
}
