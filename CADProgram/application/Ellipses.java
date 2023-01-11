package application;

public class Ellipses {
	public Circles circle1;
	public Circles circle2;
	public Layers ellipseLayer;
	
	public Ellipses() {
		
	}
	
	public Ellipses(Circles firstCircle, Circles secondCircle, Layers layer) {
		this.circle1 = firstCircle;
		this.circle2 = secondCircle;
		this.ellipseLayer = layer;
	}
	
	public Circles getCircle1() {
		return this.circle1;
	}
	
	public void setCircle1(Circles circle) {
		this.circle1 = circle;
	}
	
	public Circles getCircle2() {
		return this.circle2;
	}
	
	public void setCircle2(Circles circle) {
		this.circle2 = circle;
	}
	
	public Layers getLayer() {
		return this.ellipseLayer;
	}
	
	public void setLayer(Layers layer) {
		this.ellipseLayer = layer;
	}
	
}
