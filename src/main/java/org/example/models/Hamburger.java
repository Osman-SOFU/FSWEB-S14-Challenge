package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price + addition1Price + addition2Price + addition3Price + addition4Price ;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }


    public double itemizeHamburger() {
        double totalPrice = this.price; // Başlangıçta yalnızca ana hamburgerin fiyatı
        System.out.println("Hamburger: " + this.name + " on a " + this.breadRollType + " with " + this.meat + ", Price: " + this.price);

        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;  // Sadece ekleme varsa ekle
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;  // Sadece ekleme varsa ekle
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;  // Sadece ekleme varsa ekle
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;  // Sadece ekleme varsa ekle
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        System.out.println("Total Hamburger price is " + totalPrice);
        return totalPrice;
    }
}
