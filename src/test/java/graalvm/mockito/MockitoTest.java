package graalvm.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Moritz Halbritter
 */
class MockitoTest {
    @Test
    void mockInterface() {
        MyService mock = Mockito.mock(MyService.class);
        Mockito.when(mock.hello()).thenReturn("Hello from mock");
        assertThat(mock.hello()).isEqualTo("Hello from mock");
    }

    @Test
    void mockClass() {
        MyServiceImpl mock = Mockito.mock(MyServiceImpl.class);
        Mockito.when(mock.hello()).thenReturn("Hello from mock");
        assertThat(mock.hello()).isEqualTo("Hello from mock");
    }

    @Test
    void spyClass() {
        MyServiceImpl spy = Mockito.spy(MyServiceImpl.class);
        assertThat(spy.hello()).isEqualTo("Hello from MyServiceImpl");
        Mockito.verify(spy).hello();
    }
}
