package com.dtk.weixin.wxutils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * 
 * <p>Description: 获取本机IP </p>
 * @author wy
 * @date 2017年7月24日 下午4:56:26
 */
public class LocalIPUtil {
    public LocalIPUtil() {
    }

    @SuppressWarnings("rawtypes")
	public static String getLocalAddr() {
        Enumeration interfaces = null;

        try {
            interfaces = NetworkInterface.getNetworkInterfaces();
        } catch (SocketException var4) {
            var4.printStackTrace();
            return null;
        }

        while (interfaces.hasMoreElements()) {
            NetworkInterface ifc = (NetworkInterface) interfaces.nextElement();
            Enumeration addressesOfAnInterface = ifc.getInetAddresses();

            while (addressesOfAnInterface.hasMoreElements()) {
                InetAddress address = (InetAddress) addressesOfAnInterface.nextElement();
                if (address.isSiteLocalAddress()) {
                    return address.getHostAddress();
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(getLocalAddr());
    }
}