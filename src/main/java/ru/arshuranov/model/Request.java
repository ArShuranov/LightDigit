package ru.arshuranov.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Request {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    private Date date;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "consumer_id")
    private Consumer consumer;


    public Request() {
    }

    public Request(long id, String text, Date date, Status status) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return id == request.id && Objects.equals(text, request.text) && Objects.equals(date, request.date) && status == request.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, date, status);
    }

}
