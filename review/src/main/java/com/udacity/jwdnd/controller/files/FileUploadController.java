package com.udacity.jwdnd.controller.files;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

// https://spring.io/guides/gs/uploading-files/
@Controller
@RequestMapping("/file-upload")
public class FileUploadController {

    @PostMapping
    public String handleFileUpload(@RequestParam("fileUpload") MultipartFile fileUpload, Model model) {
        InputStream is = null;
        try {
            is = fileUpload.getInputStream();
            String text = toString(is);
            model.addAttribute("status", "success");
            model.addAttribute("content", text);
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("status", "failure");
            model.addAttribute("content", "");
        }

        return "file-upload";
    }

    @GetMapping
    public String renderPage(Model model) {
        return "file-upload";
    }

    private String toString(InputStream inputStream) {
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        int result = 0;
        try {
            result = bis.read();

            while (result != -1) {
                buf.write((byte) result);
                result = bis.read();
            }
            return buf.toString("UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Exception!";
    }

}
