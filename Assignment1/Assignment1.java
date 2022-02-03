import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Assignment1 {
    public static void main(String[] args) {
        
        // Question 1:
        String test1 = "wow";
        String test2 = "cici";
        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));

        // Question 2:
        String test3 = "qwerty";
        String test4 = "hello";
        System.out.println(isUnique(test3));
        System.out.println(isUnique(test4));

        // Question 3:
        String test5 = "duplicated";
        String test6 = "only";
        System.out.println(duplicity(test5));
        System.out.println(duplicity(test6));

        // Question 4:
        String test7 = "only";
        String test8 = "lyon";
        System.out.println(isAnagram(test7, test8));

        String test9 = "hello";
        String test10 = "hi";
        System.out.println(isAnagram(test9, test10));

        // Question 5:
        int test11 = 2020;
        int test12 = 2000;
        int test13 = 1990;
        int test14 = 2022;
        System.out.println(isLeapYear(test11));
        System.out.println(isLeapYear(test12));
        System.out.println(isLeapYear(test13));
        System.out.println(isLeapYear(test14));

        // Question 6:
        int test15 = 80;
        int test16 = 125;
        int test17 = 179;
        int test18 = 280;
        System.out.println(calculateBills(test15));
        System.out.println(calculateBills(test16));
        System.out.println(calculateBills(test17));
        System.out.println(calculateBills(test18));

        // Question 7:
        String test19 = "ton";
        String test20 = "point";
        String test21 = "hi";
        String test22 = "hello";
        System.out.println(isConstructed(test19, test20));
        System.out.println(isConstructed(test21, test22));

        // Question 8:
        char test23 = 'A';
        char test24 = 'B';
        char test25 = 'C';
        char test26 = 'D';
        char test27 = 'E';
        System.out.println(grade(test23));
        System.out.println(grade(test24));
        System.out.println(grade(test25));
        System.out.println(grade(test26));
        System.out.println(grade(test27));

        // Question 9:
        Book book = new Book("1984", 10002938, "Story", 19.9);
        book.setName("Puppy Dog Brochure");
        book.setBookID(30028472);
        book.setGenres("Instructional");
        book.setPrice(9.9);
        System.out.println(book.getName());
        System.out.println(book.getBookID());
        System.out.println(book.getGenres());
        System.out.println(book.getPrice());

        // Question 10:
        Box box = new Box(2,3,5);
        System.out.println(box.calculateVolume());
        
    }

    // Question 1: Write a program find if String is Palindrome?
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Question2: Write a program to check if a string has all unique characters.
    public static boolean isUnique(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                return false;
            }
        }
        return true;
    }

    //Question 3. Write a program to check if string contains duplicates
    public static boolean duplicity(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            } else {
                return true;
            }
        }
        return false;
    }

    // Question 4: Write a program to check if two strings are anagrams. Anagrams are strings which can be made by rearranging characters in string.
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--;
            if (counts[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    // Question 5:  Write a program to determine whether the year is a leap year or not.
    //    Leap Years are any year that can be evenly divided by 4.
    //    A year that is evenly divisible by 100 is a leap year only if it is also evenly divisible by 400.
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    // Question 6: Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
    //    Plus $ 0.60 per call for next 50 calls.
    //    Plus $ 0.50 per call for next 50 calls.
    //    Plus $ 0.40 per call for any call beyond 200 calls.
    //    Use Switch Statement in the function.
    public static double calculateBills(int calls) {
        double bills = 0;
        int index = calls / 50;
        switch (index) {
            case 0 : bills = 200;
            break;
            case 1 : bills = 200;
            break;
            case 2 : bills = 200 + (calls - 100) * 0.6;
            break;
            case 3 : bills = 230 + (calls - 150) * 0.5;
            break;
            default : bills = 255 + (calls - 200) * 0.4;
            break;
        }
        return bills;
    }

    // Question 7: Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
    //    Each letter in magazine can only be used once in ransomNote.
    public static boolean isConstructed(String randomNote, String magazine) {
        if (randomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : randomNote.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }

        return true;
    }

    // Question 8 : Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
    //    Grade     Meaning
    //      A       Excellent
    //      B       Good
    //      C       Average
    //      D       Deficient
    //      E       Failing
    public static String grade(char grade) {
        String result = null;
        switch(grade) {
            case 'A': result = "Excellent";
            break;
            case 'B': result = "Good";
            break;
            case 'C': result = "Average";
            break;
            case 'D': result = "Deficient";
            break;
            case 'E': result = "Failing";
            break;
            default: result = "Invalid grade!";
            break;
        }
        return result;
    }
}

// Question 9: Write a program to create a book class. The Book class would have following private variables
//    String name;
//    int bookID;
//    String genres;
//    double price;
//    Create a constructor to initialize the values. Create getters and setters for variables.
class Book {
    private String name;
    private int bookID;
    String genres;
    double price;

    public Book(String name, int bookID, String genres, double price) {
        this.name = name;
        this.bookID = bookID;
        this.genres = genres;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Question 10: Implement a class Box {
//        double width;
//        double height;
//        double depth;
//    }
//    Initialize the value through constructor. Write a function to calculate the box volume.
class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double calculateVolume() {
        return width * height * depth;
    }
}
