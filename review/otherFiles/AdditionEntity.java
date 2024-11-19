package review.otherFiles;

public class AdditionEntity {

    private Double valueSentByUser;

    private double totalResult;

    public AdditionEntity (Double valueSentByUser) {
        this.valueSentByUser = valueSentByUser;
    }

    public Double addValuesToVariable (Double valueSentByUser) {
         return totalResult += valueSentByUser;
    }

    public Double getValueSentByUser () {
        return valueSentByUser;
    }

    public void setValueSentByUser (Double valueSentByUser) {
        this.valueSentByUser = valueSentByUser;
    }

}
