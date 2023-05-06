package pages;



import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomeRegisterPage {

    public HomeRegisterPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement register;

    @FindBy(xpath = "//div[text()='Register']")
    public WebElement registerHeader;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surnameBox;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlaceBox;

    @FindBy(xpath ="//input[@id='phoneNumber']")
    public WebElement phoneBox;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleCheckBox;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleCheckBox;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement birthDayBox;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnBox;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement registerButton;


    @FindBy(xpath = "//div[text()='Guest User registered.']")
    public WebElement guestUserRegistered;

    @FindBy(xpath = "//div[text()='Required']")
    public WebElement requiredText;

    @FindBy(xpath = "//div[text()='Please enter valid SSN number']")
    public WebElement ssnHataMesaji;

    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']")
    public WebElement ssnRequired;
    //div[text()='Error: User with ssn 654-92-1111 already register']
    @FindBy(xpath = "//div[text()='Error: User with ssn 654-92-1111 already register']")
    public WebElement ssnAlreadyRegisterMessage;

    @FindBy(xpath = "//div[text()='Error: User with username team17 already register']")
    public WebElement usernameMessage;

    @FindBy(xpath ="//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']" )
    public WebElement errorMessage;

    @FindBy(xpath = "//div[text()='Minimum 8 character']")
    public WebElement passwordRequired;

    @FindBy(xpath = "//div[text()='geçmiş bir tarih olmalı']")
    public WebElement dateMessage;

    @FindBy(xpath = "//div[text()='Please enter valid phone number']")
    public WebElement phoneMessage;

    @FindBy(xpath = "//div[text()='Minimum 12 character (XXX-XXX-XXXX)']")
    public WebElement phoneRequired;

    @FindBy(xpath = "//div[text()='Error: User with phone number 111-111-1111 already register']")
    public WebElement phoneAlreadyRegisterMessage;



}
