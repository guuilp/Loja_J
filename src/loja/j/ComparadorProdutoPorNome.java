package loja.j;

import java.util.Comparator;

/**
 *
 * @author a110051
 */
public class ComparadorProdutoPorNome implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Produto p1 = (Produto) t;
        Produto p2 = (Produto) t1;
        return p1.getNome().compareTo(p2.getNome());
    }
    
}
