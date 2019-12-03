import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Client2 extends Application{
	
	public void start(Stage clientStage) throws Exception {
		Image BACKGROUND;
		Image PLAY;
		Image RESUME;
		Image QUIT;
		Image OPTION;
		Image MUTE;
		Image UNMUTE;
		ImageView playButton; 
		ImageView quitButton;
		Image background = null, play = null, resume = null, quit = null, option = null, mute = null, unmute = null;
		background = new Image("file:assets/menu/screenie.png");
		play = new Image("file:assets/menu/playButton.png");
		resume = new Image("file:assets/menu/sexy pants.jpg");
		option = new Image("file:assets/menu/sean+and+michael+are+h8r.png");
		quit = new Image("file:assets/menu/quitButton.png");
		mute = new Image("file:assets/menu/sheep.png");
		unmute = new Image("file:assets/menu/screenie.png");
		BACKGROUND = background;
		PLAY = play;
		RESUME = resume;
		QUIT = quit;
		OPTION = option;
		MUTE = mute;
		UNMUTE = unmute;
		
		playButton = new ImageView(play);
		quitButton = new ImageView(quit);
		Group group = new Group();
		Scene scene = new Scene(group, 800, 600);
		clientStage.setScene(scene);
		clientStage.show();
		playButton.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("Welcome to League of Legends");
				clientStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
				clientStage.setFullScreen(true);
				clientStage.show();
			}
		});
		quitButton.setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.exit(0);
			}
		});
        playButton.setLayoutY(scene.getHeight()/3 * 2 - QUIT.getHeight()/2);
        playButton.setLayoutX(scene.getWidth()/2 - QUIT.getWidth()/2);
        quitButton.setOpacity(100);
        quitButton.setLayoutY(scene.getHeight()/2 * 2 - PLAY.getHeight()/3);
        quitButton.setLayoutX(scene.getWidth()/2 - PLAY.getWidth()/2);
        group.getChildren().add(quitButton);
        group.getChildren().add(playButton);
	}
	public void initialize() {
		launch(new String [] {});
	}
}
