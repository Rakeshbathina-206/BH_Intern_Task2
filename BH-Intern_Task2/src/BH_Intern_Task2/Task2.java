package BH_Intern_Task2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Task2 {
	

	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();

	        employees.add(new Employee("Raju", 25, 45000.0));
	        employees.add(new Employee("Anitha", 28, 52000.5));
	        employees.add(new Employee("Bhanu", 22, 52000.5)); // same salary as Anitha
	        employees.add(new Employee("Chandra", 30, 38000.0));
	        employees.add(new Employee("Deepak", 26, 60000.0));

	        // Sort by salary (descending)
	        List<Employee> bySalaryDesc = new ArrayList<>(employees);
	        bySalaryDesc.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

	        System.out.println("Sorted by salary (desc):");
	        bySalaryDesc.forEach(System.out::println);
	        System.out.println();

	        // Sort by name (ascending)
	        List<Employee> byNameAsc = new ArrayList<>(employees);
	        byNameAsc.sort(Comparator.comparing(Employee::getName));

	        System.out.println("Sorted by name (asc):");
	        byNameAsc.forEach(System.out::println);
	    }

	    // Employee class
	    static class Employee {
	        private final String name;
	        private final int age;
	        private final double salary;

	        public Employee(String name, int age, double salary) {
	            this.name = name;
	            this.age = age;
	            this.salary = salary;
	        }

	        public String getName() {
	            return name;
	        }

	        public int getAge() {
	            return age;
	        }

	        public double getSalary() {
	            return salary;
	        }

	        @Override
	        public String toString() {
	            return String.format("Employee{name='%s', age=%d, salary=%.2f}", name, age, salary);
	        }
	    }
	}
