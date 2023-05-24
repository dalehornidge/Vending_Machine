import Money.Coin;
import Money.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    private Coin tenCoin;
    @Before
    public void before(){
        tenCoin = new Coin(CoinType.TEN);
    }

    @Test
    public void getValue(){
        assertEquals(10, tenCoin.getCoinValue());
    }
}
