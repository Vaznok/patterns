package com.epam.learning.decorator.additional;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
    public static void main(String[] args) throws IOException {
        int ch;
        InputStream inputStream = new LowerCaseInputStream(new FileInputStream("C:\\Users\\Vitalii_Vlasenko\\text.txt"));
        while((ch = inputStream.read()) != -1) {
            System.out.print((char) ch);
        }
        inputStream.close();
    }
}
