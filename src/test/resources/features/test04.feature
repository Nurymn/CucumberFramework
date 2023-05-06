Feature:Add_meet

  Background: Add_meet
    Given Teacher login olur
    And   Teacher menu butonuna tiklar
    And   Teacher meet management butonuna tiklar

  @US19TC01 @US19 @Failed
  Scenario:TC_01_"Choose_Students"_ögrenci_secilebilmeli
    Then Teacher choose student seceneginin gorunurlugunu dogrular
    And  Teacher dropdown`dan ogrenci secer
    And  Teacher secilen ogrencinin eklendigini dogrular
    And  Teacher gecerli bir tarih girer
    And  Teacher gecerli bir start ve stop time girer
    And  Teacher geceri bir description girer
    And  Teacher submit butonuna tiklar
    Then Teacher add meet succesfully mesajinin goruntulendigini dogrular
    And  Kaydi siler
    And  Teacher eklenen ogrenciyi siler
    And  Teacher gecerli bir tarih girer
    And  Teacher gecerli bir start ve stop time girer
    And  Teacher geceri bir description girer
    And  Teacher submit butonuna tiklar
    Then Teacher ogrenci eklenmedigine dair uyari mesaji almalidir
    And  Kaydi siler
    And  Sayfayi kapat

  @US19TC02 @US19
  Scenario: TC_02_Date_of_meet_alani_testi
    Then Teacher Date Of Meet seceneginin gorunurlugunu dogrular.
    And  Teacher dropdown`dan ogrenci secer
    And  Teacher gecerli bir start ve stop time girer
    And  Teacher geceri bir description girer
    And  Teacher date bolumune gecmis bir tarih girer
    And  Teacher submit butonuna tiklar
    Then Teacher gecmis tarih icin hata mesaji goruntulendigini dogrular
    And  Sayfayi kapat

  @US19TC03 @US19
  Scenario: TC_03_StartTime_StopTime_alani_testi
    Then Teacher Start Time seceneginin gorunurlugunu dogrular.
    Then Teacher Stop Time seceneginin gorunurlugunu dogrular
    And  Teacher dropdown`dan ogrenci secer
    And  Teacher geceri bir description girer
    And  Teacher gecerli bir tarih girer
    And  Teacher stop time alanina start time`dan kucuk bir saat girer
    And  Teacher submit butonuna tiklar
    Then Teacher uyumsuz saat icin hata mesaji goruntulendigini dogrular
    And  Sayfayi kapat

  @US19TC04 @US19
  Scenario: TC_04_Description_alani_testi
    Then Teacher Description seceneginin gorunurlugunu dogrular
    And  Teacher dropdown`dan ogrenci secer
    And  Teacher gecerli bir tarih girer
    And  Teacher gecerli bir start ve stop time girer
    And  Teacher geceri bir description girer
    And  Teacher submit butonuna tiklar
    And  Sayfayi kapat