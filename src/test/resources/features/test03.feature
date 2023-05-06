Feature:Contact_Page

  Background: Kullanici_contact_sayfasina_gider
    Given Kullanici ana sayfaya gider
    Then  Kullanici contact butonuna tiklar

  @US03TC01 @US03
  Scenario:TC_01_Tum_alanlarin_dogru_girilmesi
    When Kullanici name alanina valid bir data girer.
    When Kullanici email alanina valid bir data girer.
    When Kullanici subject alanina valid bir data girer.
    When Kullanici message alanina valid bir data girer.
    And  Kullanici send message butonuna tiklar
    Then Kullanici mesajin gonderildigine dair popup mesaji alir
    Then Sayfayi kapat

  @US03TC03 @US03  @Failed
  Scenario:TC_02_Name_alani_testi
    When Kullanici email alanina valid bir data girer.
    When Kullanici subject alanina valid bir data girer.
    When Kullanici message alanina valid bir data girer.
    And  Kullanici send message butonuna tiklar
    Then Kullanici name alaninin bos olduguna dair hata mesaji alir
    Then Sayfayi kapat

  @US03TC03 @US03  @Failed
  Scenario:TC_03_Email_alani_testi
    When Kullanici name alanina valid bir data girer.
    When Kullanici subject alanina valid bir data girer.
    When Kullanici message alanina valid bir data girer.
    And  Kullanici send message butonuna tiklar
    Then Kullanici email alaninin bos birakildigina dair hata mesaji alir
    And  Sayfayi kapat

  @US03TC04 @US03  @Failed
  Scenario: TC_04_Email_alani_@_karakter_testi
    When Kullanici name alanina valid bir data girer.
    When Kullanici subject alanina valid bir data girer.
    When Kullanici message alanina valid bir data girer.
    And  Kullanici email alanini @ karakteri olmadan doldurur
    And  Kullanici send message butonuna tiklar
    And  Kullanici enter valid email hatasi alir
    And  Kullanici email kutusundaki datayi siler
    And  Kullanici email alanini com ifadesi olmadan doldurur
    And  Kullanici send message butonuna tiklar
    And  Kullanici enter valid email hatasi alir
    And  Kullanici email kutusundaki datayi siler
    And  Kullanici email alanini nokta olmadan doldurur
    And  Kullanici send message butonuna tiklar
    And  Kullanici enter valid email hatasi alir
    And  Sayfayi kapat

  @US03TC05 @US03  @Failed
  Scenario:TC_05_Subject_alani_testi
    When Kullanici name alanina valid bir data girer.
    When Kullanici email alanina valid bir data girer.
    When Kullanici message alanina valid bir data girer.
    And  Kullanici send message butonuna tiklar
    And  Kullanici subject alaninin bos birakildigina dair hata mesaji alir
    And  Sayfayi kapat

  @US03TC06 @US03  @Failed
  Scenario:TC_06_Message_alani_testi
    When Kullanici name alanina valid bir data girer.
    When Kullanici email alanina valid bir data girer.
    When Kullanici subject alanina valid bir data girer.
    And  Kullanici send message butonuna tiklar
    And  Kullanici message alaninin bos birakildigina dair hata mesaji alir
    And  Sayfayi kapat






