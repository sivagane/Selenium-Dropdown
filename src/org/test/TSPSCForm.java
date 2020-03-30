package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TSPSCForm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\Selenium Dropdown\\div\\chromedriver.exe");
	WebDriver d= new ChromeDriver();
	d.get("https://www.tspsc.gov.in/index.jsp");
	WebElement Newreg = d.findElement(By.xpath("(//div[@class='regright'])[1]"));
	Newreg.click();
	
	Set<String> allwinh = d.getWindowHandles();
    List<String>li=new ArrayList();
    li.addAll(allwinh);
    String id = li.get(1);
    d.switchTo().window(id);
    
    WebElement aadhar = d.findElement(By.id("aadhdarNo"));
    aadhar.sendKeys("213456975");
    
    WebElement aadharname = d.findElement(By.id("aadhdarName"));
    aadharname.sendKeys("A Sivaganesh");
    
    WebElement Name = d.findElement(By.id("candidateName"));
    Name.sendKeys("A Sivaganesh");
    
    WebElement Radio = d.findElement(By.id("gender"));
    Radio.click();
    
    WebElement dob = d.findElement(By.id("dob"));
    dob.sendKeys("08/09/1990");
    Thread.sleep(3000);
    WebElement District = d.findElement(By.id("nativeDistrict"));
    Select s=new Select(District);
    s.selectByVisibleText("Hyderabad");
    Thread.sleep(3000);
    WebElement Mandal = d.findElement(By.id("nativeMandal"));
    Select s1=new Select(Mandal);
    s1.selectByVisibleText("Amberpet");
    Thread.sleep(3000);
    WebElement Village = d.findElement(By.id("nativeVillage"));
    Village.sendKeys("Nattu");
    
    WebElement community = d.findElement(By.id("community"));
    Select s2= new Select(community);
    s2.selectByVisibleText("BC-A");
    Thread.sleep(3000);
    WebElement FName = d.findElement(By.id("fatherName"));
    FName.sendKeys("R Arumugam");
    
    WebElement MName = d.findElement(By.id("motherName"));
    MName .sendKeys("A Usharani");
    
    WebElement MTongue = d.findElement(By.id("motherTongue"));
    Select s3= new Select(MTongue);
    s3.selectByVisibleText("Tamil");
    Thread.sleep(3000);
    WebElement Relegion = d.findElement(By.id("religion"));
    Select s4=new Select(Relegion);
    s4.selectByVisibleText("Hindu");
    
    WebElement Im1 = d.findElement(By.id("identificationMark1"));
    Im1.sendKeys("A Mole in the Left Ear");

    WebElement Im2 = d.findElement(By.id("identificationMark2"));
    Im2.sendKeys("A Mole in the Right Knee");
    Thread.sleep(3000);
    WebElement isph = d.findElement(By.xpath("(//input[@id='isPh'])[2]"));
    isph.click();
    
    WebElement isEx = d.findElement(By.xpath("(//input[@id='isEx'])[2]"));
   isEx.click();
   
   WebElement isCensus = d.findElement(By.xpath("(//input[@id='isCensus'])[2]"));
   isCensus.click();
   Thread.sleep(3000);
   WebElement isNcc = d.findElement(By.xpath("(//input[@id='isNcc'])[2]"));
   isNcc.click();
   
   WebElement isGov = d.findElement(By.xpath("(//input[@id='isGovt'])[2]"));
   isGov.click();
   
   WebElement isClaim = d.findElement(By.xpath("(//input[@id='isClaim'])[2]"));
   isClaim.click();
   
   WebElement isClaimAge = d.findElement(By.xpath("(//input[@id='isAgeClaim'])[2]"));
   isClaimAge.click();
   Thread.sleep(3000);
   WebElement Addr = d.findElement(By.id("commAddress1"));
   Addr.sendKeys("No 83");
   
   WebElement Addr1 = d.findElement(By.id("commAddress2"));
   Addr1.sendKeys("Amabalthadaiyar Street");
   
   WebElement Addr2 = d.findElement(By.id("commAddress3"));
   Addr2.sendKeys("Pudhucherry");
   
   WebElement Addr3 = d.findElement(By.id("commState"));
   Addr3.sendKeys("Pudhucherry");
   
   WebElement Addr4 = d.findElement(By.id("commPincode"));
   Addr4.sendKeys("605 001");
   Thread.sleep(3000);
   WebElement Saddr = d.findElement(By.id("isSameAddress"));
   Saddr.click();
   
   Thread.sleep(3000);
   WebElement EmailId = d.findElement(By.xpath("//input[@name='dyna(emailId)']"));
   EmailId.sendKeys("sivag918@gmail.com");
   
   WebElement Mobileno = d.findElement(By.id("mobileNo"));
  Mobileno.sendKeys("9750364352");
  
  WebElement TsRadio = d.findElement(By.xpath("(//input[@id='typeOfStudy'])[1]"));
  TsRadio.click();
  
  WebElement std1 = d.findElement(By.id("firstClassDistrict"));
  Select s5=new Select(std1);
  s5.selectByIndex(2);
  Thread.sleep(3000);
  WebElement schoolStd1 = d.findElement(By.id("firstClassSchool"));
  schoolStd1.sendKeys("RanaKrishna hr.sec.School");
  
  WebElement std2 = d.findElement(By.id("secondClassDistrict"));
  Select s6=new Select(std2);
  s6.selectByIndex(2);

  
  WebElement schoolStd2 = d.findElement(By.id("secondClassSchool"));
  schoolStd2.sendKeys("RanaKrishna hr.sec.School");
  Thread.sleep(3000);
  
  WebElement std3 = d.findElement(By.id("thirdClassDistrict"));
  Select s7=new Select(std3);
  s7.selectByIndex(2);

  WebElement schoolStd3 = d.findElement(By.id("thirdClassSchool"));
  schoolStd3.sendKeys("RanaKrishna hr.sec.School");
  
  WebElement std4 = d.findElement(By.id("fourthClassDistrict"));
  Select s8=new Select(std4);
  s8.selectByIndex(2);

  
  WebElement schoolStd4 = d.findElement(By.id("fourthClassSchool"));
  schoolStd4.sendKeys("RanaKrishna hr.sec.School");
  
  WebElement std5 = d.findElement(By.id("fifthClassDistrict"));
  Select s9=new Select(std5);
  s9.selectByIndex(2);

  WebElement schoolStd5 = d.findElement(By.id("fifthClassSchool"));
  schoolStd5.sendKeys("RanaKrishna hr.sec.School");

  WebElement std6 = d.findElement(By.id("sixthClassDistrict"));
  Select s10=new Select(std6);
  s10.selectByIndex(2);

  
  WebElement schoolStd6 = d.findElement(By.id("sixthClassSchool"));
  schoolStd6.sendKeys("RanaKrishna hr.sec.School");
  
  WebElement std7 = d.findElement(By.id("seventhClassDistrict"));
  Select s11=new Select(std7);
  s11.selectByIndex(2);

  WebElement schoolStd7 = d.findElement(By.id("seventhClassSchool"));
  schoolStd7.sendKeys("RanaKrishna hr.sec.School");
  
  Thread.sleep(3000);

  WebElement std8 = d.findElement(By.id("eighthClassDistrict"));
  Select s12=new Select(std8);
  s12.selectByIndex(2);

  WebElement schoolStd8 = d.findElement(By.id("eighthClassSchool"));
  schoolStd8.sendKeys("RanaKrishna hr.sec.School");
  
  WebElement std9 = d.findElement(By.id("ninthClassDistrict"));
  Select s13=new Select(std9);
  s13.selectByIndex(2);

  WebElement schoolStd9 = d.findElement(By.id("ninthClassSchool"));
  schoolStd9.sendKeys("RanaKrishna hr.sec.School");
 
  WebElement District1 = d.findElement(By.id("ssc"));
  Select s14=new Select(District1);
  s14.selectByVisibleText("Hyderabad");
  Thread.sleep(3000);
  WebElement Board = d.findElement(By.id("sscBoard"));
  Board.sendKeys("Matriculation");
  
  WebElement HTRoll = d.findElement(By.id("sscHT_no"));
  HTRoll.sendKeys("293975089");
  
  WebElement Monthpass = d.findElement(By.id("sscDOP_MON"));
  Select s15=new Select(Monthpass);
  s15.selectByVisibleText("May");
  Thread.sleep(3000);
  WebElement Yearpass = d.findElement(By.id("sscDOP_YEAR"));
  Select s16=new Select(Yearpass);
  s16.selectByVisibleText("2018");
  
  WebElement Percentage = d.findElement(By.id("ssc_grade"));
  Percentage.sendKeys("75");
  
  WebElement District2 = d.findElement(By.id("localDistrict"));
  Select s17=new Select(District2);
  s17.selectByVisibleText("Hyderabad");
  
  WebElement Zone = d.findElement(By.id("zoneBelongs"));
  Select s18=new Select(Zone);
  s18.selectByIndex(2);
  Thread.sleep(3000);
  WebElement District3 = d.findElement(By.id("intermediate"));
  Select s19= new Select(District3);
  s19.selectByVisibleText("Hyderabad");
  
  WebElement Board12 = d.findElement(By.id("intermediateBoard"));
  Board12.sendKeys("Matriculation");
  
  WebElement Group = d.findElement(By.id("intermediateGroup"));
  Select s20=new Select(Group);
  s20.selectByVisibleText("Inter M.P.C");
  Thread.sleep(3000);
  WebElement MOPass = d.findElement(By.id("intermediateDOP_MON"));
  Select s21=new Select(MOPass);
  s21.selectByVisibleText("May");
  
  WebElement YOPass = d.findElement(By.id("intermediateDOP_YEAR"));
  Select s22=new Select(YOPass);
  s22.selectByVisibleText("2018");
  
  WebElement HTNumber = d.findElement(By.id("intermediateHT_no"));
  HTNumber.sendKeys("293975086");
  
  WebElement ClgName = d.findElement(By.id("intermediate_clg"));
  ClgName.sendKeys("RanaSaheb hr. sec. School");
  
  WebElement Percentage1= d.findElement(By.id("intermediate_grade"));
  Percentage1.sendKeys("80");
  Thread.sleep(3000);
  WebElement District4 = d.findElement(By.id("degree"));
  Select s23=new Select(District4);
  s23.selectByVisibleText("Hyderabad");
  
  WebElement Univ = d.findElement(By.id("degreeUniversity"));
  Select s24= new Select(Univ);
  s24.selectByIndex(1);

  WebElement Group1 = d.findElement(By.id("degreeGroup"));
  Select s25=new Select(Group1);
  s25.selectByIndex(16);
  
  WebElement MOPassDeg = d.findElement(By.id("degreeDOP_MON"));
  Select s26=new Select(MOPassDeg);
  s26.selectByIndex(6);
  
  WebElement YOPassDeg = d.findElement(By.id("degreeDOP_YEAR"));
  Select s27= new Select(YOPassDeg);
  s27.selectByVisibleText("2018");
  
  
  WebElement HTNumberDeg = d.findElement(By.id("degree_no"));
  HTNumberDeg.sendKeys("293975087");
  
  WebElement ClgNameDeg = d.findElement(By.id("degree_clg"));
  ClgNameDeg.sendKeys("RanaSahaeb College of Engineering and Technology");
  
  WebElement GradeClg = d.findElement(By.id("degree_grade"));
  GradeClg.sendKeys("85");
  Thread.sleep(3000);
  WebElement AnyJob = d.findElement(By.id("interestAlerts1"));
  AnyJob.click();
  Thread.sleep(3000);
  WebElement Declaration = d.findElement(By.id("declaration"));
  Declaration.click();
  
  WebElement PreviewBtn = d.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
  PreviewBtn.click();
}
}
