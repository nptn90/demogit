package test.demo.exceptiondemo;

import java.io.Closeable;
import java.io.IOException;

public class CustomCloseAble implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("I'm closing");
    }
}
