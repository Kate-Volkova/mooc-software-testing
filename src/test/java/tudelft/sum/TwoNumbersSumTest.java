package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    public void threeAndTwoNumbers () {
        TwoNumbersSum sumResult = new TwoNumbersSum();
        ArrayList <Integer> first = new ArrayList <Integer>();
        first.add(1);
        first.add(2);
        first.add(3);
        ArrayList <Integer> second = new ArrayList <Integer>();
        second.add(2);
        second.add(1);
        ArrayList<Integer> result = sumResult.addTwoNumbers (first,second);
        ArrayList <Integer> actRes = new ArrayList <Integer>();
        actRes.add(1);
        actRes.add(4);
        actRes.add(4);
        Assertions.assertEquals(actRes, result);
    }

    @Test
    public void zeroLoop () {
        TwoNumbersSum sumResult = new TwoNumbersSum();
        ArrayList <Integer> first = new ArrayList <Integer>();
        ArrayList <Integer> second = new ArrayList <Integer>();
        ArrayList<Integer> result = sumResult.addTwoNumbers (first,second);
        ArrayList <Integer> actRes = new ArrayList <Integer>();
        Assertions.assertEquals(actRes, result);
    }
    @Test
    public void oneLoop () {
        TwoNumbersSum sumResult = new TwoNumbersSum();
        ArrayList <Integer> first = new ArrayList <Integer>();
        first.add(2);
        ArrayList <Integer> second = new ArrayList <Integer>();
        second.add(7);
        ArrayList<Integer> result = sumResult.addTwoNumbers (first,second);
        ArrayList <Integer> actRes = new ArrayList <Integer>();
        actRes.add(9);
        Assertions.assertEquals(actRes, result);
    }

    @Test
    public void totalEqualsTen () {
        TwoNumbersSum sumResult = new TwoNumbersSum();
        ArrayList <Integer> first = new ArrayList <Integer>();
        first.add(6);
        ArrayList <Integer> second = new ArrayList <Integer>();
        second.add(4);
        ArrayList<Integer> result = sumResult.addTwoNumbers (first,second);
        ArrayList <Integer> actRes = new ArrayList <Integer>();
        actRes.add(1);
        actRes.add(0);
        Assertions.assertEquals(actRes, result);
    }
}
