
package presentacion;

import interfaces.IEnviarMensajeEm;

import negocio.LogicaEmisor;
import negocio.Persona;

import negocio.LogicaReceptor;


import java.awt.event.ActionListener;

import java.awt.event.KeyListener;

import java.awt.event.WindowAdapter;

import java.awt.event.WindowEvent;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;

import java.util.List;

import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import negocio.UsuarioReceptor;

/**
 *
 * @author ivan-
 */
public class VentanaEmisorOld extends javax.swing.JFrame implements IVentanaEmisor{
    
    private DefaultListModel<UsuarioReceptor> modDirectorio;
    private List<UsuarioReceptor> destinatariosConfirmados;
    
    /** Creates new form VentanaEmisor */
    public VentanaEmisorOld() {
        
        this.modDirectorio = new DefaultListModel<UsuarioReceptor>();
        
        initComponents();
        this.botonEnviarEmisor.setActionCommand("ENVIAR MENSAJE");
        this.btAceptarSesion.setActionCommand("ACEPTAR SESION");
        this.btSelecDestinatarios.setActionCommand("SELECCIONAR DESTINATARIOS");
        this.btConfirmSelect.setActionCommand("CONFIRMAR DESTINATARIOS");
        this.btCancelSelect.setActionCommand("CANCELAR DESTINATARIOS");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        sesionEmisor = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textNombreSesion = new javax.swing.JTextArea();
        jPanel30 = new javax.swing.JPanel();
        btAceptarSesion = new javax.swing.JButton();
        panelMsjRecibido = new javax.swing.JOptionPane();
        tipoMensaje = new javax.swing.ButtonGroup();
        selecDestinatarios = new javax.swing.JDialog();
        jPanel40 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        btConfirmSelect = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        btCancelSelect = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDirectorio = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        btSelecDestinatarios = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        botonEnviarEmisor = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        RBSimple = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        RBAlerta = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        RBAvisoRecep = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAsuntoEmisor = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textMensajeEmisor = new javax.swing.JTextArea();

        jPanel21.setLayout(new java.awt.GridLayout(4, 0));

        jLabel5.setText("Iniciar sesion");
        jPanel22.add(jLabel5);

        jPanel21.add(jPanel22);

        jLabel1.setText("Nombre");
        jPanel23.add(jLabel1);

        jPanel21.add(jPanel23);

        textNombreSesion.setColumns(20);
        textNombreSesion.setRows(5);
        textNombreSesion.setText("Default");
        jScrollPane4.setViewportView(textNombreSesion);

        jPanel29.add(jScrollPane4);

        jPanel21.add(jPanel29);

        btAceptarSesion.setText("Confirmar");
        btAceptarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarSesionActionPerformed(evt);
            }
        });
        jPanel30.add(btAceptarSesion);

        jPanel21.add(jPanel30);

        sesionEmisor.getContentPane().add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel40.setLayout(new java.awt.GridLayout(1, 2));

        btConfirmSelect.setText("Confirmar");
        btConfirmSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmSelectActionPerformed(evt);
            }
        });
        jPanel43.add(btConfirmSelect);

        jPanel40.add(jPanel43);

        btCancelSelect.setText("Cancelar");
        jPanel42.add(btCancelSelect);

        jPanel40.add(jPanel42);

        selecDestinatarios.getContentPane().add(jPanel40, java.awt.BorderLayout.PAGE_END);

        jPanel41.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(70, 138));

        listDirectorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listDirectorio.setModel(modDirectorio);
        jScrollPane1.setViewportView(listDirectorio);

        jPanel41.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        selecDestinatarios.getContentPane().add(jPanel41, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(175, 238));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());
        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(349, 100));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(80, 31));
        jPanel13.setPreferredSize(new java.awt.Dimension(140, 100));
        jPanel13.setLayout(new java.awt.GridLayout(2, 0));

        btSelecDestinatarios.setText("Seleccionar destinatarios");
        btSelecDestinatarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSelecDestinatariosActionPerformed(evt);
            }
        });
        jPanel19.add(btSelecDestinatarios);

        jPanel13.add(jPanel19);

        botonEnviarEmisor.setText("Enviar");
        botonEnviarEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarEmisorActionPerformed(evt);
            }
        });
        jPanel20.add(botonEnviarEmisor);

        jPanel13.add(jPanel20);

        jPanel3.add(jPanel13, java.awt.BorderLayout.EAST);

        jPanel14.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel14.setPreferredSize(new java.awt.Dimension(75, 100));
        jPanel14.setLayout(new java.awt.GridLayout(4, 0));

        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Tipo de Mensaje:");
        jPanel15.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel14.add(jPanel15);

        jPanel16.setLayout(new java.awt.GridLayout(1, 0));

        tipoMensaje.add(RBSimple);
        RBSimple.setSelected(true);
        RBSimple.setText("Mensaje simple");
        jPanel16.add(RBSimple);

        jPanel14.add(jPanel16);

        jPanel17.setLayout(new java.awt.GridLayout(1, 0));

        tipoMensaje.add(RBAlerta);
        RBAlerta.setText("Mensaje con alerta");
        jPanel17.add(RBAlerta);

        jPanel14.add(jPanel17);

        jPanel18.setLayout(new java.awt.GridLayout(1, 0));

        tipoMensaje.add(RBAvisoRecep);
        RBAvisoRecep.setText("Mensaje con aviso recepcion");
        RBAvisoRecep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBAvisoRecepActionPerformed(evt);
            }
        });
        jPanel18.add(RBAvisoRecep);

        jPanel14.add(jPanel18);

        jPanel3.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel9.setPreferredSize(new java.awt.Dimension(100, 60));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel7.setLayout(new java.awt.BorderLayout());

        textAsuntoEmisor.setColumns(20);
        textAsuntoEmisor.setRows(5);
        jScrollPane2.setViewportView(textAsuntoEmisor);

        jPanel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel9.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel8.setLayout(new java.awt.GridLayout(1, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Asunto");
        jPanel8.add(jLabel3);

        jPanel9.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.GridLayout(1, 0));

        jLabel4.setText("Mensaje");
        jPanel11.add(jLabel4);

        jPanel10.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel12.setLayout(new java.awt.BorderLayout());

        textMensajeEmisor.setColumns(20);
        textMensajeEmisor.setRows(5);
        jScrollPane3.setViewportView(textMensajeEmisor);

        jPanel12.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }//GEN-END:initComponents

    private void RBAvisoRecepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBAvisoRecepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBAvisoRecepActionPerformed

    private void btAceptarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAceptarSesionActionPerformed

    private void botonEnviarEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEnviarEmisorActionPerformed

    private void btSelecDestinatariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSelecDestinatariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSelecDestinatariosActionPerformed

    private void btConfirmSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btConfirmSelectActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing
                                                                   .UIManager
                                                                   .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing
                         .UIManager
                         .setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentanaEmisor.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentanaEmisor.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentanaEmisor.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util
                .logging
                .Logger
                .getLogger(VentanaEmisor.class.getName())
                .log(java.util
                         .logging
                         .Level
                         .SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt
            .EventQueue
            .invokeLater(new Runnable() {
                public void run() {
                    new VentanaEmisor().setVisible(true);
                }
            });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBAlerta;
    private javax.swing.JRadioButton RBAvisoRecep;
    private javax.swing.JRadioButton RBSimple;
    private javax.swing.JButton botonEnviarEmisor;
    private javax.swing.JButton btAceptarSesion;
    private javax.swing.JButton btCancelSelect;
    private javax.swing.JButton btConfirmSelect;
    private javax.swing.JButton btSelecDestinatarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<UsuarioReceptor> listDirectorio;
    private javax.swing.JOptionPane panelMsjRecibido;
    private javax.swing.JDialog selecDestinatarios;
    private javax.swing.JDialog sesionEmisor;
    private javax.swing.JTextArea textAsuntoEmisor;
    private javax.swing.JTextArea textMensajeEmisor;
    private javax.swing.JTextArea textNombreSesion;
    private javax.swing.ButtonGroup tipoMensaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getAsunto() {
        
        return this.textAsuntoEmisor.getText();
    }

    @Override
    public String getMensaje() {
        return this.textMensajeEmisor.getText();
    }
    
    public void enviarMensaje(){
        List<UsuarioReceptor> personas = this.getPersonas();
        if(personas.size() > 0){
            if(!this.getAsunto().trim().equals("")){
                if(!this.getMensaje().trim().equals("")){
                    LogicaEmisor.getInstancia().enviarMensaje(personas);
                }
                else{
                    this.lanzarCartelError("ERROR: debe a�adir un mensaje.");
                }
            }
            else{
                this.lanzarCartelError("ERROR: debe a�adir un asunto.");
            }
        }
        else{
            this.lanzarCartelError("ERROR: debe seleccionar al menos un elemento de la agenda.");
        }
        
    }
    
    @Override
    public List<UsuarioReceptor> getPersonas() {
        return this.destinatariosConfirmados;
    }
    
    public void confirmarSesion() {
        String nombre = this.getNombreConfig().trim();
        if(!nombre.equals(""))
        {
            LogicaEmisor.getInstancia().configAtributos(nombre);
            this.cerrarSesion();
            this.setVisible(true);
            LogicaEmisor.getInstancia().pedirAvisosPendientes();
        }
        else 
        {
            this.lanzarCartelError("ERROR: debe completar todos los campos");
        }
    }
    
    public void confirmarDestinatarios(){
        this.destinatariosConfirmados = this.listDirectorio.getSelectedValuesList();
        this.selecDestinatarios.setVisible(false);
    }
    
    public void cancelarDestinatarios(){
        this.selecDestinatarios.setVisible(false);
    }
    
    public void lanzarCartelError(String err) {
        JOptionPane.showMessageDialog(null, err);
    }
    
    
    @Override
    public int getTipo() {
        // 0=simple   1= alerta  2=aviso de recepcion
        int retorno = 0;
        
        if(this.RBAlerta.isSelected())
            retorno = 1;
        else
            if(this.RBAvisoRecep.isSelected())
                retorno = 2;
        return retorno;
    }

    @Override
    public String getNombreConfig() {
        
        return this.textNombreSesion.getText();
    }


    
    public void abrirSesion() {
        this.sesionEmisor.setSize(400, 400);
        this.sesionEmisor.setVisible(true);
        this.textNombreSesion.setText(LogicaEmisor.getInstancia().getNombre());
        this.repaint();
        
    }
    
    public void cerrarSesion(){
        this.sesionEmisor.setVisible(false);
    }


    @Override
    public void actualizarListaDirectorio(Map<String,UsuarioReceptor> personas) {
        Iterator<UsuarioReceptor> it = personas.values().iterator();
        
        this.modDirectorio.clear();
        while(it.hasNext()){
            this.modDirectorio.addElement(it.next());
        }
        this.selecDestinatarios.setSize(200,400);
        this.selecDestinatarios.setVisible(true);
        this.repaint();
    }


    @Override
    public void addActionListener(ActionListener actionListener) {
        this.botonEnviarEmisor.addActionListener(actionListener);
        this.btAceptarSesion.addActionListener(actionListener);
        this.btSelecDestinatarios.addActionListener(actionListener);
        this.btConfirmSelect.addActionListener(actionListener);
        this.btCancelSelect.addActionListener(actionListener);
    }
    
    public void addKeyListener(KeyListener kl1,KeyListener kl2){
        this.textAsuntoEmisor.addKeyListener(kl1);
        this.textMensajeEmisor.addKeyListener(kl2);
    }


}
