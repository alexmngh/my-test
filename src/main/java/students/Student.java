package students;

import java.text.Collator;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {

  // поле ИД СТУДЕНТА
  private int studentId;
  // поле ИМЯ
  private String firstName;
  // поле ФАМИЛИЯ
  private String surName;
  // поле факультет
  private String facultet;
  //университет
  private String universitet;


  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }

  public String getFacultet() {
    return facultet;
  }

  public void setFacultet(String facultet) {
    this.facultet = facultet;
  }

  public String getUniversitet() {
    return universitet;
  }

  public void setUniversitet(String universitet) {
    this.universitet = universitet;
  }
}