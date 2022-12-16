package com.crud.library.domain;

import com.sun.istack.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

public class Copy {
    private int id;
    private int titleId;
    private String status;

    @Entity
    @Table(name = "COPIES")
    public Copy(String status) {
        this.status = status;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name ="ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToMany (targetEntity = Title.class,
            mappedBy = "title",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    @NotNull
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
