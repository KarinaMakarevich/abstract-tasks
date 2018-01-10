package by.epam.makarevich.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Payment {
    private HashMap<Purchase, Integer> purchaseMap;
    private BigDecimal commonMoneyCount;

    public Payment() {
        this.purchaseMap = new HashMap<>();
    }

    public class Purchase {
        private BigDecimal price;
        private String title;

        public Purchase(BigDecimal price, String title) {
            this.price = price;
            this.title = title;
        }

        public BigDecimal getPrice() {
            return this.price;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public void addPurchase(BigDecimal price, String title) {
        Purchase purchase = new Purchase(price, title);
        if (purchaseMap.size() != 0) {
            for (Entry<Purchase, Integer> entry : this.purchaseMap.entrySet()) {
                if (title.equals(entry.getKey().getTitle())) {
                    entry.setValue(entry.getValue() + 1);
                } else {
                    purchaseMap.put(purchase, 1);
                }
            }
        } else {
            purchaseMap.put(purchase, 1);
        }
    }

    public BigDecimal getCommonMoneyCount() {
        if (this.commonMoneyCount == null) {
            calculateMoneyCount();
        }
        return commonMoneyCount;
    }

    private void calculateMoneyCount() {
        BigDecimal moneyCount = new BigDecimal(0);
        for (Entry<Purchase, Integer> entry : this.purchaseMap.entrySet()) {
            moneyCount = moneyCount.add(entry.getKey().getPrice().multiply(new BigDecimal(entry.getValue())));
        }
        this.commonMoneyCount = moneyCount;
    }
}
