
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Se declara un metodo par aobtener un ArrayList de Objetos Categoria
    //Los objetos vienen de la tabla categoria, todos los resgistros
    
    public List<Categoria> getCategorias(boolean activos);
    //Abajo se colocara los metodos para realizar el CRUD de categorias
}
