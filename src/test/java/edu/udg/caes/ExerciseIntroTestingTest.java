package edu.udg.caes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseIntroTestingTest {

    @Test
    public void testFindLast(){
        final int result = ExerciseIntroTesting.findLast(new int []{2, 3, 5}, 2);
        assertEquals(result, 0);
    }

    @Test
    public void testFindLast_2(){
        final int result = ExerciseIntroTesting.findLast(new int []{1, 3, 2}, 2);
        assertEquals(result, 2);
    }

    @Test
    public void testLastZero(){
        final int result = ExerciseIntroTesting.lastZero(new int []{0, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testLastZero_2(){
        final int result = ExerciseIntroTesting.lastZero(new int []{3, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive(){
        final int result = ExerciseIntroTesting.countPositive(new int []{-4, 2, 0, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive_2(){
        final int result = ExerciseIntroTesting.countPositive(new int []{-4, 2, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPos(){
        final int result = ExerciseIntroTesting.oddOrPos(new int []{-3, -2, 0, 1, 4});
        assertEquals(result, 3);
    }

    @Test
    public void testOddOrPos_2(){
        final int result = ExerciseIntroTesting.oddOrPos(new int []{-2, 0, 1, 4, 8});
        assertEquals(result, 3);
    }
}