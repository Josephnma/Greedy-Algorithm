import java.util.HashMap;

public interface CashOperations {
    HashMap<Integer, Integer> cashTill = new HashMap<>();

    public void withdrawal(Customer customer, HashMap<Integer, Integer> cashTill);
}
