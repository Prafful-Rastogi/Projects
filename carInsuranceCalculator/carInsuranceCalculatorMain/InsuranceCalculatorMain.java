package carInsuranceCalculatorMain;

import java.util.ArrayList;
import java.util.Scanner;

import CarTypeInterface.CalculateInsurance;
import CarTypes.HatchBack;
import CarTypes.SUV;
import CarTypes.Sedan;
import Entity.Car;

/*
 * This application is used to calculate the insurance of a car
 * Input type : car model (any), car type(Suv, Hatchback, Sedan), cost, insurance type 
 * (basic, premium)
 * We can add multiple cars at a time.
 */
public class InsuranceCalculatorMain {

	public static void main(String[] args) {

		Scanner getScanner = new Scanner(System.in);

		// Created the array list so that user can add multiple cars at a time
		ArrayList<Car> list = new ArrayList<>();
		CalculateInsurance calculateInsurance;
		String ans = "Y";

		while ((ans.toUpperCase().equals("Y"))) {

			System.out.println("entered while loop in main");
			// calling getInfo which collects the data from the user
			GetInfo get = new GetInfo();
			Car car = get.getInfo(getScanner);

			System.out.println("object created " + car.getCarType());

//			 String carTypeString =  String.valueOf(car.getCarType());
//			 System.out.println("line 38 " +carTypeString);//car.getCarType().toLowerCase();

			if (car.getCarType().toLowerCase().equals("hatchback")) {
				System.out.println("hatchback");
				calculateInsurance = new HatchBack();
				calculateInsurance.cartypeCheck(car, car.getInsuranceType(), car.getCarCost());
			}
			if (car.getCarType().toLowerCase().equals("sedan")) {
				System.out.println("Sedan");
				calculateInsurance = new Sedan();
				calculateInsurance.cartypeCheck(car, car.getInsuranceType(), car.getCarCost());
			}
			if (car.getCarType().toLowerCase().equals("suv")) {
				System.out.println("suv");
				calculateInsurance = new SUV();
				calculateInsurance.cartypeCheck(car, car.getInsuranceType(), car.getCarCost());

			}
			list.add(car);

			System.out.println("DO YOU WANT TO ADD ANOTHER CAR? Y/N");
			ans = getScanner.next();

		}

		System.out.println(list.toString());
	}

}
