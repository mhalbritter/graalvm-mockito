package graalvm.mockito;

/**
 * @author Moritz Halbritter
 */
public class MyServiceImpl implements MyService {
    @Override
    public String hello() {
        return "Hello from MyServiceImpl";
    }
}
