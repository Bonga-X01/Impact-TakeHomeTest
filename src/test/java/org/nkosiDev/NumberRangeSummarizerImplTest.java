package org.nkosiDev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
/**
 * Assumptions:
 * Does not contain letters
 * No duplicates
 *
 */
public class NumberRangeSummarizerImplTest {

    @Test
    public void collect_stringOfNumbers_returnIntegerCollection() {

        var numberRangeSummarizer = new NumberRangeSummarizerImpl();

        Collection<Integer> expectedList = new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));

        var actualList = numberRangeSummarizer.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31");

        assertEquals(expectedList , actualList);
    }

    @Test
    public void summarizeCollection_integerCollection_returnRageSummaryString() {

        NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();

        Collection<Integer> integerCollection = new ArrayList<>(Arrays.asList(1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31));

        var expectedSummaryString = "1, 3, 6-8, 12-15, 21-24, 31";

        var actualSummaryString = numberRangeSummarizer.summarizeCollection(integerCollection);

        assertEquals(expectedSummaryString , actualSummaryString);
    }
}