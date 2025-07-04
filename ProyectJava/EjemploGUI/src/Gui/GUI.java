package Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    private JTextField textField1;
    private JButton pegarButton;
    private JButton copiarButton;
    private JTextField textField0;
    public GUI() {

        textField0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
String mensaje=textField0.getText();
textField1.setText(mensaje);
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        pegarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textField0.setText("");
                textField1.setText("");
            }
        });
    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
    }
}
