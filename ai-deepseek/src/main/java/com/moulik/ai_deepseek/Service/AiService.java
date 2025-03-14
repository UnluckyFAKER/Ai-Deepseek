package com.moulik.ai_deepseek.Service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AiService {
    private final ChatClient client;

    public AiService(ChatClient.Builder chatclientBilder ) {
        this.client = chatclientBilder.build();
    }
    public String Deepseekr1(String questions){
       return client.prompt(questions).call().content();
    }
    public Flux<String> Deepseekr1withstream(String questions){
        return client.prompt(questions).stream().content();
    }
}
