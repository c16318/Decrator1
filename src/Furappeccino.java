


/**
 *
 * @author matsu
 */
public class Furappeccino extends CondimentDecorator{
    
    public Furappeccino(Beverage beverage){
        super(beverage);
    }
    
    //生クリームをトッピング
    public String getDescription(){
        return  beverage.getDescription() + "+生クリーム";
    }
    
    //価格に30円をプラスした値を返す
    public int getCost(){
        return beverage.getCost() + 30;
    }
}

