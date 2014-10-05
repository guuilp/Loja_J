package loja.j;

import java.util.Comparator;

/**
 *
 * @author a110051
 */
public class ComparadorClientePorRG implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Cliente c1 = (Cliente) t;
        Cliente c2 = (Cliente) t1;
        
        return c1.getRg().compareTo(c2.getRg());
    }
    
}
