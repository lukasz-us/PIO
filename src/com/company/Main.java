package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList();

        list.add("jeden");
        list.add("dwa");
        list.add("trzy");

        for (String element:list) {
            System.out.println(element);

        }

        System.out.println("===================");

        Iterator <String> iterator=list.iterator();

        while (iterator.hasNext()){
            String element=iterator.next();
            System.out.println(element);
        }


        //Player player = new PlayerComp("Ewa");

        //Game game = new Game();
        //game.add(player);
        //game.play();


    }
}