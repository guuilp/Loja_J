package loja.j;

import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author a110051
 */
public class JPCadastraProduto extends javax.swing.JPanel {

    Prateleira prateleira;
    
    public JPCadastraProduto(Prateleira p1) {
       try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        this.prateleira = p1;
        initComponents();
    }
    
    public JPCadastraProduto(Prateleira p1, Produto p2) {
        this.prateleira = p1;
        initComponents();
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

        btExibirUltimo = new javax.swing.JButton();
        lbCodigoBarras = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbPreco = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        tfCodigoBarras = new javax.swing.JTextField();
        tfIdentificador = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        lbIdentificador = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();

        btExibirUltimo.setText("Exibir Ultimo");
        btExibirUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirUltimoActionPerformed(evt);
            }
        });

        lbCodigoBarras.setText("Código de barras");

        lbDescricao.setText("Descrição");

        lbNome.setText("Nome");

        lbPreco.setText("Preço R$");

        lbIdentificador.setText("Identificador");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Produto");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbDescricao)
                                .addGap(18, 18, 18)
                                .addComponent(tfDescricao))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfPreco))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfNome))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbIdentificador)
                                .addGap(18, 18, 18)
                                .addComponent(tfIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbCodigoBarras)
                                .addGap(18, 18, 18)
                                .addComponent(tfCodigoBarras)))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExibirUltimo)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdentificador)
                    .addComponent(tfIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigoBarras)
                    .addComponent(tfCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar)
                    .addComponent(btExibirUltimo))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        Container frame = this.getParent();
        frame.remove(this);
        frame.revalidate();
        frame.repaint();
    }//GEN-LAST:event_btCancelarActionPerformed

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
