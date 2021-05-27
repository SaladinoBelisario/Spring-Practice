package com.example.demo;

public class HappyFortuneInterface implements FortuneService{
    @Override
    public String getFortune() {
        return "Today it's your lucky day";
    }
}
