@employee
  Feature: US_09_10_11 test edilmesi

    Background: employee olarak giris yapilmasi
      Given kullanici employee olarak giris yapar

      @kullanicidogrulama @us_09
      Scenario: TC_0001-Kullanıcı, SSN'lerine göre yeni bir başvuru sahibi arayabilir ve doldurulmus tüm kayıt bilgilerini görebilir
        Given kullanici sayfasina "" gider
        And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
        And kullanici Search butonuna tiklar
        Then kullanici bilgileri assert eder

      @adress @us_10
        Scenario: TC_0002 Adres girisi sokak ve numara olarak girilebilmeli ve boş bırakılamaz
        Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
        And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
        And kullanici Search butonuna tiklar
        And kullanici Middle Initial kutusuna "hasan" degerini girer
        And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
        And kullanici Phone Number kutusuna "123-123-1234" degerini girer
        And kullanici Zip Code kutusuna "83241" degerini girer
        And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
        And kullanici City kutusuna "München" degerlerini girer
        And kullanici Country  dropdowndan  "Germany" index secer
        And kullanici State kutusuna "New York" degerlerini girer
        Then kullanici basarili islemi assert yapar

    @adress @us_10
    Scenario: TC_0003 Adres girisi sokak ve numara olarak girilebilmeli ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @adress @us_10
    Scenario: TC_0004 Adres girisi sokak ve numara olarak girilebilmeli ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "." degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      Then kullanici hatali islemi assert yapar

      @city @us_10
    Scenario: TC_0005 Şehir girisi olmali ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
        Then kullanici basarili islemi assert yapar

    @city @us_10
    Scenario: TC_0006 Şehir girisi olmali ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @country @us_10
    Scenario: TC_0007 Ülke yazılmalı ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      Then kullanici basarili islemi assert yapar

    @country @us_10 @tc08
    Scenario: TC_0008 Ülke yazılmalı ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @state @us_10
    Scenario: TC_0009 Eyalet ABD eyaleti olarak sağlanmalıdır ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @state @us_10
    Scenario: TC_0010 Eyalet ABD eyaleti olarak sağlanmalıdır ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "Bayern" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @state @us_10
    Scenario: TC_0011 Eyalet ABD eyaleti olarak sağlanmalıdır ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      Then kullanici basarili islemi assert yapar

    @us_11 @oncekitarih
    Scenario: TC_0012 Musteri olusturuldugu andan daha önce ki, geçmişte bir tarih yazılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "01.10.2019" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @us_11 @aygunyil @tc_13
    Scenario: TC_0013 Tarih ay, gün, yıl, saat ve dakika olarak oluşturulmalıdır
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "25.10.2020" degerlerini girer
      Then kullanici hatali islemi assert yapar

    @us_11 @aygunyil  @tc_14
    Scenario: TC_0014 Tarih ay, gün, yıl, saat ve dakika olarak oluşturulmalıdır
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "08.01.2021" degerlerini girer
      Then kullanici basarili islemi assert yapar

    @us_11 @user @tc_15
    Scenario: TC_0015 Kullanıcı kayıttan bir kullanıcı seçebilir ve boş olamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "08.01.2021" degerlerini girer
      And kullanici user dropdown dan "" degerini secer
      Then kullanici hatali islemi assert yapar

    @us_11 @user
    Scenario: TC_0016 Kullanıcı kayıttan bir kullanıcı seçebilir ve boş olamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "08.01.2021" degerlerini girer
      And kullanici user dropdown dan "sali Ali can" degerini secer
      Then kullanici basarili islemi assert yapar


    @us_11 @account
    Scenario: TC_0017 Orada kullanıcı, yönetim hesaplarında oluşturulan bir hesabı seçebili
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "08.01.2021" degerlerini girer
      And kullanici user dropdown dan "sali Ali can" degerini secer
      And kullanici  account kutusundan "team20_savingHesap" degerini secer
      Then kullanici basarili islemi assert yapar

    @us_11 @zelle
    Scenario: TC_0018 Kullanıcı kayıttan bir kullanıcı seçebilir ve boş olamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8300" degerini girer
      And kullanici Search butonuna tiklar
      And kullanici Middle Initial kutusuna "hasan" degerini girer
      And kullanici Mobile Phone Number kutusuna "321-654-9870" degerini girer
      And kullanici Phone Number kutusuna "123-123-1234" degerini girer
      And kullanici Zip Code kutusuna "83241" degerini girer
      And kullanici Address kutusuna "Cikmaz Sokak 20" degerlerinni girer
      And kullanici City kutusuna "München" degerlerini girer
      And kullanici Country  dropdowndan  "Germany" index secer
      And kullanici State kutusuna "New York" degerlerini girer
      And kullanici create date kutusuna "08.01.2021" degerlerini girer
      And kullanici user dropdown dan "sali Ali can" degerini secer
      And kullanici  account kutusundan "Global Account1" degerini secer
      And kullanici zelle enrolled  kutucugunu  tiklar
      Then kullanici basarili islemi assert yapar




      @Us9_10_11 @smoketest
    Scenario:TC_0009_0010_0011 Eyalet ABD eyaleti olarak sağlanmalıdır ve boş bırakılamaz
      Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
      And kullanici SearchSSn kutusuna "291-34-8334" degerini girer
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
        And kullanici user dropdown dan "sali Ali can" degerini secer
        And kullanici  account kutusundan "aaa" degerini secer
        And kullanici zelle enrolled  kutucugunu  tiklar
        And kullanici save butonuna basar
        Then kullanici basarili islemi assert yapar


