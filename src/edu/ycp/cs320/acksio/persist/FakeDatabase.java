package edu.ycp.cs320.acksio.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.acksio.model.Job;
import edu.ycp.cs320.acksio.model.UserAccount;
import edu.ycp.cs320.acksio.model.Courier;
import edu.ycp.cs320.acksio.model.Dispatcher;
import edu.ycp.cs320.acksio.model.Vehicle;

public class FakeDatabase implements IDatabase{
	private List<Job> jobList;
	private List<UserAccount> userList;
	private List<Courier> courierList;
	private List<Dispatcher> dispatcherList;
	private List<Vehicle> vehicleList;
	@Override
	public Boolean insert(Job job) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean insert(Courier courier) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean insert(Dispatcher dispatcher) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean insert(UserAccount user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean insert(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean update(Job job) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean update(Courier courier) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean update(Dispatcher dispatcher) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean update(UserAccount user) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean update(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Job jobFromID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Courier courierFromID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dispatcher dispatcherFromID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserAccount userAccountFromID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Vehicle vehicleFromID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean verifyLogin(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Vehicle> vehiclesFromCourierID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Job> jobsFromCourierID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Job> jobsFromDispatcherID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Courier> couriersFromDispatcherID(String id) {
		// TODO Auto-generated method stub
		return null;
	}
}
