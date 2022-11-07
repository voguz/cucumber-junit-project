package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyAlbumPage {

    public FamilyAlbumPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//input[@id='ctl00_MainContent_username']")
        public WebElement userName;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passWord;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_login_button']")
    public WebElement LoginButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement order;

    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement dropDown;

    @FindBy (xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']//option[.='FamilyAlbum']")
    public WebElement familyAlbum;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement Quantity;

    @FindBy (xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement nameInfo ;



    }


