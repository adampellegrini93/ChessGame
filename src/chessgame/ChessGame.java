package chessgame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChessGame extends Application
{
	static StackPane[][] tile = new StackPane[8][8];
	public void start (Stage mainStage)
		{
	    	GridPane gamePane = new GridPane();
	      
	    	for (int colNum = 0; colNum < 8; colNum++)
	         for (int rowNum = 0; rowNum < 8; rowNum++)
	         {
	        	 StackPane stack = new StackPane();
	        	 tile[colNum][rowNum] = stack; //put StackPanes into the array.
	            
	        	 Rectangle rect = new Rectangle(50, 50); //board pieces
	        	 if ((rowNum + colNum)%2 == 0)
	        		 rect.setFill(Color.WHITE);
	        	 else
	        		 rect.setFill(Color.BLACK);

	        	 tile[colNum][rowNum].getChildren().add(rect);
	        	 gamePane.add(tile[colNum][rowNum], colNum, rowNum);
	         }
	         
	    	Scene scene = new Scene(gamePane);
	    	mainStage.setTitle("Chess");
	    	mainStage.setScene(scene);
	    	mainStage.show();
	    }
	   
	public static StackPane[][] getTiles()//get the entire 2d array of chess tiles
	{
		return tile;
	}
	
	public static void main(String [] args)
	{
	    Application.launch(args);
	}
}