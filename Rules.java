import java.awt.*;

import javax.swing.*;

public class Rules extends JFrame{
    String name;

    JButton next, back;

    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        //  setting the heading
        JLabel headName = new JLabel("Weclome " + name);
        headName.setBounds(480, 10, 700, 50);
        headName.setFont(new Font("SanSerif", Font.BOLD, 28));
        add(headName);

        JLabel header = new JLabel("Rules & Regulations");
        header.setBounds(450, 60, 700, 50);
        header.setFont(new Font("SanSerif", Font.BOLD, 28));
        header.setForeground(new Color(201, 27, 14));
        add(header);

        // enter rules
        JLabel rules = new JLabel();
        rules.setBounds(300, 120, 700, 350);
        rules.setFont(new Font("SanSerif", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. MCQ Format - only one option each question" + "<br><br>" +
                "2. No external communication." + "<br><br>" +
                "3. Every question hold equal marking" + "<br><br>" +
                "4. Crying is allowed but please do so quietly." + "<br><br>" +
                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                "6. Providing/ acquiring external sources during exam is strictly prohibited." + "<br><br>" +
                "7. Contact the invigilator for external support" + "<br><br>" +
                "8. In any case, contact the coordinator at shafinnahian@gmail.com" + "<br><br>" +
            "<html>"
        );
        add(rules);

        // setting the buttons
        
        
        setSize(1200, 600);
        setLocation(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
