package edu.training.js.task_nested;

public class University {
	
    static class Student {
        int id;
        String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        University.Student student = new University.Student(1, "Max");
        System.out.println("ID: " + student.id + " Name: " + student.name);

    }
}
