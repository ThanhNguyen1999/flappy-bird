package gametauhai;

import javax.swing.JFrame;

public class ManHinh extends JFrame {
TapVe tapveM = new TapVe () ;

    public ManHinh() {
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(400, 100);
        add(tapveM);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ManHinh mh = new ManHinh();

    }

}
