package new_package;

public class Vehicle
{
    private String company, colour, fuel_type;
    int model;
    //above mentioned are the data members of the class Vehicle
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getFuel_type() {
        return fuel_type;
    }
    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }
    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }

    /*public void setData()
    {
        company = "TOYOTA";
        colour = "BLACK";
        fuel_type = "DIESEL";
        model = 2024;
    }
    public void display()
    {
        System.out.println(company + " " + colour + " " + fuel_type + " " + model);
    }*/

    
}