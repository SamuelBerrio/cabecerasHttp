package com.example.cabecerashttprequest.service;

import com.example.cabecerashttprequest.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    Producto buscarId(Long id);
}
