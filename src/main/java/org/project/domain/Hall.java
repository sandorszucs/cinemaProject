package org.project.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "halls")
public class Hall {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "hall_generator")
    @SequenceGenerator(
            name = "hall_generator",
            sequenceName = "hall_sequence",
            initialValue = 1
    )
    private long id;

    @Column(name = "location")
    private String location;

    @Column(name = "capacity")
    private int capacity = 40;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "hall_id")
    private List<Seat> seats;


    public Hall(String location, int capacity) {
        this.location = location;
        this.capacity = capacity;
    }

    public Hall() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
