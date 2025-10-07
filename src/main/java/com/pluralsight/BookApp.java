package com.pluralsight;

import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books= new Book[20];

        Book book1= new Book(1,"977-215-576","Billy Bob Adventure");
        books[0] = new Book(1, "977-215-576", "Billy Bob Adventure");
        books[1] = new Book(2, "978-045-234", "Mystery of the Lost Island");
        books[2] = new Book(3, "979-314-789", "Journey to the Stars");
        books[3] = new Book(4, "976-125-654", "The Hidden Kingdom");
        books[4] = new Book(5, "975-998-112", "Secrets of the Old Mansion");
        books[5] = new Book(6, "974-223-887", "Legends of the Sea");
        books[6] = new Book(7, "973-421-564", "The Enchanted Forest");
        books[7] = new Book(8, "972-312-438", "Code of the Samurai");
        books[8] = new Book(9, "971-658-249", "Whispers in the Wind");
        books[9] = new Book(10, "970-777-345", "Chronicles of Time");
        books[10] = new Book(11, "969-155-934", "The Great Invention");
        books[11] = new Book(12, "968-288-120", "The Forgotten Realm");
        books[12] = new Book(13, "967-455-873", "Love Across Oceans");
        books[13] = new Book(14, "966-874-234", "The Art of War Reimagined");
        books[14] = new Book(15, "965-213-789", "Adventures in Coding");
        books[15] = new Book(16, "964-123-456", "The Desert Nomad");
        books[16] = new Book(17, "963-987-654", "Rise of the Phoenix");
        books[17] = new Book(18, "962-321-432", "Echoes of Eternity");
        books[18] = new Book(19, "961-222-345", "The Last Horizon");
        books[19] = new Book(20, "960-111-678", "Tales of Tomorrow");





        for (Book book:books) {
            System.out.println(book);
        }




    }
}
