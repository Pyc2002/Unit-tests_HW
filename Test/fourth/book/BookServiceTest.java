package fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    void SetUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }
    @Test
    void findAllBooksTest(){
        bookService.findAllBooks();

        verify(bookRepository, times(1)).findAll();
    }

    @Test
    void findBookByIdTest(){
        bookService.findBookById("2");

        verify(bookRepository, times(1)).findById("2");
    }
    @Test
    void findByIdTest(){
        when(bookRepository.findById("0")).thenReturn(new Book("0", "Название", "Автор"));

        assertEquals(bookRepository.findById("0"), bookService.findBookById("0"));
    }

    @Test
    void findAllTest(){
        List<Book> list = new ArrayList<>();
        Book bookOne = new Book("0", "Назание", "Автор");
        Book bookTwo = new Book("1", "Название1", "Автор2");
        list.add(bookOne);
        list.add(bookTwo);

        when(bookRepository.findAll()).thenReturn(list);

        assertEquals(bookRepository.findAll(), bookService.findAllBooks());
    }
}