import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

class MainFile extends JFrame implements ActionListener
{
	JButton encode,decode,exit;
	public MainFile()
	{
		setTitle("Select Option");
		JPanel jp = (JPanel)getContentPane();
		jp.setLayout(new GridLayout(1,3));
		encode = new JButton("Encode");
		decode = new JButton("Decode");
		exit = new JButton("Exit");
		encode.addActionListener(this);
		decode.addActionListener(this);
		exit.addActionListener(this);
		jp.add(encode);
		jp.add(decode);
		jp.add(exit);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(900,300);
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);   
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)	
	{
		if (ae.getSource() == encode)
		{
			new EmbedMessage();
		}
		else if(ae.getSource() == decode)
		{
			new DecodeMessage();
		}
		else
		{
			System.exit(0);
		}
	}
	public static void main(String args[])throws Exception
	{
		MainFile f = new MainFile();
	}
}