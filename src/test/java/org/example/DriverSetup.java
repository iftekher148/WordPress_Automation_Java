package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {

    //Declare global variable
    public WebDriver driver;

    //Return driver && driver will execute First using BeforeSuite
    @BeforeSuite
    public WebDriver setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    //No return(Void) && this method execute last using AfterSuite
    @AfterSuite
    public void closeDriver(){
        driver.quit();
    }
}
