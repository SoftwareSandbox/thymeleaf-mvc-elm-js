package be.swsb.tl.domain.taxonomy;

import java.util.UUID;

public class Category {
    private UUID id;
    private String name;
    private int likes;
    private Genre genre;

    public Category(final String name, final int likes, final Genre genre) {
        id = UUID.randomUUID();
        this.name = name;
        this.likes = likes;
        this.genre = genre;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLikes() {
        return likes;
    }

    public Genre getGenre() {
        return genre;
    }
}
