public class Car
{
    //Properties:
    private String color; //Bilens färg.
    private String brand; //Bilens märke.
    private String fuel; //Bilens bränsle.
    private int year; // Bilens modell.
    private int maxSpeed;


    public Car()//Vi skapar en tom constructor för att bland kan man inte skicka in all data, eftersom all
            //property är inte satt, samt ibland krävs det att det är satt sådana i vissa ramverk.
    {//Empty constructor

    }
    //Constructors:
    public Car(String color, String brand, String fuel, int year, int maxSpeed)
    // De hä
    {
        this.color = color;//this är nyckelord, för jag själv/den här klassen,
        this.brand = brand;
        this.fuel = fuel;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public Car(String svart, String skoda, String bensin, int i) {
    }


    //Methoder:


    //Setters & Getters.

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getFuel()
    {
        return fuel;
    }

    public void setFuel(String fuel)
    {
        this.fuel = fuel;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed)
    {
        this.maxSpeed = maxSpeed;
    }
}
