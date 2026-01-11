/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myclass.library_book_management;

/**
 *
 * @author nafid
 */
public class Library_Book_Management {

    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Java Programming", "Nafi", 550);
        books[1] = new Book("C Programming", "Zami", 480);
        books[2] = new Book("C# Programming", "Tanjil", 600);
        books[3] = new Book("Python Programming", "Taief", 720);
        books[4] = new Book("HTML Programming", "Linkon", 390);

        System.out.println("Books priced above 500:");
        for (Book b : books) {
            if (b.price > 500) {
                b.display();
            }
        }
    }
}
