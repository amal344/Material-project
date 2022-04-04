package com.example.demo.Material;


import org.hibernate.validator.constraints.Length;

import javax.persistence.*;

@Entity
@Table(name = "materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String language;
    @Column(nullable = false)
    private String section;
    @Length(max = 100)
    private String url;
    @Length(max = 50)
    private String author;
    private String attachments;
    @Length(max = 150)
    private String title;
    @Length(max = 1000)
    private String content;


    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getLanguage() {
        return language;
    }

    public String getSection() {
        return section;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthor() {
        return author;
    }

    public String getAttachments() {
        return attachments;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Material() {
    }

    public Material(int id, String date, String language, String section, String url, String author, String attachments, String title, String content) {
        this.id = id;
        this.date = date;
        this.language = language;
        this.section = section;
        this.url = url;
        this.author = author;
        this.attachments = attachments;
        this.title = title;
        this.content = content;
    }


}
