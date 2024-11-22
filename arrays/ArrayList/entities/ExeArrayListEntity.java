package arrays.ArrayList.entities;

public class ExeArrayListEntity {

    private String randomName;

    private Integer randomAge;

    public ExeArrayListEntity (String randomName, Integer randomAge) {

        this.randomName = randomName;

        this.randomAge = randomAge;

    }

    @Override
    public String toString () {
        return randomName + " " + randomAge;
    }

    

}
