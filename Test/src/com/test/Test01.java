package com.test;

import com.demo.Demo01;
import com.demo.User;

/**
 * 测试类
 * @author Administrator
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Demo01 d = new Demo01();
		
		User goUser = null;
		User toUser = null;
		Boolean bl = null;
		Integer price = null;
		
		
		Integer i = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i);
		System.out.println("------------------------------");
		
		
		goUser = new User();
		toUser = new User();
		Integer i1 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i1);
		System.out.println("------------------------------");
		
		price = 2000;
		bl = false;
		Integer i2 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i2);
		System.out.println("------------------------------");
		
		bl = true;
		Integer i3 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i3);
		System.out.println("------------------------------");
		
		
		goUser.setPrice(2001);
		toUser.setPrice(200);
		Integer i4 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i4);
		System.out.println("------------------------------");
		
		
		goUser.setPrice(200);
		toUser.setPrice(200);
		Integer i5 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i5);
		System.out.println("------------------------------");
		
		
		goUser.setPrice(200);
		toUser.setPrice(2000);
		Integer i6 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i6);
		System.out.println("------------------------------");
		
		
		goUser.setPrice(200);
		toUser.setPrice(4089);
		Integer i7 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i7);
		System.out.println("------------------------------");
		
		price = 2020;
		goUser.setPrice(200);
		toUser.setPrice(4089);
		Integer i8 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i8);
		System.out.println("------------------------------");
		
		price = 2500;
		goUser.setPrice(200);
		toUser.setPrice(4089);
		Integer i9 = d.getPrice(goUser, toUser, bl, price);
		System.out.println(i9);
		System.out.println("------------------------------");
		
		
		
		
		
		
		
		
		
		
		
	}
}
