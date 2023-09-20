package fourth.weather;


import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class WeatherReporterTest {
    @Test
    void weatherServiceTest(){
        WeatherService weatherServiceMock = mock(WeatherService.class);

        when(weatherServiceMock.getCurrentTemperature()).thenReturn(24);

        assertThat(weatherServiceMock.getCurrentTemperature()).isEqualTo(24);

    }

    @Test
    void extracted() {
        WeatherService weatherServiceMock = mock(WeatherService.class);
        WeatherReporter weatherReporterMock = new WeatherReporter(weatherServiceMock);

        weatherReporterMock.generateReport();

        verify(weatherServiceMock, times(1)).getCurrentTemperature();
    }
}