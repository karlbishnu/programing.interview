package net.bishnu.kakao.first2017.round1.no1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * http://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
 */
public class SecretMapTest {

    @Test
    public void asciiTest(){

        System.out.println(String.format("%ctest", 0x20));
        System.out.println(Integer.toBinaryString(1<<5));
    }

    @Test
    public void test(){
        int n = 5;
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        String[] expected = new String[]{"#####","# # #", "### #", "#  ##", "#####"};

        assertArrayEquals(expected, SecretMap.solution(n, arr1, arr2));
    }

    @Test
    public void test2(){
        int n = 6;
        int[] arr1 = new int[]{46, 33, 33 ,22, 31, 50};
        int[] arr2 = new int[]{27 ,56, 19, 14, 14, 10};
        String[] expected = new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "};

        assertArrayEquals(expected, SecretMap.solution(n, arr1, arr2));
    }
}