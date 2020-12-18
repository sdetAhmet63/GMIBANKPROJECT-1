@TC_22Test
Feature: US22 TEST

  @RegisterErstellen
  Scenario: Us_22 kullanici gmi bank kayit sayfasinda kayit islemi gerceklestirir
    Given "https://gmibank.com/" sayfasina gider
    And   profil logolu dropdown ve icindeki register linkini tiklar
    And   kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And   ilk ad kutusuna "<ilkad>" ini girer
    And   son ad kutusuna "<sonad>" ini girer
    And   adres kutusuna "<adres>" ini girer
    And   mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And   username kutusuna "<username>" ini girer
    And   email kutusuna "<email>" ini girer
    And   kullanici kayit sayfasinda yeni sifre kutusuna tiklar
    And   newPassword ve confirmation kutusuna yedi karakterli Password girer
    Then  kullanici register butonuna tiklar