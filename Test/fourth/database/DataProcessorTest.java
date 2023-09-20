package fourth.database;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

class DataProcessorTest {
//    @Test
//    void queryTest(){
//        Database database = mock(Database.class);
//
//        when(database.query("БД")).;
//    }

    @Test
    void processDataTest(){
        Database database = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(database);

        dataProcessor.processData("Тест");

        verify(database,times(1)).query("Тест");
    }

}