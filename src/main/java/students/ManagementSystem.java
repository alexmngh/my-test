package students;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public class ManagementSystem {

  private Collection<Student> students;

  // Для шаблона Singletone статическая переменная
  private static ManagementSystem instance;

  // закрытый конструктор
  private ManagementSystem() {
//    loadGroups();
    loadStudents();
  }

  // метод getInstance - проверяет, инициализирована ли статическая
  // переменная (в случае надобности делает это) и возвращает ее
  private static synchronized ManagementSystem getInstance() {
    if (instance == null) {
      instance = new ManagementSystem();
    }
    return instance;
  }

  // Метод, который вызывается при запуске класса
  public static void main(String[] args) {
    // Этот код позволяет нам перенаправить стандартный вывод в файл
    // Т.к. на экран выводится не совсем удобочитаемая кодировка,
    // файл в данном случае более удобен
    try {
      System.setOut(new PrintStream("out.txt"));
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
      return;
    }

//    ManagementSystem ms = ManagementSystem.getInstance();





//далее


  }

  // Метод создает несколько студентов и помещает их в коллекцию
  public void loadStudents() {
    if (students == null) {
      // Мы используем коллекцию, которая автоматически сортирует свои элементы
      students = new TreeSet<Student>();
    } else {
      students.clear();
    }

    Student s = null;

    // Вторая группа
    s = new Student();
    s.setStudentId(1);
    s.setFirstName("Иван");
    s.setSurName("Степанов");
    s.setFacultet("стройфак");
    s.setUniversitet(UniverName.РИНИ);
    students.add(s);

    s = new Student();
    s.setStudentId(2);
    s.setFirstName("Наталья");
    s.setSurName("Чичикова");
    s.setFacultet("энего");
    s.setUniversitet(UniverName.РИНИ);
    students.add(s);

    // Первая группа
    s = new Student();
    s.setStudentId(3);
    s.setFirstName("Петр");
    s.setSurName("Сушкин");
    s.setFacultet("прим");
    s.setUniversitet(UniverName.РИНИ);
    students.add(s);

    s = new Student();
    s.setStudentId(4);
    s.setFirstName("Вероника");
    s.setSurName("Ковалева");
    s.setFacultet("горный");
    s.setUniversitet(UniverName.РИНИ);
    students.add(s);
  }

  // Добавить студента
  public void insertStudent(Student student) {
    // Просто добавляем объект в коллекцию
    students.add(student);
  }

  // Получить список всех студентов
  public Collection<Student> getAllStudents() {
    return students;
  }







  // Этот код позволяет нам изменить кодировку
  // Такое может произойти если используется IDE - например NetBeans.
  // Тогда вы получаете просто одни вопросы, что крайне неудобно читать
  public static void printString(Object s) {
    //System.out.println(s.toString());
    try {
      System.out.println(new String(s.toString().getBytes("windows-1251"), "windows-1251"));
    } catch (UnsupportedEncodingException ex) {
      ex.printStackTrace();
    }
  }

  public static void printString() {
    System.out.println();
  }
}