package org.project.domain;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @Column(name = "Id")
    @GeneratedValue(generator = "reservation_generator")
    @SequenceGenerator(
            name = "reservation_generator",
            sequenceName = "reservation_sequence",
            initialValue = 1
    )
    private long id;

    @Column(name = "ticketAvailableNr")
    private int ticketAvailableNr = 40;

    @Column(name = "createdDateTime")
    private Date dateTime;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "reservation_id")
    private List<ReservedSeat> reservedSeat = new ArrayList<>();


    public Reservation(int ticketAvailableNr, Date dateTime, User user, Schedule schedule, List<ReservedSeat> reservedSeat) {
        this.ticketAvailableNr = ticketAvailableNr;
        this.dateTime = dateTime;
        this.user = user;
        this.schedule = schedule;
        this.reservedSeat = reservedSeat;
    }

    public Reservation() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<ReservedSeat> getReservedSeat() {
        return reservedSeat;
    }

    public void setReservedSeat(List<ReservedSeat> reservedSeat) {
        this.reservedSeat = reservedSeat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTicketAvailableNr() {
        return ticketAvailableNr;
    }

    public void setTicketAvailableNr(int ticketAvailableNr) {
        this.ticketAvailableNr = ticketAvailableNr;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

}