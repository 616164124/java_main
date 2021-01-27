package com.dataStructure.sparsearray;

/** 稀疏数组 五子棋棋盘 */
public class SparseArray {
  public static void main(String[] args) {
    // 1、一个棋盘为11*11
    int[][] checkerboard = new int[11][11];
    // 2 棋子 1为白棋  2为黑棋
    checkerboard[1][3] = 1;
    checkerboard[2][4] = 2;
    checkerboard[5][4] = 1;
    checkerboard[7][5] = 2;
    // 打印棋盘
    System.out.println("打印棋盘: checkerboard.length   " + checkerboard.length);
    int a = 0;
    for (int i = 0; i < checkerboard.length; i++) {
      for (int j = 0; j < checkerboard.length; j++) {
        if (checkerboard[i][j] != 0) {
          a++;
        }
        System.out.print(checkerboard[i][j] + "\t");
      }
      System.out.println(); // 为了换行
    }
    // 转化为稀疏数组
    // 1、稀疏数组第一个数记录了 棋盘的行 ，列，有多少值
    int[][] sparsArray = new int[a + 1][3];
    sparsArray[0][0] = checkerboard.length;
    sparsArray[0][1] = checkerboard.length;
    sparsArray[0][2] = a;
    // 2、第二行开始记录 行列值
    int count = 1;
    for (int i = 0; i < checkerboard.length; i++) {
      for (int j = 0; j < checkerboard.length; j++) {
        if (checkerboard[i][j] != 0) {
          sparsArray[count][0] = i;
          sparsArray[count][1] = j;
          sparsArray[count][2] = checkerboard[i][j];
          count++;
        }
      }
    }
    // 打印稀疏数组
    System.out.println("打印稀疏数组 + sparsArray.length   " + sparsArray.length);
    for (int i = 0; i < sparsArray.length; i++) {
      System.out.print(sparsArray[i][0] + "\t" + sparsArray[i][1] + "\t" + sparsArray[i][2] + "\t");
      System.out.println();
    }
  }

  // 计算中同色的棋子数是否大于5个
  public static int count(int[][] sparsArray) {
    // TODO

    return 1;
  }

  /**
   * 判断是否可以落子
   *
   * @param sparsArray
   * @param checkerboard 落子的位置
   */
  public static boolean laozi(int[][] sparsArray, int[][] checkerboard) {

    if (sparsArray.length < 2) {
      return true;
    } else {

    }
    return true;
  }
}
