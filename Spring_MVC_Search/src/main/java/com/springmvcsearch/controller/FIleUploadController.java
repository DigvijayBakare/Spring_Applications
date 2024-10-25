package com.springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FIleUploadController {
    @RequestMapping("/upload")
    public String uploadForm() {
        return "fileForm";
    }

    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("image") CommonsMultipartFile file) {
        System.out.println("File upload handler");
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        return "fileSuccess";
    }
}
