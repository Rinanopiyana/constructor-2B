public class Juice extends Minuman{
	
	public int stockbuah;

	public Juice(String nama, int stockbuah){
		super(nama);		
		this.stockbuah = stockbuah;
	}

	public Juice(String nama){
		super(nama);
	}


	public void showStockbuah(){
		System.out.println("Stock buah yang ada = " +stockbuah);
	}

}