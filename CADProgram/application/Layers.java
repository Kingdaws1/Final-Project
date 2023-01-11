package application;

public class Layers {
	public String name;
	public String color;
	public boolean visible;
	public String lineType;
	public double lineWidth;
	
	public Layers() {
		
	}
	
	public Layers(String newName, String newColor, boolean isVisible, String newLineType, double newLineWidth) {
		this.name = newName;
		this.color = newColor;
		this.visible = isVisible;
		this.lineType = newLineType;
		this.lineWidth = newLineWidth;
	}
	
	public String getLayerName() {
		return this.name;
	}
	
	public void setLayerName(String newName) {
		this.name = newName;
	}
	
	public String getLayerColor() {
		return this.color;
	}
	
	public void setLayerColor(String newColor) {
		this.color = newColor;
	}
	
	public boolean getLayerVisible() {
		return this.visible;
	}
	
	public void setLayerVisible(boolean isVisible) {
		this.visible = isVisible;
	}
	
	public String getLayerLineType() {
		return this.lineType;
	}
	
	public void setLayerLineType(String newLineType) {
		this.lineType = newLineType;
	}
	
	public double getLayerLineWidth() {
		return this.lineWidth;
	}
	
	public void setLayerLineWidth(double newLineWidth) {
		this.lineWidth = newLineWidth;
	}
	
}

