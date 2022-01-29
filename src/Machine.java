import java.util.Map;

public interface Machine {
    public Map<Items,Integer> getInventory();
    public void selectItem(Items items,int quantity);
    public void insertMoney(int money,String paymentMode);
    public int refundMoney();
    public void dispenseItems();
}
