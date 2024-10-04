package org.example;

import java.util.Scanner;

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

    boolean[][] answer = new boolean[data.length][data[0].length];

    for (int i = 0; i < data.length; i++) {
      for (int j = 0; j < data[i].length; j++) {
        int sum;
        sum = 0;
        for (int k = -1; k < 2; k++) {
          for (int o = -1; o < 2; o++) {
            if ((i + k >= 0)
                && (i + k < data.length)
                && (j + o >= 0)
                && (j + o < data[i].length)
                && !(k == 0 && o == 0)) {
              sum += data[i + k][j + o];
            }
          }
        }
        if ((sum >= 15) || (data[i][j] >= 3)) {
          answer[i][j] = false;
        } else {
          answer[i][j] = true;
        }
      }
    }

    return answer;
  }

  /* uppgift 10 */
  private String buildReceipt(String[] freeCard) {
    String receipt = "";
    receipt += "------- Receipt -------\n\n";
    for (String string : freeCard) {
      receipt += string;
    }
    receipt += "\n-----------------------\n\n";
    return receipt;
  }

  public void dentistReception(Scanner scan) {

    int cost = 0;
    int index = 0;
    int choice;
    String receipt = "";
    boolean run = true;
    String[][] treatment = {
      {"Controll teeth", "600"}, {"Clean teeth", "300"}, {"Root canal", "1500"}
    };
    String[] freeCard = new String[10];

    while (run) {

      System.out.println(
          "What do you want to do?: \n"
              + " 0. Controll teeth. \n"
              + " 1. Clean teeth \n"
              + " 2. Root canal \n "
              + "-1. Get invoice and exit");
      // TODO: NoSuchElementException fix
      choice = scan.nextInt();
      switch (choice) {
        case 0:
          System.out.println(
              "You chose: "
                  + treatment[0][0]
                  + " and the cost "
                  + treatment[0][1]
                  + "kr has been added.");
          cost += Integer.parseInt(treatment[0][1]);
          freeCard[index] = "Controll teeth          600kr\n\n";
          index++;

          if (index > 9) {
            receipt += buildReceipt(freeCard);
            receipt += "Cost                 " + cost + "kr\n";
            if (cost >= 3000) {
              receipt += "Discount             " + (cost - (cost * 0.9)) + "kr\n";
            }
            receipt += "Sum total            " + (cost * 0.9) + "kr\n";
            System.out.println(receipt);
            run = false;
            break;
          }
          break;
        case 1:
          System.out.println(
              "You chose: "
                  + treatment[1][0]
                  + " and the cost "
                  + treatment[1][1]
                  + "kr has been added.");
          cost += Integer.parseInt(treatment[1][1]);
          freeCard[index] = "Clean teeth          300kr\n\n";
          index++;

          if (index > 9) {
            receipt += buildReceipt(freeCard);
            receipt += "Cost                 " + cost + "kr\n";
            if (cost >= 3000) {
              receipt += "Discount             " + (cost - (cost * 0.9)) + "kr\n";
            }
            receipt += "Sum total            " + (cost * 0.9) + "kr\n";
            System.out.println(receipt);
            run = false;
            break;
          }
          break;
        case 2:
          System.out.println(
              "You chose: "
                  + treatment[2][0]
                  + " and the cost "
                  + treatment[2][1]
                  + "kr has been added.");
          cost += Integer.parseInt(treatment[2][1]);
          freeCard[index] = "Root canal          1500kr\n\n";
          index++;

          if (index > 9) {
            receipt += buildReceipt(freeCard);
            receipt += "Cost                 " + cost + "kr\n";
            if (cost >= 3000) {
              receipt += "Discount             " + (cost - (cost * 0.9)) + "kr\n";
            }
            receipt += "Sum total            " + (cost * 0.9) + "kr\n";
            System.out.println(receipt);
            run = false;
            break;
          }
          break;
        case -1:
          receipt += buildReceipt(freeCard);
          receipt += "Cost                 " + cost + "kr";
          if (cost >= 3000) {
            receipt += "Discount             " + (cost * 0.9) + "kr";
          }
          receipt += "Sum total            " + (cost - (cost * 0.9)) + "kr";
          System.out.println(receipt);

          run = false;
          break;
        default:
          System.out.println("Something went horribly wrong in the event loop");
          break;
      }
    }
  }
}
