package ro.unitbv.shapes;

public interface Shape {

	void Draw();

	double getArea();

	String getName();

	String getHexFillColor();

	int getBorderWidth();

}