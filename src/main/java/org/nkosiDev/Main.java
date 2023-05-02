package org.nkosiDev;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        NumberRangeSummarizer numberRangeSummarizerImpl = new NumberRangeSummarizerImpl();
        Collection<Integer> x = numberRangeSummarizerImpl.collect("4");
        System.out.println(numberRangeSummarizerImpl.summarizeCollection(x));
    }
}