package ro.unitbv.lab2prob2;

public class PaymentMethod {

	private String type;

	public PaymentMethod(String type) {
		this.type = type;

	}

	@Override
	public String toString() {
		return "PaymentMethod{" + "type=" + type + ")";
	}

	public String gettype() {
		return "Type: " + type;
	}

}
