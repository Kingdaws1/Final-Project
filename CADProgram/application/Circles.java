package application;

public class Circles {
	public Points centerPoint;
	public double radius;
	public Layers circleLayer;
	
	public Circles() {
		
	}
	
	public Circles(Points center, double circleRadius, Layers layer) {
		this.centerPoint = center;
		this.radius = circleRadius;
		this.circleLayer = layer;
	}
	
	public Points getCenterPoint() {
		return this.centerPoint;
	}
	
	public void setCenterPoint(Points center) {
		this.centerPoint = center;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public Layers getLayer() {
		return this.circleLayer;
	}
	
	public void setLayer(Layers layer) {
		this.circleLayer = layer;
	}
	
}
