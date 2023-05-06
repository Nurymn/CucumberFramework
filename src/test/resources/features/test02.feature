Feature:Admin_Guest_User_List

  @US02TC01 @US02
  Scenario:TC_01_Guest_User_List_alani_testi
    Given Admin login olur
    Then  Admin menuye tiklar
    And   Admin guest user secenegine tiklar
    And   Admin guest user sayfasinin goruntulendigini dogrular
    And   Admin name alaninin gorunurlugunu dogrular
    And   Admin phone number alaninin gorunurlugunu dogrular
    And   Admin Ssn alaninin gorunurlugunu dogrular
    And   Admin user name alaninin gorunurlugunu dogrular
    Then Sayfayi kapat

  @US02TC02 @US02
  Scenario: TC_02_Guest_User_List_user_ekleme_ve_silme_testi
    Given Kullanici anasayfaya gider
    Then  Kullanici Register butonuna tiklar
    And   Kullanici Register sayfasinin goruntulendigini dogrular
    And   Kullanici name alanina valid bir data girer
    And   Kullanici surname alanina valid bir data girer
    And   Kullanici birth place alanina valid bir data girer
    And   Kullanici phone alanina valid bir data girer
    And   Kullanici female checkbox`ina tiklar
    And   Kullanici date of birth alanina valid bir data girer
    And   Kullanici Ssn alanina valid bir data girer
    And   Kullanici username alanina valid bir data girer
    And   Kullanici password alanina valid bir data girer
    And   Kullanici register butonuna tiklar
    And   Kullanici kaydin gerceklestigine dair popup mesajinin goruntulendigini dogrular
    And   Kullanici loginn butonuna tiklar
    And   Admin login olur
    And   Admin menuye tiklar
    And   Admin guest user secenegine tiklar
    And   Admin guest user sayfasinin goruntulendigini dogrular
    And   Admin eklenen kullanicinin goruntulendigini dogrular
    And   Admin goruntulenen kullanicinin username`inin yaninda delete butonu oldugunu dogrular
    And   Admin delete butonuna tiklar
  #  And   Admin silme islemi icin uyari mesaji alir
  #  And   Admin uyari mesajini onaylar
    And   Admin kulanicinin silindigini dogrular
    Then Sayfayi kapat































