package com.springboot.mybatis.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import reactor.core.Exceptions;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileSystem;
import java.util.Enumeration;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/27  10:26
 */
@RestController
public class FileController {
    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("source") MultipartFile file) {
        if (file.isEmpty()) {
            return "上传失败，请选择文件";
        }
        String fileName = file.getOriginalFilename();
        String filePath = "F:\\";
        File dest = new File(filePath + fileName);
        try {
            file.transferTo(dest);
            System.out.println("上传成功");
            return "上传成功";
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return "上传失败！";
    }

    @PostMapping("/tupload")
    @ResponseBody
    public void tupload(HttpServletRequest request) throws Exception {
        MultipartHttpServletRequest multipartRequest   =   (MultipartHttpServletRequest)   request;
        ServletInputStream inputStream = multipartRequest.getInputStream();
        System.out.println(inputStream.available());
     /*   String fType= request.getParameter("FTYPE");
        System.out.println("文件类型:" + fType);
        String name= request.getParameter("name");
        System.out.println("文件名字:" + name);*/
        OutputStream outputStream = new FileOutputStream("F:\\a.ofd");
        IOUtils.copy(inputStream,outputStream);
        inputStream.close();
        outputStream.close();
    }

    @PostMapping("/mglog")
    public void log(HttpServletRequest request){
        System.out.println("content-type:" + request.getContentType());
        System.out.println(request);
   }
}
