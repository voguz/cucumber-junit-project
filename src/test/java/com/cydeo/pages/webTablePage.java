package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class webTablePage {


    public webTablePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="username")
    public WebElement inputUsername;

    @FindBy(name="password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    //This method will accept username password login

    public void login(String user,String pass){
        inputUsername.sendKeys(user);
        inputPassword.sendKeys(pass);
        loginButton.click();

    }

}
