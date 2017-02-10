import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Lab3Exercises
{
	public static void main(String[] args)
	{
		
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		JFrame myFrame = new JFrame("Edgardo");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation((int)(dimension.getWidth()/2)-(myFrame.getWidth()/2) , (int)(dimension.getHeight()/2)-
				myFrame.getHeight()/2);
		myFrame.setSize(300, 300);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}