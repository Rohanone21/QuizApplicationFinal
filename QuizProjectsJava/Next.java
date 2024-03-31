package QuizProjectsJava;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class Next extends JFrame implements ActionListener{

	public  String name;
	JButton next,back;
	Next(String name ){
	    getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome"+" "+name+" "+"to TalentBattle Quiz");
		heading.setBounds(460,100,800,800);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
		heading.setForeground(Color.BLUE);
		add(heading);

		JLabel rules = new JLabel();
		rules.setBounds(30,50,600,400);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText(
				
				"<html>"+ 
		                "1. Read all the following instructions properly. Keep your Admit card with you." + "<br><br>" +
		                "2. You should not use mobile phones while attending the quiz" + "<br><br>" +
		                "3. Here all the questions are compulsory." + "<br><br>" +
		                "4. Each question have a time limit, if you are not submitting it with in the time limit it will move to the next question." + "<br><br>" +
		                "5. Any kind of malpractice will be not be encouraged. And you will be disqualified" + "<br><br>" +
		                "6. All the best for your competiotion, Good Luck!!!" + "<br><br>" +
		         "<html>"
		);
	
		add(rules);
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
		this.name=name;
		 setVisible(true);
	        setSize(700, 500);
	        setLocation(200, 150);
	}
		
		public void actionPerformed(ActionEvent ae) {
			

			 if (ae.getSource() == next) {
		            setVisible(false);
		            new Quiz(name);
		        } else if (ae.getSource() == back) {
		            setVisible(false);
		            new Login();
		        }

		}




		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Next("User");

	}

}
