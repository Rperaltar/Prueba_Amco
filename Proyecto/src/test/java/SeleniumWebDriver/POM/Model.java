package SeleniumWebDriver.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class Model extends Constantes{

    public static WebDriver driver;

    @FindBy(how = How.ID,id = "search-big")
    public WebElement Data_Catalog_Browse;
    @FindBy(how = How.ID,id = "#dataset-search > span > button")
    public WebElement Submit;
    @FindBy(how = How.CSS,css = "#content > div.row.wrapper > div > section:nth-child(1) > div.new-results")
    public WebElement ASSERT_TEXT_LABEL_RESULT;
    @FindBy(how = How.CSS,css = "#content > div.row.wrapper > div > section:nth-child(1) > div.module-content > ul > li:nth-child(1) > div > h3 > a")
    public WebElement Electric_Vehicle_Population_Data ;
    @FindBy(how = How.CSS,css = "#dataset-resources > ul > li:nth-child(3) > div > a")
    public WebElement rdf_file;

    public WebElement getData_Catalog_Browse() {
        return Data_Catalog_Browse;
    }
    public WebElement getSubmit() {
        return Submit;
    }
    public WebElement getASSERT_TEXT_LABEL_RESULT() {
        return ASSERT_TEXT_LABEL_RESULT;
    }
    public void AssertResult(){
        Assert.assertEquals(ASSERT_TEXT_LABEL_RESULT.getText(),Constantes.TYPE_CAR_RESULT);
    }

    public void printIn_Browse(){
        driver.printIn(ASSERT_TEXT_LABEL_RESULT.getText());
    }

    public void CloseTest(){
        driver.close();
 }

    //Metodos Selenium Funciones / Acciones
    public void Click(WebElement element){
        element.click();
    }
    public void sendkey(WebElement element, String s){
        element.sendKeys(s);
    }

}
