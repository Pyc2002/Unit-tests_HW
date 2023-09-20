package fourth.book;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.*;
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
}