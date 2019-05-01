package requests;

/**
 * Created by Jatin on 4/3/2019.
 */
public class Booking {

    private String end_date;

    private String user_country;

    private Hotel hotel;

    private String currency;

    private int api_version;

    private String lang;

    private Party[] party;

    private String start_date;

    public String getEnd_date ()
    {
        return end_date;
    }

    public void setEnd_date (String end_date)
    {
        this.end_date = end_date;
    }

    public String getUser_country ()
    {
        return user_country;
    }

    public void setUser_country (String user_country)
    {
        this.user_country = user_country;
    }

    public Hotel getHotel ()
    {
        return hotel;
    }

    public void setHotel (Hotel hotel)
    {
        this.hotel = hotel;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    public int getApi_version ()
    {
        return api_version;
    }

    public void setApi_version (int api_version)
    {
        this.api_version = api_version;
    }

    public String getLang ()
    {
        return lang;
    }

    public void setLang (String lang)
    {
        this.lang = lang;
    }

    public Party[] getParty ()
    {
        return party;
    }

    public void setParty (Party[] party)
    {
        this.party = party;
    }

    public String getStart_date ()
    {
        return start_date;
    }

    public void setStart_date (String start_date)
    {
        this.start_date = start_date;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [end_date = "+end_date+", user_country = "+user_country+", hotel = "+hotel+", currency = "+currency+", api_version = "+api_version+", lang = "+lang+", party = "+party+", start_date = "+start_date+"]";
    }
}
