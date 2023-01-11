package application;

import java.util.LinkedList;

public class Polygon {
	public LinkedList<Points> pointsQueue; 
	public Points center;
	public int sides;
	public double radius;
	public double lineLength;
	public boolean equalateral = false;
	public Layers polygonLayer;
	
	public Polygon() {
		
	}
	
	public Polygon(int numberOfSides, Points centerPoint, double distanceFromPointsToCenter, Layers layer) {
		this.sides = numberOfSides;
		this.center = centerPoint;
		this.radius = distanceFromPointsToCenter;
		this.equalateral = true;
		this.lineLength = Math.sqrt() Math.pow((distanceFromPointsToCenter - (distanceFromPointsToCenter / Math.cos(360 / numberOfSides))), 2) + ;
		this.polygonLayer = layer;
		
		for (int i = 0; i < numberOfSides; i++) {
			double angle = (360 / numberOfSides) * (i + 1);
			double xLine = 0;
			double yLine = 0;
			if (angle <= 90) {
				xLine = distanceFromPointsToCenter * Math.cos(angle);
				yLine = distanceFromPointsToCenter * Math.sin(angle);
				if (angle == 90) {
					xLine = 0;
					yLine = distanceFromPointsToCenter;
				}
			}
			else if (angle <= 180) {
				xLine = (-1) * distanceFromPointsToCenter * Math.cos(180 - angle);
				yLine = distanceFromPointsToCenter * Math.sin(180 - angle);
				if (angle == 180) {
					xLine = distanceFromPointsToCenter * (-1);
					yLine = 0;
				}
			}
			else if (angle <= 270) {
				xLine = (-1) * distanceFromPointsToCenter * Math.cos(angle - 180);
				yLine = (-1) * distanceFromPointsToCenter * Math.sin(angle - 180);
				if (angle == 270) {
					xLine = 0;
					yLine = distanceFromPointsToCenter * (-1);
				}
			}
			else {
				xLine = distanceFromPointsToCenter * Math.cos(angle + 360);
				yLine = (-1) * distanceFromPointsToCenter * Math.sin(angle + 360);
				if (angle == 360) {
					xLine = distanceFromPointsToCenter;
					yLine = 0;
				}
			}
			Points point = new Points((xLine + centerPoint.xValue), (yLine + centerPoint.yValue), layer);
			this.pointsQueue.add(point);
		}
		
	}
	
	public Polygon(int numberOfSides, double lengthOfSides, Points centerPoint, Layers layer) {
		this.sides = numberOfSides;
		this.lineLength = lengthOfSides;
		this.center = centerPoint;
		this.equalateral = true;
		this.polygonLayer = layer;
		
		double distanceFromPointsToCenter = (lengthOfSides / 2) / (Math.sin((360 / numberOfSides) / 2));
		this.radius = distanceFromPointsToCenter;
		for (int i = 0; i < numberOfSides; i++) {
			double angle = (360 / numberOfSides) * (i + 1);
			double xLine = 0;
			double yLine = 0;
			if (angle <= 90) {
				xLine = distanceFromPointsToCenter * Math.cos(angle);
				yLine = distanceFromPointsToCenter * Math.sin(angle);
				if (angle == 90) {
					xLine = 0;
					yLine = distanceFromPointsToCenter;
				}
			}
			else if (angle <= 180) {
				xLine = (-1) * distanceFromPointsToCenter * Math.cos(180 - angle);
				yLine = distanceFromPointsToCenter * Math.sin(180 - angle);
				if (angle == 180) {
					xLine = distanceFromPointsToCenter * (-1);
					yLine = 0;
				}
			}
			else if (angle <= 270) {
				xLine = (-1) * distanceFromPointsToCenter * Math.cos(angle - 180);
				yLine = (-1) * distanceFromPointsToCenter * Math.sin(angle - 180);
				if (angle == 270) {
					xLine = 0;
					yLine = distanceFromPointsToCenter * (-1);
				}
			}
			else {
				xLine = distanceFromPointsToCenter * Math.cos(360 - angle);
				yLine = (-1) * distanceFromPointsToCenter * Math.sin(360 - angle);
				if (angle == 360) {
					xLine = distanceFromPointsToCenter;
					yLine = 0;
				}
			}
			Points point = new Points((xLine + centerPoint.xValue), (yLine + centerPoint.yValue), layer);
			this.pointsQueue.add(point);
		}
		
	}
	
	public LinkedList<Points> getPointsQueue() {
		return this.pointsQueue;
	}
	
	public void addPoint(Points newPoint) {
		pointsQueue.add(newPoint);
	}
	
	public Points getCenter() {
		return this.center;
	}
	
}
