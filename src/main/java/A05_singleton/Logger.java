package A05_singleton;

import java.io.*;

class Logger {
    private static Logger instance;
    private String fileName = "logger.txt";
    private Writer writer;

    private Logger() {
        try {
            writer = new FileWriter(fileName);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String name) {
        close();
        fileName = name;
        try {
            writer = new FileWriter(fileName);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void write(String text) {
        try {
            writer.write(text);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void writeln(String text) {
        try {
            writer.write(text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
