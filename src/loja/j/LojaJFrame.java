/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loja.j;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 *
 * @author a110051
 */
public class LojaJFrame extends javax.swing.JFrame {

    Prateleira p1;

    /**
     * Creates new form LojaJFrame
     */
    public LojaJFrame() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        p1 = new Prateleira();
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        mbProduto = new javax.swing.JMenuBar();
        mnProduto = new javax.swing.JMenu();
        miCadastrarNovo = new javax.swing.JMenuItem();
        miExibirUltimo = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mnProduto.setText("Produto");

        miCadastrarNovo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        miCadastrarNovo.setText("Cadastrar Novo...");
        miCadastrarNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarNovoActionPerformed(evt);
            }
        });
        mnProduto.add(miCadastrarNovo);
        miCadastrarNovo.getAccessibleContext().setAccessibleDescription("Novo");

        miExibirUltimo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        miExibirUltimo.setText("Exibir o último...");
        miExibirUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExibirUltimoActionPerformed(evt);
            }
        });
        mnProduto.add(miExibirUltimo);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exibir produtos...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnProduto.add(jMenuItem2);

        mbProduto.add(mnProduto);

        setJMenuBar(mbProduto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastrarNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarNovoActionPerformed
        JPCadastraProduto jpcp = new JPCadastraProduto(p1);
        JScrollPane src = new JScrollPane( jpcp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                                                 JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        this.setContentPane(src);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
        this.pack();
    }//GEN-LAST:event_miCadastrarNovoActionPerformed

    private void miExibirUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExibirUltimoActionPerformed
        try {
            int tamanho = p1.size();
            Produto ultimoProduto = (Produto) p1.get(tamanho - 1);
            JPCadastraProduto jpcp = new JPCadastraProduto(p1, ultimoProduto);
            this.setContentPane(jpcp);
            this.getContentPane().revalidate();
            this.getContentPane().repaint();
            this.pack();
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Não há nenhum produto cadastrado!");
        }
    }//GEN-LAST:event_miExibirUltimoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ExibirPrateleiraPanel jpcp = new ExibirPrateleiraPanel(p1);
        JScrollPane src = new JScrollPane( jpcp, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, 
                                                 JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED );
        this.setContentPane(src);
        this.getContentPane().revalidate();
        this.getContentPane().repaint();
        this.pack();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar mbProduto;
    private javax.swing.JMenuItem miCadastrarNovo;
    private javax.swing.JMenuItem miExibirUltimo;
    private javax.swing.JMenu mnProduto;
    // End of variables declaration//GEN-END:variables
}