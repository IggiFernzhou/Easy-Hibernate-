package com.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.po.Cust;

public class CustDaoImpl implements CustDao{
	Configuration conf = new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=conf.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tran=session.beginTransaction();
	public void add(Cust c) {
		session.save(c);
		tran.commit();
		session.close();
	}
	//ͨ�������޸�����
	public void update(String s,String s1) {
		Cust c=(Cust)session.get(Cust.class, s);
		if(c!=null) {
			c.setPassword(s1);
			session.update(c);
			tran.commit();
		}			
		session.close();
	}
	//ͨ������ɾ��������Ϣ
	public void delete(String s) {
		Cust c=(Cust) session.get(Cust.class, s);
		if(c!=null) {
			session.delete(c);
			tran.commit();
		}
		session.close();
		
	}
	//ͨ��������ѯ������Ϣ
	public Cust iquery(String s) {
		Cust c=(Cust) session.get(Cust.class, s);
		return c;
	}
	//��ѯ������Ϣ
	public List<Cust> query(){
		Query q=session.createQuery("from Cust");
		   List<Cust> list=q.list();
		   return list;
	}
}
