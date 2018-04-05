package edu.ycp.cs320.acksio.model;

import edu.ycp.cs320.acksio.controller.DataController;
import edu.ycp.cs320.acksio.persist.DatabaseProvider;

public class Vehicle implements DataController{
	//ATTRIBUTES
	private int courierID;
	private int vehicleID;
	private String licensePlate;
	private int year;
	private String make;
	private String model;
	private VehicleType type;
	private boolean active;
	
	//CONSTRUCTORS
	public Vehicle() {
		//Purposefully empty
	}
	
	public Vehicle(DatabaseProvider provider, int id) {
		setVehicleID(id);
		populate(provider, id);
	}
	
	//METHODS
	@Override
	public void populate(DatabaseProvider provider, int id) {
		Vehicle hold = provider.getInstance().vehicleFromID(id);
		if(hold != null) {
			setCourierID(hold.getCourierID());//CourierID
			setType(hold.getType());
			setLicensePlate(hold.getLicensePlate());//LicensePlate
			setMake(hold.getMake());//Make
			setModel(hold.getModel());//Model
			setYear(hold.getYear());//Year
			setActive(hold.isActive());//Active
		} else {
			throw new NullPointerException();
		}
	}

	@Override
	public void save(DatabaseProvider provider) {
		if(!provider.getInstance().update(this)) 
			provider.getInstance().insert(this);
	}
	
	//SETTERS AND GETTERS
	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}
	
	public void setType (String vehicle) {
		if(vehicle.equals("Bicycle")) {
			type = VehicleType.BICYCLE;
		} else if(vehicle.equals("Motorcycle")) {
			type = VehicleType.MOTORCYCLE;
		} else if(vehicle.equals("Car")) {
			type = VehicleType.CAR;
		} else if(vehicle.equals("SUV")) {
			type = VehicleType.SUV;
		} else if(vehicle.equals("Van")) {
			type = VehicleType.VAN;
		} else if(vehicle.equals("Pickup")) {
			type = VehicleType.PICKUP;
		} else if(vehicle.equals("Sprinter")) {
			type = VehicleType.SPRINTER;
		} else if(vehicle.equals("Semi")) {
			type = VehicleType.SEMI;
		} else {
			type = null;
		}
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public int getCourierID() {
		return courierID;
	}

	public void setCourierID(int courierID) {
		this.courierID = courierID;
	}
}