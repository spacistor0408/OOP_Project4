public class GreenTea extends Ingredient {
  
  GreenTea() {
    this.cost = 20 ;
    prevIngredient_ = null ;
  } // constructor

  GreenTea( Ingredient prev ) {
    this.cost = 20 ;
    prevIngredient_ = prev ;
  } // constructor

}
