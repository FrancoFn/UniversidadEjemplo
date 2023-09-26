package universidadejemplo.Vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.AccesoADatos.AlumnoData;
import universidadejemplo.AccesoADatos.InscripcionData;
import universidadejemplo.AccesoADatos.MateriaData;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class ManipulacionDeNotas extends javax.swing.JInternalFrame {

    Alumno alumno;
    AlumnoData adata = new AlumnoData();
    MateriaData mData = new MateriaData();
    InscripcionData insData = new InscripcionData(adata, mData);
    int idalum = 0;
    String nota = "";
    List<Alumno> listas;
    List<Materia> listMat;
    DefaultComboBoxModel modeloo = new DefaultComboBoxModel();
    DefaultTableModel modelo = new DefaultTableModel();
    public static ManipulacionDeNotas instancia;

    public ManipulacionDeNotas() {
        initComponents();
        comboBox();
        modelo = (DefaultTableModel) this.jTable1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JCBAlum = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtNota = new javax.swing.JTextField();
        jlCod = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlCodigo = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 102));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Carga de notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno:");

        JCBAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAlumActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jlCod.setText("Codigo");

        jLabel5.setText("Nombre");

        jLabel6.setText("Nota");

        jlCodigo.setText("**********");

        jlNombre.setBackground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("**********");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(333, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addGap(52, 52, 52)
                        .addComponent(jbSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JCBAlum, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jlCod))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlCodigo)
                                    .addComponent(jtNota)
                                    .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(83, 83, 83))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JCBAlum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCod)
                    .addComponent(jlCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAlumActionPerformed
 if (JCBAlum.getSelectedIndex() != 0) {
           llenarTabla(); 
        }
        
    }//GEN-LAST:event_JCBAlumActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int filaSeleccionada = jTable1.rowAtPoint(evt.getPoint());
        jlCodigo.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
        jlNombre.setText(jTable1.getValueAt(filaSeleccionada, 1).toString());
        jtNota.setText(jTable1.getValueAt(filaSeleccionada, 2).toString());
        String nota = jTable1.getValueAt(filaSeleccionada, 2).toString();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int idMateria = Integer.parseInt(jlCodigo.getText());
        double Nnota;
        if (jtNota.getText().equals("")) {
            jtNota.setText(nota);
            Nnota = Double.parseDouble(nota);
        } else {
            Nnota = Double.parseDouble(jtNota.getText());
        }
        insData.actualizarNota(idalum, idMateria, Nnota);
        limpiaR();
        llenarTabla();
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCBAlum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlCod;
    private javax.swing.JLabel jlCodigo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTextField jtNota;
    // End of variables declaration//GEN-END:variables

    public void comboBox() {
        this.listas = adata.listarAlumnos();
        modeloo.addElement("--- Lista de alumnos ---");
        for (Alumno alumno : this.listas) {
            modeloo.addElement(alumno);
        }
        JCBAlum.setModel(modeloo);
    }

    public void llenarTabla() {
        Alumno alu = (Alumno) JCBAlum.getSelectedItem();       
        modelo.setRowCount(0);
        this.idalum = alu.getIdAlumno();       
        listMat = insData.obtenerMateriasCursadas(idalum);
        for (Materia materia : listMat) {
            modelo.addRow(new Object[]{materia.getIdMateria(), (materia.getNombre() + " " + materia.getAnioMateria()), materia.getNota()});
        }
    }

    public void limpiaR() {
        jlCodigo.setText("**********");
        jlNombre.setText("**********");
        jtNota.setText("");
    }
      public static ManipulacionDeNotas getInstancia(){
        if(instancia==null){
            instancia=new ManipulacionDeNotas();
        }
        return instancia;
    }
}
