package ro.unitbv.lab2prob2;

import ro.unitbv.lab2prob2.Adress;
import ro.unitbv.lab2prob2.PaymentMethod;

public class Customer {

	private String FirstName;
	private String LastName;
	private int age;
	private Adress adress;
	private PaymentMethod payment;

	public Customer(String FirstName, String LastName, int age) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.age = age;
	}

	public Customer(String FirstName, String LastName, int age, Adress adress, PaymentMethod payment) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.age = age;
		this.adress = adress;
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Customer{" + "FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + " , " + adress
				+ " , " + payment;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public int getage() {
		return age;
	}

	public String getCompleteName() {
		return "FirstName: " + FirstName + " ,  LastName:" + LastName;

	}

	public PaymentMethod getPaymentMethod() {
		return payment;
	}

	public Adress getAdress() {
		return adress;

	}

}