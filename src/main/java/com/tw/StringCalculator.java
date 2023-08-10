package com.tw;

public class StringCalculator {
    public int add(String string) {

        if (string.isEmpty()){
            return 0;
        }
            String delimiter = ","; // my initial value for delimiter

            if (string.startsWith("//")){
                int indexNewLine = string.indexOf("\n"); // index is 4
                delimiter = string.substring(2,indexNewLine); // new delimiter val ";" : index is 3
                string = string.substring(indexNewLine + 1); // index is (4+1)
            }

            String[] numbers = string.split ( "[\n" +delimiter+ "]");
            int sum =0;

            for ( String num : numbers) {
                sum += Integer.parseInt(num);
            }
            return sum;
            }
        }


