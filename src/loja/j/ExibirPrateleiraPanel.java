package loja.j;

/**
 *
 * @author a110051
 */
public class ExibirPrateleiraPanel extends javax.swing.JPanel {

    public ExibirPrateleiraPanel(Prateleira prateleira) {
        initComponents();
        PrateleiraTabelaModelo ptm = new PrateleiraTabelaModelo(prateleira);
        this.tbPrateleira.setModel(ptm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spBarraRolagem = new javax.swing.JScrollPane();
        tbPrateleira = new javax.swing.JTable();

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
        spBarraRolagem.setViewportView(tbPrateleira);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBarraRolagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spBarraRolagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane spBarraRolagem;
    private javax.swing.JTable tbPrateleira;
    // End of variables declaration//GEN-END:variables
}
