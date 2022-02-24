package model;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger() {
    }

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");

    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        // return super.itemizeHamburger();
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return hamburgerPrice;
     }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public void setHealthyExtra1Name(String healthyExtra1Name) {
        this.healthyExtra1Name = healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public void setHealthyExtra1Price(double healthyExtra1Price) {
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public void setHealthyExtra2Name(String healthyExtra2Name) {
        this.healthyExtra2Name = healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    public void setHealthyExtra2Price(double healthyExtra2Price) {
        this.healthyExtra2Price = healthyExtra2Price;
    }
}
