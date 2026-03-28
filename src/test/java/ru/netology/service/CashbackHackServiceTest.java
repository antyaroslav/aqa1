package ru.netology.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnAmountNeededToReachNextThousand() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(300, service.remain(700));
        assertEquals(800, service.remain(1200));
        assertEquals(0, service.remain(1000));
        assertEquals(300, service.remain(700));
    }
}