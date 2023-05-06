package hooks;



import utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

    /*
    Hooks : Her bir Scenario ya da Scenario Outline dan ONCE ya da SONRA calismasini istedigim methodlar konur
    @Before ve @After methodlarini icerir
    Burada onemli olan raporlama isleminin ekran goruntusuyle birlikte Hooks yardimiyla yapilmasidir.
     */

    @Before
    public void setUpScenarios(){
        System.out.println("Before Methodu");
    }

    @After
    public void tearDownScenarios(Scenario scenario){
        //Eger bir Scenario fail ederse ekran goruntusunu al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //              ekran goruntusu            file tipi           ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName());
        }
        Driver.closeDriver();
    }
}

