public class WarmDrink extends BottleOfWatter {
    private int temperature;
    
    public WarmDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "WarmDrink{" +
                 "name = " + super.getName() +
                ";temperature = " + temperature +
                ";cost = " + super.getCost() +
                '}';
    }

    
}