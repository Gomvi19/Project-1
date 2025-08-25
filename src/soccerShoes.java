//soccerShoes class represents the first class of shoes, is able to calculate price of shipping by weight

public class soccerShoes {
    private double weight;
    private String material;
    private double price;

    //Constructors
    public soccerShoes(double weight, String material, double price) {
        this.weight = weight;
        this.material = material;
        this.price = price;
    }
    public soccerShoes() {
        this.weight = 0.0;
        this.material = "";
        this.price = 0.0;
    }
    //Setters and Getters
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    //Print method
    public void printDetails() {
        System.out.println("These soccer shoes are made of: " + this.material + ", they weight: " +  this.weight + " Oz, and have a price of: $" + this.price);
    }
    //Custom method will calculate the price of shipping shoes depending on weight, distance, and a flat rate of $0.01 per Oz plus a handling fee of $3
    //returns total shipping cost
    public double shippingPrice(double distance) {
        return 3 + (distance * this.weight * 0.01);
    }
}
