package content.composition.entities;

public class Comment {

    // text: string

    private String text;

    public Comment (String text) {

        this.text = text;

    }

    @Override
    public String toString () {

        return text;

    }

}
