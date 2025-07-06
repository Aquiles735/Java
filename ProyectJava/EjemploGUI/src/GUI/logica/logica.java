package GUI.logica;
//Para logica de negocio (GUI-Backend)
import GUI.GUI;
import javax.swing.*;

public class logica {

    public static void main(String[] args) {
GUI panelContenido=new GUI();

// ventana visible con el siguiente código
        SwingUtilities.invokeLater(() -> {
            new GUI().setVisible(true);

        });
    }
}