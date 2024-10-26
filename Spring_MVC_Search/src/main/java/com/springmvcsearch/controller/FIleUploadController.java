package com.springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FIleUploadController {
    @RequestMapping("/upload")
    public String uploadForm() {
        System.out.println("upload page");
        String nt = null;
        System.out.println(nt.length());
        return "fileForm";
    }

    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    public String fileUpload(@RequestParam("image") MultipartFile file, Model model, HttpSession s) throws IOException {
        System.out.println("File upload handler");
        if (file == null || file.isEmpty()) {
            model.addAttribute("message", "Please select a file to upload");
            return "upload";  // Redirect to the form if no file is uploaded
        }
        model.addAttribute("message", "File uploaded successfully!");
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        byte[] bytes = file.getBytes();
        // we have to save this file to the server
        String path = s.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "image" + File.separator + file.getOriginalFilename();
        System.out.println("path");
        FileOutputStream fos = new FileOutputStream(path);
        fos.write(bytes);
        fos.close();
        System.out.println("File uploaded");
        return "fileSuccess";
    }
}
