package ebook.classes;

import ebook.classes.classes.*;
import ebook.classes.enums.FileType;

import java.io.File;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static ebook.classes.enums.FileType.*;

public class Test<book> {
    public static void main(String[] args) {

        Application application = new Application();

        FileInfo image1 = new FileInfo("Image1.jpg", "11 Mb", IMAGE);
        FileInfo image2 = new FileInfo("Image2.jpg", "1 Mb", IMAGE);
        FileInfo image3 = new FileInfo("Image3.jpg", "16 Mb", IMAGE);
        FileInfo image4 = new FileInfo("Image4.jpg", "100 Mb", IMAGE);
        FileInfo image5 = new FileInfo("Image5.jpg", "24 Mb", IMAGE);
        FileInfo image6 = new FileInfo("Image6.jpg", "59 Mb", IMAGE);

        // ---------------------------------Paper Book---------------------------------------

        PaperBook book1 = new PaperBook("This is a paperbook", "BookHouse", 500);

        Book<PaperBook> paperBook = new Book<>(Set.of(image1, image2),
                "Don Kihot",
                "Sanches",
                300,
                book1);

        // ---------------------------------Audio Book---------------------------------------

        FileInfo audioFragment = new FileInfo("AudioFragment.mp3", "45 Mb", AUDIOFILE);

        FileInfo audioFile = new FileInfo("AudioFile.mp3","200 Mb", AUDIOFILE);

        AudioBook book2 = new AudioBook(audioFragment, LocalTime.of(2,34,32),audioFile);

        Book<AudioBook> audioBook = new Book<>(Set.of(image3, image4),
                "Samurai",
                "Alan Walker",
                200,
                book2);

        // ---------------------------------Electronic Book---------------------------------------

        FileInfo fileInfoEbook = new FileInfo("ElectronicBook.pdf", "89 Mb", PDF);

        ElectronicBook electronicBook = new ElectronicBook("This is a Electronic Book fragment",
                350,
                "DilAzyk",
                fileInfoEbook);

        Book<ElectronicBook> ebook = new Book<>(Set.of(image5, image6),
                "Tom Sayer",
                "Jack London",
                350,
                electronicBook);

        // ---------------------------------Vendor---------------------------------------

        Vendor vendor = new Vendor("Bob",
                "bob@gmail.com",
                "0777 77 77 77",
                Set.of(paperBook, audioBook, ebook));

        // ---------------------------------Client---------------------------------------

        Client client1 = new Client("John", "john@yahoo.com");

        Client client2 = new Client("Alan","alan@icloud.com");

        System.out.println(vendor.getVendorName() + "'s books");
        vendor.getBookToSale().forEach(printBook);

        System.out.println();

        application.like(client1, paperBook);
        System.out.println(client1.getClientName() + "'s liked books");
        client1.getLikedBooks().forEach(printBook);
        application.buyABook(client1, audioBook);
        application.buyABook(client1, ebook);
        System.out.println("Bought books: ");
        client1.getBoughtBooks().forEach(printBook);

        System.out.println();

        application.like(client2, audioBook);
        System.out.println(client2.getClientName() + "'s liked books");
        client2.getLikedBooks().forEach(printBook);
        application.buyABook(client2, ebook);
        application.buyABook(client2, paperBook);
        System.out.println("Bought books: ");
        client2.getBoughtBooks().forEach(printBook);


    }
    private static final Consumer<Book<?>> printBook = System.out::println;
}
