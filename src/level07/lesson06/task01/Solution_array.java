package com.javarush.test.level07.lesson06.task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Artyom on 23.06.2016.
 */
public class Solution_array
{
    public static void main(String[] args) throws IOException
    {
        ArrayList <String> list = new ArrayList <String> ();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;i<5;i++){
            System.out.println("Enter a string: ");
            list.add(reader.readLine());
        }
        System.out.println(list);
        int maxLenght = list.get(0).length();
        String max = list.get(maxLenght);
        for(int i=0;i<5;i++){
            if(list.get(i).length()> maxLenght){
                maxLenght = list.get(i).length();
            }

        }
        System.out.println("Max is - " + maxLenght + ",  value: - " + max);
    }

}