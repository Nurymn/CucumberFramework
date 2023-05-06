package pages;



import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactPage {
    public ContactPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactButton;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@id='subject']")
    public WebElement subjectBox;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[text()='Send Message']")
    public WebElement sendMessageButton;

    @FindBy(xpath = "//div[text()='Contact Message Created Successfully']")
    public WebElement messageCreatedSucces;

    @FindBy(xpath = "//div[text()='Please enter valid email']")
    public WebElement invalidEmailMessage;

    @FindBy(xpath = "//div[text()='size must be between 5 and 80']")
    public WebElement emptyEmailBoxMessage;



}
