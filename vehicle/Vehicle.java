public class Vehicle {
    public int numWheels;
    public int year;
    public String brand;
    public String model;

    public Vehicle(int numWheels, int year, String brand, String model) {
        this.numWheels = numWheels;
        this.year = year;
        this.brand = brand;
        this.model = model; 
    }
    
    public Vehicle() {
        numWheels = 4;
        brand = "Unspecified";
    }
    
    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public Vehicle(String brand, int numWheels) {
        this.brand = brand;
        this.numWheels = numWheels;
    }

    public void soundHorn() {
        System.out.println("Beep! Beep!");
    }

    public void goForward(int distance) {
            System.out.println("The " + brand + " " + model + " made in " + year + " moved " + distance + " metres");
    }

}
