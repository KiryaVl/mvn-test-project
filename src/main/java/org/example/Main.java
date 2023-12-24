package org.example;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String word = "Laksadsfadsg";
        List<Character> characterList = Lists.charactersOf(word);
        System.out.println(characterList);
        System.out.println("____________________________");
        System.out.println(Lists.reverse(characterList));
        var a = Lists.partition(characterList, 2);
        System.out.println("____________________________");
        System.out.println(a);

        List<Character> strings1 = Lists.charactersOf("aksapr");
        List<Character> strings2 = Lists.charactersOf("aksdasq");
        Set<Character> characterSet = Sets.union(Sets.newHashSet(strings1), Sets.newHashSet(strings2));
        System.out.println(characterSet);
        System.out.println("____________________________");
        Set<Character> interSet = Sets.intersection(Sets.newHashSet(strings1), Sets.newHashSet(strings2));
        System.out.println(interSet);
        System.out.println("____________________________");
        System.out.println(Sets.difference(characterSet,interSet));

    }
}