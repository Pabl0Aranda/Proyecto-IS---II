/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package trabajopatronesis2;

/**
 *
 * @author 34651
 */
public interface ISubject {
    
    //PC: no tengo claro que el patron observador se haga asi y nose pq coño se tacha
    
    void registerObserver(IObserver o);
    void removeObserver(IObserver o);
    void notifyObservers(String message);
}
