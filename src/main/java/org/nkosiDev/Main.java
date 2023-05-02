package org.nkosiDev;

import java.util.Collection;

/**
 * Assumptions:
 * Input is a string of unique integers in ascending order.
 *
 */

public class Main {
    public static void main(String[] args) {

        NumberRangeSummarizer numberRangeSummarizerImpl = new NumberRangeSummarizerImpl();
        String input = "1,2,4,5,6,8,10,11,12";
        Collection<Integer> integerCollection = numberRangeSummarizerImpl.collect(input);
        String summaryString = numberRangeSummarizerImpl.summarizeCollection(integerCollection);
        System.out.println(summaryString);
    }
}