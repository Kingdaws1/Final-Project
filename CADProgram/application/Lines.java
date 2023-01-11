package application;

public class Lines {
	public Points point1;
	public Points point2;
	public double slope = (this.point1.yValue - this.point2.yValue) / (this.point1.xValue - this.point2.xValue);
	public double b = this.point1.yValue - this.slope * this.point1.xValue;
	public String equation = "y = " + this.slope + "x + " + this.b; 
	public Layers lineLayer;
	
	public Lines() {
		
	}
	
	public Lines(Points firstPoint, Points secondPoint, Layers layer) {
		this.point1 = firstPoint;
		this.point2 = secondPoint;
		this.lineLayer = layer;
	}
	
	public Points getPoint1() {
		return this.point1;
	}
	
	public void setPoint1(Points newPoint) {
		this.point1 = newPoint;
	}
	
	public Points getPoint2() {
		return this.point2;
	}
	
	public void setPoint2(Points newPoint) {
		this.point2 = newPoint;
	}
	
	public Layers getLayer() {
		return this.lineLayer;
	}
	
	public void setLayer(Layers layer) {
		this.lineLayer = layer;
	}
	
}
