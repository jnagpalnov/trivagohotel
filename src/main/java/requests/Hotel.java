package requests;

/**
 * Created by Jatin on 4/3/2019.
 */
public class Hotel {
    private int item_id;

    private String partner_reference;

    public int getItem_id ()
    {
        return item_id;
    }

    public void setItem_id (int item_id)
    {
        this.item_id = item_id;
    }

    public String getPartner_reference ()
    {
        return partner_reference;
    }

    public void setPartner_reference (String partner_reference)
    {
        this.partner_reference = partner_reference;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [item_id = "+item_id+", partner_reference = "+partner_reference+"]";
    }
}
