package com.aouhi.rai.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="ta_news")
public class TaNews implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="image")
    private String image;

    @Column(name="url")
    private String url;

    public TaNews() { }

    public TaNews(Integer id, String title, String description, String image, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "TaNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
