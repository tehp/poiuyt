package poiuyt;

import java.net.URL;

import javax.swing.*;

@SuppressWarnings("serial")
public class MainTest extends JFrame { 
//JFrame frame = new JFrame("poiuyt");
URL iconURL = getClass().getResource("/resources/img/poiuyt_icon.png");	
ImageIcon icon = new ImageIcon(iconURL);
					
		public MainTest(){
			super("poiuyt");
			setDefaultLookAndFeelDecorated(true);
			
			setSize(300,300);
			setIconImage(icon.getImage());
			
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
		
	

}
		public static void main(String[] args){
			new MainTest();
		}
}
