package responses;

import java.util.ArrayList;

/**
 * Created by Jatin on 4/3/2019.
 */
public class Hotel_details {
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postal_code;
    private String country;
    private float latitude;
    private float longitude;
    private String phone;
    private String url;
    ArrayList< Object > photos = new ArrayList < Object > ();
    ArrayList < Object > amenities = new ArrayList < Object > ();
    private String checkinout_policy;


    // Getter Methods

    public String getName() {
        return name;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getCountry() {
        return country;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public String getPhone() {
        return phone;
    }

    public String getUrl() {
        return url;
    }

    public String getCheckinout_policy() {
        return checkinout_policy;
    }

    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCheckinout_policy(String checkinout_policy) {
        this.checkinout_policy = checkinout_policy;
    }

}
