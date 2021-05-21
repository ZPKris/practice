package gui;
import javax.swing.*;

    class MyFrame extends JFrame {
        public MyFrame(){
            this.setBounds(100,100,300,300);
            this.setVisible(true);

        }
        public MyFrame(String s){
            super(s);
            this.setBounds(100,100,300,300);
            this.setVisible(true);
        }
    }


