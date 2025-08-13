package com.chugyoyo.web.ai.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatCompletionChoice {


    private Integer index;

    private ChatMessage message;

    @JsonProperty("finish_reason")
    private String finishReason;
}
