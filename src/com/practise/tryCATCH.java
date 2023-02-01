package com.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class tryCATCH {
    public static void main(String[] args) throws IOException {
       File f1 = new File("D:\\study\\java\\01 Introduction to Course\\attached_files\\002 Three Things You need to Know");
       try(FileInputStream fileInputStream = new FileInputStream(f1)) {
           System.out.println("Hello");
       }
    }
}
