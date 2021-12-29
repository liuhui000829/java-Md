package liuhui.com.高级特性.集合;

import java.util.HashMap;
import java.util.Map;

/**
 * map的学习
 *
 * @author 刘先生
 * 增
 * put-如果不存在则新增，如果存在则修改
 * 删
 * remove-删除并返回key的值
 * clear   清空
 * 改
 * put
 * replace(k,v)-找到k修改值，并将之前的值返回。如果没有则不修改并返回null
 * 查
 * get-通过key 获取 value
 * size-获取map的大小
 * containsKey-查询key是否存在
 * containsValue-查询值是否存在
 */
public class TestMap1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("123", 456);
        map.put("a", 456);
        map.put(null, null);
        map.put(456, null);
        map.put(123, new Pet("二哈1", 3));

        // 1.长度
        // System.out.println(map.size());           // 3

        // 2.获取元素
        // Pet pet=(Pet)map.get(123);
        // System.out.println(pet.getName());        // 二哈1
        // System.out.println(pet.getAge());         // 3

        // 3.删除
        // Object obj=map.remove(123);              // Pet{name='二哈1', age=3}
        // System.out.println(obj);
        // System.out.println(map.size());              // 2


        // 4. 修改
        /*Object object = map.replace(123, 456);
        System.out.println("replace返回的值是: " + object);         // 返回的是原先的值 Pet{name='二哈1', age=3}
        System.out.println(map.get(123));             */          // 456

        // 5. 清空
        // map.clear();

        //
        System.out.println(map.containsKey("123"));         // true
        System.out.println(map.containsValue("888"));       // false



        // 6. 遍历map
        map.forEach((k, v) -> {
            if (k != null) {
                if (k.equals("123")) {
                    map.replace("123", 999);
                }
            }
        });


        map.forEach((k, v) -> System.out.println(k + "," + v));


    }

}
