package demo.pressAssociation;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Dell on 30-06-2017.
 */
public class SmokeTest1 extends DriverFactory{
    @Test
    public void runTest() {
        System.out.println("The Press Association site is opened");

driver.findElement(By.xpath("//*[@id='nav-menu-item-28890']/a/span[1]")).click();
        org.junit.Assert.assertTrue("Products", true);
        driver.findElement(By.xpath(".//*[@id='nav-menu-item-93208']/a/span[1]")).isSelected();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//*[@id='nav-menu-item-93208']/a/span[1]")).click();

        //driver.findElement(By.cssSelector("li#nav - menu - item - 93208")).click();
                //driver.findElement(By.cssSelector("https://www.pressassociation.com/media-content/uk-general-election-2017/")).isDisplayed();
                //driver.findElement(By.linkText("https://www.pressassociation.com/media-content/uk-general-election-2017/")).click();
                // driver.findElement(By.xpath(".//*[@id='nav-menu-item-37117']/a/span[1]")).click();
                // driver.findElement(By.xpath(".//*[@id='nav-menu-item-93208']/a/span[1]")).click();
                //  Assert.assertTrue("ELECTION 2017",true);
}
}




