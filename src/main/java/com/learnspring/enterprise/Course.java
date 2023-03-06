package com.learnspring.enterprise;

public class Course {
    public Course(int id, String course, String author) {
        this.id = id;
        this.course = course;
        this.author = author;
    }

    int id;
    String course;
    String author;

    public int getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
