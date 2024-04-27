package com.design.pattern.Iterator;

import java.util.List;

import com.design.pattern.abstractfactory.Employee;

public class MyIteratorImpl implements MyIterator {

	List<User> userList;

	public MyIteratorImpl(List<User> userList) {
		this.userList = userList;
	}

	int position = 0;

	@Override
	public boolean hasNext() {
		if (position < userList.size()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User next() {
		if (this.hasNext()) {
			return userList.get(position++);
		}
		return null;
	}

}
