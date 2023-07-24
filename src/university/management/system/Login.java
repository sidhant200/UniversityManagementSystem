package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login , cancel;
    public Login(){
        JLabel Username = new JLabel("USERNAME");
        add(Username);
        setLayout(null);
        Username.setBounds(40 , 20 , 100 , 20);
        JTextField username = new JTextField();
        username.setBounds(120  , 21 , 200 , 20);
        add(username);
        setLayout(null);


        JLabel Password = new JLabel("PASSWORD");
        add(Password);
        setLayout(null);
        Password.setBounds(40 , 80 , 100 , 20);
        JPasswordField password = new JPasswordField();
        password.setBounds(120 , 80 , 200 , 20);
        add(password);
        setLayout(null);

        login = new JButton("Login");
        login.setBounds(40 , 180 , 130 , 30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        login.setFont(new Font("Arial Black" , Font.BOLD , 16));
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180 , 180 , 130 , 30);
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Arial Black" , Font.BOLD , 16));
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200 , 200 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350 , 20 , 200 , 200);
        setVisible(true);
        add(image);



        getContentPane().setBackground(Color.WHITE);
        setSize(600 , 300);
        setLocation(500 , 250);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login){


        }else if(e.getSource() == cancel){
            setVisible(false);

        }

    }

    public static void main(String[] args) {
        new Login();
    }

}
