package Java8Features;

class Product{  
    int id;  
    String name;  
    float price;  
    
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    
    @Override
    public String toString() {
    	return "Product: [ id: " + this.id + ", name: " + this.name + ", price: " + this.price + " ]";
    }
}  
