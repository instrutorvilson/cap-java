package com.aulas.mvc.interfaces;

import java.util.List;

public interface IDAO<T> {
    boolean salvar(T obj);
    T getOne(int id);
    List<T> getTodos();
    boolean alterar(T obj);
    boolean deletar(int id);
}
