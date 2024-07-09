package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void numDecodingsTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.numDecodings("12"));
        assertEquals(3, solution.numDecodings("226"));
        assertEquals(0, solution.numDecodings("06"));
    }

}