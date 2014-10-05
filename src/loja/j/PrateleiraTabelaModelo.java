package loja.j;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author a110051
 */
public class PrateleiraTabelaModelo extends AbstractTableModel {

    Prateleira prateleira;
    String[] cabecalhoColunas = { "Id", "Nome", "Descrição", "Preço" };
    
    public PrateleiraTabelaModelo (Prateleira prateleira) { 
        this.prateleira = prateleira;
    }
    
    public String getColumnName (int col) { 
        return cabecalhoColunas[col].toString();
    }
    
    @Override
    public int getRowCount() {
        return prateleira.size();
    }

    @Override
    public int getColumnCount() {
        return cabecalhoColunas.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Produto produto = (Produto) prateleira.get(row);
        
        switch(col) {
            case 0:
                return produto.getIdentificador();
            case 1:
                return produto.getNome();
            case 2:
                return produto.getDescricao();
            case 3:
                return produto.getPreco();
            default:
                return "Erro! não existe o atributo desejado.";
        }
    }
   
    
    @Override
    public boolean isCellEditable (int row, int col) {
        return false;
    }
    
    
    public void setValueAt(Object value, int row, int col) { 
        
    }
}
