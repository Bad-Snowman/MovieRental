package MovieStock;

public class Stock {
    
    private final int CAPACITY = 30;
    private Movie[] stock;
    
    public Movie[] getStock() {
        return stock;
    }
    
    public boolean isInStock(Movie movie) {
        //TODO
        return true;
    }
    
    public void addToStock(Movie movie) {
        //TODO
    }
    
    public void takeFromStock(Movie movie) {
        //TODO
    }

    public Stock() {
        this.stock = new Movie[CAPACITY];
    }
    
}
