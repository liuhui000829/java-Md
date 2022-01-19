package com.liuhui.boot.controllelr;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;


@Slf4j
@Controller
@SuppressWarnings("all")
public class FormTestController {

    @GetMapping("/form_upload")
    public String form_upload() {
        return "form_upload";
    }

    /*
    * MultipartFile 自动封装传过来的请求
    *
    * */
    @PostMapping("/upload")
    public String upload(
            @RequestParam("email") String email,
            @RequestParam("username") String username,
            @RequestPart("headerImg") MultipartFile headerImg,
            @RequestPart("photos") MultipartFile[] photos) throws IOException {

        log.info("上传的信息是: email={},username={},headerImg={},photos={}",email,username,headerImg,photos);
        if(!headerImg.isEmpty()){
            // 保存文件到服务器, oss服务器
            String originalFilename = headerImg.getOriginalFilename();  // 拿到文件的名字
            headerImg.transferTo(new File("\\"+originalFilename));
        }
        if(photos.length>0){
            for (MultipartFile photo : photos) {
                if(!photo.isEmpty()){
                    photo.transferTo(new File("\\"+photo.getOriginalFilename()));
                }

            }
        }
        return "main";
    }

}
