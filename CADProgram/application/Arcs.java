package application;

public class Arcs {
	public Points point1;
	public Points point2;
	public Points centerPoint;
	public double radius;
	public Layers arcLayer;
	
	public Arcs() {
		
	}
	
	public Arcs(Points firstPoint, Points secondPoint, Points center, double arcRadius, Layers layer) {
		this.point1 = firstPoint;
		this.point2 = secondPoint;
		this.centerPoint = center;
		this.radius = arcRadius;
		this.arcLayer = layer;
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
	
	public Points getCenterPoint() {
		return this.centerPoint;
	}
	public void setCenterPoint(Points newPoint) {
		this.centerPoint = newPoint;
	}
	
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public Layers getLayer() {
		return this.arcLayer;
	}
	
	public void setLayer(Layers layer) {
		this.arcLayer = layer;
	}
	
}
