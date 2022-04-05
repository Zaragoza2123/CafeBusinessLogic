import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal() {
        int streak = 0;
        for (int i = 0; i <= 10; i++){
            streak += i;
        }
        return streak;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for (int i =0; i < menuItems.size(); i++) {
            System.out.println(i +" "+ menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "! There are " + customers.size() + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i < maxQuantity; i++) {
            double discount = .50 * i;
            System.out.println(i+ " - $" + ((price * i)-discount) + "0");
        }
    }

};