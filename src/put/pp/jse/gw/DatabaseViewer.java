package put.pp.jse.gw;

import java.awt.BorderLayout;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class DatabaseViewer extends JFrame implements MouseListener{
 
	public DatabaseViewer()
	{
			super("Database Viewer");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			addMouseListener(this);
			initComponents();
	}
	
	
	
	public void initComponents()
	{
		
		BorderLayout borderLayout = new BorderLayout();
        JButton n = new JButton("Wyczyœæ"), s = new JButton("Wykonaj");
        JTextArea textArea = new JTextArea(5,10);
        
        
        //Point p = MouseInfo.getPointerInfo().getLocation();
        
        
        JLabel l = new JLabel("Pozycja kursora: " + "x=" + MouseInfo.getPointerInfo().getLocation().x + ", y=" + MouseInfo.getPointerInfo().getLocation().y);
    
        setLayout(borderLayout);
        add(n);
        add(s);
        add(l);
        add(textArea);
       
        borderLayout.addLayoutComponent(l, BorderLayout.NORTH);
        borderLayout.addLayoutComponent(n, BorderLayout.WEST);
        borderLayout.addLayoutComponent(textArea, BorderLayout.CENTER);
        borderLayout.addLayoutComponent(s, BorderLayout.EAST);
        pack();     
		setSize(500,500);
		setLocation(400,200);
		
		
	}
	
	
	public static void main (String args []) {
		java.awt.EventQueue.invokeLater(new Runnable() {
		@Override
		public void run () {
		new DatabaseViewer().setVisible(true);
		}
		} ) ;
		
		}
	
	 public void mousePressed(MouseEvent e) {
	       
	    }
	 
	public void mouseReleased(MouseEvent e) {
	       
	    }
	
	public void mouseExited(MouseEvent e) {
	       
	    }
	
	public void mouseEntered(MouseEvent e) {
	       
	    }
	
	public void mouseClicked(MouseEvent e) {
	       
	    }
	
	public void mouseDragged(MouseEvent e) {
	       
 }
	
	public void mouseMoved(MouseEvent e) {
	       
		int x=e.getX();
	    int y=e.getY();
	    //System.out.println(x+","+y);
	    }
}

