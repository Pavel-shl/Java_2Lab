package by.bsuir.lab2.entity;

import javax.xml.bind.annotation.*;

public class Appliance {

	@XmlElement
	private double price;

	Appliance(double price) {
		this.price = price;
	}

	public Appliance() {
		this.price = 0;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("Price: %f", this.price);
	}
	
	public String GetName() {
		return this.getClass().getSimpleName();
	}
}
