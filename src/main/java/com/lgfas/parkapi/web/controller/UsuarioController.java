package com.lgfas.parkapi.web.controller;

import com.lgfas.parkapi.entity.Usuario;
import com.lgfas.parkapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> create (@RequestBody Usuario usuario) {
        Usuario user = usuarioService.salvar(usuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getById (@PathVariable Long id) {
        Usuario user = usuarioService.buscarPorId(id);

        return ResponseEntity.ok(user);
    }


}


