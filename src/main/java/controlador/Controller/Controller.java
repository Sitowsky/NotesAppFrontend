/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.Controller;

import clientews.servicio.IUserDao;
import clientews.servicio.User;
import clientews.servicio.UserDaoService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vistas.Login;
import vistas.Usuarios;

/**
 *
 * @author fabri
 */
public class Controller {

    IUserDao us = new UserDaoService().getUserDaoPort();
    User u = new User();

    public void llenaTabla(JTable jTable1, DefaultTableModel modelo) {
        List l = us.getAll();
        for (int i = 0; i < l.size(); i++) {
            User u = (User) l.get(i);
            Object[] object = new Object[5];
            object[0] = u.getIduser();
            object[1] = u.getName();
            object[2] = u.getLastname();
            object[3] = u.getEmail();
            modelo.addRow(object);
        }

    }

    public void agregar(JTextField nombre, JTextField apellidos, JTextField correo, JPasswordField contra, JTable jTable1, DefaultTableModel modelo) {
        try {
            if (nombre.getText().equals("") && apellidos.getText().equals("") && correo.getText().equals("") && contra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
                actualizaTabla(jTable1, modelo);
            } else {
                u.setIduser((us.getAll().get(us.getAll().size() - 1).getIduser()) + 1);
                u.setName(nombre.getText());
                u.setEmail(correo.getText());
                u.setLastname(apellidos.getText());
                u.setPassword(contra.getText());
                us.add(u);
                JOptionPane.showMessageDialog(null, "Usuario nuevo registrado");
                limpiar(nombre, nombre, apellidos, correo, contra);
                actualizaTabla(jTable1, modelo);
            }
        } catch (Exception e) {
        }
    }

    private void actualizaTabla(JTable jTable1, DefaultTableModel modelo) {
        for (int i = 0; i <= jTable1.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void seleccionarUsuario(JTextField id, JTextField nombre, JTextField apellidos, JTextField correo, JPasswordField contra, JTable jTable1, DefaultTableModel modelo) {
        int fila = jTable1.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No hay fila seleccionada");
        } else {
            int idc = Integer.parseInt((String) jTable1.getValueAt(fila, 0).toString());
            String nom = (String) jTable1.getValueAt(fila, 1).toString();
            String ape = (String) jTable1.getValueAt(fila, 2).toString();
            String corre = (String) jTable1.getValueAt(fila, 3).toString();
            id.setText("" + idc);
            nombre.setText(nom);
            apellidos.setText(ape);
            correo.setText(corre);
            contra.setText("");
        }
    }

    public void modificar(JTextField id, JTextField nombre, JTextField apellidos, JTextField correo, JPasswordField contra, JTable jTable1, DefaultTableModel modelo) {
        try {
            if (nombre.getText().equals("") && apellidos.getText().equals("") && correo.getText().equals("") && contra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
                actualizaTabla(jTable1, modelo);
            } else {
                u.setIduser(Integer.parseInt(id.getText()));
                u.setName(nombre.getText());
                u.setEmail(correo.getText());
                u.setLastname(apellidos.getText());
                u.setPassword(contra.getText());
                us.update(u);
                JOptionPane.showMessageDialog(null, "Usuario modificado");
                limpiar(id, nombre, apellidos, correo, contra);
                actualizaTabla(jTable1, modelo);
            }
        } catch (Exception e) {
        }
    }

    public void limpiar(JTextField id, JTextField nombre, JTextField apellidos, JTextField correo, JPasswordField contra) {
        id.setText("");
        nombre.setText("");
        apellidos.setText("");
        correo.setText("");
        contra.setText("");
    }

    public void eliminar(JTextField id, JTextField nombre, JTextField apellidos, JTextField correo, JPasswordField contra, JTable jTable1, DefaultTableModel modelo) {
        try {
            if (id.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
                actualizaTabla(jTable1, modelo);
            } else {
                us.delete(Integer.parseInt(id.getText()));
                JOptionPane.showMessageDialog(null, "Usuario eliminado");
                limpiar(id, nombre, apellidos, correo, contra);
                actualizaTabla(jTable1, modelo);
            }
        } catch (Exception e) {
        }
    }

    public void verificarLogin(JTextField correo, JPasswordField contra, Login aThis) {
        try {
            if (correo.getText().equals("") && contra.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan datos");
            } else {
                if (correo.getText().equals("root") && contra.getText().equals("root")) {
                    new Usuarios().setVisible(true);
                    aThis.setVisible(false);
                } else {
                    boolean val = us.verifyCredentials(correo.getText(), contra.getText());
                    if (val) {
                        aThis.setVisible(false);
                        System.out.println("vista de notas con nombre");
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
