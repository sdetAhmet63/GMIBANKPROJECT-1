@us29
Feature: Veri Okuma

  @dbcustomer
  Scenario: TC_001_kullanici customer tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici customer verilerine erisim saglar ve "145-76-9874" assert eder

    @db_admin
  Scenario: TC_002_kullanici admin tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici admin verilerine erisim saglar ve assert eder

@db_employee
  Scenario: TC_003_kullanici employee tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici employee verilerine erisim saglar ve assert eder

  @db_country
  Scenario: TC_004_kullanici country tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici country verilerine erisim saglar ve assert eder

    @db_state
  Scenario: TC_005_kullanici state tablosundaki verileri okur
    Given kullanici veritabanina baglanir
    And kullanici state verilerine erisim saglar ve assert eder


