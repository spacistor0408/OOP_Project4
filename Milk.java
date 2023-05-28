public class Milk extends Ingredient {
  
  Milk() {
    this.cost = 20 ;
    prevIngredient_ = null ;
  } // constructor

  Milk( Ingredient prev ) {
    this.cost = 20 ;
    prevIngredient_ = prev ;
  } // constructor
  
}
