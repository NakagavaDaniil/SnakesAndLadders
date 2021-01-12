package springboot.controller;

import game.Board;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.dto.PlayerData;

@RestController
public class GameController {

    private Board board = new Board();

    @GetMapping("/move")
    public PlayerData move() {
        int turn = board.makeTurn();
        return new PlayerData(turn);
    }
}
