package uk.co.library.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    By jobTitle= By.id("keywords");
    By location=By.id("location");
    By distanceDropDown =By.id("distance");
    By moreSearchOptionsLink=By.id("toggle-hp-search");
    By salaryMin=By.id("salarymin");
    By salaryMax=By.id("salarymax");
    By salaryTypeDropDown=By.id("salarytype");
    By jobTypeDropDown=By.id("tempperm");
    By findJobsBtn=By.id("hp-search-btn");


    public HomePage(){
    PageFactory.initElements(driver,this);
}
    public void EnterJobTitle(String job) {
        this.sendTextToElement(this.jobTitle, job);
    }

    public void EnterLocation(String location){
       this.sendTextToElement(this.location,location);
    }
    public void selectDistance(String distance){
        sendTextToElement(distanceDropDown,distance);
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
    }
    public void EnterMinSalary(String min){
        sendTextToElement(salaryMin,min);
    }
    public void EnterMaxSalary(String max){
     sendTextToElement(salaryMax,max);
    }
    public void selectSalaryType(String salary){
        selectByVisibleTextFromDropDown(salaryTypeDropDown,salary);
    }
    public void selectJobType(String job){
        selectByVisibleTextFromDropDown(jobTypeDropDown,job);
    }
    public void clickOnFindJobsButton(){
        clickOnElement(findJobsBtn);
    }
  By cookiesButton= By.xpath("//button[@id='save']//span[contains(text(),'Accept All')]");

    public void acceptcookies() {
        //switch to frame
        driver.switchTo().frame("gdpr-consent-notice");
        // find the element inside the frame and send keys
        clickOnElement(cookiesButton);
        // switch back to default content
        driver.switchTo().defaultContent();

    }




}
