@tum_kullanicilar



Feature: Gmi Bank tum kullaniciler
  @us_23_tum_userler
  Scenario: TC_23_tum kullanici tum kullanici bilgilerini alip assurt eder
    Given kullanici tum user bilgilerini bulundugu "https://www.gmibank.com/api/tp-account-registrations" sayfasina gider
    And kullanici "291-34-8311"  kayitli userleri bulur
    Then kullanici user adrese gider "https://www.gmibank.com/api/tp-account-registrations" ssn "ssn" numarasi  "291-34-8311" ile  assert yapar

  @us_23_tum_employee
  Scenario: TC_23_tum kullanici tum employee bilgilerini alip assurt eder
    Given kullanici tum employee bilgilerini bulundugu "https://www.gmibank.com/api/tp-account-registrations" sayfasina gider
    And kullanici "291-34-8311"  kayitli employee bulur
    Then kullanici employee adrese gider "https://www.gmibank.com/api/tp-account-registrations" ssn "ssn" numarasi  "291-34-8311" ile  assert yapar

  @us_23_tum_musteriler
  Scenario: TC_23_tum kullanici tum musteri bilgilerini alip assurt eder
    Given kullanici tum musteri bilgilerini bulundugu "https://www.gmibank.com/api/tp-customers" sayfasina gider
    And kullanici "291-34-8311"  kayitli musteri bulur
    Then kullanici musteri adrese gider "https://www.gmibank.com/api/tp-account-registrations" ssn "ssn" numarasi  "291-34-8311" ile  assert yapar