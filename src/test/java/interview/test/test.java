package interview.test;

import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {

        FrequencyTest("aaaabbbbsssddbs");


        String str = "Mike likes butter but butter is finished";

        System.out.println("mostRepeatedWord(str) = " + mostRepeatedWord(str));

        System.out.println(reversed(str));


    }

    public static String reversed(String str){
        String[] split = str.split(" ");
        String result = "";

        for (int j=0; j<split.length; j++) {
            String word = split[j]+" ";
            char[] chars = word.toCharArray();

            for (int i = chars.length-1; i >=0 ; i--) {

                result+=chars[i];

            }

        }


        return result;

    }

    public static void FrequencyTest(String string) {

        String[] split = string.split("");

        Map<String, Integer> map = new HashMap<>();

        for (String s : split) {
            if (map.containsKey(s)) map.replace(s, map.get(s) + 1);
           else
               map.put(s, 1);

        }
        int max = 0;
        String a = "";
        for (String entry : map.keySet()) {

            if (map.get(entry) > max) {
                max = map.get(entry);
                a = entry;
            }
        }

        System.out.println("The most frequent character is "+a+" "+max);
    }
    public static String mostRepeatedWord(String sentence) {

        String[] splitSentence = sentence.toLowerCase().split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < splitSentence.length; i++) {
            if (map.containsKey(splitSentence[i])){
                map.replace(splitSentence[i], map.get(splitSentence[i])+1);
            }else {
                map.put(splitSentence[i], 1);
            }
        }

        String word="";
        int count=0;

        for (String entry: map.keySet()){
            if(map.get(entry)>count){
                word=entry;
                count=map.get(entry);
            }
        }
        return word + " : "+ count;
    }
}



