package com.demo;

public class Demo01 {

	
	/*
	 * 转账金额,price,要求返回自己用户剩下的金额为多少
	 * 1.必须是100的整数倍
	 * 2.如果金额大于2000 每100元收取1块钱的手续费
	 * 3.如果第三方用户有钱,就从第三方转转账
	 */
	
	/**
	 * 	面试题 此页方法为空根据要求实现_只给出你当前的方法结尾return null
	 * @param GoUser 地三方的转账用户
	 * @param ToUser 自己的用户
	 * @param bl     只有这个为true的时候才能转账
	 * @param price 转账的金额
	 * @return
	 */
	public Integer getPrice(User GoUser,User ToUser,Boolean bl,Integer price){
		try {
			//判断转账金额是否为空
			if (price!= null && price>0) {
				//判断金额是不是100的整数倍
				if (price%100 == 0) {
					if (bl) {
						//判断第三方用户的金额
						if (GoUser != null) {
							if (GoUser.getPrice()!= null && GoUser.getPrice() > price) {
								Integer p = GoUser.getPrice();
								int a = p - price;
								System.out.println("第三方用户转账成功");
								return ToUser.getPrice();
							}else {
								System.out.println("第三方用户金额不足");
							}
						}else{
							System.out.println("第三方用户为空");
						}
							//自己的账户转账
							if (ToUser != null) {
								if (ToUser.getPrice() != null && ToUser.getPrice() >= price) {
									//自己转账
									if (price > 2000) {
										int p = price - 2000;
										int i = (int) Math.floor(p/100);
										System.out.println("自己转账成功");
										return ToUser.getPrice()-2000-i;
									} else {
										System.out.println("自己转账成功");
										return ToUser.getPrice()-price;
									}
								}else {
									System.out.println("金额不足");
								}
							}else {
								System.out.println("当前用户为空");
							}
					}else{
						System.out.println("不允许转账");
					}
				} else {
					System.out.println("转账金额必须为100的倍数");
				}
			} else {
				System.out.println("请输入转账的金额");
			}
			
			return null;
			
		} catch (Exception e) {
			e.printStackTrace();
			//回滚
			return null;
		}
	}
}
