package chessgame;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ChessGame extends Application
{
	public void start (Stage mainStage)
	{  
	   Scene scene = new Scene(ChessInterface.constructInterface());
	   mainStage.setTitle("Chess");
	   mainStage.setScene(scene);
	   mainStage.show();
      
	   //ChessInterface.clearPieces();     //method test 
	   //ChessInterface.addPieces();
	}

	public static void main(String [] args)
	{
	    Application.launch(args);
	}
}
