package com.liuhui.controller;

import com.liuhui.entity.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.UUID;

@RestController
@SuppressWarnings("all")
public class HTTPMessageController {

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String requestBody) {
        System.out.println(requestBody);
        return "success";
    }


    @RequestMapping("/testRequestEntity")
    public String testRequestBody(RequestEntity<String> requestEntity) {
        System.out.println(requestEntity);
        System.out.println("============");
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return "success";
    }


    @RequestMapping("/testResponse")
    public void testRequestBody(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("你的你的都是你的");

    }

    @RequestMapping("/testResponseBody")
    public String testRequestBody() {
        return "<h1 style='color:red'>我是一个文本</h1>";
    }


    @RequestMapping("/testResponseUser")
    public Employee testRequestUser() {
        return new Employee(1001, "aaa", "bbb");
    }
    // 浏览器响应中展示的结果为   {"id":"1001","username":"aaa","password":"bbb"}

    @PostMapping("/testAxios")
    public Employee testAxios(String username, String password) {
        return new Employee(1001, username, password);
    }

    // 下载文件
    @RequestMapping("/testResponseEntity")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession httpSession) throws IOException {
        // 获取servletContext对象
        ServletContext servletContext = httpSession.getServletContext();
        // 获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/image/1.jpg");
        System.out.println(realPath);
        // 创建输入流
        InputStream inputStream = new FileInputStream(realPath);
        System.out.println(inputStream.available());
        // 创建字节数组
        byte[] bytes = new byte[inputStream.available()];   //inputStream.available() 表示字节的长度
        // 将流读取到字节数组中
        // 创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> httpHeaders = new HttpHeaders();
        // 设置下载方式以及要下载文件的名字
        httpHeaders.add("Content-Disposition", "attachment;filename=1.jpg");
        // 设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;   // 相当于200
        // 创建ResponseEntity 对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(bytes, httpHeaders, statusCode);
        // 关闭输入流
        inputStream.close();

        return responseEntity;
    }

    // 上传文件
    @RequestMapping("/testUp")
    public String testUp(MultipartFile photo, HttpSession httpSession) throws IOException {
//        System.out.println(photo.getName());   // photo  表单元素的name
//        System.out.println(photo.getOriginalFilename()); // 1.jpg  上传文件的名字

        // 获取上传文件的文件名
        String filename = photo.getOriginalFilename();
        // 获取文件的后缀名
        String suffixName = filename.substring(filename.lastIndexOf("."));
        // 将UUID作为文件名
        String uuid = UUID.randomUUID().toString();
        filename = uuid + suffixName;  //防止文件重名

        ServletContext servletContext = httpSession.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        File file = new File(photoPath);
        // 判断photoPath对应的文件夹是否存在
        if (!file.exists()) {
            // 若不存在 则创建目录
            file.mkdir();
        }
        // 最终的文件路径
        String finalPath = photoPath + File.separator + filename;
        photo.transferTo(new File(finalPath));  //把资源转移到服务器


        return "success";
    }
}
