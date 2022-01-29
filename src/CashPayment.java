import java.util.Map;

public class CashPayment extends Payment{

    public CashPayment(int paymentId, Map<Items, Integer> itemsSold,
                        int cashDeposited, int cashRefunded) {
        this.paymentId = paymentId;
        this.itemsSold = itemsSold;
        this.totalPrice = calculateTotalPrice();
        this.moneyDeposited = cashDeposited;
        this.moneyRefunded = cashRefunded;
    }

    @Override
    public void updateTotalPrice(int price) {

    }

    @Override
    public void insertMoney(int money) {

    }

    @Override
    public int refundMoney() {
        return 0;
    }

}
