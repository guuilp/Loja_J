package loja.j;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import static javax.swing.UIManager.getSystemLookAndFeelClassName;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicLookAndFeel;

/**
 *
 * @author a110051
 */
public class CadastroProdutoPrompt extends javax.swing.JFrame {
    Prateleira prateleira1;

    public CadastroProdutoPrompt(Prateleira prateleira) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }
        initComponents();
        this.setLocationRelativeTo(null);
        prateleira1 = prateleira;
    }
    
    public void exibirProduto(Produto produto){
      JOptionPane.showMessageDialog(null, "Informações Produto: \nIdentificador: " + produto.getIdentificador()+
                                          "\nCodigo de barras: " + produto.getCodigoBarras()+
                                          "\nNome do Produto: " + produto.getPreco() +
                                          "\nDescrição: " +produto.getDescricao()+
                                          "\nPreço: " +produto.getPreco());
    }
    public void encontrarProduto (Prateleira prateleira) {
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a exibir."));
            Produto mockup = new Produto();
            mockup.setIdentificador(codigo);
            int posicao = Collections.binarySearch(prateleira, mockup);

            if (posicao < 0 ) { 
                JOptionPane.showMessageDialog(null, "Não foi encontrado o produto com codigo fornecido (" + codigo + ")." );
            } else { 
                Produto p1 = (Produto)prateleira.get(posicao);
                this.exibirProduto(p1);
            }
        } catch (NumberFormatException nf) {
        }
    }
    
    public void alterarPreco (Prateleira prateleira) {
        try{ 
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto à ser alterado"));
            Produto mockup = new Produto();
            mockup.setIdentificador(codigo);
            int posicao = Collections.binarySearch(prateleira, mockup);

            if (posicao < 0 ) { 
                JOptionPane.showMessageDialog(null, "Não foi encontrado o produto com codigo fornecido (" + codigo + ")." );
            } else { 
                float novoPreco = Float.valueOf(JOptionPane.showInputDialog("Digite o novo preço"));
                Produto p1 = (Produto)prateleira.get(posicao);
                p1.setPreco(novoPreco);
            }
        } catch (NumberFormatException nf) {
        }
    }
    
    public void verificarFrequencia (Prateleira prateleira) { 
        try{
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto à ser verificado a frequência"));
            Produto mockup = new Produto();
            mockup.setIdentificador(codigo);
            int quantidade = Collections.frequency(prateleira, mockup);
            JOptionPane.showMessageDialog(null, "Você possui " + quantidade + " de produtos com código " + codigo);
        } catch (Exception e){
            
        }
    }
    
    public void removerProduto (Prateleira prateleira) {
        try {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto à ser verificado a frequência"));
            Produto mockup = new Produto();
            mockup.setIdentificador(codigo);
            int posicao = Collections.binarySearch(prateleira, mockup);
            if (posicao < 0 ) { 
                JOptionPane.showMessageDialog(null, "Não foi encontrado o produto com codigo fornecido (" + codigo + ")." );
            } else { 
                prateleira.remove(mockup);
                JOptionPane.showMessageDialog(null, "Produto removido com sucesso!" );
            }
        } catch (Exception e) { 
        }
    }
    
    public void exibirProdutosPrateleira(Prateleira prateleira) {
        //verifica se a prateleira contém produtos
        if (prateleira.size() == 0)
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados");
        else {
            Produto p;
            String informacao = new String();
            informacao = "Id      Nome     Preço\n";
            Iterator<Produto> i = prateleira.iterator();
            //Visitar cada um dos produtos na prateleira
            while(i.hasNext()) {
                //pega o próximo produto
                p = i.next();
                informacao += p.getIdentificador() + "      " 
                        + p.getNome() + "     "
                        + p.getPreco() + "\n";
            }
            //exibe os dados do produto
            JOptionPane.showMessageDialog(null, informacao);
        }
    }
   
    public Produto CadastrarNovoProduto (int identificador, int codigoBarras, String nome, String descricao, float preco) {
        Produto produto1 = new Produto();
        produto1.setIdentificador(identificador);
        produto1.setCodigoBarras(codigoBarras);
        produto1.setNome(nome);
        produto1.setDescricao(descricao);
        produto1.setPreco(preco);
        return (produto1); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlIdentificador = new javax.swing.JLabel();
        jlCodigoBarras = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlDescricao = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jtIdentificador = new javax.swing.JTextField();
        jtCodigoBarras = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDescricao = new javax.swing.JTextArea();
        jbLimpar = new javax.swing.JButton();
        jbConsultaNome = new javax.swing.JButton();
        jbConsultaPreco = new javax.swing.JButton();
        jbProdutoCaro = new javax.swing.JButton();
        jbProdutoBarato = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();
        jbEncontrar = new javax.swing.JButton();
        jbAlterarPreco = new javax.swing.JButton();
        jbVerificarFrequencia = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Produto");

        jlIdentificador.setText("Identificador");

        jlCodigoBarras.setText("Codigo de Barras");

        jlNome.setText("Nome");

        jlDescricao.setText("Descrição");

        jlPreco.setText("Preço");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jtDescricao.setColumns(20);
        jtDescricao.setRows(5);
        jScrollPane1.setViewportView(jtDescricao);

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbConsultaNome.setText("Consulta ordenada por nome");
        jbConsultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaNomeActionPerformed(evt);
            }
        });

        jbConsultaPreco.setText("Consulta ordenada por preço");
        jbConsultaPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultaPrecoActionPerformed(evt);
            }
        });

        jbProdutoCaro.setText("Produto mais caro");
        jbProdutoCaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutoCaroActionPerformed(evt);
            }
        });

        jbProdutoBarato.setText("Produto mais barato");
        jbProdutoBarato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProdutoBaratoActionPerformed(evt);
            }
        });

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbEncontrar.setText("Encontrar Produto");
        jbEncontrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEncontrarActionPerformed(evt);
            }
        });

        jbAlterarPreco.setText("Alterar Preço");
        jbAlterarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarPrecoActionPerformed(evt);
            }
        });

        jbVerificarFrequencia.setText("Verificar frequência");
        jbVerificarFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerificarFrequenciaActionPerformed(evt);
            }
        });

        jbRemover.setText("Remover um produto");
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlIdentificador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlCodigoBarras)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtCodigoBarras)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPreco)
                                    .addComponent(jlNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNome)
                                    .addComponent(jtPreco)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jlDescricao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(145, 145, 145))))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbConsultaPreco)))
                    .addComponent(jbVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbVerificarFrequencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEncontrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbProdutoCaro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbProdutoBarato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbAlterarPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlIdentificador)
                    .addComponent(jtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPreco)
                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCodigoBarras)
                    .addComponent(jtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConsultaNome)
                    .addComponent(jbConsultaPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbProdutoCaro)
                    .addComponent(jbProdutoBarato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEncontrar)
                    .addComponent(jbAlterarPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVerificarFrequencia)
                    .addComponent(jbRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jbVoltar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        try{ 
            Produto produto = CadastrarNovoProduto(Integer.parseInt(jtIdentificador.getText()), 
                                 Integer.parseInt(jtCodigoBarras.getText()), 
                                 jtNome.getText(), 
                                 jtDescricao.getText(), 
                                 Float.valueOf(jtPreco.getText()));
            prateleira1.add(produto);
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!");
            jtIdentificador.setText("");
            jtCodigoBarras.setText(""); 
            jtNome.setText("");
            jtDescricao.setText(""); 
            jtPreco.setText("");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Problema ao cadastrar, verifique os dados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtIdentificador.setText("");
        jtCodigoBarras.setText(""); 
        jtNome.setText("");
        jtDescricao.setText(""); 
        jtPreco.setText("");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbConsultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaNomeActionPerformed
        if (prateleira1.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            ComparadorProdutoPorNome cppn = new ComparadorProdutoPorNome();
            Collections.sort(prateleira1, cppn);
            this.exibirProdutosPrateleira(prateleira1);
        }
    }//GEN-LAST:event_jbConsultaNomeActionPerformed

    private void jbConsultaPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultaPrecoActionPerformed
        if (prateleira1.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            ComparadorProdutoPorPreco cppp = new ComparadorProdutoPorPreco();
            Collections.sort(prateleira1, cppp);
            this.exibirProdutosPrateleira(prateleira1);
        }
    }//GEN-LAST:event_jbConsultaPrecoActionPerformed

    private void jbProdutoCaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutoCaroActionPerformed
        if (prateleira1.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            Produto p = null;
            String informacao = new String();
            informacao = "Id      Nome       Preço\n";
            Comparator ComparadorProdutoPorPreco = new ComparadorProdutoPorPreco();
            Produto p1 = (Produto) Collections.max(prateleira1, ComparadorProdutoPorPreco);
            
            jtIdentificador.setText(String.valueOf(p1.getIdentificador()));
            jtPreco.setText(String.valueOf(p1.getPreco()));
            jtCodigoBarras.setText(String.valueOf(p1.getCodigoBarras()));
            jtNome.setText(String.valueOf(p1.getNome()));
            jtDescricao.setText(String.valueOf(p1.getDescricao()));
        }
    }//GEN-LAST:event_jbProdutoCaroActionPerformed

    private void jbProdutoBaratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProdutoBaratoActionPerformed
        if (prateleira1.size() == 0){
            JOptionPane.showMessageDialog(null, "Não há produtos cadastrados", 
                                          "Erro!", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            Produto p = null;
            String informacao = new String();
            informacao = "Id      Nome       Preço\n";
            Comparator ComparadorProdutoPorPreco = new ComparadorProdutoPorPreco();
            Produto p1 = (Produto) Collections.min(prateleira1, ComparadorProdutoPorPreco);
            
            jtIdentificador.setText(String.valueOf(p1.getIdentificador()));
            jtPreco.setText(String.valueOf(p1.getPreco()));
            jtCodigoBarras.setText(String.valueOf(p1.getCodigoBarras()));
            jtNome.setText(String.valueOf(p1.getNome()));
            jtDescricao.setText(String.valueOf(p1.getDescricao()));
            
        }
    }//GEN-LAST:event_jbProdutoBaratoActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        Menu_Inicial mi = new Menu_Inicial();
        this.setVisible(false);
        mi.setVisible(true);
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbEncontrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEncontrarActionPerformed
        this.encontrarProduto(prateleira1);
    }//GEN-LAST:event_jbEncontrarActionPerformed

    private void jbAlterarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarPrecoActionPerformed
       this.alterarPreco(prateleira1);
    }//GEN-LAST:event_jbAlterarPrecoActionPerformed

    private void jbVerificarFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificarFrequenciaActionPerformed
        this.verificarFrequencia(prateleira1);
    }//GEN-LAST:event_jbVerificarFrequenciaActionPerformed

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        this.removerProduto(prateleira1);
    }//GEN-LAST:event_jbRemoverActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterarPreco;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultaNome;
    private javax.swing.JButton jbConsultaPreco;
    private javax.swing.JButton jbEncontrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbProdutoBarato;
    private javax.swing.JButton jbProdutoCaro;
    private javax.swing.JButton jbRemover;
    private javax.swing.JButton jbVerificarFrequencia;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlCodigoBarras;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlIdentificador;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JTextField jtCodigoBarras;
    private javax.swing.JTextArea jtDescricao;
    private javax.swing.JTextField jtIdentificador;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPreco;
    // End of variables declaration//GEN-END:variables

}
