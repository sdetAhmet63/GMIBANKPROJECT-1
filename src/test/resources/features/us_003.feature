@US003

Feature: US_003 Registration page should restrict password usage to a secure and high level passcode

  Background: kullanici hesap olusturmak icin registration sayfasina gider
    Given kullanici kayit "http://www.gmibank.com/account/register" sayfasina gider


  @TC00301
  Scenario Outline: TC_00301  Pozitif Test  daha guclu bir parola icin en az bir kucuk harf girilir ve parola guvenlik seviyesi kontrol edilir
    Given kullanici newPassword kutusuna en az bir kucuk harf iceren "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password   |
      | Teste2020. |
      | GmB202-    |
      | tES2+      |
      | tes2020    |
      | GMI2020t   |


  @TC00302
  Scenario Outline: TC_00302 Negatif Test daha guclu bir parola icin kucuk harf olmadan password  girilir ve parola guvenlik seviyesi kontrol edilir
    Given kullanici newPassword kutusuna kucuk harf icermeyen "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password   |
      | GMIBA2015. |
      | GB201!     |
      | GB2015434! |



  @TC00303
  Scenario Outline: TC_00303 Pozitif Test  daha guclu bir parola icin en az bir rakam girilir ve parola guvenlik seviyesi kontrol edilir
    Given  kullanici newPassword kutusuna en az bir rakam iceren "<Password>" girer ve guvenlik seviyesini kontrol eder

    Examples:
      | Password |
      | Gmi2a.!  |
      | Gb!2C4   |
      | 345a!B   |


  @TC00304
  Scenario Outline: TC_00304 Negatif Test  daha guclu bir parola icin rakam icermeyen password girilir ve parola guvenlik seviyesi kontrol edilir
    Given kullanici newPassword kutusuna  rakam icermeyen "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password        |
      | GMIBAn.         |
      | Gesdfbbdf!!!!   |
      | GmBdfsdgb!!!..! |


  @TC00305
  Scenario Outline: TC_00305 Pozitif Test daha guclu bir parola icin en az bir ozel karakter girilir ve parola guvenlik seviyesi kontrol edilir
    Given kullanici newPassword kutusuna en az bir ozel karakter iceren "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password        |
      | GM24La.         |
      | Gbt2!a2         |
      | GeTdf34dgb!!..! |

  @TC00306
  Scenario Outline: TC_00306 Negativ Test daha guclu bir parola icin ozel karakter icermeyen parola girilir ve parola guvenlik seviyesi kontrol edilir
    Given kullanici newPassword kutusuna ozel karakter icermeyen "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password |
      | GMIBANk23 |
      | Gmi2     |
      | GmTd35   |


  @TC00307  # Smoke test
  Scenario Outline: TC_00307 Positiv Test  daha guclu parola icin en az yedi karakter girilir

    Given kullanici newPassword kutusuna yedi karakterli "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password    |
      | Gb2.!Al     |
      | Gmi2a!.a345 |


  @TC00308
  Scenario Outline: TC_00308 Negativ Test karakter sayisi yediden az girilir ve seviye kontrol edilir

    Given kullanici newPassword kutusuna karakter sayisi yediden az "<Password>" girer ve guvenlik seviyesini kontrol eder


    Examples:
      | Password |
      | Gb2.!A   |
      | Gmi2t    |
      | aT2*     |




