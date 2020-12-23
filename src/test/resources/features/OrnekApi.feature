@butunmusteriler
@apicustomer
Feature: Gmi Bank All Customer Info
  Scenario: All customer data
    Given kullanici tum musteri bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-account-registrations"
    And kullanici "357-55-1023"  kayitli musteriyi bulur
    Then kullanici adrese gider "https://www.gmibank.com/api/tp-account-registrations" ssn "ssn" numarasi  "357-55-1023" ile  assert yapar

  @apicountry
  Scenario: Country
    Given kullanici tum musteri bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-countries"
    Then kullanici country assert "Japan" eder

  @apistate
  Scenario: State
    Given kullanici tum musteri bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-states"
    Then kullanici state "ohio" aseert eder

  @us24_post
  Scenario: US24_post
    Given kullanici state bilgilerini okur sayfasina giderek "https://www.gmibank.com/api/tp-states"
    And kullanici yeni  bir  state olusturur "Baye" ve assert eder