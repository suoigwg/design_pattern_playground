package iterator.q1;

import java.util.ArrayList;

/**
 * Created by yishengyang on 29/06/2017.
 */
public class BookShelf implements Aggregate{
    private ArrayList<Book> books;
//    private int last = 0;
    public BookShelf(int n){
        books = new ArrayList<Book>(n);

    }
    public Book getBookAt(int i){
        return books.get(i);
    }
    public void appendBook(Book book){
        books.add(book);
    }
    public int getLength(){
        return books.size();
    }
    public BookShelfIterator iterator(){
        return new BookShelfIterator(this);
    }

}
