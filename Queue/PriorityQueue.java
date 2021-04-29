//https://www.hackerrank.com/challenges/java-priority-queue/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    int getID() {
        return id;
    }

    String getName() {
        return name;
    }

    double getCGPA() {
        return cgpa;
    }

}

class Priorities {
    List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> sq;
        sq = new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName)
                .thenComparing(Student::getID));
        List<Student> students = new ArrayList<Student>();
        for (String s : events) {
            Scanner in = new Scanner(s);
            String event = in.next();
            if (event.equals("ENTER")) {
                String name = in.next();
                float cgpa = in.nextFloat();
                int id = in.nextInt();
                Student student = new Student(id, name, cgpa);
                sq.add(student);
            } else if (event.equals("SERVED")) {
                Student first = sq.poll();
            }
            in.close();
        }
        Student first = sq.poll();
        if (first == null) {
            return students;
        } else {
            while (first != null) {

                students.add(first);
                first = sq.poll();

            }
            return students;
        }
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}
