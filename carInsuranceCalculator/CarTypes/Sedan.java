package CarTypes;

import CarTypeInterface.CalculateInsurance;
import Entity.Car;

public class Sedan implements CalculateInsurance{

	@Override
	public void cartypeCheck(Car car, String insuranceType, int cost) {
		System.out.println("Entered into sedan");
		if(insuranceType.toLowerCase().equals("basic")) {
			car.setInsuranceCost(cost*0.08);
			return;
		}
		else if(insuranceType.toLowerCase().equals("premium")) {
			car.setInsuranceCost(cost*0.08*0.20);
			return;
		}
		
	}



}
