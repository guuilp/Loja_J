package loja.j;

import java.util.Comparator;

/**
 *
 * @author a110051
 */
public class ComparadorProdutoPorPreco implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Produto p1 = (Produto) t;
        Produto p2 = (Produto) t1;
        if (p1.getPreco() == p2.getPreco()) {
            return 0;
        }
        else if (p1.getPreco() < p2.getPreco()) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
