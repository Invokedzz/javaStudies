package composition.application;

import composition.entities.Comment;
import composition.entities.Post;

import java.time.LocalDate;

public class MediaApp {

    public static void main (String[] args) {

        mainApplication();

    }

    private static void mainApplication () {

        LocalDate date = LocalDate.parse("2020-08-10");

        Comment element = new Comment("Nice one!");

        Post post = new Post(date, "Traveling to New Zealand", "Beautiful Country", 10);

        post.addComments(element);

        System.out.println(post);

    }

}
