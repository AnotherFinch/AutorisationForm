import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAuth extends JPanel {

    private JTextField loginField = new JTextField();
    private JPasswordField passField = new JPasswordField();
    private JLabel loginLabel = new JLabel();
    private JLabel passLabel = new JLabel();
    private JLabel forgetPass = new JLabel();
    private JLabel registration = new JLabel();
    private Font font = new Font("SanSerif", Font.BOLD, 8);

    private JButton log_in = new JButton("Log in");

    private JLabel iconLabel = new JLabel();
    private JLabel copyright = new JLabel();

    public PanelAuth() {
        RegistrationForm win2 = new RegistrationForm(this);

        setLayout(null);
        setFocusable(true);
        grabFocus();
        setVisible(true);
        setBackground(Color.decode(String.valueOf(070)));

        iconLabel.setBounds(0, 200, 0, 200);
        add(iconLabel);
        iconLabel.setSize(55, 55);
        iconLabel.setIcon(new ImageIcon("image/iconlogo-3.png"));

        loginField.setBounds(50, 30, 20, 50);
        add(loginField);
        loginField.setSize(160, 35);

        passField.setBounds(50, 95, 20, 50);
        add(passField);
        passField.setSize(160, 35);

        log_in.setBounds(90, 145, 20, 50);
        add(log_in);
        log_in.setSize(75, 30);

        loginLabel.setText("Login:");
        add(loginLabel);
        loginLabel.setBounds(105, 10, 10, 10);
        loginLabel.setSize(100, 25);
        loginLabel.setForeground(Color.YELLOW);

        passLabel.setText("Password:");
        add(passLabel);
        passLabel.setBounds(95, 70, 10, 10);
        passLabel.setSize(100, 25);
        passLabel.setForeground(Color.YELLOW);

        registration.setText("Registration");
        add(registration);
        registration.setBounds(90, 180, 10, 10);
        registration.setSize(140, 20);
        registration.setForeground(Color.YELLOW);

        forgetPass.setText("Forgotten password");
        add(forgetPass);
        forgetPass.setBounds(65, 200, 10, 10);
        forgetPass.setSize(160, 20);
        forgetPass.setForeground(Color.YELLOW);

        copyright.setText("©Another Finch");
        add(copyright);
        copyright.setBounds(175, 230, 0, 0);
        copyright.setSize(160, 20);
        copyright.setFont(font);
        copyright.setForeground(Color.white);

        log_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginField.setText("");
                passField.setText("");

            }
        });
    }
}


