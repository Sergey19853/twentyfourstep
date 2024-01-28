package edu.training.js.task_inner;

public class Book {
	
    String title;

    public Book(String title) {
        this.title = title;
    }

    class Author {
        String name;
        int age;

        public Author(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Book book = new Book("book title");


        Book.Author author = book.new Author("Author", 20);


        System.out.println(book.title);
        System.out.println(author.name);
    }
    
}
