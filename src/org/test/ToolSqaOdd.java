package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolSqaOdd {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Dropdown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("http://toolsqa.com/automation-practice-form/");
	d.manage().window().maximize();
	WebElement selecomm = d.findElement(By.id("selenium_commands"));
    Select s= new Select (selecomm);
    List<WebElement> allop = s.getOptions();
    for(int i=0;i<allop.size();i++) {
    	if(i%2==0) {
    		WebElement li = allop.get(i);
    		String name = li.getText();
            System.out.println(name);    	
    	}
    }
}
}
