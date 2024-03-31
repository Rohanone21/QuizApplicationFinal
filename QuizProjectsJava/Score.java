package QuizProjectsJava;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
public class Score extends JFrame  implements ActionListener{
	String name;
	public static int score;
	
	Score(String name,int score){
		this.name=name;
		setBounds(300,100,800,600);
		getContentPane().setBackground(new Color(187,198,226));
		setLayout(null);
        setVisible(true);
		ImageIcon icon = new ImageIcon("src/icons/icon5-modified (2).png");
	    JLabel imageLabel = new JLabel(icon);

	    // Set the bounds to cover the entire width of the container and specify the desired height
	    imageLabel.setBounds(420, 200, 1000, 250);

	    add(imageLabel);
	    JLabel title = new JLabel("Congratulations");
	    title.setBounds(525,180,450,300);
	    title.setFont(new Font("Tahoma",Font.PLAIN,26));
	    add(title);

	    JLabel heading = new JLabel("Thankyou"+" "+name +".");
	    heading.setBounds(80,30,900,30);
	    heading.setFont(new Font("Tahoma",Font.PLAIN,26));
	    add(heading);

	    JLabel lblscore = new JLabel("Your score is " + score);
	    lblscore.setBounds(525,370,320,30);
	    lblscore.setFont(new Font("Tahoma",Font.PLAIN,26));
	    add(lblscore);

	    
	    JButton submit = new JButton("Play again");
		submit.setBounds(525,450,150,30);
		submit.setBackground(new Color(30,144,254));
		submit.setForeground(Color.WHITE);
		submit.addActionListener(this);
		add(submit);
	}
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Login();
	}


public static void main(String args[]) {
new Score("User",score);
}
}

