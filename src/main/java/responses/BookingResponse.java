package responses;

import java.util.ArrayList;

/**
 * Created by Jatin on 4/3/2019.
 */
public class BookingResponse {
    private int api_version;
    private int hotel_id;
    private String start_date;
    private String end_date;
    ArrayList< Object > party = new ArrayList < Object > ();
    private String lang;
    private String user_country;
    public Hotel_details hotel_details;
    private String terms_and_conditions;
    private String terms_and_conditions_url;
    private String payment_policy;
    private String other_policy;
    Customer_support Customer_supportObject;
   //public ArrayList < Object > room_types_array = new ArrayList < Object > ();
    Room_types_array[] room_types_array;

    public Room_types_array[] getRoom_types_array ()
    {
        return room_types_array;
    }

    public void setRoom_types_array (Room_types_array[] room_types_array)
    {
        this.room_types_array = room_types_array;
    }


    // Getter Methods

    public int getApi_version() {
        return api_version;
    }

    public float getHotel_id() {
        return hotel_id;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public String getLang() {
        return lang;
    }

    public String getUser_country() {
        return user_country;
    }

    public Hotel_details getHotel_details() {
        return hotel_details;
    }

    public String getTerms_and_conditions() {
        return terms_and_conditions;
    }

    public String getTerms_and_conditions_url() {
        return terms_and_conditions_url;
    }

    public String getPayment_policy() {
        return payment_policy;
    }

    public String getOther_policy() {
        return other_policy;
    }

    public Customer_support getCustomer_support() {
        return Customer_supportObject;
    }

    // Setter Methods

    public void setApi_version(int api_version) {
        this.api_version = api_version;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setUser_country(String user_country) {
        this.user_country = user_country;
    }

    public void setHotel_details(Hotel_details hotel_details) {
        this.hotel_details = hotel_details;
    }

    public void setTerms_and_conditions(String terms_and_conditions) {
        this.terms_and_conditions = terms_and_conditions;
    }

    public void setTerms_and_conditions_url(String terms_and_conditions_url) {
        this.terms_and_conditions_url = terms_and_conditions_url;
    }

    public void setPayment_policy(String payment_policy) {
        this.payment_policy = payment_policy;
    }

    public void setOther_policy(String other_policy) {
        this.other_policy = other_policy;
    }

    public void setCustomer_support(Customer_support customer_supportObject) {
        this.Customer_supportObject = customer_supportObject;
    }
}

