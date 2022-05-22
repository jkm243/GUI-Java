import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JLabel lbAns;
    private JPanel mainPanel;

    public MainFrame(){
        setContentPane(mainPanel);
        setTitle("Main");
        setSize(450,300);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = textField1.getText();
                lbAns.setText("Welcome "+email);
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbAns.setText("");
                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
    }
}
