package chessgame;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ChessInterface
{
   static BorderPane mainPane = new BorderPane();
   static GridPane board = new GridPane();
   static StackPane[][] tile = new StackPane[8][8];
   
   public static BorderPane constructInterface()//Add everything to the main pane
   {
      mainPane.setCenter(board);
      constructBoard();
      addPieces();
      
      //mainPane.setRight(PANE);
      //mainPane.setLeft(PANE);
      //mainPane.setTop(PANE);
      //mainPane.setBottom(PANE);
      
      return mainPane;
   }
   
   private static void constructBoard()//Add tiles to the GridPane board
   {
	   for (int colNum = 0; colNum < 8; colNum++)
	      for (int rowNum = 0; rowNum < 8; rowNum++)
	         {
	        	   StackPane stack = new StackPane();
	        	   tile[colNum][rowNum] = stack; //put StackPanes into the array. (this is necessary)

	        	   Rectangle rect = new Rectangle(50, 50); //board pieces
	        	   if ((rowNum + colNum)%2 == 0)
	        		   rect.setFill(new Color(1,.98,.89,1));
	        	   else
	        		   rect.setFill(new Color(.5,.5,.5,1));

	        	   board.add(rect, colNum, rowNum);//fill the board with squares
               board.add(tile[colNum][rowNum], colNum, rowNum);//fill the board with tile arrays
	         }
      
   }
   
   public static void addPieces() //add pieces to their normal positions on the board
   {      
      for (int i = 0; i < 8; i++)
         tile[i][1].getChildren().add(new ImageView(new Image ("./images/Black_Pawn.png")));
         
      tile[0][0].getChildren().add(new ImageView(new Image("./images/Black_Rook.png")));
      tile[1][0].getChildren().add(new ImageView(new Image("./images/Black_Knight.png")));
      tile[2][0].getChildren().add(new ImageView(new Image("./images/Black_Bishop.png")));
      tile[3][0].getChildren().add(new ImageView(new Image("./images/Black_Queen.png")));
      tile[4][0].getChildren().add(new ImageView(new Image("./images/Black_King.png")));
      tile[5][0].getChildren().add(new ImageView(new Image("./images/Black_Bishop.png")));
      tile[6][0].getChildren().add(new ImageView(new Image("./images/Black_Knight.png")));
      tile[7][0].getChildren().add(new ImageView(new Image("./images/Black_Rook.png")));
      
      for (int i = 0; i < 8; i++)
         tile[i][6].getChildren().add(new ImageView(new Image ("./images/White_Pawn.png")));
         
      tile[0][7].getChildren().add(new ImageView(new Image("./images/White_Rook.png")));
      tile[1][7].getChildren().add(new ImageView(new Image("./images/White_Knight.png")));
      tile[2][7].getChildren().add(new ImageView(new Image("./images/White_Bishop.png")));
      tile[3][7].getChildren().add(new ImageView(new Image("./images/White_Queen.png")));
      tile[4][7].getChildren().add(new ImageView(new Image("./images/White_King.png")));
      tile[5][7].getChildren().add(new ImageView(new Image("./images/White_Bishop.png")));
      tile[6][7].getChildren().add(new ImageView(new Image("./images/White_Knight.png")));
      tile[7][7].getChildren().add(new ImageView(new Image("./images/White_Rook.png")));  
   }
   
   public static void clearPieces() //remove all pieces on the board
   {
      for (int colNum = 0; colNum < 8; colNum++)
	      for (int rowNum = 0; rowNum < 8; rowNum++)
	         tile[colNum][rowNum].getChildren().clear();
   }
   
   public static BorderPane getMainPane()//get the entire pane
   {
      return mainPane;
   }
   
   public static GridPane getBoard()//get the board pane
   {
      return board;
   }
   
   public static StackPane[][] getTiles()//get the entire 2d array of chess pieces
	{
	   return tile;
	}
}
