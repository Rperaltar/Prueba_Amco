package SeleniumWebDriver.Screenshot;



import java.io.File;
import java.io.IOException;


public class Ashoot {

    public static WebDriver driver;

    public static void Screenshot() throws IOException {

        // Capturing a screenshot
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "C:\\Users\\Robert\\Documents\\Proyecto_Academy_Automation\\Curso_Java_Orientado_Objetos_&_Core\\src\\test\\java\\SeleniumWebDriver\\Screenshot\\screenshot.png";
        FileUtils.copyFile(screenshotFile, new File(screenshotPath));

    }

}
