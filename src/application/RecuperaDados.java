package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class RecuperaDados {

	Scanner sc = new Scanner(System.in);
	List<Employee> listEmployee = new ArrayList<>();
	
	public void registerEmployee() {
		System.out.println("Enter the number of Employee: ");
		int numberRegister = sc.nextInt();
		sc.nextLine();
			for (int i = 1; i <= numberRegister; i++) {
				System.out.println("Employee #" + i  + " data: " );
				System.out.println("Outsourced (y/n)? ");
				char typeEmployee = sc.next().charAt(0);
				
				
				if (typeEmployee == 'n') {
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Hours: ");
					double hours = sc.nextDouble();
					System.out.print("Value per hour: ");
					double valuePerHour = sc.nextDouble();
					Employee emp = new Employee( name,(int) hours, valuePerHour);
					listEmployee.add(emp);
					}
				else if  (typeEmployee == 'y') {
					sc.nextLine();
					System.out.print("Name: ");
					String name = sc.nextLine();
					System.out.print("Hours: ");
					double hours = sc.nextDouble();
					System.out.print("Value per hour: ");
					double valuePerHour = sc.nextDouble();
					System.out.println("Additional charge: ");
					double addCharge = sc.nextDouble();
					Employee out = new OutsourcedEmployee(name, (int) hours, valuePerHour, addCharge);
					listEmployee.add(out);
				}
				else {
					System.out.println("Invalid answer!");
					
				}
			}
		System.out.println();
		System.out.println("PAYMENTS: ");	
		for (Employee e : listEmployee) {
			System.out.println(e.getName() + " - $ " + e.payment());
		}
		sc.close();
	}
	
	
}
