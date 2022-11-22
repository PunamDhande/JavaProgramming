
package com.Swing;

import java.awt.*;

import javax.swing.*;

public class JButtonexample extends JFrame {

	JButtonexample()
	{
		setLayout(new FlowLayout());
		JButton btok=new JButton("Ok");
		ImageIcon icon=new ImageIcon("check.png");
		JButton bticon=new JButton(icon);
		JButton btTxtIcon=new JButton("OK",icon);
		add(btok);
		add(bticon);
		add(btTxtIcon);
		
	}	
	class JButtonJavaExample{
	
	public static void main(String[] args) {
JButtonexample frame=new JButtonexample();
frame.setTitle("JButton in Java Swing Example");
	frame.setBounds(200,250,300,100);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	
	}
	}

}


