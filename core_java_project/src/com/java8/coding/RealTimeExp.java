package com.java8.coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearOfJoining + ", Salary : " + salary;
	}
}

public class RealTimeExp {
	
	static List<Employee> employeeList = new ArrayList<Employee>();

	 
	public static void main(String[] args) {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//		employeeList.forEach(i -> System.out.println(i.getId() + " | " + i.getName() + " | " + i.getAge() + " | "
//				+ i.getGender() + " | " + i.getDepartment() + " | " + i.getYearOfJoining() + " | " + i.getSalary()));

		System.out.println("*************************************************************************************************");
		
	    Optional<Employee> emp = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
	    System.out.println(emp.get().getId());
	    
		System.out.println("*************************************************************************************************");
		
		
//		Query 3.1 : How many male and female employees are there in the organization?
		
		Map<String, Long>  maleAndFemaleList = employeeList.stream().collect(Collectors.groupingBy(i -> i.getGender(),HashMap::new,Collectors.counting()));
        
		Map<String, Long> noOfMaleAndFemaleEmployees= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
//		System.out.println(noOfMaleAndFemaleEmployees);
		
//      Query 3.2 : Print the name of all departments in the organization?
        
//        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
//		Query 3.3 : What is the average age of male and female employees?

		Map<String, Double> avgAgeOfMaleAndFemaleEmployees= employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//        System.out.println(avgAgeOfMaleAndFemaleEmployees);

//		Query 3.4 : Get the details of highest paid employee in the organization?
		
		double highestPaidEmployeeWrapper= employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get().salary;
		System.err.println(highestPaidEmployeeWrapper);

//      Query 3.5 : Get the names of all employees who have joined after 2015?
		
		Stream<String> empsNames = employeeList.stream().filter(i -> i.getYearOfJoining()>2015).map(Employee::getName);
//		System.out.println(Arrays.toString(empsNames.toArray()));

//      Query 3.6 : Count the number of employees in each department?

	    Map<String, Long> departmentCountList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(departmentCountList);
		
//		Query 3.7 : What is the average salary of each department?

	    Map<String, Double> avgSalaryOfDepartments = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSalaryOfDepartments);
	    
//	    Query 3.8 : Get the details of youngest male employee in the product development department?

	    Optional<Employee> youngestMale =  employeeList.stream().filter(i -> i.getDepartment().equalsIgnoreCase("Product Development") && i.getGender().equals("Male")).collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
//        System.out.println(youngestMale);
	    
//	    Query 3.9 : Who has the most working experience in the organization?
       
        Optional<Employee> mostWorkingExperience = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
//       System.out.println(mostWorkingExperience);

//	    Query 3.10 : How many male and female employees are there in the sales and marketing team?
       
        Map<String, Long> countMaleFemaleEmployeesInSalesMarketing =  employeeList.stream().filter(i -> i.getDepartment().equalsIgnoreCase("sales and marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//       System.out.println(countMaleFemaleEmployeesInSalesMarketing);


//	    Query 3.11 : What is the average salary of male and female employees?
        
        Map<String, Double> avgSalaryOfGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(avgSalaryOfGender);

//	    Query 3.12 : List down the names of all employees in each department?
       
	/*	Map<String, List<Employee>> employeeListByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		Set<Entry<String, List<Employee>>> entrySet = employeeListByDepartment.entrySet();

		for (Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}*/

//	    Query 3.13 : What is the average salary and total salary of the whole organization?

	DoubleSummaryStatistics summary = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	double avgSalary = summary.getAverage();
	double totalSum = summary.getSum();
//	System.out.println("Avg Salary :" + avgSalary + "    " + "Total Salary :" + totalSum);      
        
        
//	    Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
	
	Map<Boolean, List<Employee>> partitionEmployeesByAge = employeeList.stream().collect(Collectors.partitioningBy(i -> i.getAge() > 25));
	Set<Entry<Boolean, List<Employee>>> elements = partitionEmployeesByAge.entrySet();

	for (Entry<Boolean, List<Employee>> element : elements) {

		if (element.getKey()) {
			System.err.println("Employees older than 25 years :");
		} else {
			System.out.println("Employees younger than or equal to 25 years ");
		}

		List<Employee> list = element.getValue();

		for (Employee e : list) {
//			System.out.println(e.getName());
		}
	}

//	    Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?

	Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
    
	Employee oldestEmployee = oldestEmployeeWrapper.get();
	         
	System.out.println("Name : "+oldestEmployee.getName());
	         
	System.out.println("Age : "+oldestEmployee.getAge());
	         
	System.out.println("Department : "+oldestEmployee.getDepartment());

	}
}
