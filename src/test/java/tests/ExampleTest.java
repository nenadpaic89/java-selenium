package tests;

import environment.EnvironmentManager;
import environment.RunEnvironment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
    }

    @Test
    public void example() {
        WebDriver driver = RunEnvironment.getWebDriver();
        driver.get("https://www.vivifyscrum.com");
        String url = driver.findElement(By.className("vsp-c-site-logo__img")).getAttribute("href");
        assertEquals("https://www.vivifyscrum.com/", url);
    }

    @After
    public void tearDown() {
        EnvironmentManager.shutdownDriver();
    }
}
