package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {

    private JPanel panelContenido;
    private JButton borrarButton;
    private JTextField txtMensajed1;

    public GUI() {
        setTitle("Aplicación swing");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(panelContenido);


        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtMensajed1.setText("");
            }
        });
    }
           public static void main(String[] args) {

               SwingUtilities.invokeLater(() -> {
                   new GUI().setVisible(true);

               });
           }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}