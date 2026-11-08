package com.example.startbootstrapbackend.controller;

import com.example.startbootstrapbackend.model.Career;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class CareerController {
    @GetMapping("/api/careers")
    public List<Career> getCareers() {
        return List.of(
                new Career(
                        1,
                        "웹 개발자",
                        "웹사이트와 웹 애플리케이션을 개발합니다."
                ),
                new Career(
                        2,
                        "영상 콘텐츠 제작자",
                        "영상 촬영, 편집 및 다양한 디지털 콘텐츠를 제작합니다."
                ),

                new Career(
                        3,
                        "3D 디자이너",
                        "3D 모델링과 렌더링을 활용하여 시각 콘텐츠를 제작합니다."
                ),

                new Career(
                        4,
                        "데이터 분석가",
                        "Python과 데이터를 활용하여 데이터를 분석하고 결과를 해석합니다."
                )
        );
    }
}
