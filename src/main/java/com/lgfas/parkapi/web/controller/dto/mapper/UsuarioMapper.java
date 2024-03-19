package com.lgfas.parkapi.web.controller.dto.mapper;

import com.lgfas.parkapi.entity.Usuario;
import com.lgfas.parkapi.web.controller.dto.UsuarioCreateDto;
import com.lgfas.parkapi.web.controller.dto.UsuarioResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioMapper {

    public static Usuario toUsuario(UsuarioCreateDto usuarioCreateDto) {
        return new ModelMapper().map(usuarioCreateDto, Usuario.class);
    }

    public static UsuarioResponseDto toDto(Usuario usuario) {
        String role = usuario.getRole().name().substring("ROLE_".length());
        PropertyMap<Usuario, UsuarioResponseDto> props = new PropertyMap<Usuario, UsuarioResponseDto>() {
            @Override
            protected void configure() {
                map().setRole(role);
            }
        };

        ModelMapper mapper =  new ModelMapper();
        mapper.addMappings(props);

        return mapper.map(usuario, UsuarioResponseDto.class);
    }

    public static List<UsuarioResponseDto> toListDto (List<Usuario> usuarios) {

        return usuarios.stream()
                .map(UsuarioMapper::toDto)
                .collect(Collectors.toList());
    }
}