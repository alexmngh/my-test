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
  // поле ИД ГРУППЫ
  private int groupId;
  // поле факультет
  private int facultet;
  //университет
  private int universitet;


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

  public int getGroupId() {
    return groupId;
  }

  public void setGroupId(int groupId) {
    this.groupId = groupId;
  }

  public int getFacultet() {
    return facultet;
  }

  public void setFacultet(int facultet) {
    this.facultet = facultet;
  }

  public int getUniversitet() {
    return universitet;
  }

  public void setUniversitet(int universitet) {
    this.universitet = universitet;
  }
}