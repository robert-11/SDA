package ro.unitbv.lab2prob2;

import ro.unitbv.lab2prob2.Adress;
import ro.unitbv.lab2prob2.Customer;
import ro.unitbv.lab2prob2.PaymentMethod;

public class Class {

	public static void main(String[] args)

	{

		Customer customer = new Customer("Avram", "Iancu", 1);
		Adress adress = new Adress("Republicii", "Brasov", 1);
		PaymentMethod pm = new PaymentMethod("Card");
		System.out.println(customer);
		// System.out.println(adress);
		// System.out.println(pay);
		Customer customer1 = new Customer("Robert", "Albu", 21, adress, pm);
		System.out.println(customer1);

		System.out.println(customer1.getPaymentMethod().gettype());
		System.out.println(customer1.getCompleteName());
		System.out.println(customer1.getAdress().getnumber());
		System.out.println(customer1.getAdress().getFullAdress());
		System.out.println(customer1.getAdress().getcity());
               System.out.println(customer1.getAdress());
	}

}
