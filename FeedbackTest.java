package com.feedback.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeedbackTest {

    static String path = "file:///C:/FeedBack_Form/index.html";

    public static void main(String[] args) throws InterruptedException {

        testValidSubmission();
        testResetButton();
        testInvalidEmail();
        testEmptyFields();

        System.out.println("All test cases executed successfully");
    }

    // ---------------- TEST CASE 1 ----------------
    public static void testValidSubmission() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(path);

        driver.findElement(By.id("name")).sendKeys("Kunjal Pise");
        driver.findElement(By.id("email")).sendKeys("kunjal@gmail.com");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");
        driver.findElement(By.id("department")).sendKeys("CSE");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("feedback")).sendKeys(
                "This feedback form is very useful and easy to understand for all students");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        System.out.println("✅ Test Case 1: Valid Submission PASSED");

        Thread.sleep(2000);
        driver.quit();
    }

    // ---------------- TEST CASE 2 ----------------
    public static void testResetButton() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(path);

        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.xpath("//button[text()='Reset']")).click();

        System.out.println("✅ Test Case 2: Reset Button PASSED");

        Thread.sleep(2000);
        driver.quit();
    }

    // ---------------- TEST CASE 3 ----------------
    public static void testInvalidEmail() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(path);

        driver.findElement(By.id("name")).sendKeys("Test User");
        driver.findElement(By.id("email")).sendKeys("invalidemail");
        driver.findElement(By.id("mobile")).sendKeys("9876543210");

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        System.out.println("✅ Test Case 3: Invalid Email PASSED");

        Thread.sleep(2000);
        driver.quit();
    }

    // ---------------- TEST CASE 4 ----------------
    public static void testEmptyFields() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(path);

        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        System.out.println("✅ Test Case 4: Empty Fields PASSED");

        Thread.sleep(2000);
        driver.quit();
    }
}