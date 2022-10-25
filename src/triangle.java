public class triangle {
    private int n;                               //行数
    private int[][] yh;                       //参差数组

    public triangle(int n) {                   //有参数
        this.n = n;
    }

    public void lnit() {
         yh = new int[n][];              //初始化杨辉三角形数组 赋值为0
        for (int i = 0; i < yh.length; i++) {
            yh[i] = new int[i + 1];                //给每个二维数据的元素赋值一维数组
            for (int j = 0; j < yh[i].length; j++) {
                yh[i][j] = 0;                           //赋值为0
            }
        }
    }

    public void make() {           //生成杨辉三角形
            for (int i = 0; i < yh.length; i++) {
                yh[i] = new int[i + 1];                //给每个二维数据的元素赋值一维数组
                for (int j = 0; j < yh[i].length; j++) {
                    if (j == 0 || i == j) {                                  //开头值1
                        yh[i][j] = 1;
                    } else {
                        yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];          //肩部值
                    }
                }
            }
    }

        public void print(){                  //输出杨辉三角形数组
            for (int i = 0; i < yh.length; i++) {
                for (int j = 0; j < yh.length - 1 - i; j++) {
                    System.out.print(" ");                                //打印空格
                }
                for (int j = 0; j < yh[i].length; j++) {                  //打印杨辉三角形
                    System.out.print(yh[i][j] + " ");
                }
                System.out.println();
            }
        }

}
