package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int register = sc.nextInt();
		
		for(int i=1; i<=register; i++) {
			System.out.println("Employee #"+ i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			list.add(employee);
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idSalary = sc.nextInt();
		Integer pos = position(list, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percente = sc.nextDouble();
			list.get(pos).increaseSalary(percente);
		}
		

		for(Employee x: list) {
			System.out.println(x);
		}
		sc.close();
	}
	public static Integer position(List<Employee> list, int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
