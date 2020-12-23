@TC_22Test
Feature: US22 TEST

  @RegisterErstellen @User_erstellen
  Scenario: Us_22 kullanici gmi bank kayit sayfasinda kayit islemi gerceklestirir
    Given "https://gmibank.com/" sayfasina gider
    And   profil logolu dropdown ve icindeki register linkini tiklar
    And   kayit sayfasinda ssn kutusuna tiklar ve ssn numarasi ni girer ve bunu excele yazdırır.
    And   ilk ad kutusuna ilkad ini girer ve bunu excele yazdırır.
    And   son ad kutusuna sonad ini girer ve bunu excele yazdırır.
    And   adres kutusuna adres ini girer ve bunu excele yazdırır.
    And   mobil telefon numarasi kutusuna mobile telefon numarasi ni girer ve bunu excele yazdırır.
    And   username kutusuna username ini girer ve bunu excele yazdırır.
    And   email kutusuna email ini girer ve bunu excele yazdırır.
    And   kullanici kayit sayfasinda yeni sifre kutusuna tiklar
    And   newPassword ve confirmation kutusuna yedi karakterli Password girer ve bunu excele yazdırır.
    Then  kullanici register butonuna tiklar

    @Aktivasyon @User_erstellen
  Scenario: Admin hesabı oluşturulan kullanıcıyı aktive eder
    Given ana sayfa "http://www.gmibank.com/" adresine gidiniz
    And   menu butonuna tıklayınız
    And   sign in tıklayınız
    And   username "team20admin" giriniz
    And   password "Team20Admin" giriniz
    Then  sign in butonuna tıklayınız
    And   Administratordan user management secilir
    Given Olusturulan Musteri bulunur
    And   Edite tiklanir ve Active edilir
    Then  save butonuna tiklanir ve cikis yapilir

  @Bilgi_girisi @User_erstellen
  Scenario: Employe hesabı oluşturulan customer hesabı bilgilerini düzenler
    Given ana sayfa "http://www.gmibank.com/" adresine gidiniz
    And   menu butonuna tıklayınız
    And   sign in tıklayınız
    And   username "team20employee" giriniz
    And   password "Team20Emp" giriniz
    Then  sign in butonuna tıklayınız
    Given kullanici sayfasina "http://www.gmibank.com/tp-customer/new" gider
    And   kullanici SearchSSn kutusuna ssn degerini okutup yazdırır.
    And   kullanici Search butonuna tiklar
    And   kullanici Middle Initial kutusuna ikinci adın ilk harfini okutup yazdırır.
    And   kullanici Mobile Phone Number kutusuna telefon değerini okutup yazdırır.
    And   kullanici Phone Number kutusuna 123-123-1234 formatında numara girer ve bunu excele yazdırır.
    And   kullanici Zip Code kutusuna 5 digit numara girer ve bunu excele yazdırır.
    And   kullanici Address kutusuna adresse degerlerini okutup yazdırır
    And   kullanici City kutusuna sehir ismi girer ve bunu excele yazdırır.
    And   kullanici Country  dropdowndan  fake index sayısı atar ve bunu excele yazdırır.
    And   kullanici State kutusuna fake index sayısı atar ve bunu excele yazdırır.
    And   kullanici create date kutusuna 08.01.2021 formatında bugünün tarihini girer ve excele yazdırır.
    And   kullanici user dropdown dan "aliv ALI VELI" degerini secer
    And   kullanici  account kutusundan "Global Account1","aaa" degerini secer
    And   kullanici zelle enrolled  kutucugunu  tiklar
    And   kullanici save butonuna basar


  @USApi_22_01

  Scenario: TC01_kullanici apinin calistini kontrol eder
    Given kullanici kendisine verilen "https://www.gmibank.com/api/tp-customers" token ile apiye baglanir
    Given kullanici jsonlari javaya cevirir
    Given Tüm müşterileri texte yazdır.
    Then  En son oluşturulan kullanıcının Ssn numarası ile api'dan çekilen veriyi karşılaştırıp dogrula.


  @USApi_22_02
  Scenario: TC02_kullanici
    Given kullanici kendisine verilen "https://www.gmibank.com/api/tp-customers" token ile apiye baglanir
    Given kullanici jsonlari javaya cevirir
    Given kullanici eyaletleri texte yazdırır
    Then  kullanici En son oluşturulan kullanıcının Eyalet ismi ve Ssn numarası ile api'dan çekilen veriyi karşılaştırıp dogrula.

