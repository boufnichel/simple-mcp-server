package com.example.mcp.controller;

import org.springframework.web.bind.annotation.*;
import com.example.mcp.model.*;

@RestController
@RequestMapping("/api/v1")
public class McpController {

    @PostMapping("/context")
    public ContextResponse provideContext(@RequestBody ContextRequest request) {
        // Simple implementation that echoes back the request
        return new ContextResponse(request.getQuery(), "Simple MCP response");
    }
}