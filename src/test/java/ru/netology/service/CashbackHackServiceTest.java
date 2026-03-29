package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountNeededToReachNextThousand() {
        CashbackHackService service = new CashbackHackService();

        Assert.assertEquals(service.remain(700), 300);

        Assert.assertEquals(service.remain(1200), 800);

        Assert.assertEquals(service.remain(1000), 0);

        Assert.assertEquals(service.remain(700), 300);
    }

    @Test
    public void shouldHandleZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldHandleLargeAmounts() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(9999), 1000);
    }
}