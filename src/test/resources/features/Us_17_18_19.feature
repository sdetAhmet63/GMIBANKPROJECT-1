@Admingirisi
Feature: Admin Kullanici Rolunu Etkinlestirmesi
  Background:Kullanici Admin olarak giris yapar ve user management sayfasina gider
    Given https://gmibank.com/ adresine gider ve admin olarak giris yapar
    Then Administratordan user management secilir

  @UserRolEtkinlestirme
  Scenario: TC_0001_Admin kullanici olarak bir rolü etkinleştirebilir
    Given team20admintest bulunur ve edite tiklanir
    And Profilden ROLE_USER secilir
    Then save butonuna tiklanir

  @EmployeeRolEtkinlestirme
  Scenario: TC_0002_Admin, çalışan olarak bir rolü etkinleştirebilir
    Given team20admintest bulunur ve edite tiklanir
    And Profilden ROLE_EMPLOYEE secilir
    Then save butonuna tiklanir

  @ManagerRolEtkinlestirme
  Scenario: TC_0003_Admin, yönetici olarak bir rolü etkinleştirebilir
    Given team20admintest bulunur ve edite tiklanir
    And Profilden ROLE_MANAGER secilir
    Then save butonuna tiklanir

  @AdminRolEtkinlestirme
  Scenario: TC_0004_Admin, admin olarak bir rolü etkinleştirebilir
    Given team20admintest bulunur ve edite tiklanir
    And Profilden ROLE_ADMIN secilir
    Then save butonuna tiklanir

  @Adminadminbilgilerinigoruntuleme
  Scenario: TC_0005_Admin admin kullanıcı bilgilerini goruntuleyebilir
    Given team20admintest4u bulun ve viewe tiklayin

  @Adminmanagerbilgilerinigöruntuleme
  Scenario: TC_0006_Admin manager kullanıcı bilgilerini goruntuleyebilir
    Given team20admintest1i bulun ve viewe tiklayin

  @Adminemployeebilgilerinigöruntuleme
  Scenario: TC_0007_Admin employee kullanıcı bilgilerini goruntuleyebilir
    Given team20admintest2i bulun ve viewe tiklayin

  @Adminuserbilgilerinigöruntuleme
  Scenario: TC_0008_Admin user kullanıcı bilgilerini goruntuleyebilir
    Given team20admintest3u bulun ve viewe tiklayin


  @Adminadminbilgileriniduzenleme
  Scenario: TC_0009_Admin admin kullanıcı bilgilerini duzenleyebilir
    Given team20admintest4u bulun ve edite tiklayin
    And Admin adminin lastnameni duzenler
    Then Admin lastnameyi assert edin

  @Adminmanagerbilgileriniduzenleme
  Scenario: TC_0010_Admin manager kullanıcı bilgilerini duzenleyebilir
    Given team20admintest1i bulun ve edite tiklayin
    And Admin managerin lastnameni duzenler
    Then Manager lastnameyi assert edin

  @Adminemployeebilgileriniduzenleme
  Scenario: TC_0011_Admin employee kullanıcı bilgilerini duzenleyebilir
    Given team20admintest2u bulun ve edite tiklayin
    And Admin employeenin lastnameni duzenler
    Then Employee lastnameyi assert edin

  @Adminuserbilgileriniduzenleme
  Scenario: TC_0012_Admin user kullanıcı bilgilerini duzenleyebilir
    Given team20admintest3u bulun ve edite tiklayin
    And Admin userin lastnameni duzenler
    Then User lastnameyi assert edin


  @Adminadminbilgilerinisilebilir
  Scenario: TC_0013_Admin admin kullanıcı bilgilerini silebilir
    Given team20admintest4u bulur ve delete tiklar
    Then Are you sure you want to delete user team20admintest4 mesajini gorur

  @Adminmanagerbilgilerinisilebilir
  Scenario: TC_0014_Admin manager kullanıcı bilgilerini silebilir
    Given team20admintest1i bulur ve delete tiklar
    Then Are you sure you want to delete user team20admintest1 mesajini gorur

  @Adminemployeebilgilerinisilebilir
  Scenario: TC_0015_Admin employee kullanıcı bilgilerini silebilir
    Given team20admintest2i bulur ve delete tiklar
    Then Are you sure you want to delete user team20admintest2 mesajini gorur

  @Adminuserbilgilerinisilebilir
  Scenario: TC_0016_Admin user kullanıcı bilgilerini silebilir
    Given team20admintest3u bulur ve delete tiklar
    Then Are you sure you want to delete user team20admintest3 mesajini gorur

  @MusteriHesapBilgilerininGorulmesi
  Scenario: US18_TC0001_Bilgileri doldurulan musterinin hesap bilgileri muşteri yonetimi modulunde gorunmelidir
    Given Create a User butonuna tiklanir
    And Kullanici bilgileri girilir
    And Save butonuna basilir
    And My Operationsdan Manage Accounts secilir
    Then Musterinin hesap bilgileri gorulur

  @ViewDugmesininOlmasi
  Scenario: US18_TC0002_View seçeneği olmalidir
    Given Kullanici Customer18i bulur ve view secenegini basar
    Then  View butonunun calistigini assert eder

  @EditDugmesininOlmasi
  Scenario: US18_TC0003_Edit seçeneği olmalidir
    Given Kullanici Customer18i bulur ve edit secenegini basar
    Then  Edit butonunun calistigini assert eder

  @KullanicilariEditIleDuzenleme
  Scenario: US18_TC0004_Edit seçeneği ile duzenleme yapar
    Given Kullanici Customer18i bulur ve edit secenegini basar
    And  Kullaniciya ait bilgileri degistirir ve kaydeder
    Then bilgilerin degistigini assert eder

  @DeleteDugmesininOlmasi
  Scenario: US18_TC0005_Delete seçeneğinin kontrolunu yapmak
    Given Kullanici Customer18i bulur ve DELETE dügmesine basar
    Then Kullanıcı mesaj oldugunu assert eder

  @SmokeTest
  Scenario: Adminin Kullanici aktivate etmesi
    Given Olusturulan Musteri bulunur
    And Edite tiklanir ve Active edilir
    Then save butonuna tiklanir ve cikis yapilir
