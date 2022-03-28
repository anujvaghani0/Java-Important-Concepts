package com.company;

class Liberary{
    String[] books;
    int no_of_books;
    Liberary(){
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBooks(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book +" has beeen added");
    }
    void showAvailableBooks(){
        System.out.println("Availablebooks");
        for(String book:this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println("The book has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book not exist");
    }
    void retuenBook(String book){
        addBooks(book);
    }
}
public class onlineLibrary {
    public static void main(String[] args) {
   Liberary l=new Liberary();
   l.addBooks("c");
   l.addBooks("algorithm");
   l.addBooks("computerNetwork");
   l.addBooks("bigdata");
   l.addBooks("c++");
   l.addBooks("java");
   l.addBooks("python");
   l.showAvailableBooks();
   l.addBooks("maths");
   l.showAvailableBooks();
   l.issueBook("c++");
   l.showAvailableBooks();
   l.retuenBook("c++");
   l.showAvailableBooks();
    }
}
