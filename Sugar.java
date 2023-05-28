public class Sugar extends Ingredient {
  
  Sugar() {
    this.cost = 5 ;
    prevIngredient_ = null ;
  } // constructor

  Sugar( Ingredient prev ) {
    this.cost = 5 ;
    prevIngredient_ = prev ;
  } // constructor

}
