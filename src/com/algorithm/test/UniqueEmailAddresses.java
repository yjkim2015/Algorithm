package com.algorithm.test;

import java.util.HashSet;
import java.util.Set;

/*
 * Input ["test.email + james@coding.com",
 * "test.e.mail" + toto.jane@coding.com",
 * "testemail+tom@cod.ding.com"]
 * 
 */
public class UniqueEmailAddresses {
	
	public static void main(String[] args) {
		
		String[] str = {"test.email + james@coding.com",
				"test.e.mail + toto.jane@coding.com",
				"testemail+tom@cod.ding.com"};
		solve(str);
	}
	
	public static void solve(String[] str) {
		Set<String> set = new HashSet<>();
		String localName = null;
		String domainName = null;
		
		for ( String oneStr : str ) {
			localName = makeLocalName(oneStr.substring(0,oneStr.indexOf("+")));
			domainName = makeDomainName(oneStr.substring(oneStr.indexOf("+")+1));
			
			set.add(localName+domainName);
		}
		
		System.out.println(set.toString());
	}
	
	public static String makeLocalName(String str) {
		return str.replace(".", "").trim();
	}
	
	public static String makeDomainName(String str)  {
		return str.substring(str.indexOf("@")).trim();
	}
}
