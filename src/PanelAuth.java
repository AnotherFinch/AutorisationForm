import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAuth extends JPanel {

    private JTextField loginField = new JTextField();
    private JPasswordField passField = new JPasswordField();
    private JLabel loginLabel = new JLabel();
    private JLabel passLabel = new JLabel();
    private JLabel forgetPass = new JLabel();
    private JLabel registration = new JLabel();

    private JButton log_in = new JButton("Log in");

    private JLabel iconLabel = new JLabel();

    public PanelAuth() {
        setLayout(null);
        setFocusable(true);
        grabFocus();
        setVisible(true);

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

        passLabel.setText("Password:");
        add(passLabel);
        passLabel.setBounds(95, 70, 10, 10);
        passLabel.setSize(100, 25);

        registration.setText("Registration");
        add(registration);
        registration.setBounds(90, 180, 10, 10);
        registration.setSize(140, 20);

        forgetPass.setText("Forgotten password");
        add(forgetPass);
        forgetPass.setBounds(65, 200, 10, 10);
        forgetPass.setSize(160, 20);

        log_in.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginField.setText("");
                passField.setText("");
            }
        });
    }
}


