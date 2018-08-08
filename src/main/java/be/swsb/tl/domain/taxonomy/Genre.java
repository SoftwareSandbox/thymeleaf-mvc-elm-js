package be.swsb.tl.domain.taxonomy;

import java.util.UUID;

public class Genre {
    private UUID id;
    private String name;
    private int likes;

    public Genre(final String name, final int likes) {
        id = UUID.randomUUID();
        this.name = name;
        this.likes = likes;
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
}
