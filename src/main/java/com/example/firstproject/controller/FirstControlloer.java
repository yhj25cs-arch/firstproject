package com.example.firstproject.controller; // 현재 클래스가 속한 패키지를 선언

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller //컨트롤러 선언
public class FirstControlloer {
    @GetMapping("/hi") // 웹 브라우저에서 /hi로 접속할 때 메서드와 연결함
    public String niceToMeetYou(Model model){ //컨트롤러에서 뷰(HTML 등)로 데이터를 전달할 때 사용하는 객체의 타입 매개변수 전달
        model.addAttribute("username", "유현지"); //모델 객체가 값을 username에 연결해 웹 브라우저로 보냄
        return "greetings"; // greetings.mustache 파일 반환, 서버가 templates 디렉터리에서 파일을 찾아 웹 브라우저로 전송
    }
}
