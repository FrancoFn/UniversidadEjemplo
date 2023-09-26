package universidadejemplo.Vistas;

import javax.swing.JOptionPane;
import universidadejemplo.AccesoADatos.AperturaMultiple;
import universidadejemplo.Entidades.Acceso;

public class MenuPrincipal extends javax.swing.JFrame {

    AperturaMultiple evDuplicado;
    Acceso acceso = new Acceso();
    Ingreso ingreso = new Ingreso();
    public int level;

    public MenuPrincipal() {
        initComponents();
        this.evDuplicado = new AperturaMultiple(escritorio);
        logiN();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jFrame2 = new javax.swing.JFrame();
        panel2 = new java.awt.Panel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel3 = new java.awt.Panel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFomAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFormMateria = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmInscripciones = new javax.swing.JMenuItem();
        jmNotas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmAporMateria = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 672, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmFomAlumno.setText("Formulario de Alumno");
        jmFomAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFomAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFomAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jmFormMateria.setText("Formulario de Materia");
        jmFormMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmFormMateria);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Administracion");

        jmInscripciones.setText("Manejo de Inscripciones");
        jmInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmInscripcionesActionPerformed(evt);
            }
        });
        jMenu4.add(jmInscripciones);

        jmNotas.setText("Manipulacion de notas");
        jmNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNotasActionPerformed(evt);
            }
        });
        jMenu4.add(jmNotas);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Consultas");

        jmAporMateria.setText("Alumnos por Materia");
        jmAporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAporMateriaActionPerformed(evt);
            }
        });
        jMenu5.add(jmAporMateria);

        jMenuBar1.add(jMenu5);

        jMenuSalir.setText("Salir");

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jMenuSalir.add(jmSalir);

        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmAporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAporMateriaActionPerformed
        evDuplicado.abrirInternal(consultaDeAlumnosPorMateria.getInstancia());
        /*
        escritorio.removeAll();
        escritorio.repaint();
        consultaDeAlumnosPorMateria alumpormate = new consultaDeAlumnosPorMateria();
        alumpormate.setVisible(true);
        escritorio.add(alumpormate);
        escritorio.moveToFront(alumpormate);*/
    }//GEN-LAST:event_jmAporMateriaActionPerformed

    private void jmFomAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFomAlumnoActionPerformed

        if (ingreso.getNivel() != 1) {
            evDuplicado.abrirInternal(GestionDeAlumnos.getInstancia());
            /*escritorio.removeAll();
            escritorio.repaint();
            GestionDeAlumnos gesAlumnos = new GestionDeAlumnos();
            gesAlumnos.setVisible(true);
            escritorio.add(gesAlumnos);
            escritorio.moveToFront(gesAlumnos);*/
        } else {
            JOptionPane.showMessageDialog(null, "Acceso restringido");
        }

    }//GEN-LAST:event_jmFomAlumnoActionPerformed

    private void jmInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmInscripcionesActionPerformed
        if (ingreso.getNivel() == 3) {
          evDuplicado.abrirInternal(formularioDeInscripcion.getInstancia());
            /* escritorio.removeAll();
            escritorio.repaint();
            formularioDeInscripcion forinscripcion = new formularioDeInscripcion();
            forinscripcion.setVisible(true);
            escritorio.add(forinscripcion);
            escritorio.moveToFront(forinscripcion);*/
        } else {
            JOptionPane.showMessageDialog(null, "Acceso restringido");
        }
    }//GEN-LAST:event_jmInscripcionesActionPerformed

    private void jmFormMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormMateriaActionPerformed
        if (ingreso.getNivel() != 1) {
           evDuplicado.abrirInternal(GestionDeMaterias.getInstancia());
            /*escritorio.removeAll();
            escritorio.repaint();
            GestionDeMaterias gestionMateria = new GestionDeMaterias();
            gestionMateria.setVisible(true);
            escritorio.add(gestionMateria);
            escritorio.moveToFront(jMenu1);*/
        } else {
            JOptionPane.showMessageDialog(null, "Acceso restringido");
        }
    }//GEN-LAST:event_jmFormMateriaActionPerformed

    private void jmNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNotasActionPerformed
        if (ingreso.getNivel() == 3) {
            evDuplicado.abrirInternal(ManipulacionDeNotas.getInstancia());
            /*escritorio.removeAll();
            escritorio.repaint();
            ManipulacionDeNotas mNotas = new ManipulacionDeNotas();
            mNotas.setVisible(true);
            escritorio.add(mNotas);
            escritorio.moveToFront(mNotas);*/
        } else {
            JOptionPane.showMessageDialog(null, "Acceso restringido");
        }
    }//GEN-LAST:event_jmNotasActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jmAporMateria;
    private javax.swing.JMenuItem jmFomAlumno;
    private javax.swing.JMenuItem jmFormMateria;
    private javax.swing.JMenuItem jmInscripciones;
    private javax.swing.JMenuItem jmNotas;
    private javax.swing.JMenuItem jmSalir;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
public void logiN() {
       // evDuplicado.abrirInternal(Ingreso.getInstancia());
    
        escritorio.removeAll();
        escritorio.repaint();
        ingreso.setVisible(true);
        ingreso.setLocation(375, 200);
        escritorio.add(ingreso);
        escritorio.moveToFront(ingreso);
        
    }

}
