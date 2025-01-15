package generics.map.seventhencounter.model.entities;

import java.util.Objects;

public class NumbersValue {

    private String numbersValue;

    public NumbersValue () {}

    public NumbersValue ( String numbersValue ) {

        this.numbersValue = numbersValue;

    }

    public String getNumbersValue () {

        return numbersValue;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumbersValue that)) return false;
        return Objects.equals(getNumbersValue(), that.getNumbersValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNumbersValue());
    }

    @Override
    public String toString() {
        return "NumbersValue{" +
                "numbersValue='" + numbersValue + '\'' +
                '}';
    }
}
