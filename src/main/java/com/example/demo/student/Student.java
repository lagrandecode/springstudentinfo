package com.example.demo.student;

public class Student   {
    private Long id;
    private String name;
    private String email;
    private String LocalDate;
    private int age;


    public Student(){
    }

    public Student(Long id, String name, String email, String date, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.LocalDate = date;
        this.age = age;
    }


    public Student(String name, String email, String date, int age) {
        this.name = name;
        this.email = email;
        this.LocalDate = date;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalDate() {
        return LocalDate;
    }

    public void setLocalDate(String localDate) {
        LocalDate = localDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", LocalDate='" + LocalDate + '\'' +
                ", age=" + age +
                '}';
    }
}
