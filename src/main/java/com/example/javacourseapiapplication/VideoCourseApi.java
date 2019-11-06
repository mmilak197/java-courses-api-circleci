package com.example.javacourseapiapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VideoCourseApi {

    private VideoCourseRepository videoCourseRepository;

    @Autowired
    public VideoCourseApi(VideoCourseRepository videoCourseRepository) {
        this.videoCourseRepository = videoCourseRepository;
    }

    @GetMapping
    public List<VideoCourse> getVideoCurses () {
        return videoCourseRepository.findAll();
    }

    @PostMapping
    public VideoCourse getVideoCurses(@RequestBody VideoCourse videoCourse) {
        return videoCourseRepository.save(videoCourse);
    }


}
