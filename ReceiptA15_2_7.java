import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ReceiptA15_2_7 {

    public static void main(String[] args) {
        List<Item> shoppingList = new ArrayList<>();
        shoppingList.add(new Item("Kartoffel", 150, 2));
        shoppingList.add(new Item("Spaghetti", 300, 3));

        // Einkaufsliste ausgeben
        for (Item item : shoppingList) {
            System.out.println(item);
        }

        // Gesamtsumme berechnen und ausgeben
        int totalCents = sumOfAllProducts(shoppingList);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String formattedTotal = currencyFormat.format(totalCents / 100.0);

        System.out.println("Total: " + formattedTotal);
    }

    public static int sumOfAllProducts(List<Item> shoppingList) {
        int sum = 0;
        for (Item item : shoppingList) {
            sum += item.getCostOfProduct();
        }
        return sum;
    }

    public static class Item {
        private final String name;
        private final int priceCent;
        private final int occurance;

        public Item(String name, int priceCent, int occurance) {
            if (occurance <= 0) {
                throw new IllegalArgumentException("Occurance can't be 0");
            }
            if (priceCent <= 0) {
                throw new IllegalArgumentException("Item can't be sold for free!!");
            }
            this.name = name;
            this.priceCent = priceCent;
            this.occurance = occurance;
        }

        public int getCostOfProduct() {
            return occurance * priceCent;
        }

        @Override
        public String toString() {
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.GERMANY);
            return name + " - " + occurance + " Stück - " + currencyFormat.format(getCostOfProduct() / 100.0);
        }
    }
}
