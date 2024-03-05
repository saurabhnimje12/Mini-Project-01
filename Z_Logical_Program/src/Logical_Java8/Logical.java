package Logical_Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Logical {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<Employee>();

		emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.0));
		emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

//	1. How many male and female employees are there in the organization ?

		Map<String, Long> map = emps.stream()
									.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(map);
		System.out.println("====================================================");
		
//	2. Print the name of all departments in the organization ?

		emps.stream()
			.map(e -> e.department)
			.distinct()
			.forEach(dept -> System.out.println(dept));
		
		System.out.println("====================================================");

		
//	3. What is the average age of male and female employees ?

		Map<String, Double> map2 = emps.stream()
										.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(map2);
		System.out.println("====================================================");


//	4. Get the details of highest paid employee in the organization ?

		Optional<Employee> optional = emps.stream()
										  .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		if (optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
		}
		System.out.println("====================================================");
			
				
//	5. Get the names of all employees who have joined after 2015 ?

		emps.stream()
			.filter(e -> e.getYearOfJoining() > 2015)
			.map(e -> e.name)
			.forEach(emp -> System.out.println(emp));
		
		System.out.println("====================================================");

				
//	6. Count the number of employees in each department ?

		Map<String, Long> map3 = emps.stream()
									 .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(map3);
		System.out.println("====================================================");

		
//	7. What is the average salary of each department ?

		Map<String, Double> map4 = emps.stream()
									   .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map4);
		System.out.println("====================================================");

		
//	8. Get the details of youngest male employee in the product development department ?

		Optional<Employee> optional2 = emps.stream()
										   .filter(e -> e.getDepartment().equals("Development") && e.getGender().equals("Male"))
										   .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
		if (optional2.isPresent()) {
			Employee employee = optional2.get();
			System.out.println(employee);
		}
		
		System.out.println("====================================================");

		
//	9. Who has the most working experience in the organization?

		Optional<Employee> optional3 = emps.stream()
										   .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
		
		if (optional3.isPresent()) {
			Employee employee = optional3.get();
			System.out.println(employee);
		}
		
		System.out.println("====================================================");

		
//	10. How many male and female employees are there in the Sales team?

		Map<String, Long> map5 = emps.stream()
			 						 .filter(e -> e.getDepartment().equals("Sales"))
			 						 .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(map5);
		System.out.println("====================================================");

		
//	11. What is the average salary of male and female employees ?

		Map<String, Double> map6 = emps.stream()
									   .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(map6);
		System.out.println("====================================================");
		
		
//	12. List down the names of all employees in each department ?

		Map<String, List<Employee>> map7 = emps.stream()
											   .collect(Collectors.groupingBy(Employee::getDepartment));
		
		System.out.println(map7);
		System.out.println("====================================================");

		
//	13. What is the average salary and total salary of the whole organization?

			Double double1 = emps.stream()
								 .collect(Collectors.averagingDouble(Employee::getSalary));
			System.out.println(double1);
			
			System.out.println("====================================================");

		
//	14. Separate the employees who are younger or equal to 25 years/ from those employees who are older than 25 years ?

			
			
//	15. Who is the oldest employee in the organization? What is his age and which department he belongs to ?

			Optional<Employee> optional4 = emps.stream()
											   .collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
			if (optional4.isPresent()) {
				Employee employee = optional4.get();
				System.out.println("Name : "+employee.name +" Age : "+employee.age + " Department : " +employee.department);
			}
			
			System.out.println("====================================================");

	
// 16.	Get the employee who's salary are more than 25k.
			
			List<Employee> list = emps.stream()
									  .filter(e -> e.getSalary() >= 25000)
									  .collect(Collectors.toList());
			
			list.forEach(e -> System.out.println(e));
			
			System.out.println("====================================================");

	
//	17.	Who is the highest paid employee in the organization?
			
			Optional<Employee> optional5 = emps.stream()
											   .collect(Collectors.maxBy(Comparator.comparing(Employee :: getSalary)));
			
			if (optional5.isPresent()) {
				Employee employee = optional5.get();
				System.out.println(employee);
			}
			
			System.out.println("====================================================");

			
//	18.	Who is the second highest paid employee in the organization?

			 Employee employee2 = emps.stream()
					 				  .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
					 				  .skip(1)
					 				  .findFirst()
					 				  .orElse(null);	// if data not present and id you perform operation it will occurs NULLPOINTEREXCEPTION
			 
			System.out.println(employee2);
			System.out.println("====================================================");

			
//	19.	Who is the third highest paid employee in the organization?
			
			Optional<Employee> optional8 = emps.stream()
								  		   .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
								  		   .skip(2)
								  		   .findFirst();
								  
			if (optional8.isPresent()) {
				Employee employee = optional8.get();
				System.out.println(optional8);
			}
					
			System.out.println("====================================================");

			
//	20.	Who is the lowest paid employee in the organization?
			
			Optional<Employee> optional6 = emps.stream()
											   .collect(Collectors.minBy(Comparator.comparing(Employee :: getSalary)));
			
			if (optional6.isPresent()) {
				Employee employee = optional6.get();
				System.out.println(employee);
			}
			
			System.out.println("====================================================");


//	20.	Who is the second lowest paid employee in the organization?
	
			Optional<Employee> optional7 = emps.stream()
											   .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
											   .skip(1)
											   .findFirst();
				
			if (optional7.isPresent()) {
				Employee employee = optional7.get();
				System.out.println(optional7);
			}
			
			System.out.println("====================================================");

			
//	21.	Who is the third lowest paid employee in the organization?
			
			Optional<Employee> optional9 = emps.stream()
											   .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
											   .skip(2)
											   .findFirst();
						
		if (optional9.isPresent()) {
			Employee employee = optional9.get();
			System.out.println(optional9);
		}			
	
		System.out.println("====================================================");

		
//	22.	Get the first five highest paid employee in the organization?
		
		 List<Employee> collect = emps.stream()
										   .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
										   .limit(5)
										   .collect(Collectors.toList());
		 
		 collect.forEach(e -> System.out.println(e));

		System.out.println("====================================================");

//	23. Get the first five lowest paid employee in the organization?

		List<Employee> collect3 = emps.stream()
									  .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
									  .limit(5)
									  .collect(Collectors.toList());

		collect3.forEach(e -> System.out.println(e));

		System.out.println("====================================================");	
		
		
//	24.	Get the first five employee in the organization?

		List<Employee> collect1 = emps.stream()
									 .limit(5)
									 .collect(Collectors.toList());

		collect1.forEach(e -> System.out.println(e));

		System.out.println("====================================================");
		

//	24.	Get the last five employee in the organization?

			List<Employee> collect4 = emps.stream()
										  .skip(Math.max(0, emps.size() - 5)) // Skip elements to get the last five
										  .collect(Collectors.toList());

			collect4.forEach(e -> System.out.println(e));

			System.out.println("====================================================");
			
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

class Employee {

	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
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

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}