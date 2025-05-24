
package com.thehecklers.sburrestdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/teams")
public class TeamController {
    private static final List<String> teams = List.of(
        "Corinthians", "Palmeiras", "Sao Paulo", "Santos", "Vasco", "Gremio", "Internacional"
    );

    @GetMapping("/{name}")
    public ResponseEntity<String> getTeam(@PathVariable String name) {
        for (String team : teams) {
            if (team.equalsIgnoreCase(name)) {
                return ResponseEntity.ok(team);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time não encontrado");
    }
}
