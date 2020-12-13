  @US_008
    Feature: Ana sayfadaki şifre bölümü düzenlenebilir
    Background:kullanici giris yapar
      Given kullanici "http://www.gmibank.com/login" sayfasina gider
      And gecerli kullanici adini girer "team20customer1"
      And gecerli sifreyi girer "Team20Cus"
      And "sign in" tusuna basar
      And home pageteki kullanici adina "team20customer1" tiklanarak "password" tusuna tiklar
      And current password kutusuna guncel sifreyi girer "Team20Cus"

    @TC_001
    Scenario: TC_001 Yeni sifre olarak eski sifre kullanilir
      And  new password kutusuna yeni sifreyi girer "Team20Cus"
      And  confirm new password kutusuna yeni sifreyi girer "Team20Cus"
      And  save tusuna tiklar
      Then "Password changed!" yazisinin olmadigini gorur


    @TC_002
    Scenario: TC_002 sifrede en az bir kucuk harf kullanilir
      And  new password kutusuna yeni sifreyi girer "TEAMCUs"
      Then password guvenlik seiye cizelgesinin renginin degistigini gözlemler


    @TC_003
    Scenario: TC_003 sifrede en az bir rakam kullanilir
      And  new password kutusuna yeni sifreyi girer "GMIBANK1"
      Then password guvenlik seiye cizelgesinin renginin degistigini gözlemler

    @TC_004
    Scenario: TC_004 sifrede ozel karakter kullanilir
      And  new password kutusuna yeni sifreyi girer "GMIBANK."
      Then password guvenlik seiye cizelgesinin renginin degistigini gözlemler

    @TC_005
    Scenario: TC_005 alti karakterli bir sifre kullanilir
      And  new password kutusuna yeni sifreyi girer "GMIban"
      Then password guvenlik seiye cizelgesinin renginin degismedigini gözlemler

    @TC_006
    Scenario: TC_006 yedi karakterli sifre kullanilir
      And new password kutusuna yeni sifreyi girer "GMIbank"
      Then password guvenlik seiye cizelgesinin renginin degistigini gözlemler

    @TC_007
    Scenario: TC_007 sifre onaylanir
      And new password kutusuna yeni sifreyi girer "GMIbank1."
      And confirm new password kutusuna yeni sifreyi girer "GMIbank1."
      And save tusuna tiklar
      Then "Password changed!" yazisi gorulur
      And current password kutusunun icini temizler
      And current password kutusuna guncel sifreyi girer "GMIbank1."
      And new password kutusunun icini temizler
      And new password kutusuna yeni sifreyi girer "Team20Cus"
      And confirm new password kutusunun icini temizler
      And confirm new password kutusuna yeni sifreyi girer "Team20Cus"
      And save tusuna tiklar



