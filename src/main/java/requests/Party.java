package requests;

/**
 * Created by Jatin on 4/3/2019.
 */
public class Party {
    private int[] children;

    private int adults;

    public int[] getChildren ()
    {
        return children;
    }

    public void setChildren (int[] children)
    {
        this.children = children;
    }

    public int getAdults ()
    {
        return adults;
    }

    public void setAdults (int adults)
    {
        this.adults = adults;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [children = "+children+", adults = "+adults+"]";
    }
}
