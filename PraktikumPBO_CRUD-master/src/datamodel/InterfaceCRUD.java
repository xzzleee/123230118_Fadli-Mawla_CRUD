/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamodel;

import java.util.List;

public interface InterfaceCRUD<T> {
    void create(T obj);
    List<T> readAll();
    void update(T obj);
    void delete(int id);
}
