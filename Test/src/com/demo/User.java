package com.demo;

/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {

	private String name;//姓名
	private Integer age;//年龄
	private Integer price;//账户余额
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "GoUser [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	
}
