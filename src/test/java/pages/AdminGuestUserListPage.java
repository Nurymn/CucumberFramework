package pages;




import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdminGuestUserListPage {

    public AdminGuestUserListPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@href='/login']")
    public WebElement loginText;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButon;

    @FindBy(xpath = "//a[text()='Guest User']")
    public WebElement guestUserButton;

    @FindBy(xpath = "//h5[text()='Guest User List']")
    public WebElement guestListHeader;

    @FindBy(xpath = "//th[text()='Name Surname']")
    public WebElement nameHeader;

    @FindBy(xpath = "//th[text()='Phone Number']")
    public WebElement phoneNumberHeader;

    @FindBy(xpath = "//th[text()='Ssn']")
    public WebElement ssnHeader;

    @FindBy(xpath = "//th[text()='User Name']")
    public WebElement usernameHeader;

    @FindBy(xpath = "//div[text()=' Guest User deleted Successful']")
    public WebElement deletedMessage;

    @FindBy(xpath = "//span[text()='team19Guest']")
    public WebElement addedUser;

    @FindBy(xpath = "(//button[@type='button'])[6]")
    public WebElement deleteButton;


}
