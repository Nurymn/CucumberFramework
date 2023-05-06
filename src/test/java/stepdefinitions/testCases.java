package stepdefinitions;

import com.github.javafaker.Faker;
import pages.AddMeetPage;
import pages.AdminGuestUserListPage;
import pages.ContactPage;
import pages.HomeRegisterPage;
import utilities.Driver;
import utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class testCases {
    HomeRegisterPage homeRegisterPage = new HomeRegisterPage();
    AdminGuestUserListPage adminGuestUserListPage = new AdminGuestUserListPage();

    ContactPage contactPage = new ContactPage();

    AddMeetPage addMeetPage = new AddMeetPage();
    Faker faker = new Faker();

    @Given("Kullanici anasayfaya gider.")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get("http://139.59.159.36:3000/");
    }
    @Given("Register yazisina tiklar.")
    public void register_yazisina_tiklar() {
        homeRegisterPage.register.click();
    }
    @When("Register sayfasini goruntuler.")
    public void register_sayfasini_goruntuler() {
        Assert.assertTrue(homeRegisterPage.registerHeader.isDisplayed());
    }
    @When("Name alanina valid data girer.")
    public void name_alanina_valid_data_girer() {
        homeRegisterPage.nameBox.sendKeys(faker.name().firstName());
    }
    @When("Surname alanina valid data girer.")
    public void surname_alanina_valid_data_girer() {
        homeRegisterPage.surnameBox.sendKeys(faker.name().lastName());
    }
    @When("Birth place alanina valid data girer.")
    public void birth_place_alanina_valid_data_girer() {
        homeRegisterPage.birthPlaceBox.sendKeys(faker.country().name());
    }
    @When("Phone alanina valid data girer.")
    public void phone_alanina_valid_data_girer() {
        homeRegisterPage.phoneBox.sendKeys(faker.number().
                digits(3),"-",faker.number().digits(3),"-",faker.number().digits(4));
    }
    @When("Female checkbox`ina tiklar.")
    public void female_checkbox_ina_tiklar() {
        Driver.clickWithJS(homeRegisterPage.femaleCheckBox);
    }
    @When("Date of birth alanina valid data girer.")
    public void date_of_birth_alanina_valid_data_girer() {
        homeRegisterPage.birthDayBox.sendKeys("12121993");

    }
    @When("Ssn alanina valid data girer.")
    public void ssn_alanina_valid_data_girer() {
        homeRegisterPage.ssnBox.sendKeys(faker.number().
                digits(3),"-",faker.number().digits(2),"-",faker.number().digits(4));
    }
    @When("Username alanina valid data girer.")
    public void username_alanina_valid_data_girer() {
        homeRegisterPage.userNameBox.sendKeys(faker.name().username());
    }
    @When("Password alanina valid data girer.")
    public void password_alanina_valid_data_girer() {
        homeRegisterPage.passwordBox.sendKeys(faker.internet().password());
    }

    @Then("Kaydin gerceklestigine dair mesajin goruntulendigini dogrular.")
    public void kaydin_gerceklestigine_dair_mesajin_goruntulendigini_dogrular() {
        Driver.wait(2);
        Assert.assertTrue(homeRegisterPage.guestUserRegistered.isDisplayed());
    }
    @Then("Sayfayi kapat")
    public void sayfayi_kapat() {
        Driver.getDriver().close();
        Driver.wait(5);
    }

    @Then("Name alaninin altinda required yazisinin goruntulendigini dogrular.")
    public void name_alaninin_altinda_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(homeRegisterPage.requiredText.isDisplayed());
    }

    @When("Surname alaninin altinda required yazisinin goruntulendigini dogrular.")
    public void surname_alaninin_altinda_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(homeRegisterPage.requiredText.isDisplayed());
    }

    @When("Birth place alaninin altinda required yazisinin goruntulendigini dogrular.")
    public void birth_place_alaninin_altinda_yazisinin_goruntulendigini_dogrular() {
        Assert.assertTrue(homeRegisterPage.requiredText.isDisplayed());
    }

    @When("Ssn alanına valid olmayan data harf girer.")
    public void ssn_alanına_valid_olmayan_data_harf_girer() {
        homeRegisterPage.ssnBox.sendKeys("aaa-aa-aaaa");
    }
    @Then("Ssn alanında geçersiz veri girildiğine dair mesaj görüntüler.")
    public void ssn_alanında_geçersiz_veri_girildiğine_dair_mesaj_görüntüler() {
        Driver.wait(2);
        Assert.assertTrue(homeRegisterPage.ssnHataMesaji.isDisplayed());
    }
    @When("Ssn alanındaki datayı siler.")
    public void ssn_alanındaki_datayı_siler() {
        homeRegisterPage.ssnBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,
                Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
    }
    @When("Ssn alanına valid olmayan bir data girer.")
    public void ssn_alanına_valid_olmayan_bir_data_olmadan_rakam_girer() {
        homeRegisterPage.ssnBox.sendKeys("11111111111");
    }
    @Then("Ssn alanında geçersiz bir veri girildiğine dair popup mesajını görüntüler.")
    public void ssn_alanında_geçersiz_bir_veri_girildiğine_dair_popup_mesajını_görüntüler() {
        Assert.assertTrue(homeRegisterPage.ssnHataMesaji.isDisplayed());
    }
    @When("Ssn alanına valid olmayan bir data karakter fazla girer.")
    public void ssn_alanına_valid_olmayan_bir_data_karakterden_fazla_girer() {
        homeRegisterPage.ssnBox.sendKeys("111-22-1111-1");
    }
    @When("Ssn alanına valid olmayan bir data karakter az girer.")
    public void ssn_alanına_valid_olmayan_bir_data_karakterden_az_girer() {
        homeRegisterPage.ssnBox.sendKeys("111-22-");
    }
    @Then("Ssn alanının altında uyari mesajının görüntülendiğini doğrular.")
    public void ssn_alanının_altında_uyari_mesajının_görüntülendiğini_doğrular() {
        Driver.wait(2);
        Assert.assertTrue(homeRegisterPage.ssnRequired.isDisplayed());
    }
    @When("Daha önce kayıt olan bir ssn no girer.")
    public void daha_önce_kayıt_olan_bir_ssn_no_girer() {
        homeRegisterPage.ssnBox.sendKeys("654-92-1111");
    }
    @Then("Ssn no'sunun daha önce kullanıldığına dair hata mesajı alır.")
    public void ssn_no_sunun_daha_önce_kullanıldığına_dair_hata_mesajı_alır() {

        Assert.assertTrue(homeRegisterPage.ssnAlreadyRegisterMessage.isDisplayed());
    }

    @When("Register butonuna tiklar.")
    public void register_butonuna_tıklar() {
//        Actions action = new Actions(Driver.getDriver());
//        action.scrollToElement(homeRegisterPage.registerButton);
        Driver.clickWithJS(homeRegisterPage.registerButton);
    }
    @When("Kaydın gerçekleştiğine dair mesajının görüntülendiğini doğrular")
    public void kaydın_gerçekleştiğine_mesajının_görüntülendiğini_doğrular() {
        Driver.wait(1);
        Assert.assertTrue(homeRegisterPage.guestUserRegistered.isDisplayed());
    }
    @When("Daha önce girdiği username'i username alanına girer.")
    public void daha_önce_girdiği_username_i_username_alanına_girer() {
        homeRegisterPage.userNameBox.sendKeys("team17");
    }
    @Then("Daha önce kullanılmış bir username olduğuna dair hata mesajı alir")
    public void daha_önce_kullanılmış_bir_username_olduğuna_dair_hata_mesajı_alir() {
        Assert.assertTrue(homeRegisterPage.usernameMessage.isDisplayed());
    }

    @Then("Password alanına geçerli olmayan karakterden az bir veri girer")
    public void password_alanına_geçerli_olmayan_karakterden_az_bir_veri_girer() {
        homeRegisterPage.passwordBox.sendKeys(faker.number().digits(7));
    }
    @Then("Password alanının altında bir uyarı mesajı görecektir")
    public void password_alanının_altında_bir_uyarı_mesajı_görecektir() {
        Assert.assertTrue(homeRegisterPage.passwordRequired.isDisplayed());
    }

    @When("Ay kısmına geçerli olmayan bir veri girer ve uygulanmadigini dogrular.")
    public void date_of_birth_alanında_ay_kısmına_geçerli_olmayan_bir_veri_girer() {
        Integer a = faker.number().numberBetween(13,99);
        Integer b = faker.number().numberBetween(1,31);
        Integer c = faker.number().numberBetween(1940,2022);
        String x=a.toString();
        String y=b.toString();
        String z=c.toString();
        homeRegisterPage.birthDayBox.sendKeys(x,y,z);
        Assert.assertFalse(homeRegisterPage.birthDayBox.getText().contains(x));
    }


    @Then("Gün kısmına geçerli olmayan bir veri girer ve uygulanmadigini dogrular.")
    public void date_of_birth_alanında_gün_kısmına_geçerli_olmayan_bir_veri_girer() {
        Integer a = faker.number().numberBetween(1,12);
        Integer b = faker.number().numberBetween(32,99);
        Integer c = faker.number().numberBetween(1940,2005);
        String x=a.toString();
        String y=b.toString();
        String z=c.toString();
        homeRegisterPage.birthDayBox.sendKeys(x,y,z);
        Assert.assertFalse(homeRegisterPage.birthDayBox.getText().contains(y));
    }
    @Then("Yıl kısmına geçerli olmayan bir veri girer")
    public void date_of_birth_alanında_yıl_kısmına_geçerli_olmayan_bir_veri_girer() {
        Integer a = faker.number().numberBetween(1,12);
        Integer b = faker.number().numberBetween(1,31);
        Integer c = faker.number().numberBetween(2024,3333);
        String x=a.toString();
        String y=b.toString();
        String z=c.toString();
        homeRegisterPage.birthDayBox.sendKeys(x,y,z);
    }

    @Then("Phone alanina valid olmayan bir data harf girer.")
    public void phone_alanina_valid_olmayan_bir_data_harf_girer() {
        homeRegisterPage.phoneBox.sendKeys("aaa-aaa-aaaa");
    }
    @Then("Phone alanina valid olmayan data girildigine dair popup mesajini goruntuler.")
    public void phone_alanina_valid_olmayan_data_girildigine_dair_popup_mesajini_goruntuler() {
        Driver.wait(1);
        Assert.assertTrue(homeRegisterPage.errorMessage.isDisplayed());
    }
    @Then("Phone alanindaki datayi siler.")
    public void phone_alanindaki_datayi_siler() {
        homeRegisterPage.phoneBox.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,
                Keys.BACK_SPACE, Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE,Keys.BACK_SPACE);
    }
    @Then("Phone alanina valid olmayan bir data rakam girer.")
    public void phone_alanina_valid_olmayan_bir_data_olmadan_rakam_girer() {
        homeRegisterPage.phoneBox.sendKeys("11111111111");
    }
    @Then("Phone alanina valid olmayan bir data fazla karakter girer.")
    public void phone_alanina_valid_olmayan_bir_data_karakterden_fazla_girer() {
        homeRegisterPage.phoneBox.sendKeys("111-22-1111-11");
    }
    @Then("Phone alanina valid olmayan bir data az karakter girer.")
    public void phone_alanina_valid_olmayan_bir_data_karakterden_az_girer() {
        homeRegisterPage.phoneBox.sendKeys("123");
    }
    @Then("Phone alaninin altinda uyari mesajinin goruntulendigini dogrular.")
    public void phone_alaninin_altinda_uyari_mesajinin_goruntulendigini_dogrular() {
        Assert.assertTrue(homeRegisterPage.phoneRequired.isDisplayed());
    }
    @Then("Phone alanina daha once kayit olan bir numara girer.")
    public void phone_alanina_daha_once_kayit_olan_bir_numara_girer() {
        homeRegisterPage.phoneBox.sendKeys("111-111-1111");
    }
    @Then("Numaranin daha once kullanildigina dair hata mesaji alir.")
    public void numaranin_daha_once_kullanildigina_dair_hata_mesaji_alir() {
        Assert.assertTrue(homeRegisterPage.errorMessage.isDisplayed());
    }

    @When("Gender checkbox seceneklerinin secilmemis olduguna dair hata mesaji alir.")
    public void gender_checkbox_seceneklerinin_secilmemis_olduguna_dair_hata_mesaji_alir() {
        Assert.assertTrue(homeRegisterPage.errorMessage.isDisplayed());
    }
    @When("Female checkbox`inin secilmis oldugunu dogrular.")
    public void female_checkbox_inin_secilmis_oldugunu_dogrular() {
        Assert.assertTrue(homeRegisterPage.femaleCheckBox.isSelected());
    }
    @When("Male checkbox`ina tiklar.")
    public void male_checkbox_ina_tiklar() {
        Driver.clickWithJS(homeRegisterPage.maleCheckBox);
    }
    @When("Male checkbox`inin secilmis oldugunu dogrular.")
    public void male_checkbox_inin_secilmis_oldugunu_dogrular() {
        Assert.assertTrue(homeRegisterPage.maleCheckBox.isSelected());
    }
    @Then("Kaydin gerceklestigine dair popup mesajinin goruntulendigini dogrular.")
    public void kaydin_gerceklestigine_dair_popup_mesajinin_goruntulendigini_dogrular() {
        Driver.wait(1);
        Assert.assertTrue(homeRegisterPage.guestUserRegistered.isDisplayed());
    }

    @Then("Hata mesajini goruntuler.")
    public void hata_mesaji_goruntuler(){
        Driver.wait(1);
        Assert.assertTrue(homeRegisterPage.errorMessage.isDisplayed());
    }

    @Then("Name alanina space karakteri girer")
    public void name_space(){
        ReusableMethods.scrollIntoViewJS(homeRegisterPage.registerHeader);
        homeRegisterPage.nameBox.sendKeys("         ");
    }

    @Then("Surname alanina space karakteri girer")
    public void surname_space(){
        homeRegisterPage.surnameBox.sendKeys("       ");
    }

    @Then("Birth place alanina space karakteri girer")
    public void birth_space(){
        homeRegisterPage.birthPlaceBox.sendKeys("           ");
    }

    @Then("Sayfayi yeniler.")
    public void sayfayi_yenile(){
        Driver.getDriver().navigate().refresh();
    }

    @Then("Kayit yapilamamalidir.")
    public void kayit_asserrt(){
        Driver.wait(2);
        Assert.assertFalse(homeRegisterPage.guestUserRegistered.isDisplayed());
    }

    @Given("Admin login olur")
    public void admin_login_olur() {
        Driver.getDriver().get("https://www.managementonschools.com/");
        adminGuestUserListPage.loginText.click();
        adminGuestUserListPage.usernameBox.sendKeys("adminteam19");
        adminGuestUserListPage.passwordBox.sendKeys("adminteam19");
        Driver.clickWithJS(adminGuestUserListPage.loginButton);
    }
    @Then("Admin menuye tiklar")
    public void admin_menu_butonuna_tiklar() {
        adminGuestUserListPage.menuButon.click();
    }
    @Then("Admin guest user secenegine tiklar")
    public void admin_guest_user_secenegine_tiklar() {
        Driver.clickWithJS(adminGuestUserListPage.guestUserButton);
    }
    @Then("Admin guest user sayfasinin goruntulendigini dogrular")
    public void admin_guest_user_sayfasinin_goruntulendigini_dogrular() {
        Driver.wait(3);
        Assert.assertTrue(adminGuestUserListPage.guestListHeader.isDisplayed());
    }
    @Then("Admin name alaninin gorunurlugunu dogrular")
    public void admin_name_alaninin_gorunurlugunu_dogrular() {
        Assert.assertTrue(adminGuestUserListPage.nameHeader.isDisplayed());
    }
    @Then("Admin phone number alaninin gorunurlugunu dogrular")
    public void admin_phone_number_alaninin_gorunurlugunu_dogrular() {
        Assert.assertTrue(adminGuestUserListPage.phoneNumberHeader.isDisplayed());
    }
    @Then("Admin Ssn alaninin gorunurlugunu dogrular")
    public void admin_ssn_alaninin_gorunurlugunu_dogrular() {
        Assert.assertTrue(adminGuestUserListPage.ssnHeader.isDisplayed());
    }
    @Then("Admin user name alaninin gorunurlugunu dogrular")
    public void admin_user_name_alaninin_gorunurlugunu_dogrular() {
        Assert.assertTrue(adminGuestUserListPage.usernameHeader.isDisplayed());
    }

    @Given("Kullanici anasayfaya gider")
    public void kullanici_anasayfaya_giderr() {
        Driver.getDriver().get("https://www.managementonschools.com/");
    }
    @Then("Kullanici Register butonuna tiklar")
    public void kullanici_register_butonuna_tiklar() {
        homeRegisterPage.register.click();
    }
    @Then("Kullanici Register sayfasinin goruntulendigini dogrular")
    public void kullanici_register_sayfasinin_goruntulendigini_dogrular() {
        Assert.assertTrue(homeRegisterPage.registerHeader.isDisplayed());
    }
    @Then("Kullanici name alanina valid bir data girer")
    public void kullanici_name_alanina_valid_bir_data_girer() {
        homeRegisterPage.nameBox.sendKeys("000000000");
    }
    @Then("Kullanici surname alanina valid bir data girer")
    public void kullanici_surname_alanina_valid_bir_data_girer() {
        homeRegisterPage.surnameBox.sendKeys("000000000");
    }
    @Then("Kullanici birth place alanina valid bir data girer")
    public void kullanici_birth_place_alanina_valid_bir_data_girer() {
        homeRegisterPage.birthPlaceBox.sendKeys("test");
    }
    @Then("Kullanici phone alanina valid bir data girer")
    public void kullanici_phone_alanina_valid_bir_data_girer() {
        homeRegisterPage.phoneBox.sendKeys("507-507-5757");
    }
    @Then("Kullanici female checkbox`ina tiklar")
    public void kullanici_female_checkbox_ina_tiklar() {
        Driver.clickWithJS(homeRegisterPage.femaleCheckBox);
    }
    @Then("Kullanici date of birth alanina valid bir data girer")
    public void kullanici_date_of_birth_alanina_valid_bir_data_girer() {
        homeRegisterPage.birthDayBox.sendKeys("12121993");
    }
    @Then("Kullanici Ssn alanina valid bir data girer")
    public void kullanici_ssn_alanina_valid_bir_data_girer() {
        homeRegisterPage.ssnBox.sendKeys("147-85-1237");
    }
    @Then("Kullanici username alanina valid bir data girer")
    public void kullanici_username_alanina_valid_bir_data_girer() {
        homeRegisterPage.userNameBox.sendKeys("team19Guest");
    }
    @Then("Kullanici password alanina valid bir data girer")
    public void kullanici_password_alanina_valid_bir_data_girer() {
        homeRegisterPage.passwordBox.sendKeys("team19Guest");
    }
    @Then("Kullanici register butonuna tiklar")
    public void register(){
        Driver.clickWithJS(homeRegisterPage.registerButton);
    }

    @Then("Kullanici kaydin gerceklestigine dair popup mesajinin goruntulendigini dogrular")
    public void registered(){
        Driver.wait(1);
        Assert.assertTrue(homeRegisterPage.guestUserRegistered.isDisplayed());
    }

    @Then("Admin eklenen kullanicinin goruntulendigini dogrular")
    public void admin_assert(){
        Assert.assertTrue(adminGuestUserListPage.addedUser.isDisplayed());
    }

    @Then("Admin goruntulenen kullanicinin username`inin yaninda delete butonu oldugunu dogrular")
    public void admin_goruntulenen_kullanicinin_username_inin_yaninda_delete_butonu_oldugunu_dogrular() {
        Assert.assertTrue(adminGuestUserListPage.deleteButton.isDisplayed());
    }
    @Then("Admin delete butonuna tiklar")
    public void admin_delete_butonuna_tiklar() {
        Driver.clickWithJS(adminGuestUserListPage.deleteButton);
    }
    @Then("Admin kulanicinin silindigini dogrular")
    public void admin_kulanicinin_silindigini_dogrular() {
        Driver.wait(1);
        Assert.assertTrue(adminGuestUserListPage.deletedMessage.isDisplayed());
    }

    @Then("Admin silme islemi icin uyari mesaji alir")
    public void uyari_mesaji(){

    }

    @Then("Admin uyari mesajini onaylar")
    public void onayla() {

    }

    @Then("Kullanici loginn butonuna tiklar")
    public void login_kullanici(){
        Driver.waitForClickablility(adminGuestUserListPage.loginText,10);
        Driver.clickWithJS(adminGuestUserListPage.loginText);
    }

    @Given("Kullanici ana sayfaya gider")
    public void kullanici_ana_sayfaya_gider() {
        Driver.getDriver().get("https://www.managementonschools.com/");
    }
    @Then("Kullanici contact butonuna tiklar")
    public void kullanici_contact_butonuna_tiklar() {
        Driver.clickWithJS(contactPage.contactButton);
    }
    @When("Kullanici name alanina valid bir data girer.")
    public void name_alani(){
        contactPage.nameBox.sendKeys(faker.name().firstName());
    }

    @When("Kullanici email alanina valid bir data girer.")
    public void kullanici_email_alanina_valid_bir_data_girer() {
        contactPage.emailBox.sendKeys(faker.internet().emailAddress());
    }
    @When("Kullanici subject alanina valid bir data girer.")
    public void kullanici_subject_alanina_valid_bir_data_girer() {
        contactPage.subjectBox.sendKeys(faker.name().firstName());
    }
    @When("Kullanici message alanina valid bir data girer.")
    public void kullanici_message_alanina_valid_bir_data_girer() {
        contactPage.messageBox.sendKeys(faker.name().fullName());
    }
    @When("Kullanici send message butonuna tiklar")
    public void kullanici_send_message_butonuna_tiklar() {
        Driver.clickWithJS(contactPage.sendMessageButton);
    }
    @Then("Kullanici mesajin gonderildigine dair popup mesaji alir")
    public void kullanici_mesajin_gonderildigine_dair_popup_mesaji_alir() {
        Driver.wait(1);
        Assert.assertTrue(contactPage.messageCreatedSucces.isDisplayed());
    }

    @Then("Kullanici name alaninin bos olduguna dair hata mesaji alir")
    public void kullanici_name_alaninin_bos_olduguna_dair_hata_mesaji_alir() {
        Driver.wait(1);
        Assert.assertFalse(contactPage.messageCreatedSucces.isDisplayed());
    }

    @Then("Kullanici email alaninin bos birakildigina dair hata mesaji alir")
    public void kullanici_email_alaninin_bos_birakildigina_dair_hata_mesaji_alir() {
        Driver.wait(1);
        Assert.assertTrue(contactPage.emptyEmailBoxMessage.getText().contains("email"));
    }
    @Then("Kullanici email alanini @ karakteri olmadan doldurur")
    public void kullanici_email_alanini_karakteri_olmadan_doldurur() {
        contactPage.emailBox.sendKeys("team19.com");
    }

    @Then("Kullanici enter valid email hatasi alir")
    public void kullanici_enter_valid_email_hatasi_alir() {
        Assert.assertTrue(contactPage.invalidEmailMessage.isDisplayed());
    }
    @Then("Kullanici email alanini nokta olmadan doldurur")
    public void kullanici_email_alanini_nokta_olmadan_doldurur() {
        contactPage.emailBox.sendKeys("team19@com");
    }
    @Then("Kullanici email alanini com ifadesi olmadan doldurur")
    public void kullanici_email_alanini_com_ifadesi_olmadan_doldurur() {
        contactPage.emailBox.sendKeys("team19@gmail.tr");
    }

    @When("Kullanici subject alaninin bos birakildigina dair hata mesaji alir")
    public void kullanici_subject_alaninin_bos_birakildigina_dair_hata_mesaji_alir() {
        Driver.wait(1);
        Assert.assertFalse(contactPage.messageCreatedSucces.isDisplayed());
    }

    @When("Kullanici message alaninin bos birakildigina dair hata mesaji alir")
    public void kullanici_message_alaninin_bos_birakildigina_dair_hata_mesaji_alir() {
        Driver.wait(1);
        Assert.assertFalse(contactPage.messageCreatedSucces.isDisplayed());
    }

    @Then("Kullanici email kutusundaki datayi siler")
    public void clear(){
        contactPage.emailBox.clear();
    }


    @Given("Teacher login olur")
    public void teacher_login_olur() {
        Driver.getDriver().get("https://www.managementonschools.com/");
        adminGuestUserListPage.loginText.click();
        adminGuestUserListPage.usernameBox.sendKeys("efla123");
        adminGuestUserListPage.passwordBox.sendKeys("teacherteam19");
        Driver.clickWithJS(adminGuestUserListPage.loginButton);
        Driver.wait(3);
    }

    @Then("Teacher menu butonuna tiklar")
    public void menu(){
        Driver.clickWithJS(addMeetPage.menuButton);
    }

    @Then("Teacher meet management butonuna tiklar")
    public void meet_management(){
        Driver.clickWithJS(addMeetPage.meetManagementButton);
        Driver.wait(3);
    }

    @Then("Teacher choose student seceneginin gorunurlugunu dogrular")
    public void teacher_choose_student_seceneginin_gorunurlugunu_dogrular() {
        ReusableMethods.scrollIntoViewJS(addMeetPage.header);
        Driver.wait(3);
        Assert.assertTrue(addMeetPage.chooseStudentsHeader.isDisplayed());
    }
    @Then("Teacher dropdown`dan ogrenci secer")
    public void teacher_dropdown_dan_ogrenci_secer() {
        ReusableMethods.scrollIntoViewJS(addMeetPage.header);
        Driver.wait(5);
        addMeetPage.selectStudentsBox.click();
        Driver.wait(2);
        ReusableMethods.scrollIntoViewJS(addMeetPage.assertAddedStudent);
        Driver.clickWithJS(addMeetPage.assertAddedStudent);
    }
    @Then("Teacher secilen ogrencinin eklendigini dogrular")
    public void teacher_secilen_ogrencinin_eklendigini_dogrular() {
        Assert.assertTrue(addMeetPage.assertAddedStudent.isDisplayed());
    }
    @Then("Teacher gecerli bir tarih girer")
    public void teacher_gecerli_bir_tarih_girer() {
        addMeetPage.dateBox.sendKeys("12122023");
    }
    @Then("Teacher gecerli bir start ve stop time girer")
    public void teacher_gecerli_bir_start_time_girer() {

        addMeetPage.startTimeBox.sendKeys("1011p");

        addMeetPage.stopTimeBox.sendKeys("1100p");
    }

    @Then("Teacher geceri bir description girer")
    public void teacher_geceri_bir_description_girer() {
        addMeetPage.descriptionBox.sendKeys("cakiltasi");
    }
    @Then("Teacher submit butonuna tiklar")
    public void teacher_submit_butonuna_tiklar() {
        Driver.clickWithJS(addMeetPage.submitButton);
    }
    @Then("Teacher add meet succesfully mesajinin goruntulendigini dogrular")
    public void teacher_add_meet_succesfully_mesajinin_goruntulendigini_dogrular() {
        Driver.wait(1);
        Assert.assertTrue(addMeetPage.meetSavedMessage.isDisplayed());
    }
    @Then("Teacher ogrenci eklenmedigine dair uyari mesaji almalidir")
    public void teacher_ogrenci_eklenmedigine_dair_uyari_mesaji_almalidir() {
        Assert.assertFalse(addMeetPage.meetSavedMessage.isDisplayed());
    }

    @Then("Teacher eklenen ogrenciyi siler")
    public void delete(){
        Driver.clickWithJS(addMeetPage.removeAddedStudent);
    }

    @Then("Teacher Date Of Meet seceneginin gorunurlugunu dogrular.")
    public void teacher_date_of_meet_seceneginin_gorunurlugunu_dogrular() {
        Assert.assertTrue(addMeetPage.dateofMeetHeader.isDisplayed());
    }

    @Then("Teacher date bolumune gecmis bir tarih girer")
    public void teacher_date_bolumune_gecmis_bir_tarih_girer() {
        addMeetPage.dateBox.sendKeys("12121993");
    }

    @Then("Teacher gecmis tarih icin hata mesaji goruntulendigini dogrular")
    public void teacher_hata_mesaji_goruntulendigini_dogrular() {
        Driver.wait(1);
        Assert.assertTrue(addMeetPage.dateError.isDisplayed());
    }

    @Then("Teacher uyumsuz saat icin hata mesaji goruntulendigini dogrular")
    public void saat_hata_mesaji_goruntulendigini_dogrular() {
        Driver.wait(1);
        Assert.assertTrue(addMeetPage.timeError.isDisplayed());
    }

    @Then("Teacher description`in bos olmasina dair hata mesaji goruntulendigini dogrular")
    public void description_hata_mesaji_goruntulendigini_dogrular() {
        Assert.assertTrue(addMeetPage.popUp.isDisplayed());
    }

    @Then("Teacher Start Time seceneginin gorunurlugunu dogrular.")
    public void teacher_start_time_seceneginin_gorunurlugunu_dogrular() {
        Assert.assertTrue(addMeetPage.startTimeHeader.isDisplayed());
    }

    @Then("Teacher Stop Time seceneginin gorunurlugunu dogrular")
    public void teacher_stop_time_seceneginin_gorunurlugunu_dogrular() {
        Assert.assertTrue(addMeetPage.stopTimeHeader.isDisplayed());
    }

    @Then("Teacher stop time alanina start time`dan kucuk bir saat girer")
    public void teacher_stop_time_alanina_start_time_dan_kucuk_bir_saat_girer() {

        addMeetPage.startTimeBox.sendKeys("1011p");

        addMeetPage.stopTimeBox.sendKeys("1110p");
    }

    @Then("Teacher Description seceneginin gorunurlugunu dogrular")
    public void teacher_description_seceneginin_gorunurlugunu_dogrular() {
        Assert.assertTrue(addMeetPage.descriptionHeader.isDisplayed());
    }

    @Then("Kaydi siler")
    public void delete_s(){
        Driver.clickWithJS(addMeetPage.deleteStudent );
    }




}
