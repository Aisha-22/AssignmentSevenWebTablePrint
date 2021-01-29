package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PrintWebTable {
    public void actionPrintWebTable() throws InterruptedException {
        // Set system properties of Chrome Browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Hlatshwayo\\Desktop\\chromedriver.exe");

        // Create a driver Object based on the Browser (Instance of a chromedriver)
        WebDriver driver = new ChromeDriver(); // x objectname = operator class();
        // Load website
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice"); //Simply opening the web browser and telling it to go to the url
        /*Implicit wait is all way applicable for the Entire page, it will make sure that the page is loaded if there is any slowness and it will not wait more than
        30Secs
         */
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);/*This will wait maximum 30Secs to make sure your pages is loaded, Entire DOM of the
//        page is loaded*/

        System.out.println("****Scenario -> WebTable Print****");
        System.out.println("****1. Print Number of Rows //Output-11****");
        int rowsNumber = driver.findElements(By.xpath("//body/div[3]/div[1]/fieldset[1]/table[1]/tbody/tr")).size();
        System.out.println("Number of are: " + rowsNumber ); //Concatenation -> Join multiple strings into a single string
        Thread.sleep(3000);

        System.out.println("****2. Number of Columns//Output-3****");
        int colsNumber = driver.findElements(By.xpath("//body/div[3]/div[1]/fieldset[1]/table[1]/tbody/tr[1]/th")).size();
        System.out.println("Number of are: " + colsNumber ); //Concatenation -> Join multiple strings into a single string

        System.out.println("****3. Print Data in Row3****");
        System.out.println(driver.findElement(By.xpath("//body/div[3]/div[1]/fieldset[1]/table[1]/tbody/tr[4]")).getText());

    }
}
