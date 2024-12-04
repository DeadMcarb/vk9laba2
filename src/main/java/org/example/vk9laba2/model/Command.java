package org.example.vk9laba2.aaaaaaaaaaaaaaaaaaaaaa.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public interface Command {
    void execute(HttpServletRequest request, HttpServletResponse response);
}