package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Comic> allComics = new ArrayList<>();

        Comic exampleComic = new Comic(987, "Batman", 123, "The Batman",
                1939, 0.10, 1000000.00);

        allComics.add(exampleComic);
    }
}
