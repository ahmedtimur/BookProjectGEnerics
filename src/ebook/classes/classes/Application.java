package ebook.classes.classes;

import ebook.classes.exceptions.AlreadyDislikedException;
import ebook.classes.exceptions.AlreadyLikedException;

public class Application {

    public void like(Client client, Book<?> book) {
        try {
            if(client.getLikedBooks().contains(book)) {
                throw new AlreadyLikedException();
            }
            client.likedBookMethod(book);
            book.like();
        }
        catch (AlreadyLikedException e) {
            System.err.printf("Client %s already had liked %s book%n", client.getClientName(), book.getBookName());
        }


    }

    public void dislike(Client client, Book<?> book) {
        try {
            if (client.getLikedBooks().contains(book)) {
                throw new AlreadyDislikedException();
            }
            client.dislikedBook(book);
            book.dislike();
        }
        catch (AlreadyDislikedException e) {
            System.err.printf("Client %s already had disliked %s book%n", client.getClientName(), book.getBookName());
        }

    }

    public void buyABook(Client client, Book<?> book) {
        client.buyABook(book);
    }
}
