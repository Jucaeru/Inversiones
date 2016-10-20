/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Compañia {
    private HashMap<String, Client> clients;
    
    public Compañia(){
        this.clients = new HashMap<>();
    }
    
    public boolean addClient(Client client){
        return true;
    }
    public double calAmountAllMarket0(){
        return 0;
    }
    public double calAllProfit(){
        return 0;
    }
    public ArrayList calMarketAndProfitByAsset(){
        return null;
    }
    public ArrayList calMarketAndProfitByAge(){
        return null;
    }
    public Client calClientMaxProfit(){
        return null;
    }
}
