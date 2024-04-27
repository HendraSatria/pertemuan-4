/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 * 
 */

import java.util.HashSet;
public class similaritaskata {
    
    public static void main(String[] args) {
        String string1 = "kasur";
        String string2 = "rusak";

        double similarity = calculateJaccardSimilarity(string1, string2);
        System.out.println("Similarity: " + similarity);
    }

    public static double calculateJaccardSimilarity(String s1, String s2) {
        // Menghitung set karakter unik untuk setiap string
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();

        for (char c : s1.toCharArray()) {
            set1.add(c);
        }

        for (char c : s2.toCharArray()) {
            set2.add(c);
        }

        // Menghitung intersection dan union
        HashSet<Character> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        HashSet<Character> union = new HashSet<>(set1);
        union.addAll(set2);

        // Menghitung similarity
        return (double) intersection.size() / union.size();
    }
}
    