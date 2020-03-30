package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSPSCPrintDistrict {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Dropdown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.tspsc.gov.in/index.jsp");
	WebElement NewReg = d.findElement(By.xpath("(//div[@class='regright'])[1]"));
    NewReg.click();
    
    Set<String> allwinh = d.getWindowHandles();
    List<String>li=new ArrayList();
    li.addAll(allwinh);
    String id = li.get(1);
    d.switchTo().window(id);
    
    List<WebElement> allop = d.findElements(By.id("nativeDistrict"));
    for (WebElement x : allop) {
		String DName = x.getText();
		System.out.println(DName);
	}
}
}
