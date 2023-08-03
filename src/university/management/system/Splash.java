package university.management.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Thread t;
    public Splash(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000 , 700 , Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        setVisible(true);
        add(image);

        t = new Thread(this);
        t.start();
            int x =1;
        for (int i=0; i<=500; i+=4 , x+=1){
            setLocation(600-((i + x)/2) , 350 - (i/2));
            setSize(i + 3*x, i+x/2);

            try {
                Thread.sleep(2);
            }catch (Exception e){}

        }
    }

        public void run(){
        try{
            Thread.sleep(5000);
            setVisible(false);

            new Login();
        }catch (Exception e){}


    }
    public static void main(String[] args) {
        new Splash();

    }
}
