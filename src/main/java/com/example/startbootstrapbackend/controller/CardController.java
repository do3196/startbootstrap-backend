package com.example.startbootstrapbackend.controller;

import com.example.startbootstrapbackend.model.Card;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//
@RestController
@CrossOrigin(origins = "http://localhost:8000")
public class CardController {
    // 전체 Card 데이터
    private final List<Card> cards = List.of(
            new Card(
                    1,
                    "웹·앱 개발",
                    "HTML, CSS, JavaScript를 활용하여 웹 애플리케이션 개발을 학습합니다.",
                    "웹·앱 개발 분야에서는 사용자에게 보이는 화면을 구현하고 " +
                            "서버와 데이터를 주고받는 웹 애플리케이션 개발 방법을 학습합니다.",
                    "HTML, CSS, JavaScript, React, Spring Boot"
            ),
            new Card(
                    2,
                    "영상 콘텐츠",
                    "영상 촬영, 편집과 모션그래픽을 활용하여 디지털 콘텐츠를 제작합니다.",
                    "영상 콘텐츠 분야에서는 영상 기획부터 촬영, 편집 및 " +
                            "모션그래픽 제작 과정을 실습 중심으로 학습합니다.",
                    "영상 촬영, 영상 편집, 모션그래픽"
            ),
            new Card(
                    3,
                    "3D 디자인",
                    "3D 모델링과 렌더링을 활용하여 다양한 시각 콘텐츠를 제작합니다.",
                    "3D 디자인 분야에서는 3D 모델링과 렌더링 기술을 활용하여 " +
                            "다양한 디지털 콘텐츠를 제작합니다.",
                    "3D 모델링, 렌더링, 콘텐츠 디자인"
            ),
            new Card(
                    4,
                    "데이터·AI",
                    "Python과 데이터를 활용하여 데이터 분석과 AI 기초를 학습합니다.",
                    "데이터·AI 분야에서는 Python을 활용한 데이터 처리와 " +
                            "분석 및 미래예측 기초 내용을 학습합니다.",
                    "Python, Excel, 데이터 분석, 미래예측"
            )
    );
    // Card 전체 목록
    @GetMapping("/api/cards")
    public List<Card> getCards() {
        return cards;
    }
    // Card 상세조회
    @GetMapping("/api/cards/{id}")
    public Card getCard(@PathVariable int id) {
        return cards.stream().filter(card -> card.getId() == id)
                .findFirst().orElse(null);
    }
}