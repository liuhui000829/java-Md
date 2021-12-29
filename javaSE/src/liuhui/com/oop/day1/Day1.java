package liuhui.com.oop.day1;


import java.util.Arrays;
import java.util.Scanner;


public class Day1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ArraysUtil();
    }

    /**
     * 插入一个学员的成绩 并且保持降序
     *
     * @author 刘先生
     **/
    public static void DescScore() {
        int[] nums = {93, 90, 80, 70, 0};

        System.out.println("请输入学员信息");
        int num = input.nextInt();

        // 先找到位置 找到第一个比输入数字小的，记录下标
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < num) {
                index = i;
                break;
            }
        }
        //找到的位置依次向后移动
        for (int j = nums.length - 2; j >= index; j--) {
            nums[j + 1] = nums[j];
        }
        // 将输入的数字插入到记录的下标
        nums[index] = num;

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 插入一个学员的成绩 并且保持升序
     * <p>
     * 思路是给最后一个元素添加一个 0 从后往前交换
     *
     * @author 刘先生
     **/
    public static void AscScore() {
        int[] nums = {70, 80, 90, 96, 0};
        System.out.println("请输入一个学员成绩");
        int num = input.nextInt();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > num) {
                index = i;
                break;
            }
        }
        for (int i = nums.length - 2; i >= index; i--) {
            nums[i + 1] = nums[i];
        }
        nums[index] = num;

        System.out.println(Arrays.toString(nums));

    }

    /**
     * 冒泡排序 -排序中最基本的排序方式
     *
     * @author 刘先生
     * 1.外层控制轮数  长度为 Arrays.length-1
     * 2.内层控制次数  长度为 Arrays.length-i-1
     * 3.如果后面的数比前面的数小 则互换
     */
    public static void BubbleSort() {
        int[] nums = {3, 2, 6, 1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j + 1] < nums[j]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Arrays 工具类的使用
     * <p>
     * 1. boolean equals(array1,array2) 比较两个数组是否相等
     * 2. void sort(array)              对数组的元素进行升序排列
     * 3. String toString(array)        将一个数组元素转换成字符串
     * 4. void fill(array,val)          将数组所有元素赋值为val
     * 5. copyOf(array,length)          把数组array复制成一个长度为length的新数组 返回类型与复制数组一致
     * 6. int binarySearch(array,val)   查询元素值val在数组中的下标 (要求数组中元素已经按升序排列)
     **/
    public static void ArraysUtil() {
        int[] arr = {1, 3, 2, 5};
        int[] arr2 = {1, 3, 2, 5};
        int[] arrS = {5, 4, 3, 2, 1};

        /**
         * equals()
         * 1.数组身上的equals()比较的是两个数组的内存地址
         * 2.Arrays身上的equals()比较的是两个数组的是否相等 内存地址或者内容
         *
         * arr.equals(arr2);              // false
         * Arrays.equals(arr, arr2);      // true
         **/
        /**
         * sort() 升序
         *
         * Arrays.sort(arr);            // [1, 2, 3, 5]
         * Arrays.sort(arrS, 0, 3);     // [3, 4, 5, 2, 1]  formIndex包含  toIndex排他
         **/
        /**
         * toString()
         * 1.数组身上的toString()转换的并不是数组内容 而是一个@+16进制hashCode
         * 2.Arrays身上的toString()转换的是数组内容
         *
         * arr.toString();             // [I@7ea987ac
         * Arrays.toString(arr);       // [1, 2, 3, 5]
         **/
        /**
         * fill()   填充一个数组
         *
         * Arrays.fill(arr,6);           // [6, 6, 6, 6]
         **/
        /**
         * copyOf() 复制一个数组
         *
         *  int[] a1 = Arrays.copyOf(arr, arr.length);                 // [1, 3, 2, 5]
         *  int[] a2 = Arrays.copyOf(arr, arr.length * 2);             // [1, 3, 2, 5, 0, 0, 0, 0]
         *
         **/
        /**
         * binarySearch()   查询元素值val在数组中的下标 (要求数组中元素已经按升序排列)
         *
         * Arrays.sort(arr);
         * int a1 = Arrays.binarySearch(arr,3);              // 2
         * int a2 = Arrays.binarySearch(arr,1,4,3);  formIndex包含 toIndex排它  key要搜索的值       // 2
         **/

    }
}
 //  6666



