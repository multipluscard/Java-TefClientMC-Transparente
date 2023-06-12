/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author luana.souza
 */
public class FormularioAtributos extends javax.swing.JFrame {

    public FormularioAtributos(int comunicacao, String cnpj, String codloja, String data, String pdv) {
        initComponents(); 
        txbComunicacao.setText(Integer.toString(comunicacao));
        txbCnpj.setText(cnpj);
        txbCodLoja.setText(codloja);
        txbData.setText(data);
        txbPdv.setText(pdv);
    }
    
    public FormularioAtributos() {
        initComponents();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelAtributos = new javax.swing.JPanel();
        LabelImg = new javax.swing.JLabel();
        lbComunicacao = new javax.swing.JLabel();
        lbCnpj = new javax.swing.JLabel();
        lbCodLoja = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbPDV = new javax.swing.JLabel();
        txbComunicacao = new javax.swing.JTextField();
        txbCnpj = new javax.swing.JTextField();
        txbCodLoja = new javax.swing.JTextField();
        txbData = new javax.swing.JTextField();
        txbPdv = new javax.swing.JTextField();

        setSize(new java.awt.Dimension(273, 443));

        PanelAtributos.setBackground(java.awt.SystemColor.controlLtHighlight);
        PanelAtributos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelAtributos.setPreferredSize(new java.awt.Dimension(273, 443));

        LabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shopatributos.png"))); // NOI18N

        lbComunicacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbComunicacao.setText("COMUNICAÇÃO");

        lbCnpj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCnpj.setText("CNPJ");

        lbCodLoja.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbCodLoja.setText("COD LOJA");

        lbData.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbData.setText("DATA");
        lbData.setToolTipText("");

        lbPDV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPDV.setText("PDV");

        txbComunicacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout PanelAtributosLayout = new javax.swing.GroupLayout(PanelAtributos);
        PanelAtributos.setLayout(PanelAtributosLayout);
        PanelAtributosLayout.setHorizontalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelImg))
                    .addGroup(PanelAtributosLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbPDV)
                            .addComponent(lbData)
                            .addComponent(lbCodLoja)
                            .addComponent(lbCnpj)
                            .addComponent(lbComunicacao)
                            .addComponent(txbComunicacao)
                            .addComponent(txbCnpj)
                            .addComponent(txbPdv)
                            .addComponent(txbData)
                            .addComponent(txbCodLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        PanelAtributosLayout.setVerticalGroup(
            PanelAtributosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAtributosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbComunicacao)
                .addGap(18, 18, 18)
                .addComponent(txbComunicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCnpj)
                .addGap(18, 18, 18)
                .addComponent(txbCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbCodLoja)
                .addGap(18, 18, 18)
                .addComponent(txbCodLoja, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lbData)
                .addGap(18, 18, 18)
                .addComponent(txbData, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPDV)
                .addGap(18, 18, 18)
                .addComponent(txbPdv, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PanelAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getCnpj(){
        return txbCnpj.getText();
    }
    public String getCodLoja(){
        return txbCodLoja.getText();
    }
    public String getpdv(){
        return txbPdv.getText();
    }
    
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
            java.util.logging.Logger.getLogger(FormularioAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAtributos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioAtributos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JPanel PanelAtributos;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbCodLoja;
    private javax.swing.JLabel lbComunicacao;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbPDV;
    private javax.swing.JTextField txbCnpj;
    private javax.swing.JTextField txbCodLoja;
    private javax.swing.JTextField txbComunicacao;
    private javax.swing.JTextField txbData;
    private javax.swing.JTextField txbPdv;
    // End of variables declaration//GEN-END:variables
}
