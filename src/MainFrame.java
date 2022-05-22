import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class MainFrame extends JFrame {
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JLabel lbAns;
    private JPanel mainPanel;

    public static boolean test (String word){
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(word);
        return matcher.matches();
    }

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
                if (test(email)){
                    lbAns.setText(email + " is correct");
                }else{
                    lbAns.setText(email + " is wrong");
                }
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
