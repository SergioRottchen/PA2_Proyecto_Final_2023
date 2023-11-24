/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.Controladora;
import Modelo.Almacen;
import Modelo.Direccion;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sirgi
 */
public class crudAlmacen extends javax.swing.JInternalFrame {

    Controladora control;
    private javax.swing.JDesktopPane jDesktopPane1;
    public DefaultTableModel model = null;
    public Almacen alm = null;
    public Direccion dir = null;

    public Almacen getAlm() {
        return alm;
    }

    public void setAlm(Almacen alm) {
        this.alm = alm;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public crudAlmacen(Controladora control, JDesktopPane jDesktopPane1) {
        initComponents();
        this.control = control;
        this.jDesktopPane1 = jDesktopPane1;
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    public Controladora getControl() {
        return control;
    }

    public void setControl(Controladora control) {
        this.control = control;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    public crudAlmacen() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI) this.getUI();
        ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnBorrarAlmacen = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlmacen = new javax.swing.JTable();
        btnNuevaAlmacen = new javax.swing.JButton();
        btnEditarAlmacen = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAlmacenes = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtBuscarAlmacen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(980, 680));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Buscar:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBorrarAlmacen.setText("Borrar Almacen");
        btnBorrarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlmacenActionPerformed(evt);
            }
        });

        btnRecargar.setText("Recargar tabla");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("CRUD Almacen");

        tablaAlmacen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmacenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAlmacen);

        btnNuevaAlmacen.setText("Crear Almacen");
        btnNuevaAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaAlmacenActionPerformed(evt);
            }
        });

        btnEditarAlmacen.setText("Editar Almacen");
        btnEditarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAlmacenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Dirección:");

        tablaAlmacenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaAlmacenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAlmacenesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaAlmacenes);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Buscar Almacen:");

        txtBuscarAlmacen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAlmacenKeyReleased(evt);
            }
        });

        jLabel4.setText("Lista de Almacenes:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevaAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevaAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBuscarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtro(txtBuscar.getText());
    }

    private void filtro(String str) {
        model = (DefaultTableModel) tablaAlmacen.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tablaAlmacen.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnBorrarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlmacenActionPerformed
        //Validamos que existan elementos en la tabla
        if (tablaAlmacen.getRowCount() > 0) {
            //Controlamos que se haya seleccionado un elemento
            if (tablaAlmacen.getSelectedRow() != -1) {
                //obtengo el id del elemento a eliminar
                int id_usuario = Integer.parseInt(String.valueOf(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 0)));
                //llamo al metodo borrar
                try {
                    control.borrarAlmacen(id_usuario);

                    //avisar al usuario que se borro correctamente
                    mostrarMensaje("Se borro el Almacen correctamente", "Info", "Eliminación correcta");
                    cargarTablaAlmacen();

                } catch (Exception e) {
                    mostrarMensaje("No se pudo borrar el Almacen", "Error", "Error al borrar");
                }

            } else {
                mostrarMensaje("Tabla vacia", "Error", "Error al borrar");
            }
        }
    }//GEN-LAST:event_btnBorrarAlmacenActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        cargarTablaAlmacen();   
        cargarTablaAlmacenes();// TODO add your handling code here:
    }//GEN-LAST:event_btnRecargarActionPerformed
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tablaAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmacenMouseClicked
        //Validamos que existan elementos en la tabla
        if (tablaAlmacen.getRowCount() > 0) {
            //Controlamos que se haya seleccionado un elemento
            if (tablaAlmacen.getSelectedRow() != -1) {
                //obtengo el id del elemento a eliminar
                int id_usuario = Integer.parseInt(String.valueOf(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 0)));
                dir = control.traerDireccion(id_usuario);
                alm = control.traerAlmacen(id_usuario);
               

            }
        }
    }//GEN-LAST:event_tablaAlmacenMouseClicked
    private void cargarTablaAlmacen() {
        //definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //que fila y columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //establecemos los nombres de las columnas
        String titulos[] = {"Id", "Calle", "Ciudad", "Provincia", "País"};
        modeloTabla.setColumnIdentifiers(titulos);
        tablaAlmacen.setModel(modeloTabla);
        //Traemos de la BD la lista de usuarios
        List<Direccion> listaDirecciones = control.traerDirecciones();
        try {
            if (listaDirecciones != null) {
                for (Direccion dir : listaDirecciones) {
                    Object[] objeto = {dir.getId(),  dir.getCalle(), dir.getCiudad(), dir.getEstado(), dir.getPais()};
                    modeloTabla.addRow(objeto);
                }
            }
        } catch (Exception e) {
            mostrarMensaje("Tabla de Direcciones vacia", "Error", "Error al Cargar tabla");
        }

    }
    private void btnNuevaAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaAlmacenActionPerformed
        String nombre = txtNombre.getText();
        Almacen al = new Almacen();
        al.setNombre(nombre);
        al.setUbicacion(dir);
        control.crearAlmacen(al);
        mostrarMensaje("Almacen creado con exito", "Error", "Error al borrar");

    }//GEN-LAST:event_btnNuevaAlmacenActionPerformed

    private void btnEditarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAlmacenActionPerformed
        Almacen a = new Almacen();
        Direccion d = new Direccion();
         if (tablaAlmacenes.getRowCount() > 0) {
            //Controlamos que se haya seleccionado un elemento
            if (tablaAlmacenes.getSelectedRow() != -1) {
                //obtengo el id del elemento a eliminar
                a.setId(Integer.parseInt(String.valueOf(tablaAlmacenes.getValueAt(tablaAlmacenes.getSelectedRow(), 0)))); 
                a.setNombre(String.valueOf(tablaAlmacenes.getValueAt(tablaAlmacenes.getSelectedRow(), 1)));
                d.setCalle(String.valueOf(tablaAlmacenes.getValueAt(tablaAlmacenes.getSelectedRow(), 2)));
                d.setCiudad(String.valueOf(tablaAlmacenes.getValueAt(tablaAlmacenes.getSelectedRow(), 3)));
                d.setEstado(String.valueOf(tablaAlmacenes.getValueAt(tablaAlmacenes.getSelectedRow(), 4)));
                d.setPais(String.valueOf(tablaAlmacenes.getValueAt(tablaAlmacenes.getSelectedRow(), 5)));
                

            }
        }
         a.setUbicacion(d);
        control.editarAlmacen(a);
        mostrarMensaje("Almacen Editado con exito", "Error", "Error al borrar");
    }//GEN-LAST:event_btnEditarAlmacenActionPerformed
private void cargarTablaAlmacenes() {
        //definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            //que fila y columnas no sean editables
          
        };
        //establecemos los nombres de las columnas
        String titulos[] = {"Id","Nombre", "Calle", "Ciudad", "Provincia", "País"};
        modeloTabla.setColumnIdentifiers(titulos);
        tablaAlmacenes.setModel(modeloTabla);
        //Traemos de la BD la lista de usuarios
        List<Almacen> listaAlmacenes = control.traerAlmacenes();
        try {
            if (listaAlmacenes != null) {
                for (Almacen dir : listaAlmacenes) {
                    Object[] objeto = {dir.getId(),  dir.getNombre(), dir.getUbicacion().getCalle(),dir.getUbicacion().getCiudad(), dir.getUbicacion().getEstado(), dir.getUbicacion().getPais()};
                    modeloTabla.addRow(objeto);
                }
            }
        } catch (Exception e) {
            mostrarMensaje("Tabla de Almacenes vacia", "Error", "Error al Cargar tabla");
        }

    }
    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        cargarTablaAlmacen();
        cargarTablaAlmacenes();
    }//GEN-LAST:event_formInternalFrameActivated

    private void tablaAlmacenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAlmacenesMouseClicked
       //Validamos que existan elementos en la tabla
        if (tablaAlmacen.getRowCount() > 0) {
            //Controlamos que se haya seleccionado un elemento
            if (tablaAlmacen.getSelectedRow() != -1) {
                //obtengo el id del elemento a eliminar
                int id_usuario = Integer.parseInt(String.valueOf(tablaAlmacen.getValueAt(tablaAlmacen.getSelectedRow(), 0)));
                
                alm = control.traerAlmacen(id_usuario);
                txtNombre.setText(alm.getNombre());

            }
        }
    }//GEN-LAST:event_tablaAlmacenesMouseClicked

    private void txtBuscarAlmacenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAlmacenKeyReleased
        filtro(txtBuscarAlmacen.getText());
    }//GEN-LAST:event_txtBuscarAlmacenKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarAlmacen;
    private javax.swing.JButton btnEditarAlmacen;
    private javax.swing.JButton btnNuevaAlmacen;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaAlmacen;
    private javax.swing.JTable tablaAlmacenes;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarAlmacen;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
