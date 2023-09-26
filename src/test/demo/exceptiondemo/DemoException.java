package test.demo.exceptiondemo;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DemoException {

    public static void main(String[] args) {
        CheckedException checkedException = new CheckedException();
        checkedException.demoCheckedException();
        // Checked exception vs unchecked exception
        UnCheckedException exception = new UnCheckedException();
        exception.demoUnCheckedException();
    }

    /**
     * Checked Exception catch IDE. Throw error if not catch in Compile time
     * Ex: IOException...
     */
    static class CheckedException {
        public void demoCheckedException() {
            try (CustomCloseAble is = new CustomCloseAble()) {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Not catch by IDE. Happen in Runtime
     * Ex: NullPointerException...
     */
    static class UnCheckedException {
        public void demoUnCheckedException() {
            throw new CustomUncheckedException();
//            throw new NullPointerException();
        }
    }

}
