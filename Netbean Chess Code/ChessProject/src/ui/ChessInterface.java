package ui;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;

import board.Board;
import board.Move;
import player.MoveTransition;

public class ChessInterface
{
   static BorderPane mainPane = new BorderPane();
   static GridPane board = new GridPane();
   static StackPane[] tiles = new StackPane[64];
   static enum Piece
   {
      BLACK_PAWN, BLACK_KNIGHT, BLACK_BISHOP, BLACK_ROOK, BLACK_QUEEN, BLACK_KING,
      WHITE_PAWN, WHITE_KNIGHT, WHITE_BISHOP, WHITE_ROOK, WHITE_QUEEN, WHITE_KING, EMPTY
   };
   
   static TileData[] data = new TileData[64];

   public static BorderPane constructInterface() //TODO: Add all UI elements to the main pane
   {
      mainPane.setCenter(board);
      constructBoard();
      addData();
      addStartPieces();
      test();
      
      //mainPane.setRight(PANE);
      //mainPane.setLeft(PANE);
      //mainPane.setTop(PANE);
      //mainPane.setBottom(PANE);
      
      return mainPane;
   }
   
   //Adds tiles to the GridPane board
   private static void constructBoard()
   {
      int colNum = 0;
      int rowNum = 0;
	   for (int i = 0; i <= 63; i++)
	      {
	        	StackPane stackPane = new StackPane();
               
	        	tiles[i] = stackPane; //put StackPanes into the StackPane[][] array. (required to initialize)
            tiles[i].setOnMousePressed(new EventHandler<MouseEvent>() //TODO: Proper mouse event on click
            {
               public void handle(MouseEvent me) 
               {
                  System.out.println("Mouse pressed");
               }
            }); 

	        	Rectangle rect = new Rectangle(50, 50);
	        	if ((colNum + rowNum) % 2 == 0)
	        		rect.setFill(new Color(1,.98,.89,1)); //white tiles
	        	else
	        		rect.setFill(new Color(.5,.5,.5,1)); //black tiles

	        	board.add(rect, colNum, rowNum);//fill the board with squares
            board.add(tiles[i], colNum, rowNum);//fill the board with panes
            if (colNum == 7)
            {
               rowNum++;
               colNum = 0;
            }
            else
               colNum++;
	      }
   }
   
   //Adds data to each tile on the chess board
   public static void addData()
   {
      for (int i = 0; i <= 63; i++)
      {
         switch (i)
         {
            case 0: case 7: data[i] = new ChessInterface().new TileData(i, Piece.BLACK_ROOK);
            break;
            case 1: case 6: data[i] = new ChessInterface().new TileData(i, Piece.BLACK_KNIGHT);
            break;
            case 2: case 5: data[i] = new ChessInterface().new TileData(i, Piece.BLACK_BISHOP);
            break;
            case 3: data[i] = new ChessInterface().new TileData(i, Piece.BLACK_QUEEN);
            break;
            case 4: data[i] = new ChessInterface().new TileData(i, Piece.BLACK_KING);
            break;
            case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: data[i] = new ChessInterface().new TileData(i, Piece.BLACK_PAWN);
            break;
            case 48: case 49: case 50: case 51: case 52: case 53: case 54: case 55: data[i] = new ChessInterface().new TileData(i, Piece.WHITE_PAWN);
            break;
            case 56: case 63: data[i] = new ChessInterface().new TileData(i, Piece.WHITE_ROOK);
            break;
            case 57: case 62: data[i] = new ChessInterface().new TileData(i, Piece.WHITE_KNIGHT);
            break;
            case 58: case 61: data[i] = new ChessInterface().new TileData(i, Piece.WHITE_BISHOP);
            break;
            case 59: data[i] = new ChessInterface().new TileData(i, Piece.WHITE_QUEEN);
            break;
            case 60: data[i] = new ChessInterface().new TileData(i, Piece.WHITE_KING);
            break;
            default: data[i] = new ChessInterface().new TileData(i, Piece.EMPTY);
            break;
         }
      }
   }
   
   //Adds pieces to their original positions on the board.
   public static void addStartPieces() 
   {  
      for (int i = 0; i <= 63; i++)
      {
         Piece p = data[i].getPiece();
         if (!p.equals(Piece.EMPTY))
            tiles[i].getChildren().add(getPieceImage(p));
      }  
   }
   
   //Removes all pieces on the board
   public static void clearAllPieces()
   {
      for (int i = 0; i <= 63; i++)
         tiles[i].getChildren().clear();
   }
   
   //Adds a piece to position i on the board
   private static void addPiece(int i, Piece p)
   {
      tiles[i].getChildren().add(getPieceImage(p));
      data[i].setPiece(p);
   }
   
   //Removes pieces from position i and j on the board (used to move a piece from position i to position j by using the addPiece method)
   private static void clearPieces(int i, int j)
   {
      tiles[i].getChildren().clear();
      tiles[j].getChildren().clear();
      data[i].setPiece(Piece.EMPTY);
      data[j].setPiece(Piece.EMPTY);
   }
   
   //get the image that is used in the board data of the corresponding piece
   public static ImageView getPieceImage(Piece p)
   {
      ImageView iv = new ImageView(new Image("./images/Black_Pawn.png")); //TODO: change this to an error image (this image would show up if an empty space was given an image)
      switch (p)
      {
         case BLACK_PAWN: iv = new ImageView(new Image ("./images/Black_Pawn.png"));
         break;
         case BLACK_ROOK: iv = new ImageView(new Image("./images/Black_Rook.png"));
         break;
         case BLACK_KNIGHT: iv = new ImageView(new Image("./images/Black_Knight.png"));
         break;
         case BLACK_BISHOP: iv = new ImageView(new Image("./images/Black_Bishop.png"));
         break;
         case BLACK_QUEEN: iv = new ImageView(new Image("./images/Black_Queen.png"));
         break;
         case BLACK_KING: iv = new ImageView(new Image("./images/Black_King.png"));
         break;
         case WHITE_PAWN: iv = new ImageView(new Image("./images/White_Pawn.png"));
         break;
         case WHITE_ROOK: iv = new ImageView(new Image("./images/White_Rook.png"));
         break;
         case WHITE_KNIGHT: iv = new ImageView(new Image("./images/White_Knight.png"));
         break;
         case WHITE_BISHOP: iv = new ImageView(new Image("./images/White_Bishop.png"));
         break;
         case WHITE_QUEEN: iv = new ImageView(new Image("./images/White_Queen.png"));
         break;
         case WHITE_KING: iv = new ImageView(new Image("./images/White_King.png"));
         break;
      }
      return iv;
   }
   
   public static void test()
   {
      //testing creating and printing board
      Board board = Board.createStandardBoard(); 
      System.out.println("Original Board");
      System.out.println(board);
        
      //testing moving pieces on board
      int moveStart = 55;
      int moveEnd = 47;
      
      Move move = Move.MoveFactory.createMove(board, moveStart, moveEnd); //can also make 55, 39
      MoveTransition transition = board.currentPlayer().makeMove(move);
      if(transition.getMoveStatus().isDone()){
         Piece p = data[moveStart].getPiece();
         board = transition.getTransitionBoard();
         clearPieces(moveStart, moveEnd);
         addPiece(moveEnd, p);
      }
      System.out.println("Board after moving pawn from h2 to h3");
      System.out.println(board);
   }

   
   //Data class that holds positions and the piece in that position
   class TileData
   {
      int coordinate;
      Piece piece;
      
      public TileData()
      {
         coordinate = 0;
         piece = Piece.EMPTY;
      }
      
      public TileData(int coordinate, Piece piece)
      {
         this.coordinate = coordinate;
         this.piece = piece;
      }
      
      public void setPiece(Piece p)
      {
         piece = p;
      }
      
      public Piece getPiece()
      {
         return piece;
      }
      
      //TODO remove test method
      public void makeWords()
      {
         System.out.println(coordinate + " " + piece);
      }
   }
}