package com.nekoder.controllers;

import com.nekoder.models.Game;
import com.nekoder.services.GameService;
import org.springframework.web.bind.annotation.*;

@RestController
public class GameController {
    @PostMapping("/game")
    @ResponseBody
    public Game game(@RequestBody Game game){
        return GameService.checkGame(game);
    }
}
