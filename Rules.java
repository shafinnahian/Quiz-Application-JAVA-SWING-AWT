import java.awt.*;

import javax.swing.*;

public class Rules extends JFrame{
    Rules(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //  setting the heading
        JLabel header = new JLabel("Rules & Regulations");
        header.setBounds(450, 30, 700, 50);
        header.setFont(new Font("SanSerif", Font.BOLD, 28));
        add(header);

        
        setSize(1200, 600);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules();
    }
}
