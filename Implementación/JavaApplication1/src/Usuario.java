/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author pablo
 */
public interface Usuario 
{
    //Subclases: Estudiante, Profesor e Investigador
    String getNombre();
    
    String getDNI();
    
    String getTipoUsuario();
    
    void prestarLibro (Libro libro);
    
    void devolverLibro (Libro libro);
}
