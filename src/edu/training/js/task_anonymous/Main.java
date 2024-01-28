package edu.training.js.task_anonymous;

public class Main {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Java!");
            }
        };

        greeting.sayHello();

    }
}
