package com.epam.learn.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class example {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();

        list.add("aaaaaa");
        list.add("bbbbbb");
        list.add("cccccc");
        list.add("dddddd");
        list.add("eeeeee");
        list.add("ffffff");
        list.add("gggggg");
        list.add("hhhhhh");


        for (int i = 0; i <list.size() ; i++) {

            //System.out.println(list.get(i));

        }


        String [] s = new String[3];

        s[0] = "Sanzhar";
        s[1] = "Zhanat";
        s[2] = "ASD";

        for (int i = 0; i <s.length ; i++) {
          //  System.out.println(s[i]);
        }

        for (String l : s){
         //   System.out.println(l);
        }


        HashSet<String> strings = new HashSet<>();
        strings.add("Sanzhar");
        strings.add("Zhanat");
        strings.add("Sanzhar");
        strings.add("Sanzhar");
        strings.add("Sanzhar");
        strings.add("Sanzhar");
        strings.add("Sanzhar");

        for (String list1 : strings){
            System.out.println(list1);
        }
    }
}

