package com.crud.library.domain.copy;

import com.crud.library.domain.title.Title;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "COPIES")
public class Copy {
    private int id;
    private String status;
    private Title title;


    public Copy(String status) {
        this.status = status;
    }

    public Copy() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
