package com.tea.webshop.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.io.RandomAccessFile;


@Controller
public class AboutUsController {

    @RequestMapping(value = "/aboutus",method = RequestMethod.GET)
    public ResponseEntity<byte[]> getImage() throws IOException {
        RandomAccessFile f = new RandomAccessFile("C:\\Users\\User1\\Documents\\webshop\\webshop\\src\\main\\resources\\home\\IMG_0.JPG", "r");
        byte[] b = new byte[(int) f.length()];
        f.readFully(b);
        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.IMAGE_JPEG);

        return new ResponseEntity<byte[]>(b, headers, HttpStatus.CREATED);


    }

}
