@UserYeniStateApi
  Feature: GmiBank kullanici yeni state olusturma
    Scenario: kullanici yeni state olusturur ve dogrular
      Given kullanici state bilgileri "https://www.gmibank.com/api/tp-states" gider
      And kullanici oncelikle state listesinin boyutunu bulur
      And kullanici yeni bir state "Stockholm" olusturur
      Then kullanici yeni state olusturdugunu dogrular
