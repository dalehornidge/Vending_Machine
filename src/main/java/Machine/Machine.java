package Machine;

import Money.Coin;

import java.util.ArrayList;

public class Machine {

    private ArrayList<Spring> springs;
    private ArrayList<Coin> customerCoins;

    public Machine(ArrayList springs, ArrayList customerCoins){
        springs = new ArrayList<Spring>();
        customerCoins = new ArrayList<Coin>();
    }

    public void addSpring(Spring spring){
        this.springs.add(spring);
    }

    public Boolean isCoinValid(Coin coin){
        if (coin.getCoinValue() >= 5) {
            return true;
        }
        return false;
    }


    public void addCustomerCoins(Coin coin) {
        if (this.isCoinValid(coin) == true) {
            this.customerCoins.add(coin);
        } else {
            this.customerCoins.remove(coin);
        }
    }




}


