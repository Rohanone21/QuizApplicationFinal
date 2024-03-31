package QuizProjectsJava;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	//private static final ActionListener ActionListener = null;
	JButton next,back;
	JTextField tfname;
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
      
        ImageIcon icon = new ImageIcon("src/icons/icon1.jpg");
        
     
        JLabel imageLabel = new JLabel(icon);
  
        imageLabel.setBounds(50, 50,600,600);
        
  
        add(imageLabel);
        
        JLabel heading = new JLabel("Welcome TalentBattle Quiz");
		heading.setBounds(600,60,600,600);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
		heading.setForeground(Color.BLUE);
		add(heading);

		JLabel name = new JLabel("Enter your name");
		name.setBounds(780,220,500,400);
		name.setFont(new Font("Times New Roman",Font.BOLD,20));
		name.setForeground(Color.BLACK);
		add(name);
		
		//JTextField tfname = new JTextField();
		tfname = new JTextField(); // Initialize tfname JTextField
		tfname.setBounds(700, 490, 300, 25); // Now you can set bounds
		tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		add(tfname);


		next = new JButton("Next");
		next.setBounds(730,550,90,30);
		next.setBackground(new Color(30,144,254));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);

		add(next);
		
		back = new JButton("Back");
		back.setBounds(870,550,90,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		
		
		
		
		
		
		
		
		
		

        setVisible(true);
        setSize(700, 500);
        setLocation(200, 150);
    }
    public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==next)
		{
			//AbstractButton tfname;
			String name = tfname.getText();
			setVisible(false);
			new Next(name);
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
		}
		
	}


    public static void main(String[] args) {
        new Login();
    }
}
