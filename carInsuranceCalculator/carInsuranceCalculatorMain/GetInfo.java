package carInsuranceCalculatorMain;

import java.util.Scanner;

import Entity.Car;

public class GetInfo {
	public Car getInfo(Scanner getData) {
		Car car = new Car();
		boolean ansForWrongInput = true;
		while (ansForWrongInput) {
			System.out.print("Please enter your car Model: ");
			String carModelString=getData.next();
			
			System.out.println("Please enter your car Type: Hatchback/ Sedan/ SUV");
			String carTypeString = getData.next();
			if (!(carTypeString.equals("sedan") || carTypeString.equals("suv") || carTypeString.equals("hatchback"))) {
				System.out.println("Please enter the correct Car Type!");
				continue;
			}
			
			System.out.print("Please enter your car Cost: ");
			int cost=getData.nextInt();
			getData.nextLine();
			
			System.out.println("Please enter your car Insurance Type: Basic/premium");
			String insTypeString= getData.next();
			if (!(insTypeString.equals("basic") || insTypeString.equals("premium"))) {
				System.out.println("Please enter the correct Insurance Type!");
				continue;
			}
			
			car.setCarModel(carModelString);
			car.setCarType(carTypeString);
			car.setCarCost(cost);
			car.setInsuranceType(insTypeString);
			ansForWrongInput=false;
		}
		return car;
	}
}
