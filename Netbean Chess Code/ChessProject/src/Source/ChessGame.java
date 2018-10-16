package Source;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ui.ChessInterface;

public class ChessGame extends Application
{
	public void start (Stage mainStage)
	{  
	   Scene scene = new Scene(ChessInterface.constructInterface());
	   mainStage.setTitle("Chess");
	   mainStage.setScene(scene);
	   mainStage.show();
      
      
        //test methods
        //ChessInterface.clearAllPieces();
        //ChessInterface.addStartPieces();
	}

	public static void main(String [] args)
	{
	    Application.launch(args);
	}
}