package com.yedam.java.Quiz03;

public class MySqlDao extends DataAccessObject {

	@Override
	void select() {
		System.out.print("Mysql DB에서");
		super.select();
	}

	@Override
	void insert() {
		System.out.print("Mysql DB에");
		super.insert();
	}

	@Override
	void update() {
		System.out.print("Mysql DB를");
		super.update();
	}

	@Override
	void delete() {
		System.out.print("Mysql DB에서");
		super.delete();
	}

}
