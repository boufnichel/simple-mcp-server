package com.example.mcp.model;

import lombok.Data;

@Data
public class ContextRequest {
    private String query;
    private String conversationId;
    private String messageId;
}