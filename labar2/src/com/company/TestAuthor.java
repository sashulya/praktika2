package com.company;

public class TestAuthor {

    public static void main(String[] args) {
    Author a1 = new Author("Ivan", "vanek123@mail.ru", 'm');
    a1.setEmail("ivan_alekseevich@gmail.com");
    String k = a1.toString();
    System.out.println(k);
    }
}
