package com.example.org.springboot.crudlaptop.entity;

import javax.persistence.*;

@Entity
@Table(name = "characteristic")
public class Characteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "screen_diagonal")
    private String screenDiagonal;

    @Column(name = "memory")
    private String memory;

    @Column(name = "cores")
    private String cores;

    @Column(name = "processor")
    private String processor;

    @Column(name = "graphics")
    private String graphics;

    @Column(name = "storage")
    private String storage;

    public Characteristic() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphics() {
        return graphics;
    }

    public void setGraphics(String graphics) {
        this.graphics = graphics;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Characteristic{" +
                "id=" + id +
                ", screenDiagonal='" + screenDiagonal + '\'' +
                ", memory='" + memory + '\'' +
                ", cores='" + cores + '\'' +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}
