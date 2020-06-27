package model;

public class Student {
    private String name;
    private Integer age;
    private String gender;
    private String IDNo;

    public Student(String name, Integer age, String gender, String IDNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.IDNo = IDNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDNo() {
        return IDNo;
    }

    public void setIDNo(String IDNo) {
        this.IDNo = IDNo;
    }
}
