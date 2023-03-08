import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        ArrayList<String> customers = new ArrayList<String>();
        CafeUtil cafe = new CafeUtil(customers);

        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafe.getStreakGoal());
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        // for(int i = 0; i < lineItems.double(); i++) {
        //     cafe.customFormat("$#.##", lineItems);
        // }
        System.out.printf("Order total: %s \n\n", cafe.getOrderTotal(lineItems));
        
        System.out.println("----- Display Menu Test-----");
        
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafe.displayMenu(menu);
    
        System.out.println("\n----- Add Customer Test-----");
        // --- Test 4 times ---
        for (int i = 0; i < 4; i++) {
            cafe.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
