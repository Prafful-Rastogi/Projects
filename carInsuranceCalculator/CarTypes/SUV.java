package CarTypes;

import CarTypeInterface.CalculateInsurance;
import Entity.Car;

public class SUV implements CalculateInsurance{

	@Override
	public void cartypeCheck(Car car, String insuranceType, int cost) {
		System.out.println("Entered into SUV");
		if(insuranceType.toLowerCase().equals("basic")) {
			car.setInsuranceCost(cost*0.10);
			return;
		}
		else if(insuranceType.toLowerCase().equals("premium")) {
			car.setInsuranceCost(cost*0.10*0.20);
			return;
		}
		
	}

	

}
