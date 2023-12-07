//2023-11-25 第13周课后作业
/*项目总需求
1.统计一个字符串中大写字母、小写字母和数字出现的次数。（字符串从键盘任意输入获得）
2.假设一个字符串中存放了若干个用逗号分隔的单词，如“hello，good,now,happy,boy",找出包含字母"o"的所有单词。
3.设一个字符串包含若干个用逗号分隔的整数，编码将数字从大到小排序并输出。*/

package homework.cThree;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;
public class StringWord {
    static Scanner sc =new Scanner(System.in);//创建键盘输入对象
    public static void main(String[] args) {//主程序
        //1.统计一个字符串中大写字母、小写字母和数字出现的次数。（字符串从键盘任意输入获得）
        System.out.print("任务一：请输入任意字符串");
        countLettersAndDigits(sc.next());//统计一个字符串中大写字母、小写字母和数字出现的次数。
        System.out.print("\n");

        //2.找出字符串中包含字母"o"的所有单词。
        System.out.print("任务二：包含字母\"o\"的单词有：");
        findWordsContainingLetter("hello,good,now,happy,boy,Vibrant,Horizon,Discovery");
        System.out.print("\n");

        //3.设一个字符串包含若干个用逗号分隔的整数，编码将数字从大到小排序并输出。
        System.out.print("任务三：数字从大到小排序并输出：");
        sortAndPrintIntegersDescending("96,92,15,23,48,17,36,14");//test
    }

    /**统计给定字符串中大写字母、小写字母和数字的数量。
     * 该方法遍历字符串中的每个字符，使用Character类的方法来判断字符类型，并进行计数。
     *@param str 要进行分析的字符串
     */
    public static void countLettersAndDigits(String str){//统计一个字符串中大写字母、小写字母和数字出现的次数。

        int countUppercase = 0; // 用于统计字符串中大写字母的数量
        int countLowercase = 0; // 用于统计字符串中小写字母的数量
        int countDigits = 0;    // 用于统计字符串中数字的数量
        for (int i = 0; i < str.length(); i++) {//遍历str字符串
            char ch=str.charAt(i);// 获取当前字符
            if (Character.isUpperCase(ch)){
                countUppercase++;// 当字符是大写字母时，增加大写字母的计数
            } else if (Character.isLowerCase(ch)) {
                countLowercase++; // 当字符是小写字母时，增加小写字母的计数
            } else if (Character.isDigit(ch)) {
                countDigits++; // 当字符是数字时，增加数字的计数
            }
        }// 结束 for 循环
        System.out.println("字符串"+str+"中大写字母个数："+countUppercase+"，" +
                         "小写字母个数："+countLowercase+"，数字个数："+countDigits);
    }

    /**功能：如“hello，good,now,happy,boy",找出包含字母"o"的所有单词。
     * 实现过程：1。该方法使用.split分割字符串
     *         2.遍历字符串中的每个单词，
     *         3..contains判断单词中是否包含o
     * @param str 要进行分析的字符串
     */
    public static void findWordsContainingLetter(String str){
        String[] words =str.split(",");//使用.split分割str
        // 创建一个StringJoiner，用空格作为分隔符
        StringJoiner joiner = new StringJoiner(" ");
        for (String word : words) {  // 遍历每个单词
            if (word.contains("o")) { // 检查当前单词是否包含字母 'o'
                joiner.add(word); // 如果包含，则将其添加到StringJoiner中
            }
        }//结束for循环
        // 将所有包含字母 'o' 的单词组合成一个字符串，并打印
        System.out.println(joiner.toString());
    }

    /**
     * 功能：对由逗号分隔的整数字符串进行降序排序并打印结果。
     * 实现过程：1.将输入的字符串基于逗号分割成单独的数字字符串。
     *         2.将这些数字字符串转换为整数，并存储在数组中。
     *         3.对这些整数进行降序排序。
     *         4.遍历排序后的整数数组，并打印每个整数。
     * 注意：此方法默认了输入字符串格式是正确的，且每个分割的部分都是有效的整数。
     * @param input 包含由逗号分隔的整数的字符串。
     *      例如："10,4,7,2" 将被处理成 "10 7 4 2"。
     */
    public static void sortAndPrintIntegersDescending(String input){
        String[] numberStrings =input.split(",");//使用.split分割input
        Integer[] numbers = new Integer[numberStrings.length];// // 创建一个与分割后的字符串数组等长的Integer数组
        for (int i = 0; i < numberStrings.length; i++) {// 遍历每个数字字符串
            numbers[i] = Integer.parseInt(numberStrings[i].trim());// 清除字符串的前后空白，并将其转换为整数
        }
       /* 按降序排序整数   使用Arrays类的sort方法对数字进行排序
         Collections.reverseOrder() 提供了一个比较器，用于实现降序排序*/
        Arrays.sort(numbers, Collections.reverseOrder());
        for (int number : numbers) {// 打印排序后的数字  遍历排序后的Integer数组
            System.out.print(number + " "); // 打印每个数字
        }//结束for循环
    }
}

