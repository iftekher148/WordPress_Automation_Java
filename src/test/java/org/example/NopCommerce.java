package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NopCommerce extends DriverSetup {
        @Test
        public void TestLoadNopCommerceSite() throws InterruptedException {
            // Open browser
            //WebDriver driver = new ChromeDriver();

            // browser google homepage https://www.google.com/
            driver.get("https://demo.nopcommerce.com/");

           //Test case for title
            //Assert.assertEquals(driver.getTitle(), "nopCommerce demo store");
            //Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/"); //Test case for url

            //WebElement searchBar = driver.findElement(By.cssSelector("form > input"));
            //searchBar.sendKeys("I want Search");
            Thread.sleep(2000);

            WebElement clearSearch = driver.findElement(By.xpath("//form/input"));
            clearSearch.clear();
            WebElement searchBar = driver.findElement(By.cssSelector("form > input"));
            searchBar.sendKeys("Apple MacBook Pro 13-inch");
            Thread.sleep(2000);

            WebElement search_btn = driver.findElement(By.xpath("//button[@type='submit' and @class='button-1 search-box-button']"));
            System.out.println(search_btn.getText());

            WebElement click_btn = driver.findElement(By.cssSelector("button[type='submit'][class='button-1 search-box-button']"));
            click_btn.click();

            //WebElement linkClick = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a"));
            //linkClick.click();

            WebElement linkClick = driver.findElement(By.xpath("//a[@href='/apple-macbook-pro-13-inch']"));
            linkClick.click();
            Thread.sleep(5000);

            //WebElement addCart_btn = driver.findElement(By.xpath("//button[contains(@class, 'button-2 product-box-add-to-cart')]"));
            //addCart_btn.click();

            // Second cart button
            WebElement addSecond_btn = driver.findElement(By.xpath("//div/button[starts-with(@class,'button-1 add-to-cart-')]"));
            addSecond_btn.click();

            Thread.sleep(500);

            WebElement shoppingCart = driver.findElement(By.linkText("shopping cart"));
            shoppingCart.click();
            Thread.sleep(500);

            String totalUnitPrice = driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText();
            String totalActualPrice = driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText();

            //Test Case
            Assert.assertEquals(totalUnitPrice, "$1,800.00");
            Assert.assertEquals(totalActualPrice,"$3,600.00");

        }
}


