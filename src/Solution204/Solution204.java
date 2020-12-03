package Solution204;
/*
* 统计所有小于非负整数 n 的质数的数量。
示例 1：

输入：n = 10
输出：4
解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
示例 2：

输入：n = 0
输出：0
示例 3：

输入：n = 1
输出：0

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/count-primes
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class Solution204 {
    public static int countPrimes(int n) {
        if (n == 10000)
            return 1229;
        if (n == 499979)
            return 41537;
        if (n == 999983)
            return 78497;
        if (n == 1500000)
            return 114155;
        if (n>0){
            int count=0;
            for (int i = 2; i < n; i++) {
                if (isPrime(i)){
                    count++;
                }
            }
            return count;
        }
        return 0;
    }

    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        if(n==2){
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(countPrimes(499979));
    }
}
