package pages;



import utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddMeetPage {

    public AddMeetPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//button[text()='Menu']")
    public WebElement menuButton;

    @FindBy(xpath = "//a[text()='Meet Management']")
    public WebElement meetManagementButton;

    @FindBy(xpath = "//label[text()='Choose Students']")
    public WebElement chooseStudentsHeader;

    @FindBy(xpath = "//label[text()='Date Of Meet']")
    public WebElement dateofMeetHeader;

    @FindBy(xpath = "//label[text()='Start Time']")
    public WebElement startTimeHeader;

    @FindBy(xpath = "//label[text()='Stop Time']")
    public WebElement stopTimeHeader;

    @FindBy(xpath = "//label[text()='Description']")
    public WebElement descriptionHeader;

    @FindBy(xpath = "//div[@class=' css-b62m3t-container']")
    public WebElement selectStudentsBox;

    @FindBy(xpath = "//div[text()='gullfe ulu']")
    public WebElement assertAddedStudent;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement dateBox;

    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTimeBox;

    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stopTimeBox;

    @FindBy(xpath = "//input[@id='description']")
    public WebElement descriptionBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[text()='Meet Saved Successfully']")
    public WebElement meetSavedMessage;

    @FindBy(xpath = "//div[text()='must be a future date']")
    public WebElement dateError;

    @FindBy(xpath = "//div[text()='Error: start time must not be greater than or equal to stop time']")
    public WebElement timeError;

    @FindBy(xpath = "//div[@class='Toastify__toast-icon Toastify--animate-icon Toastify__zoom-enter']")
    public WebElement popUp;

    @FindBy(xpath = "//div[@aria-label='Remove gullfe ulu']")
    public WebElement removeAddedStudent;

    @FindBy(xpath = "//h3[text()='Meet Management']")
    public WebElement header;

    @FindBy(xpath = "//i[@class='fa-solid fa-trash']")
    public WebElement deleteStudent;









}
