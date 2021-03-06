package com.coderpwh.leetcode;

/*****
 *   位1的个数
 *
 *  编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 *
 *  
 *
 * 提示：
 *
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用二进制补码记法来表示有符号整数。因此，在上面的 示例 3 中，输入表示有符号整数 -3。
 *  
 *
 * 进阶：
 *
 * 如果多次调用这个函数，你将如何优化你的算法？
 *  
 *
 * 示例 1：
 *
 * 输入：00000000000000000000000000001011
 * 输出：3
 * 解释：输入的二进制串 00000000000000000000000000001011 中，共有三位为 '1'。
 * 示例 2：
 *
 * 输入：00000000000000000000000010000000
 * 输出：1
 * 解释：输入的二进制串 00000000000000000000000010000000 中，共有一位为 '1'。
 * 示例 3：
 *
 * 输入：11111111111111111111111111111101
 * 输出：31
 * 解释：输入的二进制串 11111111111111111111111111111101 中，共有 31 位为 '1'。
 *  
 *
 *
 *
 */
public class HammingWeight {


    public static void main(String[] args) {
        HammingWeight weight = new HammingWeight();

        System.out.println(weight.hammingWeight(00000000000000000000000010000001));
    }


    /*****
     *    思路：位移动
     *     1：给的数字int类型就是32位，都是0与1
     *     2：1的二进制则是 0000 0000 0000 0000 0000 0000 0000 0001
     *     3：& 与 运算符比较的是二进制最低位的 & 运算的规则是 0&0=0;  0&1=0;   1&0=0;    1&1=1;
     *     4: 通过位移 << 和遍历逐步统计出来1的个数
     *     5： 时间复杂度，已经是给定的32位，一个for循环。 时间复杂度则为O(1)
     *
     *
     *
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {

        int count = 0;
        int make = 1;

        for (int i = 0; i < 32; i++) {

            if ((n & make) != 0) {
                count++;
            }
            make <<= 1;
        }
        return count;
    }


}
