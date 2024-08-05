import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JTextField screen;
    private JPanel p;
    private JButton fir;
    private JButton two;
    private JButton button1;
    private JButton clear;
    private boolean addButtonPressed = false;
    double num;

    public Calculator() {
        setContentPane(p);
        setVisible(true);
        setSize(500,500);

        fir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.setText(screen.getText()+"1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.setText(screen.getText()+"2");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!addButtonPressed){
                    if(!screen.getText().isEmpty()){
                        num = Double.parseDouble(screen.getText());
                        screen.setText(" ");
                        addButtonPressed = true;
                    }
                }else{
                    if(!screen.getText().isEmpty()){
                      double  secondnum = Double.parseDouble(screen.getText());
                      double ans = num + secondnum;
                        screen.setText(Double.toString(ans));
                        addButtonPressed = false;
                    }
                }

            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.setText(" ");
            }
        });
    }

    public static void main(String[] args) {
        Calculator calculator =  new Calculator();
    }
}
