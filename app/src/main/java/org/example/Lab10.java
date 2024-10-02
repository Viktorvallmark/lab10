package org.example;

/** Lab10 */
public class Lab10 {
  /* Uppgift 6 */

  public int[] bubbleSortData(int[] arr) {
    for (int i : arr) {
      System.out.println("raw data: " + i);
    }
    for (int k = 1; k < arr.length; k++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] < arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    for (int i : arr) {
      System.out.println("bubble sorted data: " + i);
    }
    return arr;
  }

  /* Uppgift 7 */

  public int[][] compareEntries(int[][] first, int[][] second) {

    if ((first.length != second.length) || ((first[0].length != second[0].length))) {
      System.out.println("Wrong dimensions");
      int[][] bad = {{-1}};
      return bad;
    }

    int[][] answer = new int[first.length][first[0].length];

    for (int i = 0; i < first.length; i++) {
      for (int j = 0; j < first[0].length; j++) {

        if (first[i][j] > second[i][j]) {
          answer[i][j] = first[i][j];
        } else {
          answer[i][j] = second[i][j];
        }
      }
    }
    return answer;
  }

  /* Uppgift 8 */

  public int[] selectionSortData(int[] arr) {
    for (int i : arr) {
      System.out.println("raw data: " + i);
    }
    for (int i = 0; i < arr.length - 1; i++) {
      int indexSmallest;
      indexSmallest = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[indexSmallest]) {
          indexSmallest = j;
        }
      }
      if (indexSmallest != i) {
        int temp;
        temp = arr[i];
        arr[i] = arr[indexSmallest];
        arr[indexSmallest] = temp;
      }
    }
    return arr;
  }

  public int[] insertionSortData(int[] arr) {
    for (int i : arr) {
      System.out.println("raw data insertion: " + i);
    }

    for (int i = 1; i < arr.length; i++) {
      int help;
      help = i;
      while ((help > 0) && (arr[help] < arr[help - 1])) {
        int temp;
        temp = arr[help];
        arr[help] = arr[help - 1];
        arr[help - 1] = temp;
        help--;
      }
    }

    return arr;
  }

  /* uppgift 9 */

  public boolean[][] survivalGame(int[][] data) {
    return null;
  }

  /* uppgift 10 */

}
