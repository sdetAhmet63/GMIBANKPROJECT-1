



@gmi_bank
@gmi_bank01

Feature: Gmi Bank
  Background: Gmi Bank yeni hesap numarasi olusturma

  Scenario: TC13_14_kullanici yeni hesap numarasi olusturur
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.




  @gmi_bank
  @gmi_bank02
  Scenario: TC13_14_kullanici aciklama bolumune harf ve rakam girer
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli021" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank03
  Scenario: TC13_14_kullanici aciklama bolumuna harf, rakam ve ozel karakter girer
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli*;-" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank04
  Scenario: TC13_14_kullanici aciklama bolumuna minumum 2 karekter test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "VH" yazar
   # And kullanici minimum iki karekterin kabul etmedigini test eder
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank05
  Scenario: TC13_14_kullanici aciklama bolumuna maximum degeri test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Fethi Kaya Vadeli Hesap Ozellllllllllllll" yazar
    #And kullanici aciklama kismina max deger otuzbes karekter giremedigini test eder
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank06
  Scenario: TC13_14_kullanici aciklama bolumuna null deger test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "" yazar
    And kullanici aciklama kismina null deger girilmedigini assurt eder
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank07
  Scenario: TC13_14_kullanici Balance bolumune harf girer
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10FKaya" rakamlarini yazar
    And kullanici Balance kutusu harf kabul etmedigini assurt eder
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank08
  Scenario: TC13_14_kullanici Balance bolumune ozel karekter girer girer
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "123F**-+" rakamlarini yazar
    And kullanici Balance kutusu ozel karakter kabul etmedigini assurt eder
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank09
  Scenario: TC13_14_kullanici Balance bolumune minimum degerini test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "0,50" rakamlarini yazar
    And kullanici Balans degerinin en az bir dolar olması gerektigini assurt eder
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank10
  Scenario: TC13_14_kullanici Balance bolumune maximum degerini test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "100000000000" rakamlarini yazar
    And kullanici max deger olarak on milyar dolar girildigini assurt eder
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank11
  Scenario: TC13_14_kullanici Balance bolumune null degerini test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "" rakamlarini yazar
    And kullanici balance deger null kabul etmedigini assert eder
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank12
  Scenario: TC13_14_kullanici hesap islem turunu test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap turlerini consola yazdirir
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank13
  Scenario: TC13_14_kullanici hesap durumunu test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee console yazdirir
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.

  @gmi_bank
  @gmi_bank14
  Scenario: TC13_14_kullanici hesap olusturma gecmise ait bir tarih ile test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit tarihi olarak gecmise ait "01.12.2020" olarak girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici gecmis tarihli kayid edilmedigini assurt eder.

  @gmi_bank
  @gmi_bank15
  Scenario: TC13_14_kullanici hesap olusturma gelecege ait bir tarih ile test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit tarihi olarak gelecek tarihe ait ait "30.12.2020" olarak girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici gelecek tarihli kayid yapilmadigini assurt eder.


  @gmi_bank
  @gmi_bank16
  Scenario: TC13_14_kullanici hesap kapatma gecmise ait bir tarih ile test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gecmise ait "01.12.2020" olarak girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici hesap kapatma tarihini gecmis tarih kayid edilmedigini assurt eder


  @gmi_bank
  @gmi_bank17
  Scenario: TC13_14_kullanici hesap kapatma glecege ait bir tarih ile test eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kaptam tarihini gelecege ait olarak  "30.12.2020" olarak girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici hesap kapatma tarihini gelecege ait tarih kayid edilmedigini assurt eder


  @gmi_bank
  @gmi_bank18
  Scenario: TC13_14_kullanici hasap acan calisani belirtir
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    And kullanici Employee drop down da tum Employee leri console yazdirir
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.

  @gmi_bank
  @gmi_bank19
  Scenario: TC13_14_kullanici bilgileri kayd eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.


  @gmi_bank
  @gmi_bank20
  Scenario: TC13_14_kullanici bilgilerin kayd edildigini assurt eder
    Given kullanici "http://gmibank.com/login" sayfasine gidip giris yapar
    And kulanici user name kutusuna "team20employee" yazar
    And kullanici passwort kismina "Team20Emp" yazar.
    And kullanici sign in tiklayip giris yapar.
    And kullanici My Operations tiklar
    And kullanci Manage Accounts tiklar
    And kullanici Create a new account buttonunu tiklar
    And kullanici aciklama kismina "Vadeli Hesap" yazar
    And kullanici Balance kutusuna "10" rakamlarini yazar
    And kullanici hesap cesitleri dropdown da "SAVING" secer
    And kullanici Account Status Typee dropdown da "CLOSED" secer
    And kullanici kayit yapacagi gunun tarihini girer
    And kullanici hesap kapatma tarihini gunun tarihini girer
    #And kullanici Employee de islemi yapan calisani secer
    And kullanici Save butonuna tiklayarak bilgileri kayd eder
    Then kullanici bilgilerin kayd edildigini assurt eder.

