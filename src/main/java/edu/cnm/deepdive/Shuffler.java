package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Shuffler {

  private final Random rng;

  public Shuffler(Random rng) {
    this.rng = rng;
  }

  public void shuffle(int[] data) {
    shufflePart(data, data.length - 1);
  }

  public int[] shuffle(int[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  public void shuffle(double[] data) {
    shufflePart(data, data.length - 1);
  }

  public double[] shuffle(double[] data, int drawSize) {
    shufflePart(data, drawSize);
    return Arrays.copyOfRange(data, data.length - drawSize, data.length);
  }

  // TODO Create overloads of both forms of shuffle (full and partial) for boolean[], byte[], char[], short[], long[], float[], Object[].

  private void shufflePart(int[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        int temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  private void shufflePart(double[] data, int drawSize) {
    for (int sourceIndex = data.length - 1; sourceIndex >= data.length - drawSize; sourceIndex--) {
      int destIndex = rng.nextInt(sourceIndex + 1);
      if (sourceIndex != destIndex) {
        double temp = data[sourceIndex];
        data[sourceIndex] = data[destIndex];
        data[destIndex] = temp;
      }
    }
  }

  // TODO Create overloads of shufflePart for boolean[], byte[], char[], short[], long[], float[], Object[].
}
