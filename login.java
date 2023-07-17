import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class login extends JFrame{

    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/login.png"));

        // setting image for login

        JLabel image = new JLabel(i1);
        image.setBounds(0, 20, 600, 500);
        add(image);

        //  setting the heading
        JLabel header = new JLabel("Quiz Application");
        header.setBounds(780, 60, 300, 45);
        header.setFont(new Font("SanSerif", Font.BOLD, 25));
        add(header);

        // Enter name
        JLabel name = new JLabel("Enter name");
        name.setBounds(820, 120, 300, 45);
        name.setFont(new Font("SanSerif", Font.PLAIN, 18));
        add(name);

        // taking input from users
        JTextField tfname = new JTextField();
        tfname.setBounds(730, 180, 300, 30);
        add(tfname);

        //add button to enter the next phase and take input of name
        JButton login = new JButton("Login");
        login.setBorderPainted(false);
        login.setBounds(730, 270, 120, 25);
        login.setBackground(new Color(83, 226, 245));
        login.setForeground(Color.WHITE);
        add(login);

        //exit button
        JButton back = new JButton("Exit");
        back.setBorderPainted(false);
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(83, 226, 245));
        back.setForeground(Color.WHITE);
        add(back);

        setSize(1200, 600);
        setLocation(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new login();
    }
}
