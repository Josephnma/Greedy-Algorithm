import java.util.HashMap;

public class Cashier implements CashOperations {

    @Override
    public void withdrawal(Customer customer, HashMap<Integer, Integer> cashTill) {
        cashTill.put(500,7);
        cashTill.put(200,5);
        cashTill.put(100,10);
        cashTill.put(50,20);
        cashTill.put(20,30);
        cashTill.put(10,45);
        cashTill.put(5,50);
        int amt = customer.getAmountPaid();
        boolean fiveh,twoh,oneh,fifty,twenty,ten,five = false;



    }


}
