@us_12

  Feature: GMIBank
    Background: Employee giris yapar ve Manage Customer butonuna tiklar
      Given Employee valid bilgiler ile "https://gmibank.com/" sayfasina employee olarak giriş yapar.
      And Employee My Operations modulu içerisinden Manage Costumers butonunu tıklar.

     @TC_001
    Scenario: TC-0001 Kullanici customer listesinde ID'nin gorunuyor ve tıkanabiliyor olduguna bakar.
       Then Employee sayfada customer ID'sinin gorunuyor ve tıkanabiliyor oldugunu assert eder.


     @TC_002
    Scenario: TC_0002 Kullanici customer listesinde First Name'in gorunup gorunmedigine bakar.
       Then Employee sayfada customer First Name'inin gorunuyor oldugunu assert eder.

     @TC_003
    Scenario: TC_0003 Kullanici customer listesinde Last Name'in gorunup gorunmedigine bakar.
       Then Employee sayfada customer Last Name'inin gorunuyor oldugunu assert eder.

     @TC_004
     Scenario: TC_0004 Kullanici customer listesinde Middle Initial'in gorunup gorunmedigine bakar.
       Then Employee sayfada customer Middle Initial'in gorunuyor oldugunu assert eder.

    @TC_005
    Scenario: TC_0005 Kullanici customer listesinde Email'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Email'in gorunuyor oldugunu assert eder.

    @TC_006
    Scenario: TC_0006 Kullanici customer listesinde Mobile Phone Number'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Mobile Phone Number'in gorunuyor oldugunu assert eder.

    @TC_007
    Scenario: TC_0007 Kullanici customer listesinde Phone Number'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Phone Number'in gorunuyor oldugunu assert eder.

    @TC_008
    Scenario: TC_0008 Kullanici customer listesinde Address'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Address'in gorunuyor oldugunu assert eder.

    @TC_009
    Scenario: TC_0009 Kullanici customer listesinde Create Date'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Create Date'in gorunuyor oldugunu assert eder.

    @TC_010
    Scenario: TC_0010 Kullanici customer listesinde View'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer View'in gorunuyor oldugunu assert eder.

    @TC_011
    Scenario: TC_0011 Kullanici customer listesinde View'in tiklanabiliyor olup olmadigina bakar.
      Then Employee sayfada customer View'in tiklanabiliyor oldugunu assert eder.

    @TC_012
    Scenario: TC_0012 Kullanici customer listesinde Delete'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Edit'in gorunuyor oldugunu assert eder.

    @TC_013
    Scenario: TC_0013 Kullanici customer listesinde Delete'in tiklanabiliyor olup olmadigina bakar.
      Then Employee sayfada customer Edit'in tiklanabiliyor oldugunu assert eder.

    @TC_014
    Scenario: TC_0014 Kullanici customer listesinde Edit'in gorunup gorunmedigine bakar.
      Then Employee sayfada customer Delete'in gorunuyor oldugunu assert eder.

    @TC_015
    Scenario: TC_0015 Kullanici customer listesinde Edit'in tiklanabiliyor olup olmadigina bakar.
      Then Employee sayfada customer Delete'in tiklanabiliyor oldugunu assert eder.

    @TC_016
    Scenario: TC_0016 Kullanici customer listesinde Edit'i tiklar ve ID kutusunu verify eder.
      Then Employee edit sayfasinda customer ID'nin gorunuyor ancak tiklanamiyor ve degistirilemiyor oldugunu assert eder.

    @TC_017
    Scenario: TC_0017 Kullanici customer listesinde Edit'i tiklar ve First Name kutusunu verify eder.
      Then Employee edit sayfasinda customer First Name'nin degistirilip degistirilemedigini assert eder.

    @TC_018
    Scenario: TC_0018 Kullanici customer listesinde Edit'i tiklar ve Last Name kutusunu verify eder.
      Then Employee edit sayfasinda customer Last Name'nin degistirilip degistirilemedigini assert eder.

    @TC_019
    Scenario: TC_0019 Kullanici customer listesinde Edit'i tiklar ve Middle Initial kutusunu verify eder.
      Then Employee edit sayfasinda customer Middle Initial'in degistirilip degistirilemedigini assert eder.

    @TC_020
    Scenario: TC_0020 Kullanici customer listesinde Edit'i tiklar ve Email kutusunu verify eder.
      Then Employee edit sayfasinda customer Email'in degistirilip degistirilemedigini assert eder.

    @TC_021
    Scenario: TC_0021 Kullanici customer listesinde Edit'i tiklar ve Mobile Phone Number kutusunu verify eder.
      Then Employee edit sayfasinda customer Mobile Phone Number'in degistirilip degistirilemedigini assert eder.

    @TC_022
    Scenario: TC_0022 Kullanici customer listesinde Edit'i tiklar ve Phone Number kutusunu verify eder.
      Then Employee edit sayfasinda customer Phone Number'in degistirilip degistirilemedigini assert eder.

    @TC_023
    Scenario: TC_0023 Kullanici customer listesinde Edit'i tiklar ve Zip Code kutusunu verify eder.
      Then Employee edit sayfasinda customer Zip Code'un degistirilip degistirilemedigini assert eder.

    @TC_024
    Scenario: TC_0024 Kullanici customer listesinde Edit'i tiklar ve Address kutusunu verify eder.
      Then Employee edit sayfasinda customer Address'in degistirilip degistirilemedigini assert eder.

    @TC_025
    Scenario: TC_0025 Kullanici customer listesinde Edit'i tiklar ve City kutusunu verify eder.
      Then Employee edit sayfasinda customer City'nin degistirilip degistirilemedigini assert eder.

    @TC_026
    Scenario: TC_0026 Kullanici customer listesinde Edit'i tiklar ve Ssn kutusunu verify eder.
      Then Employee edit sayfasinda customer Ssn'in degistirilip degistirilemedigini assert eder.

    @TC_027
    Scenario: TC_0027 Kullanici customer listesinde Edit'i tiklar ve Create Date kutusunu verify eder.
      Then Employee edit sayfasinda customer Create Date'in degistirilip degistirilemedigini assert eder.

    @TC_028
    Scenario: TC_0028 Kullanici customer listesinde Edit'i tiklar ve Country kutusunu verify eder.
      Then Employee edit sayfasinda customer Country'nin degistirilip degistirilemedigini assert eder.

    @TC_029
    Scenario: TC_0029 Kullanici customer listesinde Edit'i tiklar ve State kutusunu verify eder.
      Then Employee edit sayfasinda customer State'in degistirilip degistirilemedigini assert eder.

    @TC_030
    Scenario: TC_0030 Kullanici customer listesinde Edit'i tiklar ve User kutusunu verify eder.
      Then Employee edit sayfasinda customer User'in degistirilip degistirilemedigini assert eder.

    @TC_031
    Scenario: TC_0031 Kullanici customer listesinde Edit'i tiklar ve Account kutusunu verify eder.
      Then Employee edit sayfasinda customer Account'nin degistirilip degistirilemedigini assert eder.

    @TC_032
    Scenario: TC_0032 Kullanici customer listesinde Edit'i tiklar ve Zelle Enrolled kutusunu verify eder.
      Then Employee edit sayfasinda customer Zelle Enrolled kutusuna tick konulup konulamayacagini assert eder.

    @TC_033
    Scenario: TC_0033 Kullanici customer listesinde Edit'i tiklar ve Back kutusunu verify eder.
      Then Employee edit sayfasinda customer Back butonuna tiklanip tiklanamayacigini assert eder.

    @TC_034
    Scenario: TC_0034 Kullanici customer listesinde Edit'i tiklar ve Save kutusunu verify eder.
      Then Employee edit sayfasinda customer Save butonuna tiklanip tiklanamayacigini assert eder.

    @TC_035
    Scenario: TC_0035 Kullanici customer listesinde Edit ve daha sonra Delete'i tiklar ve Alert'i verify eder.
      Then Employee edit sayfasinda bir musteriyi silebilir, ancak employee silme konusunda emin misiniz diye bir mesaj görmelidir.

    @TC_036
    Scenario: TC_0036 Kullanici customer listesinde Edit ve daha sonra Delete'i tiklar ve Alert uzerindeki Cancel tusunu assert eder.
      Then Employee edit sayfasinda customer Delete butonuna tiklar ve Cancel butonunu assert eder.

    @TC_037
    Scenario: TC_0037 Kullanici customer listesinde Edit ve daha sonra Delete'i tiklar ve Alert uzerindeki Delete tusunu assert eder.
      Then Employee edit sayfasinda customer Delete butonuna tiklar ve Delete butonunu assert eder.
