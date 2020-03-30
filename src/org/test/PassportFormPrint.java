package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassportFormPrint {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Dropdown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	d.manage().window().maximize();
	List<WebElement> allop = d.findElements(By.id("dcdrLocation"));
    for (WebElement x : allop) {
		String ofiLoc = x.getText();
		System.out.println(ofiLoc);
	}
}
}
