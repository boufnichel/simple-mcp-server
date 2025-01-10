package com.example.mcp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ContextResponse {
    private String query;
    private String context;
}