package new_package;

public class DemoVehicle 
{
    public static void main(String[] args)
    {
        Vehicle v;
        v = new Vehicle();

        /*v.setData();
        v.display();*/

        v.setColour("BLUE");
        v.setCompany("SKODA");
        v.setFuel_type("PETROL");
        v.setModel(2025);

        System.out.println(v.getColour());
        System.out.println(v.getCompany());
        System.out.println(v.getFuel_type());
        System.out.println(v.getModel());
    }
}
