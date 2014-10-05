package loja.j;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CadastroProdutoJFrame extends javax.swing.JFrame {

    Prateleira prateleira;

    public CadastroProdutoJFrame(Prateleira p1) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        this.prateleira = p1;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public CadastroProdutoJFrame(Prateleira p1, Produto p2) {
        this.prateleira = p1;
        initComponents();
        this.setLocationRelativeTo(null);
        tfIdentificador.setText(Integer.toString(p2.getIdentificador()));
        tfCodigoBarras.setText(Integer.toString(p2.getCodigoBarras()));
        tfNome.setText(p2.getNome());
        tfDescricao.setText(p2.getDescricao());
        tfPreco.setText(Float.toString(p2.getPreco()));
        tfIdentificador.setEditable(false);
        tfCodigoBarras.setEditable(false);
        tfNome.setEditable(false);
        tfDescricao.setEditable(false);
        tfPreco.setEditable(false);
        tfIdentificador.setEditable(false);
        tfCodigoBarras.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbIdentificador = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        lbCodigoBarras = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        tfIdentificador = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        tfCodigoBarras = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btExibirUltimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produto");

        lbIdentificador.setText("Identificador");

        lbNome.setText("Nome");

        lbPreco.setText("Preço R$");

        lbCodigoBarras.setText("Código de barras");

        lbDescricao.setText("Descrição");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        btExibirUltimo.setText("Exibir Ultimo");
        btExibirUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbIdentificador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfIdentificador))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCodigoBarras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigoBarras))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExibirUltimo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(tfDescricao))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdentificador)
                    .addComponent(tfIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoBarras)
                    .addComponent(tfCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar)
                    .addComponent(btExibirUltimo))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        try {

            int identificador = Integer.parseInt(tfCodigoBarras.getText());
            String nome = tfNome.getText();
            String descricao = tfDescricao.getText();
            float preco = Float.parseFloat(tfPreco.getText());
            int codigo = Integer.parseInt(tfCodigoBarras.getText());

            Produto novoProduto = new Produto();
            novoProduto.setIdentificador(identificador);
            novoProduto.setNome(nome);
            novoProduto.setDescricao(descricao);
            novoProduto.setPreco(preco);
            novoProduto.setCodigoBarras(codigo);

            prateleira.add(novoProduto);

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");

            tfIdentificador.setText("");
            tfCodigoBarras.setText("");
            tfNome.setText("");
            tfDescricao.setText("");
            tfPreco.setText("");

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(this, "Problema no cadastro do produto!");

        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btExibirUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirUltimoActionPerformed
        try {
            int tamanho = prateleira.size();
            Produto produto = (Produto) prateleira.get(tamanho - 1);
            tfIdentificador.setText(Integer.toString(produto.getIdentificador()));
            tfCodigoBarras.setText(Integer.toString(produto.getCodigoBarras()));
            tfNome.setText(produto.getNome());
            tfDescricao.setText(produto.getDescricao());
            tfPreco.setText(Float.toString(produto.getPreco()));

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Não há nenhum produto cadastrado!");
        }

    }//GEN-LAST:event_btExibirUltimoActionPerformed
    /**
     * @param args the command line arguments
     */
    /*
     public static void main(String args[]) {
     try {
     for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
     if ("Nimbus".equals(info.getName())) {
     javax.swing.UIManager.setLookAndFeel(info.getClassName());
     break;
     }
     }
     } catch (ClassNotFoundException ex) {
     java.util.logging.Logger.getLogger(CadastroProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (InstantiationException ex) {
     java.util.logging.Logger.getLogger(CadastroProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (IllegalAccessException ex) {
     java.util.logging.Logger.getLogger(CadastroProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
     java.util.logging.Logger.getLogger(CadastroProdutoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
     }
     //</editor-fold>

     java.awt.EventQueue.invokeLater(new Runnable() {
     public void run() {
     Prateleira p1 = new Prateleira();
     new CadastroProdutoJFrame(p1).setVisible(true);
     new CadastroProdutoJFrame(p1).setVisible(true);
     new CadastroProdutoJFrame(p1).setVisible(true);
     }
     });
     }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExibirUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCodigoBarras;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbIdentificador;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JTextField tfCodigoBarras;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfIdentificador;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
