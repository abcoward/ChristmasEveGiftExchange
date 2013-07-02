import javax.swing.JFrame;
public class Main {

	public static void main(String[] args) {
		
		Gui Window = new Gui();
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.setSize(400,450);
		Window.setVisible(true);
		Window.setResizable(false);
		Window.setLocationRelativeTo(null);

	}

}
