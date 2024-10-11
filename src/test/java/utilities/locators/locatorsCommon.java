package utilities.locators;

import org.openqa.selenium.By;

public class locatorsCommon {
    //Create account Link
    public By lnkCreateAcc = By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']");
    //Sign in Link
    public By lnkSignIn = By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]");
}