import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    private JLabel labelmsg;
    private  JButton btnregister;{
        JButton btnregister = new JButton(String.valueOf(9));
        btnregister = new JButton(String.valueOf(8));
        btnregister = new JButton(String.valueOf(7));
        btnregister = new JButton(String.valueOf(6));
        btnregister = new JButton(String.valueOf(5));
        btnregister = new JButton(String.valueOf(4));
        btnregister = new JButton(String.valueOf(3));
        btnregister = new JButton(String.valueOf(2));
        btnregister = new JButton(String.valueOf(1));
        btnregister = new JButton(String.valueOf(0));
        btnregister = new JButton("=");
        btnregister = new JButton("+");
        btnregister = new JButton("-");
        btnregister = new JButton("*");
        btnregister = new JButton("/");
        btnregister = new JButton("%");
        btnregister = new JButton("CLR");
        btnregister = new JButton(".");


    };

    public Calculator(){
        setLayout(new GridBagLayout());

        labelmsg = new JLabel();
        add(labelmsg);

    }

    public static void main (String [] args){
        Calculator calc = new Calculator();
        calc.setSize(400,600);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
