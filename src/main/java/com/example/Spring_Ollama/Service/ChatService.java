package com.example.Spring_Ollama.Service;

import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.stereotype.Service;
import com.example.Spring_Ollama.Validations.Validation;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class ChatService {

    private final ChatModel chatModel;
    private final Validation validationCheck;

    public Flux<String> getMessage(String messageRequest) {
        if (validationCheck.isNull(messageRequest)) {
            return Flux.just("Please enter a prompt: ");
        }

        // Create a prompt with the user's message
        UserMessage userMessage = new UserMessage(messageRequest);
        Prompt prompt = new Prompt(userMessage);

        return chatModel.stream(prompt)
                .map(response -> response.getResult().getOutput().getText())
                .bufferUntil(chunk -> chunk.endsWith("\n") || chunk.endsWith("."))
                .flatMap(chunks -> {

                    String combinedChunk = String.join("", chunks);
                    return Flux.just(combinedChunk);
                });
    }

}
