
package Ventana;

import client.Emisor;
import client.Persona;

import client.Receptor;

import interfaz.IVentanaEmisor;

import java.awt.event.ActionListener;

import java.awt.event.KeyListener;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ivan-
 */
public class VentanaEmisor extends javax.swing.JFrame implements IVentanaEmisor{
    
    private DefaultListModel<Persona> modAgenda;

    /** Creates new form VentanaEmisor */
    public VentanaEmisor() {
        
        this.modAgenda = new DefaultListModel<Persona>();
            
        initComponents();
        this.botonEnviarEmisor.setActionCommand("ENVIAR MENSAJE");
        this.botonConfigEmisor.setActionCommand("CONFIGURACION");
        this.btCancelarConfig.setActionCommand("CANCELAR CAMBIO");
        this.btAceptarConfig.setActionCommand("ACEPTAR CAMBIO");
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {//GEN-BEGIN:initComponents

        jDialog1 = new javax.swing.JDialog();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textNombreConfig = new javax.swing.JTextArea();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        textApellidoConfig = new javax.swing.JTextArea();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        textIPConfig = new javax.swing.JTextArea();
        jPanel23 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        btCancelarConfig = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        textPuertoConfig = new javax.swing.JTextArea();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        btAceptarConfig = new javax.swing.JButton();
        panelMsjRecibido = new javax.swing.JOptionPane();
        tipoMensaje = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAgenda = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        botonEnviarEmisor = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        botonConfigEmisor = new javax.swing.JButton();
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

        jPanel21.setLayout(new java.awt.GridLayout(2, 0));

        jPanel22.setLayout(new java.awt.GridLayout(1, 2));

        jPanel24.setLayout(new java.awt.GridLayout(3, 0));

        jLabel5.setText("Nombre");
        jPanel28.add(jLabel5);

        jPanel24.add(jPanel28);

        jLabel6.setText("Apellido");
        jPanel29.add(jLabel6);

        jPanel24.add(jPanel29);

        jLabel7.setText("IP");
        jPanel30.add(jLabel7);

        jPanel24.add(jPanel30);

        jPanel22.add(jPanel24);

        jPanel25.setLayout(new java.awt.GridLayout(3, 0));

        jPanel31.setLayout(new java.awt.BorderLayout());

        textNombreConfig.setColumns(20);
        textNombreConfig.setRows(5);
        jScrollPane4.setViewportView(textNombreConfig);

        jPanel31.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel25.add(jPanel31);

        jPanel32.setLayout(new java.awt.BorderLayout());

        textApellidoConfig.setColumns(20);
        textApellidoConfig.setRows(5);
        jScrollPane5.setViewportView(textApellidoConfig);

        jPanel32.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel25.add(jPanel32);

        jPanel33.setLayout(new java.awt.BorderLayout());

        textIPConfig.setColumns(20);
        textIPConfig.setRows(5);
        jScrollPane8.setViewportView(textIPConfig);

        jPanel33.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jPanel25.add(jPanel33);

        jPanel22.add(jPanel25);

        jPanel21.add(jPanel22);

        jPanel23.setLayout(new java.awt.GridLayout(1, 2));

        jPanel26.setLayout(new java.awt.GridLayout(3, 0));

        jLabel8.setText("Puerto");
        jPanel34.add(jLabel8);

        jPanel26.add(jPanel34);
        jPanel26.add(jPanel35);

        btCancelarConfig.setText("Cancelar");
        jPanel36.add(btCancelarConfig);

        jPanel26.add(jPanel36);

        jPanel23.add(jPanel26);

        jPanel27.setLayout(new java.awt.GridLayout(3, 0));

        jPanel37.setLayout(new java.awt.BorderLayout());

        textPuertoConfig.setColumns(20);
        textPuertoConfig.setRows(5);
        jScrollPane7.setViewportView(textPuertoConfig);

        jPanel37.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jPanel27.add(jPanel37);
        jPanel27.add(jPanel38);

        btAceptarConfig.setText("Aceptar");
        btAceptarConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarConfigActionPerformed(evt);
            }
        });
        jPanel39.add(btAceptarConfig);

        jPanel27.add(jPanel39);

        jPanel23.add(jPanel27);

        jPanel21.add(jPanel23);

        jDialog1.getContentPane().add(jPanel21, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(175, 238));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Agenda");
        jPanel5.add(jLabel1);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(70, 138));

        listAgenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        listAgenda.setModel(modAgenda);
        jScrollPane1.setViewportView(listAgenda);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.LINE_END);

        jPanel3.setPreferredSize(new java.awt.Dimension(349, 100));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel13.setMinimumSize(new java.awt.Dimension(80, 31));
        jPanel13.setPreferredSize(new java.awt.Dimension(140, 100));
        jPanel13.setLayout(new java.awt.GridLayout(2, 0));

        botonEnviarEmisor.setText("Enviar");
        jPanel19.add(botonEnviarEmisor);

        jPanel13.add(jPanel19);

        botonConfigEmisor.setText("Configuración");
        botonConfigEmisor.setActionCommand("Configuracion");
        botonConfigEmisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfigEmisorActionPerformed(evt);
            }
        });
        jPanel20.add(botonConfigEmisor);

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

    private void btAceptarConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarConfigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAceptarConfigActionPerformed

    private void botonConfigEmisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfigEmisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfigEmisorActionPerformed

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
    private javax.swing.JButton botonConfigEmisor;
    private javax.swing.JButton botonEnviarEmisor;
    private javax.swing.JButton btAceptarConfig;
    private javax.swing.JButton btCancelarConfig;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JList<Persona> listAgenda;
    private javax.swing.JOptionPane panelMsjRecibido;
    private javax.swing.JTextArea textApellidoConfig;
    private javax.swing.JTextArea textAsuntoEmisor;
    private javax.swing.JTextArea textIPConfig;
    private javax.swing.JTextArea textMensajeEmisor;
    private javax.swing.JTextArea textNombreConfig;
    private javax.swing.JTextArea textPuertoConfig;
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
        List<Persona> personas = this.getPersonas();
        if(personas.size() > 0){
            Emisor.getInstancia().enviarMensaje(personas);
        }
        else{
            this.lanzarCartelError("ERROR: debe seleccionar al menos un elemento de la agenda");
        }
        
    }
    
    @Override
    public List<Persona> getPersonas() {
        return this.listAgenda.getSelectedValuesList();
    }
    
    public void confirmarConfiguracion() {
        String ip = this.getIPConfig().trim();
        String puerto = this.getPuertoConfig().trim();
        String nombre = this.getNombreConfig().trim();
        String apellido = this.getApellidoConfig().trim();
        if(!ip.equals("") &&
                   !puerto.equals("") &&
                   !nombre.equals("") &&
                   !apellido.equals("") )
        {
            Emisor.getInstancia().configAtributos(ip, puerto, nombre, apellido);
            this.cerrarConfig();
        }
        else 
        {
                this.lanzarCartelError("ERROR: debe completar todos los campos");
        }
    }
    
    public void lanzarCartelError(String err) {
        JOptionPane.showMessageDialog(null, err);
    }
    
    
    @Override
    public int getTipo() {
        // 0=simplea   1= alerta  2=aviso de recepcion
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
        
        return this.textNombreConfig.getText();
    }

    @Override
    public String getApellidoConfig() {
        
        return this.textApellidoConfig.getText();
    }
    
    @Override
    public String getIPConfig() {
        return this.textIPConfig.getText();
    }

    @Override
    public String getPuertoConfig() {
        return this.textPuertoConfig.getText();
    }
    
    public void abrirConfig() {
        
        this.jDialog1.setSize(400, 400);
        this.jDialog1.setVisible(true);
        this.textNombreConfig.setText(Emisor.getInstancia().getNombre());
        this.textApellidoConfig.setText(Emisor.getInstancia().getApellido());
        this.textIPConfig.setText(Emisor.getInstancia().getIP());
        this.textPuertoConfig.setText(Emisor.getInstancia().getPuerto());
        this.repaint();
        
    }
    
    public void cerrarConfig(){
        this.jDialog1.setVisible(false);
    }


    @Override
    public void actualizarListaAgenda(HashMap<String,Persona> personas) {
        Iterator<Persona> it = personas.values().iterator();
        
        this.modAgenda.clear();
        while(it.hasNext()){
            this.modAgenda.addElement(it.next());
        }
        
        this.repaint();
    }


    @Override
    public void addActionListener(ActionListener actionListener) {
        this.botonConfigEmisor.addActionListener(actionListener);
        this.botonEnviarEmisor.addActionListener(actionListener);
        this.btAceptarConfig.addActionListener(actionListener);
        this.btCancelarConfig.addActionListener(actionListener);
    }
    
    public void addKeyListener(KeyListener kl1,KeyListener kl2){
        this.textAsuntoEmisor.addKeyListener(kl1);
        this.textMensajeEmisor.addKeyListener(kl2);
    }


}
