package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Project extends JFrame {
    Project (){
//        setLocation(100 , 250 );
        setSize(1540 , 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1540 , 750 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();

        JMenu newinformation = new JMenu("NEW INFORMATION");
        newinformation.setForeground(Color.red);
        mb.add(newinformation);


        setJMenuBar(mb);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Project();

    }
}
