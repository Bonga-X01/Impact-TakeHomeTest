package org.nkosiDev;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer{

    @Override
    public Collection<Integer> collect(String input) {
        return Arrays.stream(input.split(","))
                .filter(item-> !item.contains("."))//delete doubles
                .filter(item-> !item.isEmpty())//delete whitespaces
                .map(Integer::valueOf).sorted()
                .collect(Collectors.toList());
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {

        StringBuilder summary = new StringBuilder();
        Integer[] arrayOfNumbers = input.toArray(Integer[]::new);

        Predicate<Integer> hasSuccessor = currentIndex -> (currentIndex + 1 < arrayOfNumbers.length && arrayOfNumbers[currentIndex + 1] == arrayOfNumbers[currentIndex] + 1);

        BiPredicate<Integer, Integer> haveNoRange  = (start, end) -> Objects.equals(end, start);

        BiFunction<Integer, Integer, String> getRange = (start, end) -> haveNoRange.test(start, end) ? (start + ", ") : (start + "-" + end + ", ");

        Function<String, String> trimOutput = str -> str.substring(0,str.length()-2);

        int index = 0;

        while(index<arrayOfNumbers.length) {

            int start,end;

            start = arrayOfNumbers[index];
            //continue until sequence breaks
            while(hasSuccessor.test(index)) index++;

            end = arrayOfNumbers[index];

            summary.append(getRange.apply(start, end));

            index++;
        }// time complexity - O(n)

        return trimOutput.apply(summary.toString());
    }
}
