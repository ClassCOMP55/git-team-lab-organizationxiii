//Programmer: Misbah
//Second Comment
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	public static int SIZE = 700;
	public static final String IMAGE_FILENAME = "tyranocif.png";
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() {
		GImage robot = new GImage("tyranocif.png", 300, 300);
		add(robot);

		GLabel label = new GLabel("Delayer", 200, 300);
		add(label);
	}
	
	public static void main(String[] args) {
		new SimplePicture().start();
	}
}