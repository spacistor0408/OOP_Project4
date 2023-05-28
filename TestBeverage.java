class TestBeverage {
    
  public static void main( String[] args ) {
    
      /* 製作珍珠奶茶 */
      
      // 1.產生牛奶
      Milk milk = new Milk() ;

      // 2.加紅茶
      BlackTea blackTea = new BlackTea( milk ) ;

      // 3.加珍珠
      Pearl pearl = new Pearl( blackTea ) ;
      
      // 完成！
      System.out.println( pearl.getCost() ) ;
  }
}