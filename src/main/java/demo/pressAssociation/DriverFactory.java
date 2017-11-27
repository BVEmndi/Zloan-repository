package demo.pressAssociation;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell on 30-06-2017.
 */
public class DriverFactory {
    final String BROWSER="Chrome";
    final String url="https://www.pressassociation.com/";
    WebDriver driver;
    @Before
    public void setUp()
    {
        if(BROWSER.matches("Firefox"))
        {
            FirefoxDriverManager.getInstance().setup();
        driver= new FirefoxDriver();

          }
        else if(BROWSER.equals("Chrome"))
        {ChromeDriverManager.getInstance().setup();
            driver= new ChromeDriver();


        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@After
public void tearDown()
{
   driver.quit();
}
}
