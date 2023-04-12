package Entity;
/*
 * This class is an entity
 * 
 */
public class Car {
	private String carModel;
	private String carType;
	private int carCost;
	private String insuranceType;
	private double insuranceCost;
	
	public double getInsuranceCost() {
		return insuranceCost;
	}

	public void setInsuranceCost(double d) {
		this.insuranceCost = d;
	}

	
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carType=" + carType + ", carCost=" + carCost + ", insuranceType="
				+ insuranceType + ", insuranceCost=" + insuranceCost + "]";
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String carModel, String carType, int carCost, String insuranceType) {
		super();
		this.carModel = carModel;
		this.carType = carType;
		this.carCost = carCost;
		this.insuranceType = insuranceType;
	}
	
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarType() {
		return carType.toString();
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public int getCarCost() {
		return carCost;
	}
	public void setCarCost(int carCost) {
		this.carCost = carCost;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	
}
