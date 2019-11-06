package com.example.javacourseapiapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Starter {

    private VideoCourseRepository videoCourseRepository;

    @Autowired
    public Starter(VideoCourseRepository videoCourseRepository) {
        this.videoCourseRepository = videoCourseRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void init() {
        VideoCourse videoCourse1 = new VideoCourse("Programowanie wielowatkowe Java", "https...", "https...");
        VideoCourse videoCourse2 = new VideoCourse("Testowanie automatyczne z wykorzystaniem mockow", "https...", "https...");
        VideoCourse videoCourse3 = new VideoCourse("Docker od podstaw", "https...", "https...");

        videoCourseRepository.save(videoCourse1);
        videoCourseRepository.save(videoCourse2);
        videoCourseRepository.save(videoCourse3);
    }
}
