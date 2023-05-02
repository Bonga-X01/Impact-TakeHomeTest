package org.nkosiDev;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Assumptions:
 * Input is a string of unique integers in ascending order.
 *
 */
public class NumberRangeSummarizerImplTest {

    //tests for basic input
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

    //tests for single integer input
    @Test
    public void collect_numericString_returnIntegerCollection() {

        var numberRangeSummarizer = new NumberRangeSummarizerImpl();

        Collection<Integer> expectedList = new ArrayList<>(List.of(4));

        var actualList = numberRangeSummarizer.collect("4");

        assertEquals(expectedList , actualList);
    }
    @Test
    public void summarizeCollection_integerCollection_returnNumericString() {

        NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();

        Collection<Integer> integerCollection = new ArrayList<>(List.of(4));

        var expectedSummaryString = "4";

        var actualSummaryString = numberRangeSummarizer.summarizeCollection(integerCollection);

        assertEquals(expectedSummaryString , actualSummaryString);
    }

    //tests for empty input
    @Test
    public void collect_emptyString_returnEmptyCollection() {

        var numberRangeSummarizer = new NumberRangeSummarizerImpl();

        Collection<Integer> expectedList = new ArrayList<>(List.of());

        var actualList = numberRangeSummarizer.collect("");

        assertEquals(expectedList , actualList);
    }
    @Test
    public void summarizeCollection_emptyCollection_returnEmptyString() {

        NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();

        Collection<Integer> integerCollection = new ArrayList<>(List.of());

        var expectedSummaryString = "";

        var actualSummaryString = numberRangeSummarizer.summarizeCollection(integerCollection);

        assertEquals(expectedSummaryString , actualSummaryString);
    }
}