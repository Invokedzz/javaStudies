package composition.entities;

import composition.entities.Comment;

import java.time.LocalDate;

import java.util.List;

import java.util.ArrayList;

public class Post {

    // moment (LocalDate), title (String), content (String), likes (int) -> comment;

    private final LocalDate moment;

    private final String title;

    private final String content;

    private final int likes;

    private final List <Comment> comments = new ArrayList<>();

    public Post (LocalDate moment, String title, String content, int likes) {

        this.moment = moment;

        this.title = title;

        this.content = content;

        this.likes = likes;

    }

    public List<Comment> getComment () {
        return comments;
    }

    public void addComments (Comment comment) {

        comments.add(comment);

    }

    public void removeComments (Comment comment) {

        comments.remove(comment);

    }

    @Override
    public String toString () {

        return moment + " " + title + " " + content + " " + likes;

    }

}
