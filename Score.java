import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener{
    JButton playAgain;
    private String textNameRef = "Project by Shafin Mahmud";
    
    Score(String username, int score){
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/score.png"));

        // Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon(i2);
        // JLabel image = new JLabel(i3);
        // setting image for login

        // image.setBounds(100, 0, 300, 250);
        // add(image);

        JLabel heading = new JLabel("Thank you " + username);
        heading.setBounds(270, 30, 700, 30);
        heading.setFont(new Font("San Serif", Font.BOLD, 26));
        add(heading);

        JLabel scoreLabel = new JLabel("Total score " + score);
        scoreLabel.setBounds(290, 120, 700, 30);
        scoreLabel.setFont(new Font("San Serif", Font.BOLD, 20));
        add(scoreLabel);

        playAgain = new JButton("Play Again");
        playAgain.setBounds(260, 200, 200, 30);
        playAgain.setBorderPainted(false);
        playAgain.setBackground(new Color(83, 226, 245));
        playAgain.setForeground(Color.white);
        playAgain.setFont(new Font("Dialog", Font.PLAIN, 20));

        playAgain.addActionListener(this);
        add(playAgain);

        JLabel hyperlink = new JLabel(textNameRef);
        hyperlink.setForeground(Color.BLUE.darker());
        hyperlink.setBounds(285, 30, 700, 500);

        hyperlink.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try{
                    Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/shafinnahian75/"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }
            @Override
            public void mouseExited(MouseEvent e) {
                hyperlink.setText(textNameRef);
            }
 
            @Override
            public void mouseEntered(MouseEvent e) {
                hyperlink.setText("<html><a href=''>" + textNameRef + "</a></html>");
            }

        });

        add(hyperlink);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
