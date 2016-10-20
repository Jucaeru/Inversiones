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
public class DivivendStock extends Stock{
    private double dividend;

    public DivivendStock(double dividend, int totalShare, String symbol, double totalCost, double currentPrice) {
        super(totalShare, symbol, totalCost, currentPrice);
        this.dividend = dividend;
    }

    @Override
    public double getProfit() {
        return super.getProfit(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getMarketValue() {
        return (super.getMarketValue() + this.dividend); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
