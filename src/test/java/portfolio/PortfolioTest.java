package portfolio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PortfolioTest {
    @Test
    void testContains() {
//        //given
//        Portfolio<Share> p   = new Portfolio<>();
//        Share            ubs = new Share("ubs");
//        assertFalse(p.contains(ubs));
//
//        //when
//        p.buy(ubs);
//
//        //then
//        assertTrue(p.contains(ubs));
//        assertTrue(p.contains(new Share("ubs")));
    }

    @Test
    void testBuy() {
//        //given
//        Portfolio<Share> p   = new Portfolio<>();
//        Share            ubs = new Share("ubs");
//
//        //when
//        p.buy(ubs);
//        p.buy(new Share("ubs"));
//
//        //then
//        assertEquals(2, ubs.getCount());
    }

    @Test
    void testSell() {
//        //given
//        Portfolio<Share> p   = new Portfolio<>();
//        Share            ubs = new Share("ubs");
//        ubs.setCount(2);
//        p.buy(ubs);
//
//        //when
//        p.sell("ubs", 1);
//
//        //then
//        assertTrue(p.contains(ubs));
//        assertEquals(1, ubs.getCount());
    }

    @Test
    void testSellUnknown() {
//        //given
//        Portfolio<Share> p   = new Portfolio<>();
//        Share            ubs = new Share("ubs");
//        p.buy(ubs);
//
//        //when
//        p.sell("cs", 1);
//
//        //then
//        assertTrue(p.contains(ubs));
//        assertEquals(1, ubs.getCount());
    }

    @Test
    void testSellTotal() {
//        //given
//        Portfolio<Share> p   = new Portfolio<>();
//        Share            ubs = new Share("ubs");
//        p.buy(ubs);
//
//        //when
//        p.sell("ubs", 1);
//
//        //then
//        assertFalse(p.contains(ubs));
//        assertEquals(0, ubs.getCount());
    }

    @Test
    void testGetShare() {
//        //given
//        Portfolio<Share> p   = new Portfolio<>();
//        Share            ubs = new Share("ubs");
//        p.buy(ubs);
//
//        //when
//
//        //then
//        assertSame(ubs, p.getShare("ubs"));
//        assertNull(p.getShare("cs"));
    }
}
