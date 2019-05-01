package responses;

import java.util.ArrayList;

/**
 * Created by Jatin on 4/4/2019.
 */
public class Room_types_array {
    private String name;
    private float rooms_available;
    Partner_data Partner_dataObject;
    private String rate_key;
    ArrayList<Object> amenities = new ArrayList<Object>();
    ArrayList<Object> value_adds = new ArrayList<Object>();
    ArrayList<Object> photos = new ArrayList<Object>();
    private String occupancy_policy;
    private String payment_policy;
    private String other_policy;
    private String room_type;
    Occupancy OccupancyObject;
    ArrayList<Object> payment_methods = new ArrayList<Object>();
    ArrayList<Object> line_items = new ArrayList<Object>();
    Final_price_at_booking final_price_at_booking;
    Final_price_at_checkout final_price_at_checkout;
    private String description;
    Room_group Room_groupObject;


    // Getter Methods

    public String getName() {
        return name;
    }

    public float getRooms_available() {
        return rooms_available;
    }

    public Partner_data getPartner_data() {
        return Partner_dataObject;
    }

    public String getRate_key() {
        return rate_key;
    }

    public String getOccupancy_policy() {
        return occupancy_policy;
    }

    public String getPayment_policy() {
        return payment_policy;
    }

    public String getOther_policy() {
        return other_policy;
    }

    public String getRoom_type() {
        return room_type;
    }

    public Occupancy getOccupancy() {
        return OccupancyObject;
    }

    public Final_price_at_booking getFinal_price_at_booking() {
        return final_price_at_booking;
    }

    public Final_price_at_checkout getFinal_price_at_checkout() {
        return final_price_at_checkout;
    }

    public String getDescription() {
        return description;
    }

    public Room_group getRoom_group() {
        return Room_groupObject;
    }

    // Setter Methods

    public void setName( String name ) {
        this.name = name;
    }

    public void setRooms_available( float rooms_available ) {
        this.rooms_available = rooms_available;
    }

    public void setPartner_data( Partner_data partner_dataObject ) {
        this.Partner_dataObject = partner_dataObject;
    }

    public void setRate_key( String rate_key ) {
        this.rate_key = rate_key;
    }

    public void setOccupancy_policy( String occupancy_policy ) {
        this.occupancy_policy = occupancy_policy;
    }

    public void setPayment_policy( String payment_policy ) {
        this.payment_policy = payment_policy;
    }

    public void setOther_policy( String other_policy ) {
        this.other_policy = other_policy;
    }

    public void setRoom_type( String room_type ) {
        this.room_type = room_type;
    }

    public void setOccupancy( Occupancy occupancyObject ) {
        this.OccupancyObject = occupancyObject;
    }

    public void setFinal_price_at_booking( Final_price_at_booking final_price_at_bookingObject ) {
        this.final_price_at_booking = final_price_at_bookingObject;
    }

    public void setFinal_price_at_checkout( Final_price_at_checkout final_price_at_checkoutObject ) {
        this.final_price_at_checkout = final_price_at_checkoutObject;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public void setRoom_group( Room_group room_groupObject ) {
        this.Room_groupObject = room_groupObject;
    }
}

