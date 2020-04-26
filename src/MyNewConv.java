import javax.swing.*;

public class MyNewConv {

    private JFrame window;

    public MyNewConv(){
        window = new JFrame("Authorization");
        window.setSize(255, 275);
        window.add(new PanelAuth());
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MyNewConv();
                new RegistrationForm();
            }
        });
    }
}