package liuhui.com.高级特性.Util;

import com.alibaba.fastjson.JSON;


public class JsonUtil<T> {

    // 将对象转换成字符串
    public String ObjToJson(Object obj){
       return JSON.toJSONString(obj);
    }

    // 将字符串转换成对象
    public T JsonToObject(String str, Class clazz){
       return (T)JSON.parseObject(str,clazz);
    }


}
