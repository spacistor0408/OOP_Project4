public abstract class Ingredient {

  protected int cost = 0 ;
  protected Ingredient prevIngredient_ = null ;

  public int getCost() {
    if ( prevIngredient_ instanceof Ingredient ) return cost + prevIngredient_.getCost() ;
    return cost ;
  } // getCost()
}
