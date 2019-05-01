package responses;

public class Final_price_at_booking {
    private float amount;
    private String currency;


    // Getter Methods

    public float getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    // Setter Methods

    public void setAmount( float amount ) {
        this.amount = amount;
    }

    public void setCurrency( String currency ) {
        this.currency = currency;
    }
}
