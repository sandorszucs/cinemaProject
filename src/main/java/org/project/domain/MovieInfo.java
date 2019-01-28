package org.project.domain;

import javax.persistence.*;

@Entity
@Table(name = "movieInfo")
public class MovieInfo {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "movieInfo_generator")
    @SequenceGenerator(
            name = "movieInfo_generator",
            sequenceName = "movieInfo_sequence",
            initialValue = 1
    )
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "movieType")
    private String movieType;

    @Column(name = "director")
    private String director;

    @Column(name = "actor")
    private String actor;

    @Column(name = "venue")
    private String venue;



    public MovieInfo(long id, String title, String movieType, String director, String actor, String venue) {
        this.id = id;
        this.title = title;
        this.movieType = movieType;
        this.director = director;
        this.actor = actor;
        this.venue = venue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return actor;
    }

    public void setCast(String cast) {
        this.actor = cast;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }
}
