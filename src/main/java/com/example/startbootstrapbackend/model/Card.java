package com.example.startbootstrapbackend.model;

public class Card {

    private int id;
    private String title;
    private String description;

    // 상세 페이지에서 사용할 추가 데이터
    private String detail;
    private String subjects;

    public Card(int id, String title, String description,
            String detail, String subjects) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.detail = detail;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDetail() {
        return detail;
    }

    public String getSubjects() {
        return subjects;
    }
}