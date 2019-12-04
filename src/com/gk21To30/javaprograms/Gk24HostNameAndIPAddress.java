package com.gk21To30.javaprograms;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Gk24HostNameAndIPAddress {

	public static void main(String[] args) throws UnknownHostException {

		InetAddress inetAddrss = InetAddress.getLocalHost();

		System.out.println("Host Name: " + inetAddrss.getHostAddress());
		System.out.println("Inet Address: " + inetAddrss);

	}

}
