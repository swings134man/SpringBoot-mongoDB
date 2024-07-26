package com.using.mongo.conntest.maria;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final BoardRepository boardRepository;

    @GetMapping("/all")
    public List<Board> findAll() {
        return boardRepository.findAll();
    }
}
