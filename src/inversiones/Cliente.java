/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

/**
 *
 * @author Estudiante
 */
public class Client {
    private int cc;
    private String firstName;
    private String lastName;
    private int phone;
    private int age;
    
    private Asset[] assets;

    public Client(int cc, String firstName, String lastName, int phone, int age) {
        this.cc = cc;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.assets = new Asset [10];
    }
    
    public double sumMarketValue(){
        return 0;
    }
    public double sumProfit(){
        return 0;
    }
    public boolean addAsset(Asset asset){
        return true;
    }
}
