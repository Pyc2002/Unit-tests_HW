package fourth.hotel;


import fourth.weather.WeatherReporter;
import fourth.weather.WeatherService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class BookingServiceTest {
    @Test
    void isRoomAvailableTest(){
        HotelService hotelService = mock(HotelService.class);

        when(hotelService.isRoomAvailable(10)).thenReturn(true);

        assertThat(hotelService.isRoomAvailable(10)).isEqualTo(true);
    }

    @Test
    void bookRoomTest() {
        HotelService hotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(hotelService);

       bookingService.bookRoom(10);

        verify(hotelService, times(1)).isRoomAvailable(10);
    }




}