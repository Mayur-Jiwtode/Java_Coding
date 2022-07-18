package org.springcore.autowire;
public class Emp 
{
	//creating a object of Address class
	private Address address;

	//Getter and Setter
	public Address getAddress()
	{
		return address;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public Emp() 
	{
		super();
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
