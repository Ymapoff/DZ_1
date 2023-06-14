import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCashback900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashback1200(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual , expected);
    }

    @Test
    public void shouldCashback1000(){
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;


        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual , expected);
    }

}
