@smoketest
  Feature: Demo

    Scenario Outline: Customer register yapar
      Given kullanici "https://gmibank.com/" sayfasina gider
      And kullanici profil logolu dropdown ve icindeki register linkini tiklar
      And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
      And kullanici ilk ad kutusuna "<ilkad>" ini girer
      And kullanici son ad kutusuna "<sonad>" ini girer
      And kullanici adres kutusuna "<adres>" ini girer
      And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
      And kullanici username kutusuna "<username>" ini girer
      And kullanici email kutusuna "<email>" ini girer
      And kullanici kayit sayfasinda yeni sifre kutusuna tiklar
      And kullanici newPassword kutusuna yedi karakterli "<Password>" girer ve guvenlik seviyesini kontrol eder
      And kullanici New password confirmation kutusuna yedi karakterli "Gmi2a!.a345" girer ve guvenlik seviyesini kontrol eder
      Then kullanici register butonuna tiklar


      Examples:
        |ssn numarasi |ilkad    |sonad    |adres                   |mobile telefon numarasi|username       |email                      | Password    |
        |222-18-1444  |Carlos   |Valder   |Magic Street No:124/5   |048-194-0277           |Val4555Car       |valdercarlos11@hotmail.com   |Gmi2a!.a345 |


   Scenario: Admin customeri  aktiv yapar
      Given https://gmibank.com/ adresine gider ve admin olarak giris yapar
      And Administratordan user management secilir
      Given Olusturulan Musteri bulunur
      And Edite tiklanir ve Active edilir
      Then save butonuna tiklanir ve cikis yapilir


   Scenario: Employee customera hesap tanimlar

     Given kullanici employee olarak giris yapar
     Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
     And kullanici SearchSSn kutusuna "222-18-1444" degerini girer
     And kullanici Search butonuna tiklar
     And kullanici Middle Initial kutusuna "hasan" degerini girer
     And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
     And kullanici Phone Number kutusuna "123-123-1234" degerini girer
     And kullanici Zip Code kutusuna "83241" degerini girer
     And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
     And kullanici City kutusuna "München" degerlerini girer
     And kullanici Country  dropdowndan  "GERMANY" index secer
     And kullanici State kutusuna "New York" degerlerini girer
     And kullanici create date kutusuna "08.01.2021" degerlerini girer
     And kullanici user dropdown dan "aliv ALI VELI" degerini secer
     And kullanici  account kutusundan "Global Account1","aaa" degerini secer
     And kullanici zelle enrolled  kutucugunu  tiklar
     And kullanici save butonuna basar
     And kullanici basarili islemi assert yapar
     And     menu butonuna tıklayınız
     Then    Sign Out butonuna tıklayınız.


   Scenario: Customer havale  yapar

     Given ana sayfa "http://www.gmibank.com/" adresine gidiniz
     And   menu butonuna tıklayınız
     And   sign in tıklayınız
     And   username "osmntest" giriniz
     And   password "Osman2015" giriniz
     Then  sign in butonuna tıklayınız
     And  My Operations butonuna tıklayınız
     And  Transfer Money butonunu tıklayınız
     Given   From butonunu tıkla rastgele bir hesap sec.
     And     To butonunu tıkla rastgele bir hesap sec.
     And     Balance kutucuğunu tıkla
     And     From dropdonda seçilen hesaptaki bakiye miktarına eşit veya daha düşük bir meblağ gir.
     And     Description kutucuğunu tıkla.
     And     Bir açıklama yaz.
     And     Make Transfer butonunu tıkla
     And    ekranda "transfer is done successfully" mesajı görünmeli.
     And     menu butonuna tıklayınız
     Then    Sign Out butonuna tıklayınız.
