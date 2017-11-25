package com.Model;

import java.util.List;
import java.util.Scanner;

import com.Dao.CustDaoImpl;
import com.po.Cust;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("请输入您要进行的操作：");
			System.out.println("1.增加顾客信息");
			System.out.println("2.通过姓名删除顾客信息");
			System.out.println("3.通过姓名修改顾客密码");
			System.out.println("4.通过姓名查询顾客信息");
			System.out.println("5.直接打印出所有顾客信息");
			System.out.println("0.退出程序");
			System.out.println("*******************************************");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				CustDaoImpl cu = new CustDaoImpl();
				Cust c = new Cust();
				System.out.println("请依次输入增加顾客信息：");
				System.out.println("姓名：");
				String name = sc.next();
				c.setCustname(name);
				System.out.println("年龄：");
				int age = sc.nextInt();
				c.setAge(age);
				System.out.println("地址：");
				String address = sc.next();
				c.setAddress(address);
				System.out.println("密码：");
				String password = sc.next();
				c.setPassword(password);
				cu.add(c);
				break;
			case 2:
				CustDaoImpl cu1 = new CustDaoImpl();
				System.out.println("请输入要删除的顾客姓名：");
				String name1 = sc.next();
				cu1.delete(name1);
				break;
			case 3:
				CustDaoImpl cu2 = new CustDaoImpl();
				System.out.println("请输入要修改密码的顾客姓名和新密码：");
				String name2 = sc.next();
				String password2 = sc.next();
				cu2.update(name2, password2);
				break;
			case 4:
				CustDaoImpl cu3 = new CustDaoImpl();
				System.out.println("请输入要查询顾客的姓名信息：");
				String name3 = sc.next();
				Cust c1 = new Cust();
				c1 = cu3.iquery(name3);
				System.out.println(c1.toString());
				
				break;
			case 5:
				CustDaoImpl cu4 = new CustDaoImpl();
				List<Cust> list = cu4.query();
				for (Cust c2 : list) {
					System.out.println(c2.toString());
				}
				break;
			case 0:
				flag = false;
				break;
			default:
				break;
			}
		}
	}

}
