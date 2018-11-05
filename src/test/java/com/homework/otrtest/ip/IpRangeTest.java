package com.homework.otrtest.ip;

import org.junit.Assert;
import org.junit.Test;

import java.net.UnknownHostException;

public class IpRangeTest {

    @Test
    public void ipToLong() throws UnknownHostException {
        Assert.assertEquals("Ожидается -1062731775", -1062731775L, IpRange.ipToLong("192.168.0.1"));
    }

    @Test
    public void longToIp() throws UnknownHostException {
        Assert.assertEquals("Ожидается 192.168.0.1", "192.168.0.1", IpRange.longToIp(-1062731775L));
    }
}