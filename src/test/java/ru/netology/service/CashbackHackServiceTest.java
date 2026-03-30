package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnAmountNeededToReachNextThousand() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(300, service.remain(700));
        Assert.assertEquals(800, service.remain(1200));
        Assert.assertEquals(0, service.remain(1000));
    }
}