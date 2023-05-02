package org.nkosiDev;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        NumberRangeSummarizer numberRangeSummarizerImpl = new NumberRangeSummarizerImpl();
        Collection<Integer> integerCollection = numberRangeSummarizerImpl.collect("");
        String summaryString = numberRangeSummarizerImpl.summarizeCollection(integerCollection);
        System.out.println(summaryString);
    }
}