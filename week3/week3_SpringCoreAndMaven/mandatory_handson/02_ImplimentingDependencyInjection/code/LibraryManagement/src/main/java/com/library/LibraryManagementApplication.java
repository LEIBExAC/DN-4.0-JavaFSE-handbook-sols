package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

            BookService bookService = (BookService) context.getBean("bookService");

            bookService.displayBookTitle();
        } catch (Exception e) {
            System.err.println("Spring context failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
