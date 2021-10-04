package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Keno {

  public static void main(String[] args) {
    Random random = new SecureRandom();
    Shuffler shuffler = new Shuffler(random);
    int[] kenoPool = new int[80];
    for (int i = 0; i < kenoPool.length; i++) {
      kenoPool[i] = i + 1;
    }
    int[] draw = shuffler.shuffle(kenoPool, 20);
    Arrays.sort(draw);
    System.out.println(Arrays.toString(draw));
  }
}
