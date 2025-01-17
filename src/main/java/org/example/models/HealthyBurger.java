package org.example.models;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    // HealthyBurger'ın constructor'ı, sabit olarak "Tofu" kullanır.

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
    }

    public double getPrice() {
        return super.getPrice() + healthyExtra1Price + healthyExtra2Price;
    }

    public String getHealthyExtra1Name() {
        return healthyExtra1Name;
    }

    public double getHealthyExtra1Price() {
        return healthyExtra1Price;
    }

    public String getHealthyExtra2Name() {
        return healthyExtra2Name;
    }

    public double getHealthyExtra2Price() {
        return healthyExtra2Price;
    }

    // Sağlıklı ek malzeme 1 ekleme metodu
    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    // Sağlıklı ek malzeme 2 ekleme metodu
    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger(); // Hamburger fiyatını al
        if (this.healthyExtra1Name != null) {
            System.out.println("Healthy Addition 1: " + this.healthyExtra1Name + " - $" + this.healthyExtra1Price);
            hamburgerPrice += this.healthyExtra1Price;
        }
        if (this.healthyExtra2Name != null) {
            System.out.println("Healthy Addition 2: " + this.healthyExtra2Name + " - $" + this.healthyExtra2Price);
            hamburgerPrice += this.healthyExtra2Price;
        }
        return hamburgerPrice;
    }
}
