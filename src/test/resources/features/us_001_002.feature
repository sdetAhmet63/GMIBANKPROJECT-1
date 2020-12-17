@GMIBANKKAYITSAYFASI
Feature: GMI BANK Kayit islemi
  @UserStory1
  @GecerliSSN
  Scenario Outline: Us_1_TC_0001 kullanici gmi bank kayit sayfasinda ssn numarasini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici kayit sayfasinda ilk ad kutusuna tiklar
    Then kullanici ssn kutusunun altinda herhangi bir uyari görmez
    Examples:
      |ssn numarasi |
      |132-55-9658  |
      |963-49-9999  |
      |222-18-1596  |
      #|888-57-1100  |
      #|899-99-1234  |
      #|624-81-3495  |
      #|032-01-2030  |
      #|561-13-0561  |
      #|999-66-3456  |

  @UserStory2
  @SSNGerekli
  Scenario: Us_2_TC_0001 kullanici gmi bank kayit sayfasinda ssn numarasi kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar
    And kullanici kayit sayfasinda ilk ad kutusuna tiklar
    Then kullanici ssn kutusunun altinda ssn numarasinin gerekli oldugunu belirten uyari görur

  @UserStory1
  @8HaneliSSN
  Scenario Outline: Us_1_TC_0002 kullanici gmi bank kayit sayfasinda ssn numarasini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusunu tiklar ve "<8 haneli ssn numarasi>" ni girer
    And kullanici kayit sayfasinda ilk ad kutusuna tiklar
    Then kullanici ssn kutusunun altinda gecersiz ssn numarasi yazili uyariyi görur
    Examples:
      |8 haneli ssn numarasi |
      |12-345-568            |
      |876-45-357            |
      |354-201-19            |

  @UserStory1
  @10HaneliSSN
  Scenario Outline: Us_1_TC_0003 kullanici gmi bank kayit sayfasinda ssn numarasini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusunu tiklayarak "<10 haneli ssn numarasi>" ni girer
    And kullanici kayit sayfasinda ilk ad kutusuna tiklar
    Then kullanici ssn kutusunun altinda gecersiz ssn numarasi yazili uyariyi görur
    Examples:
      |10 haneli ssn numarasi |
      |1298-345-568           |
      |876-4745-357           |
      |354-201-1849           |

  @UserStory1
  @UserStory2
  @IlkadGerekli
  Scenario Outline: Us_01_TC_0004 ve Us_2_TC_0002 kullanici gmi bank kayit sayfasinda ilk ad kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici kayit sayfasinda ilk ad kutusuna tiklar
    And kullanici kayit sayfasinda son ad kutusuna tiklar
    Then kullanici ilk ad kutusunun altinda adin gerekli oldugunu belirten uyari görur
    Examples:
      |ssn numarasi |
      |132-55-9658  |
      #|222-18-1596  |
      #|763-49-9999  |
      #|888-57-1100  |
      #|899-99-1234  |
      #|624-81-3495  |
      #|032-01-2030  |
      #|561-13-0561  |
      #|399-66-3456  |

  @UserStory1
  @GecerliIlkad
  Scenario Outline: Us_1_TC_0005 kullanici gmi bank kayit sayfasinda ilk adini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici kayit sayfasinda son ad kutusuna tiklar
    Then kullanici ilk ad kutusunun altinda herhangi bir uyari görmez
    Examples:
      |ssn numarasi |ilkad    |
      |132-55-9658  |Heikki   |
      #|222-18-1596  |Carlos   |
      #|763-49-9999  |Mariah   |
      #|888-57-1100  |Nadir    |
      #|899-99-1234  |Didie    |
      #|624-81-3495  |Hans     |
      #|032-01-2030  |Suna     |
      #|561-13-0561  |Caroline |
      #|399-66-3456  |David    |

  @UserStory1
  @UserStory2
  @SonadGerekli
  Scenario Outline: Us_1_TC_0006 ve Us_2_TC_0003 kullanici gmi bank kayit sayfasinda son ad kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici kayit sayfasinda son ad kutusuna tiklar
    And kullanici kayit sayfasinda adres kutusuna tiklar
    Then kullanici son ad kutusunun altinda son adin gerekli oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |
      |132-55-9658  |Heikki   |
      #|222-18-1596  |Carlos   |
      #|763-49-9999  |Mariah   |
      #|888-57-1100  |Nadir    |
      #|899-99-1234  |Didie    |
      #|624-81-3495  |Hans     |
      #|032-01-2030  |Suna     |
      #|561-13-0561  |Caroline |
      #|399-66-3456  |David    |


  @UserStory1
  @GecerliSonad
  Scenario Outline: Us_1_TC_0007 kullanici gmi bank kayit sayfasinda son adini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici kayit sayfasinda adres kutusuna tiklar
    Then kullanici son ad kutusunun altinda herhangi bir uyari görmez

    Examples:
      |ssn numarasi |ilkad    |sonad    |
      |132-55-9658  |Heikki   |Kolmanen |
      #|222-18-1596  |Carlos   |Valder   |
      #|763-49-9999  |Mariah   |Halle    |
      #|888-57-1100  |Nadir    |Uslanir  |
      #|899-99-1234  |Didie    |DeKal    |
      #|624-81-3495  |Hans     |Muller   |
      #|032-01-2030  |Suna     |Durmaz   |
      #|561-13-0561  |Caroline |Gomez    |
      #|399-66-3456  |David    |Mans     |


  @UserStory1
  @GecerliAdres
  Scenario Outline: Us_1_TC_0008 kullanici gmi bank kayit sayfasinda adresini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici kayit sayfasinda mobil telefon numarasi kutusuna tiklar
    Then kullanici adres kutusunun altinda herhangi bir uyari görmez

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |
      |132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |
      #|222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |
      #|561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |

  @UserStory2
  @AdresGerekli
  Scenario Outline: Us_2_TC_0004 kullanici gmi bank kayit sayfasinda adres kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici kayit sayfasinda adres kutusuna tiklar
    And kullanici kayit sayfasinda mobil telefon numarasi kutusuna tiklar
    Then kullanici adres kutusunun altinda adresin gerekli oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |
      |132-55-9658  |Heikki   |Kolmanen |

  @UserStory1
  @UserStory2
  @MobilTelefonNumarasiGerekli
  Scenario Outline: Us_1_TC_0009 ve Us_2_TC_0005 kullanici gmi bank kayit sayfasinda mobil telefon numarasi kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici kayit sayfasinda mobil telefon numarasi kutusuna tiklar
    And kullanici kayit sayfasinda username kutusuna tiklar
    Then kullanici mobil telefon numarasi kutusunun altinda mobil telefon numarasinin gerekli oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |
      |132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |
      #|222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |
      #|561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |

  @UserStory1
  @GecersizMobilTelefonNumarasi
  Scenario Outline: Us_1_TC_0010 kullanici gmi bank kayit sayfasinda mobil telefon numarasini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna gecersiz "<mobile telefon numarasi>" ni girer
    And kullanici kayit sayfasinda username kutusuna tiklar
    Then kullanici mobil telefon numarasi kutusunun altinda mobil telefon numarasinin gecersiz oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|
      |132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |5634-456-1985          |
      #|222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048-194-077            |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |0303004102             |

  @UserStory1
  @GecerliMobilTelefonNumarasi
  Scenario Outline: Us_1_TC_0011 kullanici gmi bank kayit sayfasinda mobil telefon numarasini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici kayit sayfasinda username kutusuna tiklar
    Then kullanici mobil telefon numarasi kutusunun altinda herhangi bir uyari görmez

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|
      |561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |831-462-0759           |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |004-896-4040           |
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |546-650-2344           |
      #|132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |563-456-1985           |
      #|222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048-194-0277           |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |030-300-4102           |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530-356-1410           |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |043-541-7788           |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |999-999-9999           |

  @UserStory1
  @GecersizUsername
  Scenario Outline: Us_1_TC_0012 kullanici gmi bank kayit sayfasinda username girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici username kutusuna sadece rakam olarak "<username>" ini girer
    And kullanici kayit sayfasinda email kutusuna tiklar
    Then kullanici username kutusunun altinda usernamenin gecersiz oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|username       |
      |888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530-356-1410           |44             |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |043-541-7788           |869            |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |999-999-9999           |123879645      |

  @UserStory1
  @GecerliUsername
  Scenario Outline: Us_1_TC_0013 kullanici gmi bank kayit sayfasinda username girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici username kutusuna "<username>" ini girer
    And kullanici kayit sayfasinda email kutusuna tiklar
    Then kullanici username kutusunun altinda herhangi bir uyari görmez

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|username       |
      |561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |831-462-0759           |#CaGo42        |
      #|132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |563-456-1985           |HeKol          |
      #|222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048-194-0277           |Val44Car       |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |043-541-7788           |De+Kal         |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |030-300-4102           |363Mariah      |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530-356-1410           |Nadir_Uslanir  |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |999-999-9999           |MullerHans     |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |004-400-4040           |Durmaz44/Suna09|
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |500-500-5000           |DvdMans12:)    |

  @UserStory2
  @UsernameGerekli
  Scenario Outline: Us_2_TC_0006 kullanici gmi bank kayit sayfasinda username kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici kayit sayfasinda username kutusuna tiklar
    And kullanici kayit sayfasinda email kutusuna tiklar
    Then kullanici username kutusunun altinda usernamenin gerekli oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|
      |888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530-356-1410           |

  @UserStory1
  @Email
  Scenario Outline: Us_1_TC_0014 kullanici gmi bank kayit sayfasinda emailini girer
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici username kutusuna "<username>" ini girer
    And kullanici email kutusuna "<email>" ini girer
    And kullanici kayit sayfasinda yeni sifre kutusuna tiklar
    Then kullanici email kutusunun altinda herhangi bir uyari görmez
    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|username       |email                      |
      |222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048-194-0277           |Val44Car       |valdercarlos@hotmail.com   |
      #|132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |563-456-1985           |HeKol          |heikkikolmanen@gmail.net   |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |030-300-4102           |363Mariah      |mariahhalle_22@gmail.com    |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530-356-1410           |Nadir_Uslanir  |uslanirminadir@yahoo.net   |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |043-541-7788           |DeKal          |dekaldidie@msn.net         |
      #|624-8 1-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |999-999-9999           |MullerHans     |drhansmuller@mynet.net     |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |004-400-4040           |Durmaz44       |sunadurmaz09@gmail.com     |
      #|561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |831-462-0759           |CaGo42         |carolinegomez@hotmail.com  |
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |500-500-5000           |DvdMans12      |mansdavid36@yahoo.com      |

  @UserStory2
  @EmailGerekli
  Scenario Outline: Us_2_TC_0007 kullanici gmi bank kayit sayfasinda email kutusunu bos birakir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici username kutusuna "<username>" ini girer
    And kullanici kayit sayfasinda email kutusuna tiklar
    And kullanici kayit sayfasinda yeni sifre kutusuna tiklar
    Then kullanici email kutusunun altinda emailin gerekli oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|username       |
      |132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |563-456-1985           |HeKol          |

  @UserStory2
  @GecersizSembolSSN
  Scenario Outline: Us_2_TC_0008 kullanici gmi bank kayit sayfasinda ssn numarasi kutusunda baska semboller kullanir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici kayit sayfasinda ilk ad kutusuna tiklar
    Then kullanici ssn kutusunun altinda gecersiz ssn numarasi yazili uyariyi görur
    Examples:
      |ssn numarasi |
      |132.55.9658  |
      |888-57.1100  |
      |624+81-3495  |
      #|032#01#2030  |
      #|561*13*0561  |
      #|999%66>3456  |
      #|963_49_9999  |
      #|222,18,1596  |
      #|899/99/1234  |

  @UserStory2
  @GecersizSembolTelefonNumarasi
  Scenario Outline: Us_2_TC_0009 kullanici gmi bank kayit sayfasinda mobil telefon numarasi kutusunda baska semboller kullanir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna gecersiz "<mobile telefon numarasi>" ni girer
    And kullanici kayit sayfasinda username kutusuna tiklar
    Then kullanici mobil telefon numarasi kutusunun altinda mobil telefon numarasinin gecersiz oldugunu belirten uyari görur

    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|
      |222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048/194/0277           |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |0048964040             |
      #|561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |831.462-0759           |
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |546-650,2344           |
      #|132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |563_456_1985           |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |030!300*4102           |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530#3561410            |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |043-5417788            |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |999a999:9999           |

  @UserStory2
  @GecersizSembolEmail
  Scenario Outline: Us_2_TC_0010 kullanici gmi bank kayit sayfasinda emaili kutusunda baska semboller kullanir
    Given kullanici "https://gmibank.com/" sayfasina gider
    And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici username kutusuna "<username>" ini girer
    And kullanici email kutusuna "<email>" ini girer
    And kullanici kayit sayfasinda yeni sifre kutusuna tiklar
    Then kullanici email kutusunun altinda emailin gecersiz oldugunu belirten uyari görur
    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|username       |email                      |
      |222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048-194-0277           |Val44Car       |valdercarlos@hotmailcom    |
      #|763-49-9999  |Mariah   |Halle    |Herlanseen Road No:4 Teksas                        |030-300-4102           |363Mariah      |mariahhalle_22gmailcom     |
      #|888-57-1100  |Nadir    |Uslanir  |Ataturk Bulvari No: 205 Cankaya/Izmir              |530-356-1410           |Nadir_Uslanir  |uslanirminadir£yahoo,net   |
      #|899-99-1234  |Didie    |DeKal    |Hotel DeKal Marsille                               |043-541-7788           |DeKal          |dekaldidie#msn*net         |
      #|624-81-3495  |Hans     |Muller   |Baudenberg Street No: 9 Stutgard                   |999-999-9999           |MullerHans     |drhansmuller-mynet-net     |
      #|032-01-2030  |Suna     |Durmaz   |Huzur Mahallesi Gunes Sokak No: 12 Didim/Aydin     |004-400-4040           |Durmaz44       |sunadurmaz09gmail.com     |
      #|561-13-0561  |Caroline |Gomez    |John Morris Ave. No:48 Montgomery/Alabama/Usa      |831-462-0759           |CaGo42         |carolinegomez.hotmail@com  |
      #|399-66-3456  |David    |Mans     |Greeway Road No:63 Henderson/Las Vegas/Nevada/Usa  |500-500-5000           |DvdMans12      |mans@david36@yahoo.com      |
      #|132-55-9658  |Heikki   |Kolmanen |Uudenmaankatu No:36 Helsinki                       |563-456-1985           |HeKol          |heikkikolmanengmail.com    |


 # @SmokeTest
  Scenario Outline: Us_1_SmokeTest kullanici gmi bank kayit sayfasinda kayit islemi gerceklestirir
   Given kullanici "https://gmibank.com/" sayfasina gider
  And kullanici profil logolu dropdown ve icindeki register linkini tiklar
    And kullanici kayit sayfasinda ssn kutusuna tiklar ve "<ssn numarasi>" ni girer
    And kullanici ilk ad kutusuna "<ilkad>" ini girer
    And kullanici son ad kutusuna "<sonad>" ini girer
    And kullanici adres kutusuna "<adres>" ini girer
    And kullanici mobil telefon numarasi kutusuna "<mobile telefon numarasi>" ni girer
    And kullanici username kutusuna "<username>" ini girer
    And kullanici email kutusuna "<email>" ini girer
    And kullanici kayit sayfasinda yeni sifre kutusuna tiklar
    Then kullanici email kutusunun altinda herhangi bir uyari görmez
    Examples:
      |ssn numarasi |ilkad    |sonad    |adres                                              |mobile telefon numarasi|username       |email                      |
      |222-18-1596  |Carlos   |Valder   |Magic Street No:124/5                              |048-194-0277           |Val44Car       |valdercarlos@hotmail.com   |