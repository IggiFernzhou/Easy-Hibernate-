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
			System.out.println("��������Ҫ���еĲ�����");
			System.out.println("1.���ӹ˿���Ϣ");
			System.out.println("2.ͨ������ɾ���˿���Ϣ");
			System.out.println("3.ͨ�������޸Ĺ˿�����");
			System.out.println("4.ͨ��������ѯ�˿���Ϣ");
			System.out.println("5.ֱ�Ӵ�ӡ�����й˿���Ϣ");
			System.out.println("0.�˳�����");
			System.out.println("*******************************************");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				CustDaoImpl cu = new CustDaoImpl();
				Cust c = new Cust();
				System.out.println("�������������ӹ˿���Ϣ��");
				System.out.println("������");
				String name = sc.next();
				c.setCustname(name);
				System.out.println("���䣺");
				int age = sc.nextInt();
				c.setAge(age);
				System.out.println("��ַ��");
				String address = sc.next();
				c.setAddress(address);
				System.out.println("���룺");
				String password = sc.next();
				c.setPassword(password);
				cu.add(c);
				break;
			case 2:
				CustDaoImpl cu1 = new CustDaoImpl();
				System.out.println("������Ҫɾ���Ĺ˿�������");
				String name1 = sc.next();
				cu1.delete(name1);
				break;
			case 3:
				CustDaoImpl cu2 = new CustDaoImpl();
				System.out.println("������Ҫ�޸�����Ĺ˿������������룺");
				String name2 = sc.next();
				String password2 = sc.next();
				cu2.update(name2, password2);
				break;
			case 4:
				CustDaoImpl cu3 = new CustDaoImpl();
				System.out.println("������Ҫ��ѯ�˿͵�������Ϣ��");
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
