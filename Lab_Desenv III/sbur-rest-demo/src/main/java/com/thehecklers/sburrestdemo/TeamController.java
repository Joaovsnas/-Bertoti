package com.thehecklers.sburrestdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/teams")
public class TeamController {
    private static final List<String> teams = new ArrayList<>(List.of(
            "Corinthians", "Palmeiras", "Sao Paulo", "Santos", "Vasco", "Gremio", "Internacional", "Tigrinho", "Iludido"
    ));

    @GetMapping("/{name}")
    public ResponseEntity<String> getTeam(@PathVariable String name) {
        for (String team : teams) {
            if (team.equalsIgnoreCase(name)) {
                return ResponseEntity.ok(team);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time não encontrada");
    }

    @PostMapping
    public ResponseEntity<String> addTeam(@RequestBody String newTeam) {
        for (String team : teams) {
            if (team.equalsIgnoreCase(newTeam)) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body("Time já existe.");
            }
        }
        teams.add(newTeam);
        return ResponseEntity.status(HttpStatus.CREATED).body("Time adicionado: " + newTeam);
    }

    @PutMapping("/{oldName}")
    public ResponseEntity<String> updateTeam(@PathVariable String oldName, @RequestBody String newName) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equalsIgnoreCase(oldName)) {
                teams.set(i, newName);
                return ResponseEntity.ok("Mudou o nome de " + oldName + " para " + newName);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time antigo não encontrado.");
    }

    @DeleteMapping("/{name}")
    public ResponseEntity<String> deleteTeam(@PathVariable String name) {
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).equalsIgnoreCase(name)) {
                teams.remove(i);
                return ResponseEntity.ok("Time removido: " + name);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Time não encontrado.");
    }
}
