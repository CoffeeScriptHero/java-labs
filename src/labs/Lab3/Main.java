package labs.Lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final int C3 = 1309 % 3; // 1 - StringBuffer
        final int C17 = 1309 % 17; // 0 - Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.
        StringBuffer text = new StringBuffer("Hello,lol there. Hello hello world! OOP is my favorite there subject! There Hello hello.There.");

        if (!text.isEmpty()) {
            HashMap<String, Integer> wordsMap = new HashMap<>(countSentences(text));
            if (wordsMap.isEmpty()) {
                System.out.println("Речення не задане");
            } else {
                System.out.println(wordsMap);
                printSentencesNumber(wordsMap);
            }
        } else {
            System.out.println("Речення не задане");
        }
    }

    public static HashMap<String, Integer> countSentences(StringBuffer text) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        StringBuffer word = new StringBuffer();
        ArrayList<String> punctuationArr = new ArrayList<>(List.of(".", "?", "!"));
        ArrayList<String> sentenceOfWords = new ArrayList<>();

        for (int i = 0; i < text.length(); i++) {
            String currentChar = String.valueOf(text.charAt(i));
            boolean isSentenceEnd = punctuationArr.contains(currentChar);
            boolean isNotLetter = currentChar.equals(" ") || currentChar.equals(",");
            boolean isSentenceBegin = isNotLetter && word.length() == 0;
            String stringWord = String.valueOf(word).trim().toLowerCase();

            if ((isSentenceEnd || isNotLetter) && !isSentenceBegin) {
                if (!sentenceOfWords.contains(stringWord) && !isNumber(stringWord)) {
                    int number = wordsMap.getOrDefault(stringWord, 0);
                    wordsMap.put(stringWord, number + 1);
                    sentenceOfWords.add(stringWord);
                }
                if (isSentenceEnd) {
                    sentenceOfWords.clear();
                }
                word.setLength(0);
            } else {
                word.append(currentChar);
            }
        }

        return wordsMap;
    }

    public static boolean isNumber(String word) {
        try {
            Integer.parseInt(word);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void printSentencesNumber(HashMap<String, Integer> wordsMap) {
        int max = 0;
        for (String word : wordsMap.keySet()) {
            if (wordsMap.get(word) > max) {
                max = wordsMap.get(word);
            }
        }
        System.out.printf("\nНайбільша кількість речень заданого тексту, в яких є однакові слова: %d\n", max);
    }
}