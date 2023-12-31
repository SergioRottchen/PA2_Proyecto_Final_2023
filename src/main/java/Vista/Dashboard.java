/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controladora;
import Modelo.Usuario;
import java.awt.Color;

/**
 *
 * @author sirgi
 */
public class Dashboard extends javax.swing.JFrame {
Controladora control;
Usuario user;
    /**
     * Creates new form Dashboard
     */
    Color DefaultColor,ClickedColor;
    public Dashboard(Controladora control, Usuario user) {
        
        initComponents();
        DefaultColor=new Color(13,36,51);
        ClickedColor=new Color(240,151,57);
        this.control=control;
        this.user=user;
        menu1.setBackground(DefaultColor);
        menu2.setBackground(DefaultColor);
        menu3.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor);
        
        
        
    
    }
    public Dashboard(){
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Menuname = new javax.swing.JLabel();
        jtfNombreUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menu2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menu3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        menu4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        menu5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        menu6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        menu7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/Cerrar.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        Menuname.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Menuname.setForeground(new java.awt.Color(255, 255, 255));
        Menuname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        Menuname.setText("Menu");

        jtfNombreUsuario.setEditable(false);
        jtfNombreUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfNombreUsuario.setText("jTextField1");
        jtfNombreUsuario.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Menuname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 837, Short.MAX_VALUE)
                .addComponent(jtfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Menuname)
                        .addComponent(jtfNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        menu1.setBackground(new java.awt.Color(0, 0, 51));
        menu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu1MousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel2.setText("CRUD Cliente");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu2.setBackground(new java.awt.Color(0, 0, 51));
        menu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu2MousePressed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel3.setText("CRUD Envios");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu3.setBackground(new java.awt.Color(0, 0, 51));
        menu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu3MousePressed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel4.setText("Menu 3");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu3Layout = new javax.swing.GroupLayout(menu3);
        menu3.setLayout(menu3Layout);
        menu3Layout.setHorizontalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu3Layout.setVerticalGroup(
            menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu4.setBackground(new java.awt.Color(0, 0, 51));
        menu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu4MousePressed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel5.setText("Menu 4");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        menu5.setBackground(new java.awt.Color(0, 0, 51));
        menu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu5MousePressed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel15.setText("Gestión de Almacenes");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu5Layout = new javax.swing.GroupLayout(menu5);
        menu5.setLayout(menu5Layout);
        menu5Layout.setHorizontalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu5Layout.setVerticalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu6.setBackground(new java.awt.Color(0, 0, 51));
        menu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu6MousePressed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel16.setText("Proveedores");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu6Layout = new javax.swing.GroupLayout(menu6);
        menu6.setLayout(menu6Layout);
        menu6Layout.setHorizontalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu6Layout.setVerticalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menu7.setBackground(new java.awt.Color(0, 0, 51));
        menu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu7MousePressed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Img/images (1).png"))); // NOI18N
        jLabel17.setText("Administrador Usuario");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });

        javax.swing.GroupLayout menu7Layout = new javax.swing.GroupLayout(menu7);
        menu7.setLayout(menu7Layout);
        menu7Layout.setHorizontalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu7Layout.setVerticalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menu4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(menu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 200, 690));

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(980, 960));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 980, 1030));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void menu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1MousePressed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_menu1MousePressed

    private void menu2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2MousePressed
       // TODO add your handling code here:
    }//GEN-LAST:event_menu2MousePressed

    private void menu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu3MousePressed

    private void menu4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu4MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu4MousePressed

    private void menu5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu5MousePressed

    private void menu6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu6MousePressed
      // TODO add your handling code here:
    }//GEN-LAST:event_menu6MousePressed

    private void menu7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu7MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
      menu1.setBackground(ClickedColor);
        menu2.setBackground(DefaultColor);
        menu3.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor);
        Menuname.setText("Menu 1");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
     menu1.setBackground(DefaultColor);
        menu2.setBackground(ClickedColor);
        menu3.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor);   
        Menuname.setText("Menu 2");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
     menu1.setBackground(DefaultColor);
        menu3.setBackground(ClickedColor);
        menu2.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor); 
        Menuname.setText("Menu 3");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
     menu1.setBackground(DefaultColor);
        menu4.setBackground(ClickedColor);
        menu3.setBackground(DefaultColor);
        menu2.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor);
        Menuname.setText("Menu 4");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
     menu1.setBackground(DefaultColor);
        menu5.setBackground(ClickedColor);
        menu3.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu2.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor);
        Menuname.setText("Menu 5");
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
     menu1.setBackground(DefaultColor);
        menu6.setBackground(ClickedColor);
        menu3.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu2.setBackground(DefaultColor);
        menu7.setBackground(DefaultColor);  
        Menuname.setText("Menu 6");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
     menu1.setBackground(DefaultColor);
        menu7.setBackground(ClickedColor);
        menu3.setBackground(DefaultColor);
        menu4.setBackground(DefaultColor);
        menu5.setBackground(DefaultColor);
        menu6.setBackground(DefaultColor);
        menu2.setBackground(DefaultColor); 
        Menuname.setText("Menu 7");// TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
     Menu1 men1 =new Menu1(control);   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men1).setVisible(true);
     
     
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
Menu2 men2 =new Menu2(control,user);   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men2).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
    Menu3 men3 =new Menu3();   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men3).setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
Menu4 men4 =new Menu4();   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men4).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
    Menu5 men5 =new Menu5(control,jDesktopPane1);   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men5).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
Menu6 men6 =new Menu6(control);   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men6).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
Menu7 men7 =new Menu7(control);   
     jDesktopPane1.removeAll();
     jDesktopPane1.add(men7).setVisible(true);  
     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    jtfNombreUsuario.setText(user.getNombreUsuario());        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Menuname;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jtfNombreUsuario;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPanel menu3;
    private javax.swing.JPanel menu4;
    private javax.swing.JPanel menu5;
    private javax.swing.JPanel menu6;
    private javax.swing.JPanel menu7;
    // End of variables declaration//GEN-END:variables
}
