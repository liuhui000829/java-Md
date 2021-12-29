package liuhui.com.高级特性.集合;


import java.util.HashSet;
import java.util.Set;

/**
 * set-无序元素唯一集合
 * 	使用equals方法进行比较，如果为true则不添加
 *  @author Thinkpad
 * 	add()插入元素
 * 	remove(e) 删除元素
 *  toArray() 将set转换成数组

 * set无序的，没法使用下标进行遍历
 */
public class TestSet {
    public static void main(String[] args) {


        Set set=new HashSet();
        set.add("1");
        set.add("1");
        set.add(new Pet("二哈1",3));
        set.add(null);
        set.add(true);
        set.add(2.0);

        // 1.判断是否添加成功
        // System.out.println(set.add("456"));         // true  没有可以添加
        // System.out.println(set.add("1"));           // false 有则返回false

        System.out.println(set.add(new Pet("二哈1",123)));        // true
        System.out.println(set.add(new Pet("二哈1",123)));        // false

        String str1 = new String("你好");
        String str2 = new String("你好");

        System.out.println(set.add(str1));      // true
        System.out.println(set.add(str2));      // false




        // 迭代器
        // 调用iterator方法返回set的迭代器
        // Iterator it=set.iterator();
        // 使用hasNext进行判断，是否还有下一条信息
        // while (it.hasNext()){
        //    System.out.println(it.next());
        // }

        // 增强for循环
        // for (Object obj: set) {
        //    System.out.println(obj);
        // }

        // lambda 表达式
        // set.forEach(System.out::println);
    }
}
