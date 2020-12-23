@US_26
 Feature: Sistem, api uç noktası kullanarak Country'nin güncellenmesine izin verebilmelidir "https://www.gmibank.com/api/tp-countries"

   @TC_2601
     Scenario: TC_2601 Kullanici her Country'i bire bir guncelleyebilir
      Given api uc noktasini kullanir "https://www.gmibank.com/api/tp-countries" sayfasina giderek
       And kullaci kac tane country oldugunu bulur
       And  kullanici endpoint "https://www.gmibank.com/api/tp-countries/" put request gondererek ilk country i "Netherlands" olarak gunceller
       Then kullanici country'nin guncellendigini kontrol eder


