package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountNeededToReachNextThousand() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(300, service.remain(700));
        Assert.assertEquals(800, service.remain(1200));
        Assert.assertEquals(0, service.remain(1000));
        Assert.assertEquals(300, service.remain(700));
    }

    @Test
    public void shouldHandleZeroAmount() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldHandleLargeAmounts() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000, service.remain(9999));
    }

    @Test
    public void shouldReturnZeroWhenAmountIsExactlyThreshold() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldReturnCorrectRemainderForMultipleThresholds() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(2000));
    }
}