package LeetCode.One;

import javax.swing.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        // 创建一个包含测试数据的数组
        int[] nums = {1,0,1,1,1,0,1,1,1,1,0,1,1,0};

        // 创建Solution类的实例
        Solution solution = new Solution();

        // 调用方法并传入数组
        int result = solution.findMaxConsecutiveOnes(nums);

        int[] nums2 = {4, 2, 1};
        System.out.println(solution.checkPossibility(nums2)); // 输出: false

    }



/*
303. 区域和检索 - 数组不可变

    给定一个整数数组  nums，处理以下类型的多个查询:
    计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right

    实现 NumArray 类：
        NumArray(int[] nums) 使用数组 nums 初始化对象
        int sumRange(int i, int j) 返回数组 nums 中索引 left 和 right 之间的元素的 总和 ，包
       含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] )
*/
    /*
    项目分析：
        1.输入：一个整数数组 两个索引值
        2.输出：用两个索引值切割整型数组  将索引值范围内的数值相加
        3.实现NumArray
            用于实现索引范围内的元素总和

        4.实现思路：
            1.构建一个前缀和数组
               2.每次查询使用前缀和去运算
*/
class NumArray {
//创建一个数组 用于储存前缀和、
    private  int[] s;
    public NumArray(int[] nums) {
        //初始化前缀和数组 长度为nums.length+1
        s=new int[nums.length+1];

        //构建前缀和数组
        for (int i = 0; i < nums.length; i++) {
            //i[i+1] 表示i+1个元素的和
            //s[i]表示前i个元素的和
            //nums[i]表示第i个元素 的值
            s[i+1]=s[i]+nums[i];
        }
    }
    //用于计算子数组的和，从索引left到right
    public int sumRange(int left, int right) {
        //使用前缀和数组s 计算区间和
        //s[rigth+1] 表示前rigth+1 个元素的和  因为前方储存的时候 偏移了一位 所以这里也需要偏移一位
        return s[right+1]-s[left];
    }
}

/*
289. 生命游戏
    根据 百度百科 ， 生命游戏 ，简称为 生命 ，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。

    给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。
    每个细胞都具有一个初始状态： 1 即为 活细胞 （live），或 0 即为 死细胞 （dead）。
    每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：

    如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
    如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
    如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
    如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
    下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，
    其中细胞的出生和死亡是同时发生的。给你 m x n 网格面板 board 的当前状态，返回下一个状态。
*/
    /*
    项目分析：
    1.输入：一个mxn的数组
        输出：使用原地算法 用生命游戏更新后将其输出
    2.生命游戏规则： 活-周围八个  （活<两个）将该位置细胞死 --死
                  活------(2>=活<=3)---活
                  活------（活>3）-----死
                  死-----（活==3）-----复活
    3.实现思路：
            1.周围坐标可用（0,-1,1）
            2.已知死为0，活为1，那么再加两个值 2为复活的 -1为由生到死的、
            3.遍历细胞
            4.嵌套遍历周围的细胞 并且根据规则进行判断
            5.根据结果更新数组
            6.最后更新将-1 2 改回0 1
     */
    public void gameOfLife(int[][] board) {
        //设定一个坐标用于查找周围的细胞
        int[] xy={-1,0,1};
        //获取数组的长宽
        int rows =board.length;//宽--x
        int cols =board[0].length;//长--y
        //遍历矩形
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //统计活细胞数量
                int liveNeighbors =0;
                //根据xy坐标遍历周围八个细胞状态 xy数组只有3个数
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        //排除自身位置  自身位置 为 0 0
                        if (!(xy[k]==0&&xy[l]==0)){//如果不为当前位置便执行
                            int r=i+xy[k];//获取横坐标
                            int c =j+xy[l];//获取纵坐标
                            //判断当前位置是否为活细胞
                            /*
                            * (r<rows&&r>=0)&&(c < cols && c >= 0) 用于判断是超出边界
                            * r < rows：
                                检查 r 是否小于 rows，确保 r 不超过数组的最大行索引。
                                如果 r 等于或大于 rows，说明 r 超出了数组的行范围。
                            *
                             r >= 0：
                                检查 r 是否大于或等于 0，确保 r 不小于数组的最小行索引。
                                如果 r 小于 0，说明 r 在数组的行范围之外。
                            *
                              c < cols：
                                检查 c 是否小于 cols，确保 c 不超过数组的最大列索引。
                                 如果 c 等于或大于 cols，说明 c 超出了数组的列范围。
                             *
                               c >= 0：
                              检查 c 是否大于或等于 0，确保 c 不小于数组的最小列索引。
                               如果 c 小于 0，说明 c 在数组的列范围之外。
                               *
                               *
                             后半部分用于判断是否初始值为活
                             * Math.abs用于判断board[r][c])==1  绝对值是否为1  因为1 和-1 初始值都是活 -1是由活到死
                               * */
                            if ((r<rows&&r>=0)&&(c < cols && c >= 0)&&Math.abs(board[r][c])==1){
                                //确认是活细胞计数器++
                                liveNeighbors+=1;
                            }

                        }
                    }
                    
                }
                //根据规则确定生死
                /*
                * 判断先确认是否是活的 确认以后再确定附近活的数量 最后判断生死*/
                if(board[i][j]==1/*确定是活的*/&&(liveNeighbors<2||liveNeighbors>3)/*死的条件为活大于3或者小于2*/){
                    board[i][j]=-1;//过去是活的现在死了。
                }
                /*复活的条件为活==3  并且原本是死的*/
                if(board[i][j]==0&&liveNeighbors==3){
                    board[i][j]=2;//过去死了  现在复活了
                }
            }
        }
//        更新状态  使其变为应返回的数组格式
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j]>0){
                    //大于0 的为活的状态 1活 2复活状态
                    board[i][j]=1;
                }else /*其他的便都为死*/{
                    board[i][j]=0;
                }
            }
        }
    }



/*48. 旋转图像
    给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。
    你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。*/
   /*
   *项目分析：
   *    1.需求：
   *        输入：一个2*2的矩阵
   *        输出：矩阵90度旋转以后输出
   *    2.不能使用另一个矩阵来旋转图像，只能原地旋转
   *    3.思路：
   *        设置两个循环，外层循环用来遍历矩阵的每一层，内层循环用来遍历当前层的每一个元素。
   *        在遍历每一个元素的时候，将当前元素与它旋转90度后的位置的元素进行交换，这样就完成了对当前元素的旋转。这个过程是通过四次交换来完成的。
   *        继续遍历下一个元素，直到所有的元素都被旋转。
   *        当所有的元素都被旋转后，就完成了对矩阵的旋转。
   *        这个算法的主要思想是通过旋转矩阵的每一层来实现矩阵的旋转，而不是直接旋转整个矩阵，这样可以大大减少计算的复杂度。
   *
   * */
    public void rotate(int[][] matrix) {
        //先获取数组的长度
        int n =matrix.length;
        //设置两个循环 外层用来循环矩阵的每一层 内层用来遍历当前层的每一个元素
        for (int i = 0; i < n/2; i++) {//需要旋转的圈数为 n/2
            for (int j = i; j < n-i-1; j++) {//从当前圈数开始  -1是因为最后一列已经被处理 不用重复处理
                int temp =matrix[i][j];//先保存上边的
                //左边给上边
                matrix[i][j]=matrix[n-1-j][i];
                //下边给左边
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                //右边赋值给下边
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                //上边赋值给右边
                matrix[j][n-1-i]=temp;
            }
        }
    }







/*566. 重塑矩阵
    在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。
    给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。
    重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。
    如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。
    */
    /*
    * 任务分析：
    *   1.需求
    *     输入：一个m*n的矩阵  需要重塑成矩阵的行数和列数
    *     输出：重塑完成后的新矩阵 rXc
    *   2.需要将原始数组中的数据保存到一个队列中/或者依次读取数组中的数据 再将其依次放入新矩阵中
    *   3.如何遍历数组 并且执行读取或者写入的操作
    *       需要套两层for循环  外层为行 内层为列
    *           列： for(int i=0;i<m;i++){//超过边界换行
    *                行：for(int j=0;j<n;j++){在循环中执行 写入或者读取}
    *               }
    *   4.如何解决 同时把读取旧矩形 再将数据填入新矩形
    *       直接放入一个一维数组中
    *   5. 检查新矩阵的总元素数量是否与原矩阵的总元素数量匹配 如果不匹配，返回原矩阵
    *
    * */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length,n=mat[0].length;
        int[][] newarray=new int[r][c];//新的数组
        int[] sum =new int[c*r];
        int cont=0;//计数器
        if (m*n!=r*c){//检查新矩阵的总元素数量是否与原矩阵的总元素数量匹配
            return mat;//如果不匹配，返回原矩阵
        }
        for (int i=0;i<m;i++){//二维数组转为一维数组
            for (int j = 0; j < n; j++) {
                sum[cont]=mat[i][j];//将所在位置数据给一维数组
                cont++;
            }
        }
        cont=0;
        for (int i=0;i<r;i++){//录入到新的数组
            for (int j = 0; j < c; j++) {
                newarray[i][j]=sum[cont];//把一维数组里的依次存到新数组中
                cont++;
            }
        }
        return newarray;
    }

/*498. 对角线遍历

    给你一个大小为 m x n 的矩阵 mat ，请以对角线遍历的顺序，用一个数组返回这个矩阵中的所有元素。*/
    /*项目分析：
    *   1.需求：
    *       输入：一个 m x n 的矩阵 matrix。
    *       输出：一个一维数组，包含矩阵中的所有元素，顺序按照对角线遍历。
    *   2.第一趟(x+y=0) 第二趟(x+y=1) 剩下的以此类推 依次增加
    *   3.位置变化：(x横坐标 y纵坐标)
    *         奇数趟(x+,y-) 为上
    *         偶数趟(x-,y+) 为下
    *   4.需要走的趟数为 diagonalCount=(m.length+n.length)-1
    *        需要转向的次数还需要再-1 turnCount=diagonalCount-1
    *   5.边界问题  考虑x或y是否小于0或者大于length 以判断边界
    *
    * 实现思路：
    *
    * 所遇困难：
    *
    * */
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat[0].length,m=mat.length;//定义长度 n为高 m为宽
        int[] nums =new int[m*n];//设定一个空数组 用于存放需返回的值
        int k =0;//返回值 nums的索引
        int i= 0;//根据上方项目分析2 第一趟为0 m+n=0
        while (i<m+n-1){//根据上方项目分析4 需要走的趟数为 m+n-1  用此while来判断需要走几趟
            //可判断是否在边界 i>m说明越界 只用赋值为m-1  也就是最大宽-1
            int y1=i<m?i:m-1;//行 如果i（每趟的次数）<m（宽） 如果为真 返回i  否则返回 m-1(宽-1)
            int x1=i-y1;//通过上方项目分析2.得知 x1+y1等于 i  那么已知y1 就能够推出x1=i-x1
            //此whule 必须同时满足行在边界之内 y1比高小
            while (y1>=0&&x1<=n-1){//奇数 从下往上
                nums[k++]=mat[y1][x1];
                //为上 x+ y- 行++ 列--
                y1--;//行号递减，表示向上移动
                x1++; //列号递增，表示向右移动
            }
            i++;

            //从上往下
            //判断边界 可判断是否在边界 i>n说明越界 只用赋值为n-1  也就是最大宽-1
            int x2=i<n?i:n-1;//列 同上 i如果小于高n 返回i 否则返回 n-1
            int y2=i-x2; //x2+y2等于 i  那么已知x2 就能够推出y2=i-x2
            //x2必须在m宽度内 y2也要大于0 这两条必须同时满足
            while (y2<=m-1&&x2>=0){
                nums[k++]=mat[y2][x2];
                y2++;//行号递增，表示向下移动
                x2--;//列号递减，表示向左移动
            }
            i++;
        }
        return nums;
    }


/*    59. 螺旋矩阵 II
    给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。*/
    /*项目分析：
    *   1. 与54.螺旋矩阵类似  但返回值使用二维数组储存
    *   2.矩形中的数字范围为1到n² 元素数量便为n²
    *   3.顺序仍然遵循 右 下 左 上
    *   4.但须考虑特殊事件 例如 n=1 应当如何处理
    *   5.需要先生成一个为 n*n 的矩阵
    *
    *       时间复杂度: O(n^2)，因为我们需要填充 n * n 个元素。
    *        空间复杂度: O(n^2)，因为我们需要存储一个 n x n 的二维数组。
    * */
    public int[][] generateMatrix(int n) {
       int[][] order=new int[n][n];
        int a =0,d=n-1,w=0,s=n-1;//设定四个方向的边界值 a左 d右 w上 s下 并赋予初始值
        int sum=n*n;//长度*宽度为数字的数量
        int count=1;//计数器 记录运行次数
        while (count<=sum){
//                          从左往右
            for (int i = a;i<=d && count <= sum;i++){
                order[w][i]=count;
                count++;
            }//从a边界起步 到d 依次录入list
            w++;//从左往右到达边界处时说明顶层跑完 w++
//                         从上往下
            for (int i = w;i<=s && count <= sum;i++){
                        order[i][d]=count;
                count++;
            }
            d--;//从从上往下到达边界处时说明右边界跑完 d--
            //            从右往左
            for (int i = d;i>=a && count <= sum;i--){
                        order[s][i]=count;
                count++;
            }
            s--;//从左往右从右往左到达边界处时说明底层跑完 w++
            //            从下往上
            for (int i = s;i>=w && count <= sum;i--){
                         order[i][a]=count;
                count++;
            }
            a++;//从下往上到达边界处时说明左边跑完 w++
        }
        return order;//返回最终值
    }









/*    54. 螺旋矩阵
    给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。*/
/*      项目需求分析：
*           1.判断是否到达边界，如果到达则转向
*           2.考虑如何分清边界
*           3.使用什么类型的数据结构来存储返回值
*           4.需要循环的次数
*           5.以什么顺序来执行
*       实现思路：
*           1.设定 w s a d分别对应四个方向的边界 每次转向对应边界进行++||— —
*           2.可使用list 有序数据结构来存储 返回值
*           3.需要循环的次数为 矩阵所拥有元素的数量  m*n
*           4.以 右 下 左 上的顺序来执行
*           5.如何判断数该如何走
*                  // 从左到右遍历当前上边界的元素
                    for (int i = left; i <= right; i++) { //让i从左开始走  一直走到右边
                        ans.add(matrix[top][i]);//将走过的数添加到list之中
                         }
                   // 上边界向下移动
                     top++;
*           */
    /*此程序 最终超时*/
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<>();//用于存放返回的元素
        int a =0,d=matrix[0].length-1,w=0,s=matrix.length-1;//设定四个方向的边界值 a左 d右 w上 s下 并赋予初始值
        int sum=matrix.length*matrix[0].length;//长度*宽度为数字的数量
        int count=0;//计数器 记录运行次数
        while (count<sum){
//                          从左往右
            for (int i = a;i<=d && count < sum;i++){
                order.add(matrix[w][i]);
                count++;
            }//从a边界起步 到d 依次录入list
            w++;//从左往右到达边界处时说明顶层跑完 w++
//                         从上往下
            for (int i = w;i<=s && count < sum;i++){
                order.add(matrix[i][d]);
                count++;
            }
            d--;//从从上往下到达边界处时说明右边界跑完 d--
            //            从右往左
            for (int i = d;i>=a && count < sum;i--){
                order.add(matrix[s][i]);
                count++;
            }
            s--;//从左往右从右往左到达边界处时说明底层跑完 w++
            //            从下往上
            for (int i = s;i>=w && count < sum;i--){
                order.add(matrix[i][a]);
                count++;
            }
            a++;//从下往上到达边界处时说明左边跑完 w++
        }
        return order;//返回最终值
    }





  /*  396. 旋转函数
    给定一个长度为 n 的整数数组 nums 。
    假设 arrk 是数组 nums 顺时针旋转 k 个位置后的数组，我们定义 nums 的 旋转函数  F 为：
    F(k) = 0 * arrk[0] + 1 * arrk[1] + ... + (n - 1) * arrk[n - 1]
    返回 F(0), F(1), ..., F(n-1)中的最大值 。
    生成的测试用例让答案符合 32 位 整数。*/
  public int maxRotateFunction(int[] nums) {
        int f=0,n=nums.length;
        int numSum=Arrays.stream(nums).sum();//数组元素的总和
      for (int i = 0; i < n; i++) {
          f+=i*nums[i];
      }
      int res=f;
      for (int i = n-1; i>0; i--) {
          f+=numSum-n*nums[i];
          res=Math.max(res,f);
      }
      return res;
  }





  /*  661. 图片平滑器
    图像平滑器 是大小为 3 x 3 的过滤器，用于对图像的每个单元格平滑处理，平滑处理后单元格的值为该单元格的平均灰度。
    每个单元格的  平均灰度 定义为：该单元格自身及其周围的 8 个单元格的平均值，结果需向下取整。（即，需要计算蓝色平滑器中 9 个单元格的平均值）。
    如果一个单元格周围存在单元格缺失的情况，则计算平均灰度时不考虑缺失的单元格（即，需要计算红色平滑器中 4 个单元格的平均值）。*/
  /*分析：
      1.题意
         1 1 1
         1 0 1
         1 1 1
         求出与周围八个数相加的平均值 如果不存在则不参与运算
         使用（x,y）模拟位置   求（x,y）平均灰度为 (x-1,y+1)+(x,y+1)+(x+1,y+1)+(x-1,y)+(x,y)+(x+1,y)+(x-1,y-1)+(x,y-1)+(x+1,y-1)
         (x-1,y+1)  (x,y+1)  (x+1,y+1)
         (x-1,y)    (x,y)    (x+1,y)
         (x-1,y-1)  (x,y-1)  (x+1,y-1)
       2.考虑越界问题 加入判断 是否越界 如果越界 则不参与计算
   */
  public int[][] imageSmoother(int[][] img) {
        //获取图像的行(m)和列(n)
      int m=img.length,n=img[0].length;
      int[][] ret=new int[m][n];//创建和图像同样大小的二维数组 用于储存 平均灰度
      for (int i = 0; i < m; i++) {//遍历行
          for (int j = 0; j < n; j++) {//遍历列
              int cout=0,sum=0;//设置计数器与像素值总和
              //遍历3x3正方形 以便获取平均灰度
              for (int x = i-1; x <= i+1; x++) {//x轴
                  for (int y = j-1; y <= j+1; y++) {//y轴
                      if (x>=0&&x<m&&y>=0&&y<n){ // 检查坐标(x, y)是否在图像范围内
                          cout++;//计数器++
                          sum+=img[x][y];  //所在值加入总值
                      }
                  }

              }
              ret[i][j]=sum/cout;//将平均灰度给ret
          }

      }
      return ret;
  }





/*    118. 杨辉三角
    给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
    在「杨辉三角」中，每个数是它左上方和右上方的数的和。
    分析：
    0 1 2 3 4
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    规律 1.第一列与最后一列为1
        2.假设行为x 列为y  设（3，3）求i的值为 (x-1，y)+（x-1,y-1)
    */
    public List<List<Integer>> generate(int numRows) {
        //储存所有数据
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        //遍历每一层  i为行 j为列
        for (int i = 0; i < numRows; i++) {
            //用于储存当前行
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <=i; j++) {
                if (j==0||j==i){
                    row.add(1);
                }else {
                    //     (在上一行中找到当前元素左边的元素和当前元素正上方的元素相加  最后添加到ret。
                    row.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                }
            }
            ret.add(row);
        }
    return ret;
    }



  /*  283. 移动零
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
    同时保持非零元素的相对顺序。
    请注意 ，必须在不复制数组的情况下原地对数组进行操作。*/
  public void moveZeroes(int[] nums) {
      int j = 0;//用于定位0的位置
      for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                int tmp =nums[i];//寄存 i
                nums[i]=nums[j];//把0给下标i所在
                nums[j++]=tmp;//跳到下一个非0
            }

      }
  }






/*665. 非递减数列

    给你一个长度为 n 的整数数组 nums ，
    请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。

    我们是这样定义一个非递减数列的：
        对于数组中任意的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。*/
    /*分析：1.如果改动数组中的一个数能将其变成递增返回true 如果不能则返回false
            2.如果要使数组 nums\textit{nums}nums 变成一个非递减数列，
            数组中至多有多少个 i 满足 nums[i]>nums[i+1]？
                3.可搜索有多少个不符合 nums[i]>nums[i+1] 如果大于1那么就直接返回fales
                  4. if (i > 0 && y < nums[i - 1]) 
    * 实现思路；*/

    public boolean checkPossibility(int[] nums) {
        int count = 0; // 计数器，统计违反非递减条件的次数

        // 如果数组长度小于3，肯定能满足非递减序列
        if (nums.length < 3) {
            return true;
        }

        // 遍历数组，检查是否存在 nums[i] > nums[i + 1] 的情况
        for (int i = 0; i < nums.length - 1; i++) {
            // 超过一个不满足直接返回 false
            if (count > 1) {
                return false;
            }
            // 如果发现 nums[i] > nums[i + 1]
            if (nums[i] > nums[i + 1]) {
                count++; // 违反条件的次数加1
                // 如果违反条件的次数超过1次，直接跳出循环
                if (count > 1) {
                    break;
                }
                // 检查是否可以通过修改 nums[i] 或 nums[i + 1] 来解决问题
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    nums[i + 1] = nums[i]; // 修改 nums[i + 1] 为 nums[i] 的值
                } else {
                    nums[i] = nums[i + 1]; // 修改 nums[i] 为 nums[i + 1] 的值
                }
            }
        }

        // 如果整个数组没有出现超过1次违反条件的情况，返回 true
        return count <= 1;
    }







    //    453. 最小操作次数使数组元素相等
//    给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
    /*项目分析
    *1找到数组中的最小值 min_val。
      2.初始化一个变量 operations 为0，用于累计操作次数。
        3.遍历数组，对于每个元素 num，将 num - min_val 的结果加到 operations 上。
          4.最终 operations 的值即为最小操作次数。 */
    public int minMoves(int[] nums) {
        //用于找到数组中最小的数
         int min_val=Arrays.stream(nums).min().orElseThrow();
         int operations=0;//作用相当于计数器
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=min_val){
                operations+=nums[i]-min_val;
            }
        }
        return operations;
    }



    /*274. H 指数
    给你一个整数数组 citations ，
    其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。
    计算并返回该研究者的 h 指数。

    根据维基百科上 h
    指数的定义：h 代表“高引用次数” ，
    一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
    并且 至少 有 h 篇论文被引用次数大于等于 h 。
    如果 h 有多种可能的值，h 指数 是其中最大的那个。
*/
    /*分析题意
    *拥有的数据：整数数组 citations
    *           citations[i] 表示研究者的第 i 篇论文被引用的次数
    * 需求：返回h指数
    * 什么是h指数：1.有h篇论文引用次数大于h
    * 思路：
    *   1.将数组排序
    *   2.遍历数组 每次 h次数+1 那么剩余篇数-1 直到
     * */
    public int hIndex(int[] citations) {
        int h =0;//h指数
        Arrays.sort(citations);//将数组排序
        int i =citations.length-1;
        while (i>=0 && h>citations[i]){
            h++;//每次h指数-1 因为每轮排除了一个数
            i--;//每次减一个数
        }
        return h;
    }






/*41. 缺失的第一个正数
    给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
    请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。*/
    public int firstMissingPositive(int[] nums) {
        // 将nums数组转换为HashMap，其中键是数组元素，值是元素出现的次数
        Map<Integer, Integer> hashMap = new HashMap<>();
        int firstNumber=0;
        //把nums依次存入哈希表中
        for (int element : nums) {
            hashMap.put(element, hashMap.getOrDefault(element, 0) + 1);
        }
        //遍历1-nums.length+1范围内的每一个数字  如果有不存在的 直接返回i
        for (int i = 1; i < nums.length+2; i++) {
            if (!hashMap.containsKey(i)) {
                firstNumber=i;
                break;
            }
        }
        return firstNumber;
    }




/*    442. 数组中重复的数据
    给你一个长度为 n 的整数数组 nums ，其中 nums 的所有整数都在范围 [1, n] 内，且每个整数出现 一次 或 两次 。请你找出所有出现 两次 的整数，并以数组形式返回。

    你必须设计并实现一个时间复杂度为 O(n) 且仅使用常量额外空间的算法解决此问题。
    */
    public List<Integer> findDuplicates(int[] nums) {
        //用来存放
        int[] allNums= new int[nums.length] ;
        //遍历所有存在的数 对应 放入allNyms
        for (int i = 0; i < nums.length; i++) {
            allNums[nums[i]-1]++;//将nums[i]的数-1 便为allNums的下标
        }
        //找到所有为2的数 放入列表中
        List<Integer>lostNums =new ArrayList<>();//创建列表
        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i]==2){
                lostNums.add(i+1);//i+1便为出现次数为2的数
            }
        }
        return  lostNums;
    }





    //448. 找到所有数组中消失的数字
    /*给你一个含 n 个整数的数组 nums ，
    其中 nums[i] 在区间 [1, n] 内。
    请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，
    并以数组的形式返回结果。*/
    /*分析需求：
    *   1.有一个长度为n的数组
    *    2.找出所有在 [1, n] 范围内但没有出现在 nums 中的数字
    * 思路：
    *   1.哈希映射1到n的所有数字为0
    *    2.for遍历数组中的每个下标 每出现一个 就在哈希表中++
    *     3.此时哈希表中为0的便为缺失的数字
    *       4.通过for再将哈希表中所有为0的数赋给数组*/
    //方法二
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //用来存放
        int[] allNums= new int[nums.length] ;
        //遍历所有存在的数 对应 放入allNyms
        for (int i = 0; i < nums.length; i++) {
            allNums[nums[i]-1]++;//将nums[i]的数-1 便为allNums的下标
        }
        //找到所有为0的数 放入列表中
        List<Integer>lostNums =new ArrayList<>();//创建列表
        for (int i = 0; i < allNums.length; i++) {
            if (allNums[i]==0){
                lostNums.add(i+1);//i+1便为出现次数为0的数
            }
        }
        return  lostNums;
    }



    //方法一
    /*public List<Integer> findDisappearedNumbers(int[] nums) {
        //建立一个空的哈希表
        HashMap<Integer,Integer> hashTable = new HashMap<>();
        int n = nums.length;
        //1.哈希映射1到n的所有数字为0
        for (int i = 0; i < n; i++) {
            hashTable.put(i,0);
        }
        //2.for遍历数组中的每个下标 每出现一个 就在哈希表中++
        for (int i = 0; i < n; i++) {
            int index = nums[i];
            //更新其对应的值
            hashTable.put(index, hashTable.get(index) + 1);
        }
        //4.通过for再将哈希表中所有为0的数赋给一个队列
        List<Integer> keysWithZeroValue = new ArrayList<>();//用于保存出现次数0的数
        for (HashMap.Entry<Integer, Integer> entry : hashTable.entrySet()) {
            if (entry.getValue() == 0) {
                keysWithZeroValue.add(entry.getKey());
            }
        }
        return keysWithZeroValue;//返回消失的数字
    }*/









    //697. 数组的度
    /*给定一个非空且只包含非负数的整数数组 nums，
    数组的 度 的定义是指数组里任一元素出现频数的最大值。
    你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
    # 思路
        1.找到 度（出现频率最高的数）
        2.截取第一次出现位置与最后一次出现的位置 相减便为长度 如果有多个度 取长度最短
    # 解题方法
        使用for循环遍历数组 找到频率最高的数字

    # 复杂度
        时间复杂度:
            > 添加时间复杂度, 示例： $O(n)$
        空间复杂度:
            > 添加空间复杂度, 示例： $O(n)$
    # Code  */
    public int findShortestSubArray(int[] nums) {
        //使用一个哈希映射来记录每个数字出现的次数 第一次出现位置 最后一次出现案的位置
        /*键（Key）类型：Integer
                    键是 Integer 类型的对象。在我们的例子中，键是数组中的元素。
                    值（Value）类型：int[]  值是 int[] 类型的数组。
            在我们的例子中，值是一个包含三个整数的数组，分别表示该元素的出现次数、首次出现的位置和最后一次出现的位置。*/
        Map<Integer,int[]>map = new HashMap<Integer,int[]>();
        //哈希映射 [0,0,0] 第一个表示出现次数  第二个表示第一次出现位置 第三个表示最后一次出现位置
        int n =nums.length;//储存数组长度
        //遍历数组 将每一个数字记录到哈希映射中
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])){//containsKey 方法用于检查映射中是否存在指定的键。如果存在，返回 true；否则，返回 false。
                //如果数字已经在映射，更新其出现次数和最后一次出现的位置
                map.get(nums[i])[0]++;//更新次数
                map.get(nums[i])[2]=i;//最后一次出现的位置 因为nums[i])[1]是第一次出现的位置 这里就直接更新最后一次
            }else {
                //否则说明第一次出现这个数 那就加入到map中
                map.put(nums[i],new int[]{1,i,i}); //{1-出现一次,i-第一次,i-最后一次}
            }
        }
        int maxNum=0;//记录数组的最大度数
        int minLen = 0;//记录最短的子数组长度
        //遍历哈希映射，找到最大的数字和最短子数组长度
        for (Map.Entry<Integer,int[]>entry: map.entrySet()){
            int[] arr= entry.getValue();
            if (maxNum<arr[0]){//如果当前的arr大于maxNum 那么就更新最大度数
                //更新最大度数和最短数组长度
                //arr是map是哈希映射表中获取的值
                maxNum=arr[0];//将最大的arr[0]交给 maxNum （最大度数）
                minLen=arr[2]-arr[1]+1;//arr[2]（最后一次出现的位置）-arr[1]第一次出现的位置+1 便为最短的子数组长度
                // 例如1 2 2 3 4 2 key(键) arr[0]=3 arr[1]=1 arr[2]=5 长度便为 5-1+1=5 长度便为5
                //map 变为 {2: [3, 1, 5]}。 也可以这么表示 2为key [3, 1, 5]是与该键相关的值（value）
            }else if (maxNum==arr[0]){//查看同样度数的数
                //如果当前的度数等于最大度数，那就比较并更新最短子数组长度
                //rr[2]（最后一次出现的位置）-arr[1]第一次出现的位置+1 便为最短的子数组长度
                if (minLen>arr[2]-arr[1]+1){//1.当前的子数组长度如果大于minLen所储存的子数组长度
                    minLen=arr[2]-arr[1]+1;//2.那么就更新 最短子数组长度
                }
            }
        }
        return minLen;
    }




    //645
    //错误的集合
    /*集合 s 包含从 1 到 n 的整数。
    不幸的是，因为数据错误，
    导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，
    导致集合 丢失了一个数字 并且 有一个数字重复 。
    给定一个数组 nums 代表了集合 S 发生错误后的结果。

    请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。*/
    /*分析需求
    * 一.变量
    * 1.用于存放返回值的数组
    *     2.用于存放nums长度的变量
    *       3.需要对数组进行排序 可用Arrays.sort()
    *         4.存放上一个数
    * 二.for循环 寻找返回值
    * 1.判断当前数是否等于前一个数 如果等于说明重复
    *   2.判断是否和前一个数字相差大于1 如果大于说明不是连续的数 缺失着一个数
    *     3.最后更新上一个数字
    * 三.检查最后一个数字是否为丢失的数字
    *   */
    public int[] findErrorNums(int[] nums) {
            int[] errorNums= new int[2];//新建一个长度为2的数组给错误数、
            int ln=nums.length;//存放nums的长度
            Arrays.sort(nums);//对数组nums进行排序
            int Previous=0;//存放上一个数 初始值为0
        for (int i = 0; i < ln; i++) {
            int current =nums[i];//当前数
            if (Previous == current){//如果当前数等于上一个数 说明重复
                errorNums[0]=Previous;//就将上一个数放入需返回的数组
            }else if (current-Previous>1){//当前数-上一个数>1   与上一个数相差是否大于1 大于说明不是连续的数
                errorNums[1]=Previous+1;//丢失的数=上一个数+1
            }
            Previous=current;//更新上一个数
        }
        if (nums[ln-1] != ln){//（nums[ln-1] 数组的最后一个数 ）！= 数组的长度  因为正常情况是一一对应的 如果不等于说明为丢失的数
            errorNums[1]=ln;
        }
        return errorNums;
    }














//    public int[] findErrorNums(int[] nums) {
//        int[] errorNums = new int[2];//用来存放retunrn的值
//        int n =nums.length;//存放nums 的长度
//        Arrays.sort(nums);//对数组进行排序 使它比为有序数组
//        int prev = 0;//定义一个变量来保存前一个数字，初始为0
//        for (int i = 0; i < n; i++) {
//            int curr = nums[i];//获取当前的数
//            if (curr==prev){//如果当前数等于前一个数 说明是重复的
//                errorNums[0]=curr;//将当前的数存到errorNums[0]
//            }else if (curr-prev>1){//判断是否和前一个数字相差大于1 如果大于 说明缺失一个数
//                errorNums[1]=prev+1;
//            }
//            prev=curr;//如没有 那么更新prev
//        }
//
//        //检查最后一个是否等于n 如果不等于 说明缺失的数为n 因为nums的长度为n 最后一个数必然为n
//        if (nums[n-1] !=n){
//            errorNums[1]=n;
//        }
//
//        return errorNums;
//    }

    //495
    /*在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄。他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。

    当提莫攻击艾希，艾希的中毒状态正好持续 duration 秒。

    正式地讲，提莫在 t 发起攻击意味着艾希在时间区间 [t, t + duration - 1]（含 t 和 t + duration - 1）处于中毒状态。
    如果提莫在中毒影响结束 前 再次攻击，中毒状态计时器将会 重置 ，在新的攻击之后，中毒影响将会在 duration 秒后结束。

    给你一个 非递减 的整数数组 timeSeries ，
    其中 timeSeries[i] 表示提莫在 timeSeries[i] 秒时对艾希发起攻击，
    以及一个表示中毒持续时间的整数 duration 。

    返回艾希处于中毒状态的 总 秒数。*/

    /*分析需求：
    * 1.输入：！攻击时间点 [t, t + duration - 1]
    *         ！正常情况中毒状态持续时间 duration
    * 2.返回：中毒状态的 总 秒数                                1   2
    * 3.分析：攻击时间点如果 两次相隔 小于中毒持续时间 那么 中毒时间为 1 2 3 4 5
    * 4.思路一：1-TotalTime;//总中毒时长
    *        expired = 0;//更新中毒结束时间点 如果为小于下次攻击时间 则无毒 其他为中毒状态 最后更新中毒结束时间
    *     思路二：先中毒时间拉满，再减去重复的时间。
    * */
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int TotalTime=0;//总中毒时长
        int expired = 0;//更新中毒结束时间点
        for (int i = 0; i < timeSeries.length; i++) {
            if(timeSeries[i]>=expired){//如果大于解毒的时间点 那么说明没有重叠中毒
                TotalTime+=duration;//直接增加中毒时间
            }else{
                TotalTime += timeSeries[i]+duration-expired;//重叠的话 就减去中毒结束时间点 再加上TotalTime
            }
            expired= timeSeries[i]+duration;//更新中毒结束时间点
        }
    return TotalTime;
    }

    //414
    //给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
    public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE, max2=Long.MIN_VALUE,max3=Long.MIN_VALUE;//初始化前三名
        for (int num : nums) {
            if (num == max1 || num == max2 || num == max3) continue;//如果重复则加入下一次循环
            if (num>max1){//如果大于max1 则赋值给 max1 原数值往后推
                max3=max2;
                max2=max1;
                max1=num;
            }else if(num>max2){//再比较是否为第二大
                max3=max2;
                max2=num;
            }else  if (num>max3){//比较最后一个
                max3=num;//最后一名直接赋值即可
            }

        }

    return (int) (max3==Long.MIN_VALUE?max1:max3);//判断是否有第三大的数 如果还是初始值那么返回最大 否则返回第三大
    }

    //485
    //给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
    public int findMaxConsecutiveOnes(int[] nums) {
        int length=nums.length;//用于获取数组长度
        int max =0;//储存最大连续的个数值
        int cont=0;//用于计数
        for(int a=0; a<length;a++){
             if (nums[a]==1){
                cont++;
                if(cont>max){
                    max=cont;
                }
            }else{
                cont=0;//如果不等于1 说明已经断开 将计数器归零
            }
        }
return max;
    }
}