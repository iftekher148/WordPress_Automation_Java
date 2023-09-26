package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Footer extends DriverSetup{
    @Test
    public void TestFooter() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");

        WebElement sitemap = driver.findElement(By.linkText("Sitemap"));
        System.out.println(sitemap.getText());

        WebElement shipping_returns = driver.findElement(By.linkText("Shipping & returns"));
        System.out.println(shipping_returns.getText());

        WebElement privacyNotice = driver.findElement(By.linkText("Privacy notice"));
        System.out.println(privacyNotice.getText());

        WebElement contactUs = driver.findElement(By.linkText("Contact us"));
        System.out.println(contactUs.getText());
        contactUs.click();
        Thread.sleep(5000);

    }

}
