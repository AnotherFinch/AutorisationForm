import javax.swing.*;

public class MyNewConv {

    private JFrame window;
    private JFrame registrationForm;

    public MyNewConv(){
        window = new JFrame("Authorization");
        window.setSize(255, 275);
        window.add(new PanelAuth());
        window.setLocationRelativeTo(null);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        registrationForm = new JFrame("Registration Form");
        registrationForm.setSize(255, 350);
        registrationForm.add(new RegistrationForm(new PanelAuth()));
        registrationForm.setLocationRelativeTo(null);
        registrationForm.setResizable(true);
        registrationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationForm.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyNewConv();
            }
        });
    }
}