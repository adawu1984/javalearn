package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManager lm = new LibraryManager();

        while(true){
            System.out.println("=====******欢迎使用图书管理系统*********=========");
            System.out.println("1.添加书籍");
            System.out.println("2.借出书籍");
            System.out.println("3.查找书籍");
            System.out.println("4.列出所有书籍");
            System.out.println("请你输入操作:");
            String num =  scanner.nextLine();

            if(num.equals("1")){
                System.out.println("请分别录入书籍名称,isbn,作者,分类:");
                String[] info = scanner.nextLine().split(",");
                lm.addBook(info[0],info[1],info[2],info[3]);
            }

            if(num.equals("2")){
                System.out.println("请录入所借书籍的isbn:");
                String isbn1 = scanner.nextLine();
                lm.sellBook(isbn1);
            }

            if(num.equals("3")){
                System.out.println("请录入需要查找的书籍名称:");
                String name = scanner.nextLine();
                List<Book> books =lm.findBookByName(name);
                for(Book book:books){
                    System.out.println(String.format("%s,%s,%s,%s",book.getName(),book.getIsbn(),book.getAuthor(),book.getCategory()));
                }
            }

            if(num.equals("4")){
                List<Book> books =lm.listBook();
                for(Book book:books){
                    System.out.println(String.format("%s,%s,%s,%s",book.getName(),book.getIsbn(),book.getAuthor(),book.getCategory()));
                }
            }
        }


    }
}
