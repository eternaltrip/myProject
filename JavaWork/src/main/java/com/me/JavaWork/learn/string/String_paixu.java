package com.me.JavaWork.learn.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class String_paixu {
	public static void main(String[] args) {
//		String ad = "117.172.237.208, 117.175.179.78, 112.19.169.144, 117.175.139.239, 117.175.139.115, 117.175.139.157, 117.172.237.54, 117.173.209.148, 117.172.237.31, 112.19.169.31, 117.175.179.173, 117.175.139.113, 117.172.237.200, 117.173.209.178, 117.175.149.11, 117.139.8.62, 117.175.179.109, 117.175.139.189, 117.175.139.144, 117.175.139.158, 112.19.169.32, 117.175.139.246, 117.175.139.145, 117.173.209.159, 183.220.115.201, 117.175.139.40, 223.85.249.211, 117.175.179.81, 117.175.179.97, 117.175.179.95, 117.175.179.99, 117.175.179.72, 117.175.179.104, 117.175.179.107, 117.175.179.166, 117.172.237.22, 117.175.139.41, 117.172.237.249, 117.139.8.8, 117.175.179.108, 117.175.139.143, 117.175.139.141, 117.175.149.12, 117.173.209.51, 117.175.139.238, 117.175.149.26, 112.19.169.43, 117.175.139.242, 117.139.8.106, 117.175.139.180, 117.175.179.65";
//		ad = ad.replaceAll(" ", "");
//		String[] ads = ad.split(",");
//		Arrays.sort(ads);
//		Arrays.sort(ads);
//		for (int i = 0; i < ads.length; i++) {
//			System.out.println(ads[i]);
//		}
//		
		
		String a= "   1222  333  4544  6666    77777     " ;
		String b = a.trim();
		System.out.println(b);
		String[] c = b.split("\\s+");
		String d = Arrays.toString(c);
		System.out.println(c);
		System.out.println(d);
	}

}