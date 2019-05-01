package responses;

public class Partner_data {
    private String rate_key;
    private String original_rate_key;
    private String currency;
    private String room_name;
    private float room_type_id;
    private String ba_id;


    // Getter Methods

    public String getRate_key() {
        return rate_key;
    }

    public String getOriginal_rate_key() {
        return original_rate_key;
    }

    public String getCurrency() {
        return currency;
    }

    public String getRoom_name() {
        return room_name;
    }

    public float getRoom_type_id() {
        return room_type_id;
    }

    public String getBa_id() {
        return ba_id;
    }

    // Setter Methods

    public void setRate_key( String rate_key ) {
        this.rate_key = rate_key;
    }

    public void setOriginal_rate_key( String original_rate_key ) {
        this.original_rate_key = original_rate_key;
    }

    public void setCurrency( String currency ) {
        this.currency = currency;
    }

    public void setRoom_name( String room_name ) {
        this.room_name = room_name;
    }

    public void setRoom_type_id( float room_type_id ) {
        this.room_type_id = room_type_id;
    }

    public void setBa_id( String ba_id ) {
        this.ba_id = ba_id;
    }
}
