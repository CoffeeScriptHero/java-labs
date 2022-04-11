package labs.Lab3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    final int C3 = 1309 % 3; // 1 - StringBuffer
    final int C17 = 1309 % 17; // 0 - Знайти найбільшу кількість речень заданого тексту, в яких є однакові слова.
    StringBuffer stringBuffer = new StringBuffer("Hello,lol there. Hello hello world! OOP is my favorite there subject! There Hello hello.There.");

    if (!stringBuffer.isEmpty()) {
      HashMap<String, Integer> words = new HashMap<>(countSentences(stringBuffer));
      if (words.isEmpty()) {
        System.out.println("Речення не задане");
      } else {
        System.out.println(words);
        printSentencesNumber(words);
      }
    } else {
      System.out.println("Речення не задане");
    }
  }

  public static HashMap<String, Integer> countSentences(StringBuffer stringBuffer) {
    HashMap<String, Integer> words = new HashMap<>();
    StringBuffer word = new StringBuffer();
    ArrayList<String> punctuationArr = new ArrayList<>(List.of(".", "?", "!"));
    ArrayList<String> sentence = new ArrayList<>();

    for (int i = 0; i < stringBuffer.length(); i++) {
      String currentChar = String.valueOf(stringBuffer.charAt(i));
      boolean isSentenceEnd = punctuationArr.contains(currentChar);
      boolean isNotLetter = currentChar.equals(" ") || currentChar.equals(",");
      boolean isSentenceBegin = isNotLetter && word.length() == 0;
      String stringWord = String.valueOf(word).trim().toLowerCase();

      if ((isSentenceEnd || isNotLetter) && !isSentenceBegin) {
        if (!sentence.contains(stringWord) && !checkIfWordNumber(stringWord)) {
          int number = words.getOrDefault(stringWord, 0);
          words.put(stringWord, number + 1);
          sentence.add(stringWord);
        }
        if (isSentenceEnd) sentence.clear();
        word.setLength(0);
      } else {
        word.append(currentChar);
      }
    }

    return words;
  }

  public static boolean checkIfWordNumber(String word) {
    try {
      int number = Integer.parseInt(word);
      return true;
    } catch (Exception e) {
      return false;
    }
  }

   public static void printSentencesNumber(HashMap<String, Integer> words) {
     int max = 0;
     for (String word: words.keySet()) {
       if (words.get(word) > max) max = words.get(word);
     }
     System.out.printf("\nНайбільша кількість речень заданого тексту, в яких є однакові слова: %d\n", max);
   }
}