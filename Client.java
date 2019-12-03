import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;

public class Client extends JPanel {
	private final Image BACKGROUND;
	private final Image PLAY;
	private final Image RESUME;
	private final Image QUIT;
	private final Image OPTION;
	private final Image MUTE;
	private final Image UNMUTE;
	private JFrame frame;
	private JButton playButton = new JButton("I love League of Legends");
	private Game game = new Game();

	public Client() {
		Image background = null, play = null, resume = null, quit = null, option = null, mute = null, unmute = null;
		try {
			background = ImageIO.read(new File("./assets/menu/screenie.png"));
			play = ImageIO.read(new File("./assets/menu/sheep.png"));
			resume = ImageIO.read(new File("./assets/menu/sexy pants.jpg"));
			option = ImageIO.read(new File("./assets/menu/sean+and+michael+are+h8r.png"));
			quit = ImageIO.read(new File("./assets/menu/shirley i guess.png"));
			mute = ImageIO.read(new File("./assets/menu/sheep.png"));
			unmute = ImageIO.read(new File("./assets/menu/screenie.png"));
		} catch (IOException e) {
			System.out.println("Hi Mr Benum");
			e.printStackTrace();
		}
		BACKGROUND = background;
		PLAY = play;
		RESUME = resume;
		QUIT = quit;
		OPTION = option;
		MUTE = mute;
		UNMUTE = unmute;
	}

	public void init() {
		frame = new JFrame("Video Game");
		// frame.getContentPane().add(new Client(), BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		setLayout(null);
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent ce) {
				resize();
			}
		});
		playButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ss");
				game.start();
			}
		});
		add(playButton);
		frame.add(this);
		frame.setVisible(true);
		game.initialize();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(BACKGROUND, 0, 0, null);
	}

	private void resize() {
		Rectangle r = frame.getBounds();
		int h = r.height;
		int w = r.width;
		playButton.setBounds(w / 2 - 300, h / 3 + h / 3 - 150, 600, 100);
	}
}
