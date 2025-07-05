package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GUI extends JFrame {

        // ********Para accionar la aplicación con funcionalidad
    //es con Run GUI.GUI o MAYUS+F10 (No funciona con "Preview")*******

    private JPanel panelContenido;
    private JButton borrarButton;
    private JTextField txtMensajed1;
    private JTextField txtCopiado;
    private JButton copiarButton;

    public GUI() {
        setTitle("Funcionalidad Button");
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
        copiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            String mensaje=txtCopiado.getText();//copia contenido del primer recuadro de texto
            txtMensajed1.setText(mensaje); //pega el contenido en el secundo recuadro de texto
                txtCopiado.setText("");//borra contenido del último cuadro de texto
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