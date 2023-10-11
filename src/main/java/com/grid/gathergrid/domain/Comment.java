package com.grid.gathergrid.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Comment {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private String eval;
    @ManyToOne
    private User user;
    @ManyToOne
    private Event event;

    public Comment() {
    }

    public Comment(String content, String eval, User user, Event event) {
        this.content = content;
        this.eval = eval;
        this.user = user;
        this.event = event;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEval() {
        return eval;
    }

    public void setEval(String eval) {
        this.eval = eval;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return Objects.equals(content, comment.content) && Objects.equals(eval, comment.eval) && Objects.equals(user, comment.user) && Objects.equals(event, comment.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, eval, user, event);
    }
}
