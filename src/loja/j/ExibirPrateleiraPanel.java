package loja.j;

import javax.swing.JOptionPane;

/**
 *
 * @author a110051
 */
public class ExibirPrateleiraPanel extends javax.swing.JPanel {

    Prateleira p1;
    
    public ExibirPrateleiraPanel(Prateleira prateleira) {
        initComponents();
        p1 = prateleira;
        PrateleiraTabelaModelo ptm = new PrateleiraTabelaModelo(p1);
        this.tbPrateleira.setModel(ptm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spBarraRolagem = new javax.swing.JScrollPane();
        tbPrateleira = new javax.swing.JTable();
        btRemover = new javax.swing.JButton();

        tbPrateleira.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbPrateleira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPrateleiraMouseClicked(evt);
            }
        });
        spBarraRolagem.setViewportView(tbPrateleira);

        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBarraRolagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(spBarraRolagem, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btRemover)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int linhaSelecionada = this.tbPrateleira.getSelectedRow();
        this.p1.remove(linhaSelecionada);
        this.tbPrateleira.revalidate();
        this.btRemover.setEnabled(false);
        JOptionPane.showMessageDialog(this, "Produto removido com sucesso");
//        try{ 
//            int linhaSelecionada = this.tbPrateleira.getSelectedRow();
//            this.p1.remove(linhaSelecionada);
//            this.tbPrateleira.revalidate();
//            JOptionPane.showMessageDialog(this, "Produto removido com sucesso");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            JOptionPane.showMessageDialog(this, "Não há linhas selecionadas");
//        } catch (IndexOutOfBoundsException e){
//            JOptionPane.showMessageDialog(this, "Não há linhas selecionadas");
//        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tbPrateleiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPrateleiraMouseClicked
        if (this.tbPrateleira.getSelectedRow() >= 0) { 
            this.btRemover.setEnabled(true);
        } else {
            this.btRemover.setEnabled(false);
        }
    }//GEN-LAST:event_tbPrateleiraMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRemover;
    private javax.swing.JScrollPane spBarraRolagem;
    private javax.swing.JTable tbPrateleira;
    // End of variables declaration//GEN-END:variables
}
