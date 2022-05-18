public class Customer {
    private int amountPaid;
    private int amountReceived;


    public Customer(int amount) {
        this.amountPaid = amount;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

}
