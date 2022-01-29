import java.util.Map;

public abstract class Payment {
    int paymentId;
    Map<Items,Integer> itemsSold;
    int totalPrice;
    int moneyDeposited;
    int moneyRefunded;
    public abstract void updateTotalPrice(int price);
    public abstract void insertMoney(int money);
    public abstract int refundMoney();

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public Map<Items, Integer> getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(Map<Items, Integer> itemsSold) {
        this.itemsSold = itemsSold;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getMoneyDeposited() {
        return moneyDeposited;
    }

    public void setMoneyDeposited(int moneyDeposited) {
        this.moneyDeposited = moneyDeposited;
    }

    public int getMoneyRefunded() {
        return moneyRefunded;
    }

    public void setMoneyRefunded(int moneyRefunded) {
        this.moneyRefunded = moneyRefunded;
    }
    public int calculateTotalPrice()
    {
        int totalPrice=0;
        for(Map.Entry<Items,Integer> t:itemsSold.entrySet())
        {
            int pricePerItem=t.getKey().getPrice();
            totalPrice=totalPrice+(pricePerItem*t.getValue());
        }
        return totalPrice;
    }

}
