  @US_008
  Feature: Ana sayfadaki şifre bölümü düzenlenir

    @TC_001
    Scenario: TC_001_Yeni sifre olarak eski sifre kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      And coonfirm new password kutusuna yeni sifreyi girer
      And  save tusuna tiklar
      Then "password changed " yazisi gorulmez
    @TC_002
    Scenario: TC_002_Yeni sifre olarak eski sifre kullanilmaz
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      And coonfirm new password kutusuna yeni sifreyi girer
      And  save tusuna tiklar
      Then "password changed " yazisi gorulur

    @TC_003
    Scenario: TC_003_sifrede en az bir kucuk harf kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin turuncu oldugunu gözlemler

    @TC_004
    Scenario: TC_004_sifrede kucuk harf kullanilmaz
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin kirmizi oldugunu gözlemler
    @TC_005
    Scenario: TC_005_sifrede en az bir kucuk harf kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      And  save tusuna tiklar
      Then "password changed " yazisi gorulur

    @TC_006
    Scenario: TC_006_sifrede kucuk harf kullanilmaz
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And current password kutusuna yeni sifreyi girer
      And  save tusuna tiklar
      Then "An error has occurred! The password could not be changed." yazisi gorulur

    @TC_007
    Scenario: TC_007_sifrede en az bir rakam kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin turuncu oldugunu gözlemler
    @TC_008
    Scenario: TC_008_sifrede rakam kullanilmaz
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin kirmizi oldugunu gözlemler

    @TC_009
    Scenario: TC_009 sifrede ozel karakter kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin turuncu oldugunu gözlemler

    @TC_010
    Scenario: TC_0010 sifrede ozel karakter kullanilmaz
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin kirmizi oldugunu gözlemler

    @TC_011
    Scenario: TC_0011 alti karakterli bir sifre kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin kirmizi oldugunu gözlemler
    @TC_012
    Scenario: TC_0012 yedi karakterli sifre kullanilir
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      Then password guvenlik seiye cizelgesinin renginin turuncu oldugunu gözlemler
    @TC_013
    Scenario: TC_0013 sifre onaylanabilinir olur
      Given kullanici https://gmibank.com/ sayfasina gider
      And gecerli kullanici bilgileri ile giris yapar
      And home page teki kullanici adi uzerine gelerek "password" tusuna tiklar
      And current password kutusuna eski sifreyi girer
      And new password kutusuna yeni sifreyi girer
      And coonfirm new password kutusuna yeni sifreyi gir
      And save tusuna tiklar
      Then "password changed " yazisi gorulur


