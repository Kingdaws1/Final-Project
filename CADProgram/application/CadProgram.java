package application;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Border;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

public class CadProgram extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		BorderPane mainWindow = new BorderPane();
		VBox topControls = new VBox();
		
		MenuBar topMenu = new MenuBar();
		
		Menu menuFile = new Menu("File");
		MenuItem newProject = new MenuItem("New Project");
		MenuItem saveProject = new MenuItem("Save");
		MenuItem saveAsProject = new MenuItem("Save As");
		MenuItem printProject = new MenuItem("Print");
		MenuItem quitProject = new MenuItem("Quit");
		menuFile.getItems().addAll(newProject, saveProject, saveAsProject, printProject, quitProject);
		topMenu.getMenus().add(menuFile);
		
		Menu menuEdit = new Menu("Edit");
		MenuItem undoOption = new MenuItem("Undo");
		MenuItem projectSettingsOption = new MenuItem("Project Settings");
		MenuItem printLayoutOption = new MenuItem("Print Layout");
		menuEdit.getItems().addAll(undoOption, projectSettingsOption, printLayoutOption);
		topMenu.getMenus().add(menuEdit);
		
		Menu menuWindow = new Menu("Window");		
		MenuItem showLayersList = new MenuItem("Show Layers List");
		MenuItem showPropertiesWindow = new MenuItem("Show Properties Window");
		MenuItem showGridLines = new MenuItem("Show Grid Lines");
		MenuItem showCursorCoordinates = new MenuItem("Show Cursor Coordinates");
		MenuItem showSnapOptionsBar = new MenuItem("Show Snap Options Bar");
		MenuItem showViewControlBar = new MenuItem("Show View Control Bar");
		MenuItem showScaleBar = new MenuItem("Show Scale Bar");
		MenuItem showNorthArrow = new MenuItem("Show North Arrow");
		menuWindow.getItems().addAll(showLayersList, showPropertiesWindow, showGridLines, showCursorCoordinates, showSnapOptionsBar, showViewControlBar, showScaleBar, showNorthArrow);
		topMenu.getMenus().add(menuWindow);
		
		Menu helpOption = new Menu("Help");
		topMenu.getMenus().add(helpOption);
		
		topControls.getChildren().add(topMenu);
		
		mainWindow.setTop(topControls);
		
		
		MenuBar basicTools = new MenuBar();
		
		Menu pointMenu = new Menu();
		ImageView pointGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\pointGraphic.png");
		pointMenu.setGraphic(pointGraphic);
		basicTools.getMenus().add(pointMenu);
		
		Menu lineMenu = new Menu();
		ImageView lineGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\lineGraphic.png");
		lineMenu.setGraphic(lineGraphic);
		basicTools.getMenus().add(lineMenu);
		
		Menu arcMenu = new Menu();
		ImageView arcGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\arcGraphic.png");
		arcMenu.setGraphic(arcGraphic);
		basicTools.getMenus().add(arcMenu);
		
		Menu circleMenu = new Menu();
		ImageView circleGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\circleGraphic.png");
		circleMenu.setGraphic(circleGraphic);
		basicTools.getMenus().add(circleMenu);
		
		Menu ellipseMenu = new Menu();
		ImageView ellipseGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\ellipseGraphic.png");
		ellipseMenu.setGraphic(ellipseGraphic);
		basicTools.getMenus().add(ellipseMenu);
		
		Menu polygonMenu = new Menu();
		ImageView polygonGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\polygonGraphic.png");
		polygonMenu.setGraphic(polygonGraphic);
		basicTools.getMenus().add(polygonMenu);
		
		Menu hatchMenu = new Menu();
		ImageView hatchGraphic = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\hatchGraphic.png");
		hatchMenu.setGraphic(hatchGraphic);
		basicTools.getMenus().add(hatchMenu);
		
		topControls.getChildren().add(basicTools);
		
		
		GridPane propertiesWindow = new GridPane();
		propertiesWindow.setHgap(20);
		propertiesWindow.setVgap(10);
		
		Label propertiesLbl = new Label("Properties:");
		propertiesWindow.add(propertiesLbl, 0, 0);
		
		Label propertyLayer = new Label("Layer: ");
		propertiesWindow.add(propertyLayer, 0, 1);
		ComboBox<Label> layerCBox = new ComboBox<Label>();
		layerCBox.getItems().add(new Label("Layer0"));
		layerCBox.getItems().add(new Label("Add New Layer"));
		propertiesWindow.add(layerCBox, 1, 1);
		
		Label propertyPosition = new Label("Position: ");
		propertiesWindow.add(propertyPosition, 0, 2);
		TextField positionTxtFld = new TextField();
		propertiesWindow.add(positionTxtFld, 1, 2);
		
		mainWindow.setLeft(propertiesWindow);
		
		
		Pane modelView = new Pane();
		
		modelView.setMinHeight(400);
		modelView.setMinWidth(400);
		modelView.setBorder(Border.stroke(Color.BLACK) );
		
		mainWindow.setCenter(modelView);
		
		
		GridPane layersWindow = new GridPane();
		layersWindow.setHgap(20);
		layersWindow.setVgap(10);
		
		Label layersWindowLbl = new Label("Layers:");
		layersWindow.add(layersWindowLbl, 0, 0);
		
		ArrayList<Layers> layersList = new ArrayList<Layers>();
		layersList.add(new Layers("layer0", "Color.BLACK", true, "solid", 1.0));
		for (int i = 0; i < layersList.size(); i++) {
			Label layerName =new Label(layersList.get(i).getLayerName());
			layersWindow.setColumnIndex(layerName, 1);
			layersWindow.setRowIndex(layerName, i + 1);
			layersWindow.getChildren().add(layerName);
			if (layersList.get(i).visible) {
				Label isVisibleCheckmark = new Label();
				ImageView checkmark = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\checkGraphic.png");
				isVisibleCheckmark.setGraphic(checkmark);
				layersWindow.setColumnIndex(isVisibleCheckmark, 0);
				layersWindow.setRowIndex(isVisibleCheckmark, i + 1);
				layersWindow.getChildren().add(isVisibleCheckmark);
			}
			else {
				Label isntVisibleCheckmark = new Label();
				ImageView uncheckmark = new ImageView("C:\\Users\\dawso\\Documents\\CADProgramGraphics\\uncheckGraphic.png");
				isntVisibleCheckmark.setGraphic(uncheckmark);
				layersWindow.setColumnIndex(isntVisibleCheckmark, 0);
				layersWindow.setRowIndex(isntVisibleCheckmark, i + 1);
				layersWindow.getChildren().add(isntVisibleCheckmark);
			}
		}
		
		mainWindow.setRight(layersWindow);
		
		
		Scene scene = new Scene(mainWindow);
		primaryStage.setTitle("CADProgram");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
