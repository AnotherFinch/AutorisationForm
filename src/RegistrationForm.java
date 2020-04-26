import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class RegistrationForm extends JPanel {

    private JTextField loginFieldReg = new JTextField("Введите логин");
    private JPasswordField passFieldReg = new JPasswordField();
    private JPasswordField twoPassFieldReg = new JPasswordField();
    private JTextField firstName = new JTextField();
    private JTextField sureName = new JTextField();
    private JTextField emailField = new JTextField();
    private JTextField phoneField = new JTextField();
    private JButton log_in = new JButton("Ok");
    private JLabel iconLabel = new JLabel();
    private JLabel copyright = new JLabel();
    private Font font = new Font("SanSerif", Font.BOLD, 8);

    public RegistrationForm(PanelAuth panelAuth) {
        setLayout(null);
        setFocusable(true);
        grabFocus();
        setVisible(true);
        setBackground(Color.decode(String.valueOf(070)));

        loginFieldReg.setBounds(50, 30, 20, 50);
        add(loginFieldReg);
        loginFieldReg.setSize(160, 35);

        passFieldReg.setBounds(50, 65, 20, 50);
        add(passFieldReg);
        passFieldReg.setSize(160, 35);

        twoPassFieldReg.setBounds(50, 100, 20, 50);
        add(twoPassFieldReg);
        twoPassFieldReg.setSize(160, 35);

        firstName.setBounds(50, 135, 20, 50);
        add(firstName);
        firstName.setSize(160, 35);

        sureName.setBounds(50, 170, 20, 50);
        add(sureName);
        sureName.setSize(160, 35);

        emailField.setBounds(50, 205, 20, 50);
        add(emailField);
        emailField.setSize(160, 35);

        phoneField.setBounds(50, 240, 20, 50);
        add(phoneField);
        phoneField.setSize(160, 35);

        log_in.setBounds(90, 275, 20, 50);
        add(log_in);
        log_in.setSize(75, 30);

        copyright.setText("©Another Finch");
        add(copyright);
        copyright.setBounds(185, 305, 0, 0);
        copyright.setSize(160, 20);
        copyright.setFont(font);
        copyright.setForeground(Color.white);

        iconLabel.setBounds(0, 270, 0, 200);
        add(iconLabel);
        iconLabel.setSize(55, 55);
        iconLabel.setIcon(new ImageIcon("image/iconlogo-3.png"));

        loginFieldReg.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                loginFieldReg.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
                loginFieldReg.setText("Верни мышку, сука");
            }
        });

    }
}









