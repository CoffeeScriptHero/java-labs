package labs.Lab6.Car;

public class Car{
    String brand;
    float price;
    float fuelCosts;
    float speed;

    public Car(float price, float fuelCosts, float speed) {
        this.price = price;
        this.fuelCosts = fuelCosts;
        this.speed = speed;
    }

    public Car(String brand, float price, float fuelCosts, float speed) {
        this.brand = brand;
        this.price = price;
        this.fuelCosts = fuelCosts;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.printf("""
                 Авто марки %s
                 Вартість - %.2f $
                 Середні витрати палива на 100 км - %.2f л
                 Швидкість - %.3f км/год
                
                """, brand, price, fuelCosts, speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getFuelCosts() {
        return fuelCosts;
    }

    public void setFuelCosts(float fuelCosts) { this.fuelCosts = fuelCosts; }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
