package review.otherFiles;

public class AdditionEntity {

    private Double valueSentByUser;

    private Double totalResult;

    public AdditionEntity (Double valueSentByUser) {
        this.valueSentByUser = valueSentByUser;
    }

    public Double addValuesToVariable (Double valueSentByUser) {
         totalResult += valueSentByUser;
         return totalResult;
    }

    public Double getValueSentByUser () {
        return valueSentByUser;
    }

    public void setValueSentByUser (Double valueSentByUser) {
        this.valueSentByUser = valueSentByUser;
    }

}
