package ru.netology;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@FunctionalInterface
public interface Handler {

    boolean handle(String path, HttpServletRequest req, HttpServletResponse resp) throws IOException;
}