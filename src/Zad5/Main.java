package Zad5;

import java.io.*;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            Class1.ThrowBothExceptions();
            Class1.ThrowMyException2();
        } catch (MyException1 | MyException2 e) {
            e.printStackTrace();
        }
    }
}

class Class1{
    public static void ThrowBothExceptions() throws MyException1, MyException2{
        throw new MyException1();
    }
    public static void ThrowMyException2() throws MyException2{
        throw new MyException2();
    }
}

class MyException1 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException");
    public  MyException1(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

class MyException2 extends Exception{
    private static Logger logger = Logger.getLogger("LoggingException2");
    public MyException2(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
