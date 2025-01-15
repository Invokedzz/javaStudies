package lambdaandmore.firstencounter.src.entities2;

import java.util.Comparator;

public class ComparatorForProduct2 implements Comparator < Product2 > {

    @Override
    public int compare(Product2 o1, Product2 o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }

}
