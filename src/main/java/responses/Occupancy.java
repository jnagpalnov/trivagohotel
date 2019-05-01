package responses;

public class Occupancy {
    private float max_adults;
    private float max_children;
    private float max_children_age;
    private float max_persons;
    private float standard_persons;


    // Getter Methods

    public float getMax_adults() {
        return max_adults;
    }

    public float getMax_children() {
        return max_children;
    }

    public float getMax_children_age() {
        return max_children_age;
    }

    public float getMax_persons() {
        return max_persons;
    }

    public float getStandard_persons() {
        return standard_persons;
    }

    // Setter Methods

    public void setMax_adults( float max_adults ) {
        this.max_adults = max_adults;
    }

    public void setMax_children( float max_children ) {
        this.max_children = max_children;
    }

    public void setMax_children_age( float max_children_age ) {
        this.max_children_age = max_children_age;
    }

    public void setMax_persons( float max_persons ) {
        this.max_persons = max_persons;
    }

    public void setStandard_persons( float standard_persons ) {
        this.standard_persons = standard_persons;
    }
}
