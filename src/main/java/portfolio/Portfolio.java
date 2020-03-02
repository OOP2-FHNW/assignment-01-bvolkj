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
        if (investments.containsKey(investment.getTitel())) {
            investment = investments.get(investment.getTitel());
            investment.setCount(investment.getCount() + 1);
            return;
        }
        investments.put(investment.getTitel(), investment);
    }

    public void sell(String name, int amount) {
        if(!investments.containsKey(name)){
           return;
        }
        T investment = investments.get(name);
        if( investment.getCount() <= amount){
            investments.remove(name);
        }
        investment.setCount(investment.getCount() - amount);
    }

    public T getShare(String name) {
        return investments.get(name);
    }
}
