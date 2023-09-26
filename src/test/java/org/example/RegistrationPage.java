package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegistrationPage extends DriverSetup{
    @Test
    public void TestRegistrationPage() throws InterruptedException {

        driver.get("https://demo.nopcommerce.com/");

        //click on registration
        WebElement registrationLink = driver.findElement(By.linkText("Register"));
        registrationLink.click();

        //Gender Select
        WebElement genderSelect =  driver.findElement(By.id("gender-male"));
        genderSelect.click();

        //Enter First Name
        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Rubel");

        //Enter Last name
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Hossain");

        //Date Of Birth
        //WebElement daySelect = driver.findElement(By.name("DateOfBirthMonth"));
        //Select select = new Select(daySelect);
        //select.selectByValue("3");

        // Date of Birth
        Select dayDropdown = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dayDropdown.selectByValue("4");

        Select monthDropdown = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        monthDropdown.selectByVisibleText("April");

        Select yearDropdown = new Select(driver.findElement(By.name("DateOfBirthYear")));
        yearDropdown.selectByIndex(5);

        // Enter email
        WebElement emailAddress = driver.findElement(By.xpath("//input[@id='Email']"));
        emailAddress.sendKeys("abc123@gmail.com");

        // Company Name
        WebElement companyName = driver.findElement(By.cssSelector("input[id='Company']"));
        companyName.sendKeys("Bangladeshi Company");

        WebElement newsletter = driver.findElement(By.xpath("//input[@name='Newsletter']"));
        newsletter.click();

        // Password and confirm Password
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("123abc");
        WebElement confirmPassWord = driver.findElement(By.name("ConfirmPassword"));
        confirmPassWord.sendKeys("123abc");

        //Registration click
        WebElement registration_btn = driver.findElement(By.xpath("//div/button"));
        registration_btn.click();


        Thread.sleep(5000);


    }
}
