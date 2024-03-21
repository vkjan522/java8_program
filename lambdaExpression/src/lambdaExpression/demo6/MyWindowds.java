package lambdaExpression.demo6;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyWindowds {

	public static void main(String[] args) {
		JFrame frame = new JFrame("My Window");
		frame.setSize(400, 400);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("Click me!");
		button.addActionListener((ActionEvent e) -> {
			System.out.println("Button Clicked!");
			JOptionPane.showMessageDialog(null, "Hello, Girls!");
		});
		button.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("Hello, Mouse Moved!!");
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("Hello, Mouse Dragged!!");
				
			}
		});
		frame.add(button);
		frame.setVisible(true);

	}

}
