package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class notificationService {

    // 1. atributos
    Saludo saludo;
    String nombre;
 @Autowired
    //2. constructores
    public notificationService(Saludo saludo, String nombre){

        this.saludo = saludo;
        this.nombre = nombre;
        System.out.println(" te ha llegado un mensaje");
    }

    // 3... metodos....


    @Override
    public String toString() {
        return "notificationService{" +
                "saludo=" + saludo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
