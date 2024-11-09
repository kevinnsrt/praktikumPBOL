import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JPanel cardPanel = new JPanel();
        CardLayout cardLayout = new CardLayout();
        cardPanel.setLayout(cardLayout);

        Register registerPanel = new Register(cardLayout, cardPanel);
        Login loginPanel = new Login();

        cardPanel.add(registerPanel, "Register");
        cardPanel.add(loginPanel, "Login");

        JLabel footer = new JLabel("All Right Reserved, Kevin Sirait",JLabel.CENTER);
        footer.setForeground(Color.darkGray);

        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(footer,BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}

class Register extends JPanel {
    public Register(CardLayout cardLayout, JPanel cardPanel) {

        setLayout(new GridLayout(11, 0)); 

        setBackground(Color.darkGray);
        setBorder(new EmptyBorder(30,50,50,50));

        JLabel label1 = new JLabel("Email");
        label1.setForeground(Color.WHITE);
        JTextField textField1 = new JTextField();
        textField1.setForeground(Color.WHITE);
        textField1.setBackground(Color.darkGray);
        textField1.setBorder(new LineBorder(Color.green,2,true));


        JLabel label3 = new JLabel("Name");
        label3.setForeground(Color.WHITE);

        JTextField textField3 = new JTextField();
        textField3.setForeground(Color.WHITE);
        textField3.setBackground(Color.darkGray);
        textField3.setBorder(new LineBorder(Color.green,2,true));


        JLabel label2 = new JLabel("Password");
        label2.setForeground(Color.WHITE);

        JTextField textField2 = new JTextField();
        textField2.setForeground(Color.WHITE);
        textField2.setBackground(Color.darkGray);
        textField2.setBorder(new LineBorder(Color.green,2,true));


        JButton buttonRegister = new JButton("Register");
        buttonRegister.setBackground(Color.GREEN);
        
        JLabel label4 = new JLabel("Sudah Punya Akun?",JLabel.CENTER);
        label4.setForeground(Color.white);
        label4.setBorder(new EmptyBorder(10,10,10,10));

        JButton buttonLogin = new JButton("Login");
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBackground(Color.GRAY);

        JLabel border1 = new JLabel();
        border1.setBorder(new EmptyBorder(100, 0, 0, 0));

        JLabel border2 = new JLabel();
        border2.setBorder(new EmptyBorder(100, 0, 0, 0));

        add(label3);
        add(textField3);
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(border1);
        add(buttonRegister);
        add(border2);
        add(label4);
        add(buttonLogin);

        buttonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Login");
            }
        });

        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Login");
            }
        });
    }
}

class Login extends JPanel {
    public Login() {

        setLayout(new GridLayout(8, 0)); 
        setBackground(Color.darkGray);
        setBorder(new EmptyBorder(50, 50, 50, 50)); 

        JLabel label1 = new JLabel("Email");
        label1.setForeground(Color.white);

        JTextField textField1 = new JTextField();
        textField1.setBackground(Color.darkGray);
        textField1.setForeground(Color.WHITE);
        textField1.setBorder(new LineBorder(Color.green, 2));

        JLabel label2 = new JLabel("Password");
        label2.setForeground(Color.white);

        JTextField textField2 = new JTextField();
        textField2.setBackground(Color.darkGray);
        textField2.setForeground(Color.white);
        textField2.setBorder(new LineBorder(Color.green, 2));

        JButton buttonLogin = new JButton("Login");
        buttonLogin.setBackground(Color.GREEN);

        JLabel border = new JLabel();
        border.setBorder(new EmptyBorder(100, 0, 0, 0));

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(border);
        add(buttonLogin);
    }

}