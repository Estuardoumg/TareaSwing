package ventanas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import clases.Propietario;
import java.awt.event.*;

/**
 * Created by PC on 13/07/2017.
 */
public class App extends JDialog{
    private JPanel panelMain;
    private JTextField cantidadVehiculos;
    private JTextField codigoPropietario;
    private JTextField nombrePropietario;
    private JTextField edadPropietario;
    private JTextField sexoPropietario;
    private JButton ButtonGuardar;
    private JTable table1;
    private JButton salirButton;
    private DefaultTableModel model;

    public App() {
        model=new DefaultTableModel( );
        model.addColumn( "Cantidad Vehiculos" );
        model.addColumn( "Codigo" );
        model.addColumn( "Nombre" );
        model.addColumn( "Edad" );
        model.addColumn( "Sexo" );
        table1.setModel( model );

        ButtonGuardar.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        ButtonGuardar.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                int cantVehiculos = Integer.parseInt( cantidadVehiculos.getText() );
                int codPropietario = Integer.parseInt( codigoPropietario.getText() );
                String nomPropietario = nombrePropietario.getText();
                int edPropietario = Integer.parseInt( edadPropietario.getText() );
                String sexPropietario = sexoPropietario.getText();

                Propietario propi = new Propietario( cantVehiculos );
                propi.setCodigo( codPropietario );
                propi.setNombre( nomPropietario );
                propi.setEdad( edPropietario );
                propi.getSexo(sexPropietario);

                // LIMPIAR
                cantidadVehiculos.setText("");
                codigoPropietario.setText("");
                nombrePropietario.setText("");
                edadPropietario.setText("");
                sexoPropietario.setText("");

                model.addRow(new Object[]{cantVehiculos,codPropietario,nomPropietario,edPropietario,sexPropietario});

            }
        });
        salirButton.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        } );
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
