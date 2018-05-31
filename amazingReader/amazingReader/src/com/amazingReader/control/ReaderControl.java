package com.amazingReader.control;

import com.amazingReader.service.Interface.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReaderControl {
    @Autowired
    private ReaderService readerService;

    @RequestMapping("/readerLogin")
    public void login(){

    }

}
