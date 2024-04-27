package com.design.pattern.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.design.pattern.abstractfactory.Employee;

// Iterator DP provide a way to access the elements of an object without exposing it's underlying implementation. 
// https://www.javatpoint.com/iterator-pattern

public class Main {

	public static void main(String[] args) {

		User user1 = new User(101, "Akshay", 87576.89);
		User user2 = new User(102, "Prakash", 3454.89);
		User user3 = new User(103, "Vijay", 767686.89);

		List<User> list = Arrays.asList(user1, user2, user3);

		UserManagement userManagement = new UserManagement(list);
		MyIterator iterator = userManagement.getIterator();

		while (iterator.hasNext()) {
			User emp = (User) iterator.next();
			System.out.println(emp);
		}

	}

}
