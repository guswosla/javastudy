import javax.swing.*;
import java. awt.*;
import java. awt.event.*;

public class gamemain extends JFrame implements keyListener {
gameview gv=new gameview();

	public gamemain()
	{
		add("Center", gv);
		setSize(800,600);
		setVisible(true);
		addkeyListener(this);
	}

	if(gv.y<0)
		 gv.y=768;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new gamemain();
		
		
	}

}
