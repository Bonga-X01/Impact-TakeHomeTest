package org.nkosiDev;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        NumberRangeSummarizer numberRangeSummarizerImpl = new NumberRangeSummarizerImpl();
        Collection<Integer> x = numberRangeSummarizerImpl.collect("1,-3,-8,-9,6,7,8,12,13,14,15,21,22,23,24,31");
        System.out.println(numberRangeSummarizerImpl.summarizeCollection(x));
    }
}