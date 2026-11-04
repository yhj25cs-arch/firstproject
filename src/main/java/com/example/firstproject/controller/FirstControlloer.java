package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;

@Controller //컨트롤러 선언
public class FirstControlloer {
    public String niceToMeetYou(){
        return "greetings"; // greetings.mustache 파일 반환, 서버가 templates 디렉터리에서 파일을 찾아 웹 브라우저로 전송
    }
}
