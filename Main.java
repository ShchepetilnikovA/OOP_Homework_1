import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WarmDrink b1 = new WarmDrink("coffee", 1, 0.5, 45);
        WarmDrink b2 = new WarmDrink("tea", 2, 0.3, 50);
        WarmDrink b3 = new WarmDrink("cacao", 4, 0.7, 55);
        
        WarmDrinkVendingMachine vendingMachine = new WarmDrinkVendingMachine(new ArrayList<>());
        vendingMachine.addWarmDrink(b1);;
        vendingMachine.addWarmDrink(b2);
        vendingMachine.addWarmDrink(b3);
        System.out.println(vendingMachine.getProduct("coffee", 0.5, 45));
        System.out.println(vendingMachine.getProduct("tea", 0.7, 50));

    }

}
