/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinPatron;

import java.util.ArrayList;

/**
 *
 * @author Axel
 */
public class Iterador {
    ArrayList<Estudiante> estudiante;
    public void Recorrer(ArrayList<Estudiante> estudiante){
    this.estudiante=estudiante;
    };
    public Estudiante first(){return estudiante.get(estudiante.lastIndexOf(this));};
    public void isdone(){}
    public Estudiante next(){return estudiante.get(0);}
    public void current_item(){}
}
