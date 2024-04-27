package com.design.pattern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {

	List<User> userList = new ArrayList<>();

	public UserManagement(List<User> userList) {
		this.userList = userList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public MyIterator getIterator() {
		return new MyIteratorImpl(userList);
	}

}
