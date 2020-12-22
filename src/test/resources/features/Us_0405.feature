@login004
Feature: Giris Sayfasi
  @TC04_01
  Scenario: TC01_kullanici_giris_sayfasina_erisebilmelidir
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    And username text box a tiklar
    And Kullanici gecerli username girer
    And Kullanici password text box a tiklar
    And Kullanici gecerli password girer
    Then Sign in buttona tiklar

  @TC04_02
  Scenario: TC02_kullanici_giris_sayfasindan_cikabilmelidir
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    Then Cancel buttona tiklar
    
  @TC05_01
  Scenario: TC01_kullanici_Gecersiz_data_ile_giris_sayfasina_erisemez
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    And username text box a tiklar
    And Kullanici gecersiz username girer
    And Kullanici password text box a tiklar
    And Kullanici gecerli password girer
    Then Sign in buttona tiklar

  @TC05_02
  Scenario: TC02_kullanici_Gecersiz_data_ile_giris_sayfasina_erisemez
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    And username text box a tiklar
    And Kullanici gecerli username girer
    And Kullanici password text box a tiklar
    And Kullanici gecersiz password girer
    Then Sign in buttona tiklar

  @TC05_03
  Scenario: TC03_kullanici_Gecersiz_data_ile_giris_sayfasina_erisemez
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    And username text box a tiklar
    And Kullanici gecersiz username girer
    And Kullanici password text box a tiklar
    And Kullanici gecersiz password girer
    Then Sign in buttona tiklar

  @TC05_04
  Scenario: TC04_kullanici_Gecersiz_data_olan_sifresini_sıfırlanabilmelidir
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    And Sifreni mi unuttun butonuna tiklar
    And Email box a tiklar
    And Kullanici gecerli mail girer
    Then Reset Pasword buttona tiklayiniz

  @TC05_05
  Scenario: TC05_kullanici_Gecersiz_data_ile_kayit_sayfasina_erisebilmelidir
    Given Kullanici www.gmibank.com gider
    And Kullanici giris menusune tiklar
    And Henuz bir hesabınız yok mu? Yeni bir hesap açın? butonuna tiklar
    Then Kayit Sayfasina gider