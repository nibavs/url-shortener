package com.github.nibavs.url_shortener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Slf4j
@RestController
@RequestMapping("/api")
public class UrlShortenerController {
    UrlRepository urlRepository;
    StudentRepo studentRepo;

    public UrlShortenerController(UrlRepository urlRepository, StudentRepo studentRepo) {
        this.urlRepository = urlRepository;
        this.studentRepo = studentRepo;
    }

    @PostMapping("/shorten")
    public String shorten(@RequestBody String url) {
        return url + "+ short";
    }

    @GetMapping("/{shortUrl}")
    public RedirectView redirect(@PathVariable("shortUrl") String shortUrl) {
        String originalUrl = "https://vk.com/photos165366975?z=photo165366975_457243050%2Fphoto_feed165366975";
        return new RedirectView(originalUrl);
    }

    @PostMapping("/addUrl")
    public void addUrl(@RequestBody UrlDocument url) {
        urlRepository.save(url);
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentRepo.save(student);
    }





}
