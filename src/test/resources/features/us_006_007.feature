@gmibank
@us_006_007_kullanicigiris
Feature: GmiBank Kullanici Bilgi Gunceller
  Scenario:TC_0001 Kullanici gmibank giris yapar
    Given kullanici customer "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    Then kullanici anasayfaya giris yaptigini assert eder

  @us_006_007_kullaniciayarlar01
  Scenario:TC_0002 Kullanici giris yapdiktan sonra User Info(Ayarlara) gidebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    Then kullanici User settings for sayfasini assert eder

  @us_006_007_kullaniciayarlar02
  Scenario:TC_0003 Kullanici User settings for sayfasindaki guncellenebilecek bilgileri listeleyiniz
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    Then kullanici User settings for sayfasindaki guncellenebilecekleri assert eder

  @us_006_007_kullaniciayarlar03
  Scenario:TC_0004 Kullanici User settings for Language Drop Down da iki dil secenegi olmali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    Then kullanici User settings for sayfasindaki language dropdown iki dil oldugunu assert eder

  @us_006_007_kullaniciayarlar04
  Scenario:TC_0005 Kullanici User settings for First Name kutusundaki bilgiyi guncellenebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici First Name kutusunu tiklar
    And kullanici First Name kutusunu temizler
    And kullanici First Name kutusuna "Funda" girer
    And kullanici save butonunu tiklar
    Then kullanici First Name kutusundaki bilginin guncellendigini assert eder

  @us_006_007_kullaniciayarlar05
  Scenario:TC_0006 Kullanici User settings for Last Name kutusundaki bilgiyi guncelleyebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Last Name kutusunu tiklar
    And kullanici Last Name kutusunu temizler
    And kullanici Last Name kutusuna "Tanriverdi" girer
    And kullanici save butonunu tiklar
    Then kullanici Last Name kutusundaki bilginin guncellendigini assert eder

  @us_006_007_kullaniciayarlar06
  Scenario:TC_0007 Kullanici settings for Email bilgisini guncelleyebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna "fnda20@gmail.com" girer
    And kullanici save butonunu tiklar
    Then kullaniciEmail kutusundaki bilginin guncellendigini assert eder

  @us_006_007_kullaniciayarlar07
  Scenario:TC_0008 Kullanici settings for Language "Türkçe" secip guncelleyebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Language DropDown "Türkçe" secer
    And kullanici save butonunu tiklar
    Then kullanici Language DropDown bilginin guncellendigini assert eder

  @us_006_007_kullaniciayarlar08
  Scenario:TC_0009 Kullanici settings for "Türkçe" sectiginde guncellenebilen bilgiler turkçe olmali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Language DropDown "Türkçe" secer
    And kullanici save butonunu tiklar
    Then kullanici setting for guncellenebilecek bilgilerin Türkçe oldugunu assert eder

  @us_006_007_kullaniciayarlar09
  Scenario:TC_0010 Kullanici settings for Language "English" secip guncelleyebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Language DropDown "English" secer
    And kullanici save butonunu tiklar
    Then kullanici Language DropDown bilginin guncellendigini assert eder

  @us_006_007_kullaniciayarlar10
  Scenario:TC_0011 Kullanici settings for "English" sectiginde guncellenebilen bilgiler turkçe olmali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Language DropDown "English" secer
    And kullanici save butonunu tiklar
    Then kullanici setting for guncellenebilecek bilgilerin English oldugunu assert eder


  @email_laguage
  @us_006_007_kullaniciayarlar11
  Scenario: :TC_0012 Kullanici settings for Email invalid deger girilir,hata mesaji alinmali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna "fnd20gmailcom" girer
    Then kullaniciEmail kutusunun altinda hata mesajini assert eder

  @us_006_007_kullaniciayarlar13
  Scenario: :TC_0014 Kullanici settings for Email invalid deger girilir,hata mesaji alinmali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna "fnd20@gmail." girer
    Then kullaniciEmail kutusunun altinda hata mesajini assert eder

  @us_006_007_kullaniciayarlar14
  Scenario: :TC_0015 Kullanici settings for Email invalid deger girilir,hata mesaji alinmali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna "fnd20@gmail" girer
    Then kullanici Email kutusunun altinda hata mesajini assert eder

  @us_006_007_kullaniciayarlar15
  Scenario:TC_0016 Kullanici User settings for Language "English ve Türkçe" disinda dil olmamali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici User settings for sayfasindaki language dropdown iki dil oldugunu gorur
    Then kullanici Language DropDown "Deutsche" secemezdigini assert eder


  @us_006_007_kullaniciayarlar16
  Scenario:TC_0016 Kullanici User settings for Language "English ve Türkçe" disinda dil olmamali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici User settings for sayfasindaki language dropdown iki dil oldugunu gorur
    Then kullanici Language DropDown "Deutsche" secemezdigini assert eder


  @us_006_007_kullaniciayarlar17 @smoketest01
    Scenario Outline: : TC_006 kullanici ayarlarda bilgilerini guncelleyebilmeli
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici First Name kutusunu tiklar
    And kullanici First Name kutusunu temizler
    And kullanici First Name kutusuna "<isim>" girer
    And kullanici Last Name kutusunu tiklar
    And kullanici Last Name kutusunu temizler
    And kullanici Last Name kutusuna "<soyadi>" girer
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna "<email>" girer
    And kullanici Language DropDown "<language>" secer
    And kullanici save butonunu tiklar
    Then kullanici bilgileri guncelledigini assert eder
    Examples:
      | isim | soyadi | email            |  language |
      |Dilara| Team20  |dilara20@gmail.com |English|
      |Melike| Melike  | melike20@hotmail.com|Türkçe|
      |Fidan | Tanriverdi|fidn20@icloud.com  |English|



  @us_006_007_kullaniciayarlar18 @smoketest02
  Scenario Outline: : TC_006 kullanici invalid email ile guncelleme yapamamali,hata almali
    Given kullanici "http://gmibank.com" sayfasina gider
    And kullanici menu dropdown tiklar
    And kullanici sing in tiklar
    And kullanici username kutusuna tiklar
    And kıllanici username kutusuna "Fidan20" girer
    And kullanici password kutusuna tiklar
    And kullanici password kutusuna "Team20Fidan?" girer
    And kullanici sing in butonunu tiklar
    And kullanici account-menu tiklar
    And kullanici account-menuden dropdown User Info tiklar
    And kullanici First Name kutusunu tiklar
    And kullanici First Name kutusunu temizler
    And kullanici First Name kutusuna "<isim>" girer
    And kullanici Last Name kutusunu tiklar
    And kullanici Last Name kutusunu temizler
    And kullanici Last Name kutusuna "<soyadi>" girer
    And kullanici Email kutusunu tiklar
    And kullanici Email kutusunu temizler
    And kullanici Email kutusuna invalid "<email>" girer
    Then kullanici Email kutusunun altinda hata mesajini assert eder
    Examples:
      | isim | soyadi | email | language |
      |Dilara| Team20  |dilara20gmail.com |English|
      |Melike| Melike  | melike20@hotmailcom|Türkçe|
      |Fidan | Tanriverdi|fidn20@icloud.  |English|
      |Funda |Fidan      |fnda20@gmail    |English |














