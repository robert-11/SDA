package ro.unitbv.shapes;

public interface Shape {

	void draw();
	double getArea();
	String getName();
	String getHexFillColor();
	int getBorderWidth();
}