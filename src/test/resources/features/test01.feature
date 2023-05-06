Feature:Register_Page

  Background: Kullanici register sayfasina gider.
    Given Kullanici anasayfaya gider.
    And   Register yazisina tiklar.
    When  Register sayfasini goruntuler.

  @US01TC01 @Register
  Scenario:TC01_Tum_alanlarin_dogru_girilmesi
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Register butonuna tiklar.
    Then  Kaydin gerceklestigine dair mesajin goruntulendigini dogrular.
    And   Sayfayi kapat

  @US01TC02 @Register
  Scenario:TC02_Name_alani_testi
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    Then  Name alaninin altinda required yazisinin goruntulendigini dogrular.
    And   Sayfayi kapat

  @US01TC03 @Register
  Scenario: TC03_Surname_alani_testi
    And   Name alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Surname alaninin altinda required yazisinin goruntulendigini dogrular.
    And   Register butonuna tiklar.
    And   Sayfayi kapat

  @US01TC04 @Register
  Scenario: TC04_Birth_Place_alaninin_testi
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Birth place alaninin altinda required yazisinin goruntulendigini dogrular.
    And   Register butonuna tiklar.
    And   Sayfayi kapat

  @US01TC05 @Register
  Scenario: TC05_Ssn_alaninin_testi
    When  Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Ssn alanına valid olmayan data harf girer.
    And   Register butonuna tiklar.
    Then  Ssn alanında geçersiz veri girildiğine dair mesaj görüntüler.
    When  Ssn alanındaki datayı siler.
    And   Ssn alanına valid olmayan bir data girer.
    Then  Ssn alanında geçersiz bir veri girildiğine dair popup mesajını görüntüler.
    When  Ssn alanındaki datayı siler.
    When  Ssn alanına valid olmayan bir data karakter fazla girer.
    Then  Ssn alanında geçersiz bir veri girildiğine dair popup mesajını görüntüler.
    When  Ssn alanındaki datayı siler.
    When  Ssn alanına valid olmayan bir data karakter az girer.
    Then  Ssn alanının altında uyari mesajının görüntülendiğini doğrular.
   # When  Ssn alanındaki datayı siler.
   # When  Daha önce kayıt olan bir ssn no girer.
   # And   Register butonuna tiklar.
   # Then  Ssn no'sunun daha önce kullanıldığına dair hata mesajı alır.
    And   Sayfayi kapat


  @US01TC06 @Failed @Register
  Scenario: TC06_User_name_alaninin_testi
    When  Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Register butonuna tiklar.
    When  Kaydın gerçekleştiğine dair mesajının görüntülendiğini doğrular
    When  Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Daha önce girdiği username'i username alanına girer.
    And   Password alanina valid data girer.
    And   Register butonuna tiklar.
    Then  Daha önce kullanılmış bir username olduğuna dair hata mesajı alir
    # Register page`de bir kez kayit gerceklestirildiginde tekrar register islemi yapilmak istenildiginde
    # submit butonu calismiyor.
    And   Sayfayi kapat

  @US01TC07 @Register
  Scenario: TC07_Password_alaninin_testi
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanına geçerli olmayan karakterden az bir veri girer
    Then  Password alanının altında bir uyarı mesajı görecektir
    When  Register butonuna tiklar.
    And   Sayfayi kapat

  @US01TC08 @Register
  Scenario: TC08_Date_of_birth_alaninin_testi
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    When  Ay kısmına geçerli olmayan bir veri girer ve uygulanmadigini dogrular.
    And   Gün kısmına geçerli olmayan bir veri girer ve uygulanmadigini dogrular.
    And   Yıl kısmına geçerli olmayan bir veri girer
    Then  Register butonuna tiklar.
    Then  Hata mesajini goruntuler.
    And   Sayfayi kapat

  @US01TC09 @Register
  Scenario: TC09_Phone_alaninin_testi
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Phone alanina valid olmayan bir data harf girer.
    And   Register butonuna tiklar.
    And   Phone alanina valid olmayan data girildigine dair popup mesajini goruntuler.
    And   Phone alanindaki datayi siler.
    And   Phone alanina valid olmayan bir data rakam girer.
    And   Register butonuna tiklar.
    And   Phone alanina valid olmayan data girildigine dair popup mesajini goruntuler.
    And   Phone alanindaki datayi siler.
    And   Phone alanina valid olmayan bir data fazla karakter girer.
    And   Register butonuna tiklar.
    And   Phone alanina valid olmayan data girildigine dair popup mesajini goruntuler.
    And   Phone alanindaki datayi siler.
    And   Phone alanina valid olmayan bir data az karakter girer.
    And   Register butonuna tiklar.
    Then  Phone alaninin altinda uyari mesajinin goruntulendigini dogrular.
    And   Phone alanindaki datayi siler.
    And   Phone alanina daha once kayit olan bir numara girer.
    And   Register butonuna tiklar.
    Then  Numaranin daha once kullanildigina dair hata mesaji alir.
    And   Sayfayi kapat


  @US01TC10 @Failed @Register
  Scenario: TC10_Gender_alaninin_testi
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Female checkbox`inin secilmis oldugunu dogrular.
    And   Male checkbox`ina tiklar.
    And   Male checkbox`inin secilmis oldugunu dogrular.
    And   Register butonuna tiklar.
    Then  Kaydin gerceklestigine dair popup mesajinin goruntulendigini dogrular.
    And   Sayfayi yeniler.
    And   Name alanina valid data girer.
    And   Surname alanina valid data girer.
    And   Birth place alanina valid data girer.
    And   Phone alanina valid data girer.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Gender checkbox seceneklerinin secilmemis olduguna dair hata mesaji alir.
    And   Sayfayi kapat

  @US01TC11 @Failed @Register
  Scenario: TC_11_Space_karakter_testi
    And   Name alanina space karakteri girer
    And   Surname alanina space karakteri girer
    And   Birth place alanina space karakteri girer
    And   Phone alanina valid data girer.
    And   Date of birth alanina valid data girer.
    And   Ssn alanina valid data girer.
    And   Username alanina valid data girer.
    And   Password alanina valid data girer.
    And   Female checkbox`ina tiklar.
    And   Register butonuna tiklar.
    And   Kayit yapilamamalidir.
    And   Sayfayi kapat


