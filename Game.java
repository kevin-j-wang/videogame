import java.util.concurrent.atomic.AtomicReference;

import javafx.application.*;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Game extends Application {
	private volatile AtomicReference<Stage>stage = new AtomicReference<>();

	@Override
	public void start(Stage stage) throws Exception {
		Canvas canvas = new Canvas(800, 600);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		Group group = new Group(canvas);
		Scene scene = new Scene(group);
		stage.setScene(scene);
		gc.fillRect(10, 10, 10, 10);
		this.stage.set(stage);
	}

	public synchronized void start() {
		System.out.println(stage);
		stage.get().show();
	}

	public void hide() {
		stage.get().hide();
	}

	public void initialize() {
		try {
			launch(new String[] {});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
