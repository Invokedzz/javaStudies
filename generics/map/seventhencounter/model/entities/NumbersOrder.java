package generics.map.seventhencounter.model.entities;

import java.util.Objects;

public class NumbersOrder {

    private String numbersKey;

    public NumbersOrder () {}

    public NumbersOrder ( String numbersKey ) {

        this.numbersKey = numbersKey;

    }

    public String getNumbersKey () {

        return numbersKey;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumbersOrder that)) return false;
        return Objects.equals(getNumbersKey(), that.getNumbersKey());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumbersKey());
    }

    @Override
    public String toString() {
        return "NumbersOrder{" +
                "numbersKey='" + numbersKey + '\'' +
                '}';
    }
}
