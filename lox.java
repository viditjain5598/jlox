package com.craftinginterpreters.lox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

public class Lox{
    public static void runFile(String path) throws IOException {
        byte[] bytes = Files.readAllBytes(Paths.get(path));
        run(new String(bytes, Charset.defaultCharset()));
    }

    public static void runPrompt() thrws IOException {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
    }

    public static void main(String[] args){
        if(args.length>1){
            System.out.println("usage: jlox [script]");
            System.exit(64);
        } else if(args.length == 1){
            runFile(args[0]);
        } else{
            runPrompt();
        }
    }
}
