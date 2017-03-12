package com.company;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-3-12.
 */
public class LibraryManager {
    private List<Book> books =new ArrayList();

    public void addBook(String name,String isbn,String author,String category){
        Book book=new Book();
        book.setName(name);
        book.setIsbn(isbn);
        book.setAuthor(author);
        book.setCategory(category);
        books.add(book);
    }
    public void sellBook(String isbn){
        for(Book book:books){
            if(book.getIsbn().equals(isbn)){
                books.remove(book);
                break;
            }
            else {
                System.out.println("图书编号不存在，请重新输入");
            }
        }
    }
    public List<Book> findBookByName(String name){
        List<Book> result =new ArrayList<Book>();
        for(Book book:books){
            if(book.getName().contains(name)){
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> listBook(){
        return books;
    }

}
