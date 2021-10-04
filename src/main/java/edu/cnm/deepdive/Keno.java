package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Keno {

  public static final int POOL_SIZE = 80;
  public static final int DRAW_SIZE = 20;

  public static void main(String[] args) {
    Random random = new SecureRandom();
    Shuffler shuffler = new Shuffler(random);
    int[] kenoPool = new int[POOL_SIZE];
    for (int i = 0; i < kenoPool.length; i++) {
      kenoPool[i] = i + 1;
    }
    int[] draw = shuffler.shuffle(kenoPool, DRAW_SIZE);
    Arrays.sort(draw);
    System.out.println(Arrays.toString(draw));
  }
}
