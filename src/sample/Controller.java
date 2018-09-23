package sample;


import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Controller
{
	@FXML private Pane topCenter;
	@FXML private Pane middleCenter;
	@FXML private Pane bottomCenter;
	@FXML private Pane upperLeft;
	@FXML private Pane upperRight;
	@FXML private Pane lowerLeft;
	@FXML private Pane lowerRight;
	@FXML private Button rollButton;
	private List<DiceFace> rollList = new ArrayList<>();


	@FXML void initialize()
	{
		assert topCenter != null : "fx:id=\"topCenter\" was not injected: check your FXML file 'sample.fxml'.";
		assert middleCenter != null : "fx:id=\"middleCenter\" was not injected: check your FXML file 'sample.fxml'.";
		topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
		middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
		bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
		upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
		upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
		lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
		lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );

		for( int i = 1; i < 7; i++ )
		{
			rollList.add( new DiceFace( i ) );
		}

		rollButton.setOnAction( e ->
			rollDice() );
	}


	@FXML private void rollDice()
	{
		Random rand = new java.util.Random();
		rollList.get( rand.nextInt( 6 ) ).execute();
	}


	class DiceFace
	{
		private int number;


		DiceFace( int num )
		{
			number = num;
		}


		private void execute()
		{
			switch( number )
			{
				case 1:
					topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					break;
				case 2:
					topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					break;
				case 3:
					topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					break;
				case 4:
					topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					break;
				case 5:
					topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					break;
				case 6:
					topCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					middleCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					bottomCenter.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					upperRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Blue" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerLeft.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					lowerRight.setBackground( new Background( new BackgroundFill( Color.valueOf( "Red" ), CornerRadii.EMPTY, Insets.EMPTY ) ) );
					break;
				default:
					break;
			}
		}
	}
}
