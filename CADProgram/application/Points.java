package application;

public class Points {
	public double xValue;
	public double yValue;
	public String pointCoordinates = "(" + this.xValue + "," + this.yValue + ")";
	public Layers pointLayer;
	
	public Points() {
		
	}
	
	public Points(double xVal, double yVal, Layers layer) {
		this.xValue = xVal;
		this.yValue = yVal;
		this.pointCoordinates = "(" + xVal + "," + yVal + ")";
		this.pointLayer = layer;
	}
	
	public String getCoordinates() {
		return this.pointCoordinates;
	}
	
	public void setCoordinates(double xVal, double yVal) {
		this.xValue = xVal;
		this.yValue = yVal;
	}
	
	public Layers getLayer() {
		return this.pointLayer;
	}
	
	public void setLayer(Layers newLayer) {
		this.pointLayer = newLayer;
	}
	
}
