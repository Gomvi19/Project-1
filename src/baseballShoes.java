//baseballHoes class represents the second class of shoes and is able to calculate how much time will it take to dry the shoes off
public class baseballShoes {
    private String spikeType;
    private int ventilationZones;
    private boolean waterResistant;

    //Constructor
    public baseballShoes(String spikeType, int ventilationZones, boolean waterResistant) {
        this.spikeType = spikeType;
        this.ventilationZones = ventilationZones;
        this.waterResistant = waterResistant;
    }
    public baseballShoes() {
        this.spikeType = "";
        this.ventilationZones = 0;
        this.waterResistant = false;
    }
    //Setters and Getters
    public String getSpikeType() {
        return spikeType;
    }
    public void setSpikeType(String spikeType) {
        this.spikeType = spikeType;
    }
    public int getVentilationZones() {
        return ventilationZones;
    }
    public void setVentilationZones(int ventilationZones) {
        this.ventilationZones = ventilationZones;
    }
    public boolean isWaterResistant() {
        return waterResistant;
    }
    public void setWaterResistant(boolean waterResistant) {
        this.waterResistant = waterResistant;
    }
    //Print method
    public void printDetails() {
        System.out.println("These baseball shoes' spikes are: " + this.spikeType + ", they have: " +  this.ventilationZones + " ventilation zones, water resistant?: " + this.waterResistant);
    }
    //Custom method Uses water resistance as a factor: if water-resistant, dries faster.
    public double calculateDryingTime(int hoursOutside) {
        if (this.waterResistant) return hoursOutside * 0.5; // dries faster
        else return hoursOutside * 1.2; // slower drying
    }
}
