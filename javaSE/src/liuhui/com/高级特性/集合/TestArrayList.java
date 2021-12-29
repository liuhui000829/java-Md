package liuhui.com.高级特性.集合;

import java.util.ArrayList;
import java.util.List;
/**
 * ArrayList-数组列表
 * @author Thinkpad
 *	增
 *		add(e) 插到末尾   *
 *		add(index,e) 指定位置插入  *
 *	删
 *		remove(index) 删除指定下标元素  *
 *		remove(obj) 找到第一个符合的对象完成删除
 *		clear() 清空列表
 *	改
 *		set(index,e)根据下标将元素进行替换为e
 *	查
 *		get(index) 根据下标获取元素  *
 *		size() 查询列表的长度  *
 *		contains(e) 判断对象e是否存在
 *		isEmpty() 判断列表内容是否为空
 *
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList();
        // 在末尾添加内容

        Pet pet = new Pet("二哈2", 3);

        petList.add(new Pet("二哈1", 3));
        petList.add(pet);
        petList.add(new Pet("二哈3", 3));
        petList.add(null);
        petList.add(null);


        //添加到指定位置，其他的进行移动
        petList.add(1, new Pet("二哈4", 3));


        //使用下标插入时，如果超过边界，也会报错  IndexOutOfBoundsException
        //petList.add(5,new Pet("二哈5", 3));

        // 根据下标删除
        // petList.remove(1);
        // 删除找到的第一个
        // petList.remove(pet);

        // 根据下标 进行替换
        petList.set(1,new Pet("二哈需改的",3));

        // 判断对象是否存在 判断的是对象的内存地址
        // System.out.println(petList.contains("123"));          false
        // System.out.println(petList.contains(pet));          // true



        // 清空集合
        //petList.clear();
        // 返回对象的下标
        // System.out.println(petList.indexOf(pet));

        System.out.println("判断集合是否为空"+petList.isEmpty());




        /** size 集合大小
         *
         *  for (int i = 0; i < petList.size(); i++) {
         *       System.out.println(petList.get(i).toString());
         *  }
         */


        /**
         *  java 1.8 lambda表达式
         *
         */

        petList.forEach(System.out::println);
        System.out.println(petList.get(2).getName()); ;
    }


}
