package applications;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Employee's name: ");
		employee.name = leia.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = leia.nextDouble();
		System.out.print("Tax: ");
		employee.tax = leia.nextDouble();
		
		System.out.printf("\nEmployee: %s Salary: %.2f\n", employee.name, employee.netSalary());
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = leia.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.print("\nUpdated data: " + employee);
		System.out.print("\nFim do programa");
				
	}

}
