package com.Swing;

import javax.swing.JFrame;

public class FrameDemo extends JFrame {
	public FrameDemo(String title) {
		super(title);
	}

	public static void main(String[] args) {
		FrameDemo fd=new FrameDemo("First frame");
		fd.setVisible(true);
		fd.setSize(300,600);
	}

}
