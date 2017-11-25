package com.Dao;

import java.util.List;

import com.po.Cust;

public interface CustDao {
		public void add(Cust c);
		public void update(String s,String s1);
		public void delete(String s);
		public Cust iquery(String s);
		public List<Cust> query();
}
