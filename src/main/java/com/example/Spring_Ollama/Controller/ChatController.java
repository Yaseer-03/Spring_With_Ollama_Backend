package com.example.Spring_Ollama.Controller;

import org.springframework.web.bind.annotation.*;

import com.example.Spring_Ollama.Request.Prompt;
import com.example.Spring_Ollama.Service.ChatService;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping(value = "/chat", produces = "text/event-stream")
    public Flux<String> messageRequest(@RequestBody Prompt prompt) {
        return chatService.getMessage(prompt.getPrompt());
    }

}
