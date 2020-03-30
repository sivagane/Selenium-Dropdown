package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PassportForm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Dropdown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	WebElement radio = d.findElement(By.id("cpvLocationPO"));
    radio.click();
    
    WebElement location = d.findElement(By.id("dcdrLocation"));
    Select s= new Select(location);
    s.selectByVisibleText("Chennai");
    
    WebElement name = d.findElement(By.name("givenName"));
    name.sendKeys("Sivaganesh");

    WebElement sur = d.findElement(By.name("surname"));
    sur.sendKeys("Hamam");
    Thread.sleep(3000);
    WebElement date = d.findElement(By.id("dob"));
    String dateval="08/09/1990";
    calender( d, date, dateval);
    
    WebElement Emid = d.findElement(By.name("email"));
    Emid.sendKeys("siva@gmail.com");
    Thread.sleep(3000);
    WebElement radio1 = d.findElement(By.id("emailloginSameno"));
    radio1.click();
    
    WebElement logid = d.findElement(By.name("loginId"));
    logid.sendKeys("0809siva");
    Thread.sleep(3000);
    WebElement pass = d.findElement(By.name("pwd"));
    pass.sendKeys("08091990");
    
    WebElement cpass = d.findElement(By.name("confirmPwd"));
    cpass.sendKeys("08091990");
    Thread.sleep(3000);
    WebElement hq = d.findElement(By.id("hintQues"));
    Select s1=new Select(hq);
    s1.selectByVisibleText("Favourite Cricketer");
 
    WebElement hs = d.findElement(By.name("hintAns"));
    hs.sendKeys("M S Dhoni");
    Thread.sleep(3000);
    WebElement captcha = d.findElement(By.name("test123"));
    captcha.sendKeys("YC8WFFEK");
    Thread.sleep(3000);
    WebElement register = d.findElement(By.id("frmSample_register"));
    register.click();
}

public static void calender(WebDriver d,WebElement webelement,String dateval) {
JavascriptExecutor js=((JavascriptExecutor)d);
js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", webelement);
}
}
