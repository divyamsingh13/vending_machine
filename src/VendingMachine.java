import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine implements Machine {
    int id;
    Map<Items, Integer> selectedItems;
    Map<Items, Integer> inventory;
    Payment payment;

    public VendingMachine(int id, Map<Items, Integer> selectedItems, Map<Items, Integer> inventory, Payment payment) {
        this.id = id;
        this.selectedItems = selectedItems;
        this.inventory = inventory;
        this.payment = payment;
    }


    @Override
    public Map<Items, Integer> getInventory() {
        return inventory;
    }

    @Override
    public void selectItem(Items items, int quantity) {
        //thr exception in case item cannot be selected.
        selectedItems.put(items,selectedItems.getOrDefault(items,0)+quantity);
    }

    @Override
    public void insertMoney(int money, String paymentMode) {
        if(paymentMode.equals("CASH"))
        {
            payment = new CashPayment(1,selectedItems,money,0);
        }
        payment.insertMoney(money);
    }

    @Override
    public int refundMoney() {
        return payment.refundMoney();
    }

    @Override
    public void dispenseItems() {
        for(Map.Entry<Items,Integer> t:selectedItems.entrySet())
        {
            if(inventory.get(t.getKey())==t.getValue())
            {
                inventory.remove(t.getKey());
            }
            else if(inventory.get(t.getKey())>t.getValue())
            {
                inventory.put(t.getKey(),inventory.get(t.getKey())-t.getValue());
            }
        }
        selectedItems=new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Items, Integer> getSelectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(Map<Items, Integer> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public void setInventory(Map<Items, Integer> inventory) {
        this.inventory = inventory;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
