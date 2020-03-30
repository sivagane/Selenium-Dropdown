package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinRoomBooking {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Dropdown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://adactin.com/HotelApp/");
	WebElement NewReg = d.findElement(By.xpath("//a[@href='Register.php']"));
    NewReg.click();
    
    WebElement User = d.findElement(By.id("username"));
    User.sendKeys("SivaAdactin1990");
    
    WebElement Pass = d.findElement(By.id("password"));
    Pass.sendKeys("08091990adac");
    
    WebElement CPass = d.findElement(By.id("re_password"));
    CPass.sendKeys("08091990adac");
    
    WebElement FName = d.findElement(By.id("full_name"));
    FName.sendKeys("SivaGanesh");
    
    WebElement EmailId = d.findElement(By.id("email_add"));
    EmailId.sendKeys("sivag918@gmail.com");
    
    WebElement Captcha = d.findElement(By.id("captcha-form"));
    Captcha.sendKeys("");
    
    WebElement AgreeBtn = d.findElement(By.id("tnc_box"));
    AgreeBtn.click();
    
    WebElement RegBtn = d.findElement(By.id("Submit"));
    RegBtn.click();
 }
}
