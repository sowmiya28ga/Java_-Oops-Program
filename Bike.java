class Vehicle
{
    void speed()
    {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle
{
    void display()
    {
        System.out.println("Bike is moving fast");
    }

    public static void main(String args[])
    {
        Bike b1 = new Bike();

        b1.speed();
        b1.display();
    }
}