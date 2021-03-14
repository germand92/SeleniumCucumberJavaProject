package pages;

public class GridPage extends BasePage {

    private String table = "//*[@id='root']/div";
    private String mainTable = "//*[@id='root']/div/table";

    public GridPage(){
        super(driver);
    }

    public void navigateToGrid(){
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getValueFromGrid(int row, int column){
        return getValueFromTable(table, row, column);
    }

    public boolean tableStatus(){
        return elementIsDisplayed(mainTable);
    }

    
}
