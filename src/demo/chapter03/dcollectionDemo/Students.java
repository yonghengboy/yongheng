package demo.chapter03.dcollectionDemo;

import java.util.HashMap;

public class Students {
    String number;//学号
    String name;//姓名
    String classes;//班级
    public Students(String number, String name, String classes) {
        this.number=number;
        this.name=name;
        this.classes=classes;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    HashMap<String, Students> weatherMap = new HashMap<>();
  // Students
}
