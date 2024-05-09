package SeleniumWebDriver.POM;

import SeleniumWebDriver.Screenshot.Ashoot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.apache.logging.log4j.LogManager;


import java.io.IOException;

import static SeleniumWebDriver.POM.Constantes.PASSWORD;
import static SeleniumWebDriver.POM.Constantes.USER;



public class Test {

    public WebDriver driver;
    private ExtentReports extentReports;
    private ExtentTest extentTest;

    private static final Logger logger =  LogManager.getLogger(Test.class);


    @BeforeTest
    public void SetUp(){
        //Setting the driver path
        System.setProperty
                ("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Curso_Java_Orientado_Objetos_&_Core\\src\\drivers\\chromedriver.exe");
        //Creating WebDriver instance
        WebDriver driver = new ChromeDriver();
        //Navigate to web page
        driver.get("https://catalog.data.gov/dataset/");
        //Maximizing window
        driver.manage().window().maximize();

        // Initialize ExtentReports
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\Robert\\Documents\\Proyecto_Academy_Automation\\Curso_Java_Orientado_Objetos_&_Core\\src\\test\\java\\SeleniumWebDriver\\ExtentReport\\extent-report.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);

        extentTest = extentReports.createTest("Test Example");
    }
    @Test
    public Test() throws InterruptedException, IOException {
        Model object = new Model();
        Thread.sleep(10);
        object.sendkey(object.Data_Catalog_Browse,Constantes.TYPE_CAR);
        Thread.sleep(10);
        object.Click(object.Submit);
        Thread.sleep(10);
        object.Click(object.Electric_Vehicle_Population_Data);
        Thread.sleep(10);
        object.Click(object.rdf_file);
        Ashoot.Screenshot();
        object.AssertResult();
        object.printIn_Browse();
        logger.log(Level.ALL,"logTest");
        extentTest.log(Status.INFO, "Test PASSED");

    }

    @AfterTest
    public void CloseUp(){
        driver.close();
        extentReports.flush();
    }
}
