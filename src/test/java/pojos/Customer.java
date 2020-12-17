package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Customer {

    // Country gibi alt başlıkları olanlar için ayrı Class oluşturup orada variableları tanımlıyoruz.


    // encapsilation yaptık
    // private olduğu için başka Classlarda görülmez ve kullanılamaz.
    // bu nedenle başka Classlarda kullanılabilmesi için getter ve setter yapmamız lazım.
    // sağ tıklayıp generate, sonra getter and setter, sonra hepsini seç ok.


/*
   "id": 43709,
        "firstName": "Robert",
        "lastName": "Sabin",
        "middleInitial": "M",
        "email": "infor@gmail.com",
        "mobilePhoneNumber": "412-123-4589",
        "phoneNumber": "123-485-7889",
        "zipCode": "900180",
        "address": "izmir buca",
        "city": "Sakarya",
        "ssn": "194-21-8830",
        "createDate": "0020-12-10T22:15:36Z",
        "zelleEnrolled": true,
        "country": {
            "id": 3,
            "name": "ISLAND",
            "states": null
        },
        "state": "",
        "user": {
            "id": 41437,
            "login": "adf",
            "firstName": "US11",
            "lastName": "Team13",
            "email": "as@sdf.com",
            "activated": true,
            "langKey": "en",
            "imageUrl": null,
            "resetDate": null
        },
       "accounts": null
    },
 */


    private int id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String mobilePhoneNumber;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String city;
    private String ssn;
    private String createDate;
    private boolean zelleEnrolled;
    private Country country;
    private String state;
    private User user;
    private String accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }

    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccounts() {
        return accounts;
    }

    public void setAccounts(String accounts) {
        this.accounts = accounts;
    }


}