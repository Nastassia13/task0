package com.katsuba.task0;

import org.apache.commons.io.FilenameUtils;

public class FileMain {
    public static void main(String[] args) {
        String path = FilenameUtils.getExtension(args[0]);
        System.out.println(path);
    }
}
