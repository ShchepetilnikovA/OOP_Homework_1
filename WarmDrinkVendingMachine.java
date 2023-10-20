import java.util.List;

public class WarmDrinkVendingMachine implements VendingMachine {
    List<WarmDrink> warmdrinks;

    public WarmDrinkVendingMachine (List<WarmDrink> drinks) {
        this.warmdrinks = drinks;
    }

    public List<WarmDrink> getWarmDrinks() {
        return this.warmdrinks;
    }

    public void setBottleOfWatters(List<WarmDrink> warmdrinks) {
        this.warmdrinks = warmdrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (WarmDrink item : warmdrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature){
        for (WarmDrink item : warmdrinks) {
            if(item.getName().equals(name) && item.getVolume() == volume && item.getTemperature() == temperature)
                return item;
        }
        return null; 
    }

    public void addWarmDrink(WarmDrink WarmDrink){
        this.warmdrinks.add(WarmDrink);
    }
}