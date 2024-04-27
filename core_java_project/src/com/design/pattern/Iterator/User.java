package com.design.pattern.Iterator;

class User {

	private int userId;
	private String userName;
	private double userSalary;

	public int getUserId() {
		return userId;
	}

	public User(int userId, String userName, double userSalary) {
		this.userId = userId;
		this.userName = userName;
		this.userSalary = userSalary;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getUserSalary() {
		return userSalary;
	}

	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userSalary=" + userSalary + "]";
	}

}