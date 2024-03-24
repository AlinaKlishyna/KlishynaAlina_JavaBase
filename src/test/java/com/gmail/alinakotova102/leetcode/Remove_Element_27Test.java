package com.gmail.alinakotova102.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Remove_Element_27Test {
    Remove_Element_27 removeElement27;

    @BeforeEach
    void setUp() {
        removeElement27 = new Remove_Element_27();
    }

    @DisplayName("Simple values")
    @Test
    void removeElementCase01() {
        removeElement27.removeElement(new int[]{3,2,2,3}, 3);

        int[] expected = {2,2};
    }
}