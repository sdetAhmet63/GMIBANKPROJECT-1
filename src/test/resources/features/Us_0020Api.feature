@Us20_MU_Api
Feature:Sistem, Api uç noktasını kullanarak tüm müşteri bilgilerini okumaya izin vermelidir

    Background:TC_2001 and TC_2002 background
      Given Kullanici api entpoint "https://www.gmibank.com/api/tp-customers" gider
      And Kullanıcı tum musteri verilerini alir json'dan pojo'ya aktarir

    @TC_2001_Api
      Scenario: Kullanici api entpoint "https://www.gmibank.com/api/tp-customers" gider
      Given Kullanıcı tum musteri verilerini alir json'dan pojo'ya aktarir
      And Kullanıcı tum verileri veri kumesinden doğrular

    @TC_2002_Api
    Scenario: Kullanici api entpoint "https://www.gmibank.com/api/tp-customers" gider
      Given Kullanıcı tum musteri verilerini alir json'dan pojo'ya aktarir
      Then Kullanıcı tum verileri BireBir doğrular
