import javax.swing.*;

public class RegistrationForm extends JPanel{

    private JFrame registrationFrame;

    public RegistrationForm (){

        registrationFrame = new JFrame("Registration");
        registrationFrame.setSize(255, 400);
        registrationFrame.add(new PanelAuth());
        registrationFrame.setLocationRelativeTo(null);
        registrationFrame.setResizable(false);
        registrationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        registrationFrame.setVisible(true);
}

}
