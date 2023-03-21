public class Bean implements java.io.Serializable {
    private int id;
    private int roll;
    private String name;
    public void setId(int id)
    {
        this.id=id;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }

}
