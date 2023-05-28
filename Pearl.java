public class Pearl extends Ingredient {
  
  Pearl() {
    this.cost = 10 ;
    prevIngredient_ = null ;
  } // constructor

  Pearl( Ingredient prev ) {
    this.cost = 10 ;
    prevIngredient_ = prev ;
  } // constructor

}
