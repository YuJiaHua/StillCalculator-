//U10213035虞家樺

//Import all Function
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class StillCalculator extends Application{
	
	public void start (Stage primaryStage) {
		//Add GridPane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		//Constructs a new Insets instance with four different border distance
		pane.setPadding(new Insets(-5,-4, 10, -4));
		//The width of the horizontal gaps between columns
		pane.setHgap(10);
		//The height of the vertical gaps between rows
		pane.setVgap(10);
		
		//Creates a TextField with empty text content
		TextField tf = new TextField();
		//Indicates whether this TextInputControl can be edited by the user
		tf.setEditable(false);
		//Creates Buttons
 		Button bt1 = new Button("MC");
		Button bt2 = new Button("MR");
		Button bt3 = new Button("M+");
		Button bt4 = new Button("M-");
		Button bt5 = new Button("MS");
		Button bt6 = new Button("M^");
		Button bt7 = new Button("7");
		Button bt8 = new Button("8");
		Button bt9 = new Button("9");
		Button bt10 = new Button("+");
		Button bt11 = new Button("CE");
		Button bt12 = new Button("C");
		Button bt13 = new Button("4");
		Button bt14 = new Button("5");
		Button bt15 = new Button("6");
		Button bt16 = new Button("-");
		Button bt17 = new Button("x^2");
		Button bt18 = new Button("1/x");
		Button bt19 = new Button("1");
		Button bt20 = new Button("2");
		Button bt21 = new Button("3");
		Button bt22 = new Button("*");
		Button bt23 = new Button("√");
		Button bt24 = new Button("%");
		Button bt25 = new Button("+-");
		Button bt26 = new Button("0");
		Button bt27 = new Button(".");
		Button bt28 = new Button("/");
		Button bt29 = new Button("←");
		Button bt30 = new Button("=");

		//Add Button and TextField from pane
		pane.add(tf,1,1,6,1);
		pane.add(bt1,1,2);
		pane.add(bt2,2,2);
		pane.add(bt3,3,2);
		pane.add(bt4,4,2);
		pane.add(bt5,5,2);
		pane.add(bt6,6,2);
		pane.add(bt7,1,3);
		pane.add(bt8,2,3);
		pane.add(bt9,3,3);
		pane.add(bt10,4,3);
		pane.add(bt11,5,3);
		pane.add(bt12,6,3);
		pane.add(bt13,1,4);
		pane.add(bt14,2,4);
		pane.add(bt15,3,4);
		pane.add(bt16,4,4);
		pane.add(bt17,5,4);
		pane.add(bt18,6,4);
		pane.add(bt19,1,5);
		pane.add(bt20,2,5);
		pane.add(bt21,3,5);
		pane.add(bt22,4,5);
		pane.add(bt23,5,5);
		pane.add(bt24,6,5);
		pane.add(bt25,1,6);
		pane.add(bt26,2,6);
		pane.add(bt27,3,6);
		pane.add(bt28,4,6);
		pane.add(bt29,5,6);
		pane.add(bt30,6,6);		

		//Set Button's size
		bt1.setPrefSize(50, 50);
		bt2.setPrefSize(50, 50);
		bt3.setPrefSize(50, 50);
		bt4.setPrefSize(50, 50);
		bt5.setPrefSize(50, 50);
		bt6.setPrefSize(50, 50);
		bt7.setPrefSize(50, 50);
		bt8.setPrefSize(50, 50);
		bt9.setPrefSize(50, 50);
		bt10.setPrefSize(50, 50);
		bt11.setPrefSize(50, 50);
		bt12.setPrefSize(50, 50);
		bt13.setPrefSize(50, 50);
		bt14.setPrefSize(50, 50);
		bt15.setPrefSize(50, 50);
		bt16.setPrefSize(50, 50);
		bt17.setPrefSize(50, 50);
		bt18.setPrefSize(50, 50);
		bt19.setPrefSize(50, 50);
		bt20.setPrefSize(50, 50);
		bt21.setPrefSize(50, 50);
		bt22.setPrefSize(50, 50);
		bt23.setPrefSize(50, 50);
		bt24.setPrefSize(50, 50);
		bt25.setPrefSize(50, 50);
		bt26.setPrefSize(50, 50);
		bt27.setPrefSize(50, 50);
		bt28.setPrefSize(50, 50);
		bt29.setPrefSize(50, 50);
		bt30.setPrefSize(50, 50);
		
		//Creates a new empty MenuBar
		MenuBar mb = new MenuBar();
		//Constructs a Menu and sets the display text with the specified text.
		Menu m1 = new Menu("檢視");
		Menu m2 = new Menu("編輯");
		Menu m3 = new Menu("說明");
		
		//Add Menu from MenuBar
		mb.getMenus().addAll(m1,m2,m3);
		pane.add(mb,0,0,8,1);
		
		//Creates a Scene for a specific root Node
		Scene scene = new Scene(pane);
		//Defines whether the Stage is do not to resizable by the user
		primaryStage.setResizable(false);
		//Set title from the window 
		primaryStage.setTitle("StillCalculator");
		//Add Scene from the window
		primaryStage.setScene(scene);
		//Show the Scene
		primaryStage.show();
	}
}
