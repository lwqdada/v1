package com.hzxy.show.web.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Auther:lwq
 * @Date:2019/2/2
 * @Description:上传文件到服务器
 * @version:1.0
 */


/*上传文件到服务器，返回文件路径*/
@RestController
public class UploadController {


    private static String path = "D:\\mp3\\";

    @PostMapping("/upload")
    public Object upload(HttpServletRequest request, @RequestParam(name = "file") MultipartFile multipartFile) {
        String fileName = multipartFile.getOriginalFilename();
        System.out.println("文件名"+fileName);
        String fileSuffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.printf(fileSuffix);
        if(!fileSuffix.equals(".mp3")){
           path="D:\\mp4\\" ;
        }

        // 判断路径是否存在，不存在则创建文件夹
        File file = new File(path);
        if (!file.exists()) {
            file.mkdir();
        }


        // 将文件写入目标
        file = new File(path, UUID.randomUUID() + fileSuffix);
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 返回文件完整路径

        return  path+file.getName();


    }
}
