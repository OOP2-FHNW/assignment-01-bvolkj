package portfolio;

import portfolio.investments.Investment;

import java.util.HashMap;
import java.util.Map;

public class Portfolio<T extends Investment> {

    private Map<String, T> investments;

    public Portfolio() {
        this.investments = new HashMap<>();
    }

    public boolean contains(T investment) {
        return investments.containsKey(investment.getTitel());
    }

    public void buy(T investment) {
        String investmentTitel = investment.getTitel();
        if (contains(investment)) {
            investment = getShare(investmentTitel);
            investment.setCount(investment.getCount() + 1);
            return;
        }
        investments.put(investmentTitel, investment);
    }

    public void sell(String investmentTitel, int amount) {
        T investment = getShare(investmentTitel);
        if (investment == null) {
            return;
        }
        if (investment.getCount() <= amount) {
            investments.remove(investmentTitel);
        }
        investment.setCount(investment.getCount() - amount);
    }

    public T getShare(String investmentTitel) {
        return investments.get(investmentTitel);
    }
}
