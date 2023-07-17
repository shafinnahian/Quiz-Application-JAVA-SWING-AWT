import java.awt.*;

import javax.swing.*;

public class login extends JFrame {

    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/login.png"));

        // setting image for login

        JLabel image = new JLabel(i1);
        image.setBounds(0, 20, 600, 500);
        add(image);

        //  setting the heading
        

        setSize(1200, 600);
        setLocation(400, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new login();
    }
}
