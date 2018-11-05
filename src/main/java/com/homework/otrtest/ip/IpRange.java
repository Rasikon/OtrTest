package com.homework.otrtest.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

public class IpRange {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstIP = reader.readLine();
        String secondIP = reader.readLine();
        printIpRange(firstIP, secondIP);
        reader.close();
    }

    public static void printIpRange(String startIp, String endIp) throws UnknownHostException {
        long start = ipToLong(startIp);
        long end = ipToLong(endIp);

        for (long i = start + 1; i < end; i++) {
            System.out.println(longToIp(i));
        }
    }

    public static long ipToLong(String stringIp) throws UnknownHostException {
        InetAddress address = InetAddress.getByName(stringIp);
        ByteBuffer.allocate(4);
        ByteBuffer bb = ByteBuffer.wrap(address.getAddress());
        return (long) bb.getInt();
    }

    public static String longToIp(long longIp) throws UnknownHostException {
        ByteBuffer bb = ByteBuffer.allocate(4).putInt((int) longIp);
        InetAddress address = InetAddress.getByAddress(bb.array());
        return address.getHostAddress();
    }
}
