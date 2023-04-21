package CarTypes;

import CarTypeInterface.CalculateInsurance;
import Entity.Car;

public class HatchBack implements CalculateInsurance{

	@Override
	public void cartypeCheck(Car car, String insuranceType, int cost) {
		System.out.println("enterned into hatchback");
		if(insuranceType.toLowerCase().equals("basic")) {
			car.setInsuranceCost(cost*0.05);
			return;
		}
		if(insuranceType.toLowerCase().equals("premium")) {
			car.setInsuranceCost(cost*0.05*0.20);
			return;
		}
	}

}
