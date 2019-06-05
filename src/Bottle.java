import java.awt.*;

public abstract class Bottle {


    private String name;
    private int capacity;
    private double sugar;

    public String getName()
    {
        return name;
    }

    public int getCapacity()
    {
        return capacity;
    }
    public double getSugar()
    {
        return sugar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void drink()
    {
        System.out.println("You drink " + getName() + ", which is " +getCapacity() + "ml and contains " + getSugar() + " grams of sugar per 100ml");
    }
}
