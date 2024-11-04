package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {
    //var web element

    @FindBy(name = "username")
    WebElement inputUsername;
    @FindBy(name = "password")
    WebElement inputPassword;
    @FindBy(tagName = "button")
    WebElement loginButton;
    public HomePage(){

        PageFactory.initElements(driver, this);

    }
    //methods actions that we perform in the web app
    public void  enterUserName(String username){
        inputUsername.sendKeys(username);
    }
    public void enterPassword(String password){
        inputPassword.sendKeys(password);
    }
    public void clickOnLogin(){
        loginButton.click();

    }
    public void doLogin(String username, String password){
        enterUserName(username);
        enterPassword(password);
        clickOnLogin();
    }

}