package com.crud.library.domain;

import com.sun.istack.NotNull;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

public class Copy {
    private int id;
    private int copyId;
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

    public int getCopyId() {
        return copyId;
    }

    public void setCopyId(int copyId) {
        this.copyId = copyId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
