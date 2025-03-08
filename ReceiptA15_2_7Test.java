import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceiptA15_2_7Test {
    @Test
    public void JTest(){
        List<ReceiptA15_2_7.Item> shoppingListTest = new ArrayList<>();
        shoppingListTest.add(new ReceiptA15_2_7.Item("Penne", 150, 2));
        shoppingListTest.add(new ReceiptA15_2_7.Item("Sugo", 30, 4));
        shoppingListTest.add(new ReceiptA15_2_7.Item("Parmesan", 150, 2));
        shoppingListTest.add(new ReceiptA15_2_7.Item("Basilikum", 2, 80));
        shoppingListTest.add(new ReceiptA15_2_7.Item("OliveOil", 150, 2));
        shoppingListTest.add(new ReceiptA15_2_7.Item("Oregano", 3000, 1));

        System.out.println(shoppingListTest);
        // Erwarteten Gesamtpreis berechnen
        int expectedTotal = (150 * 2) + (30 * 4) + (150 * 2) + (2 * 80) + (150 * 2) + (3000 * 1);

        // Teste die Methode sumOfAllProducts()
        int actualTotal = ReceiptA15_2_7.sumOfAllProducts(shoppingListTest);
        assertEquals(expectedTotal, actualTotal, "Die berechnete Summe ist falsch!");

        ReceiptA15_2_7.sumOfAllProducts(shoppingListTest);


    }

}
