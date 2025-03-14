package com.moulik.ai_deepseek.Controller;

import com.moulik.ai_deepseek.Service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/promt")
public class AiController {
    @Autowired
    AiService aiService;

    @GetMapping
    public String getpromt(@RequestParam(value = "questions") String questions) {
        return aiService.Deepseekr1(questions);
    }

    @GetMapping("stream")
    public Flux<String> getpromtwithstream(@RequestParam(value = "questions") String questions) {
        return aiService.Deepseekr1withstream(questions);
    }
}
