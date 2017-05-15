/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author matsu
 */
public class HouseBlend extends Beverage {
    private int cost = 200;
    private String description;
    
    public HouseBlend(){
        this.description = "コーヒー";
    }
    
    //価格に200円プラスした価格を返す
    public int getCost(){ 
        return super.getCost() + cost;
    }
    
    public String getDescription(){
        return description;
    }
}
