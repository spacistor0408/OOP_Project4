public class BlackTea extends Ingredient {

  BlackTea() {
    this.cost = 20 ;
    prevIngredient_ = null ;
  } // constructor

  BlackTea( Ingredient prev ) {
    this.cost = 20 ;
    prevIngredient_ = prev ;
  } // constructor

}
