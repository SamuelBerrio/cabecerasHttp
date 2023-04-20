package com.example.cabecerashttprequest.service.impl;

import com.example.cabecerashttprequest.model.Producto;
import com.example.cabecerashttprequest.service.ProductoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {

    List<Producto> productoArrayList = new ArrayList<>();
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "notebook", "computacion",
                        175000),
                new Producto(2L, "mesa escritorio", "oficina", 100000),
                new Producto(3L, "teclado mecanico", "computacion", 40000));
    }

    @Override
    public Producto buscarId(Long id) {
        productoArrayList = listar();
        return productoArrayList.stream()
                .filter(producto -> producto.getId() == id)
                .findAny()
                .orElse(null);
    }


}
