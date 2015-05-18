package hello;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingFrame extends JFrame{
	  public static void main( String args[] ) {
			JFrame win = new JFrame( "My First GUI Program" );
			JLabel label = new JLabel( "Hello Bao Ngan" );
			win.setBounds(30, 30, 300, 300); 
			win.getContentPane().add( label );

			win.setVisible(true);
		    }
}
