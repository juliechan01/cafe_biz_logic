import java.util.ArrayList;
import java.text.*;

public class CafeUtil {
    private ArrayList<String> customers;
    public CafeUtil(ArrayList<String> customers) {
        this.customers = customers;
    }
    // GET STREAK GOAL
    public int getStreakGoal() {
        int sum = 0;
        for(int week = 1; week <= 10; week++) {
            sum += week;
        }
        return sum;
    }

    // TOTAL OF ALL ITEMS ORDERED
    public double getOrderTotal(double[]lineItems) {
        double sum = 0;
        for (double total: lineItems) {
            sum += total;
        }
        return sum;
    }

    // ADDING A $ TO TOTAL
    public void customFormat(String pattern, double value) {
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String output = myFormatter.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }

    // DISPLAY MENU ARRAY
    public void displayMenu(ArrayList<String> menuItems) {
        for (int id = 0; id < menuItems.size(); id++) {
            System.out.printf("%s %s \n", id, menuItems.get(id));
        }
    }

    // ADD CUSTOMER
    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people in front of you.", customers.size());
        customers.add(userName);
        System.out.println(customers);
    }

}