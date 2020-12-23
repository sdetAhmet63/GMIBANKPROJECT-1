@KullanicibilgileriApi

  Feature: Gmi Bank tum kullanici bilgileri
    Scenario:Tum kullanicilarin bilgileri ad soyad ve rol olarak pdf formatinda yazdirilmasi
      Given Kullanici Get request ile api end point "https://www.gmibank.com/api/users" den tum kullanici bilgilerini alir
      Then Tum kullanici ad soyad ve rolleri pdf formatinda yazdirilabilir olmali

