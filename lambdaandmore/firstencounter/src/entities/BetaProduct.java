package lambdaandmore.firstencounter.src.entities;

public class BetaProduct extends Product1 {

    public BetaProduct () {

        super();

    }

    public BetaProduct ( String name, Double price ) {

        super( name, price );

    }

    @Override
    public int compareTo(Product1 o) {

        return getPrice().compareTo(o.getPrice());

    }

}
