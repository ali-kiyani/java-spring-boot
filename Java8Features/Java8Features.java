package Java8Features;

import java.util.*;  
import java.util.stream.Collectors;  

class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
    	return a.price < b.price ? -1 : a.price == b.price ? 0 : 1;
    }
}

public class Java8Features {  
    List<Product> productsList = new ArrayList<Product>();  

	public Java8Features()
	{
        //Adding Products  
        productsList.add(new Product(1,"Product-1",25000f));  
        productsList.add(new Product(2,"Product-2",30000f));  
        productsList.add(new Product(3,"Product-3",28000f));  
        productsList.add(new Product(4,"Product-4",28000f));  
        productsList.add(new Product(5,"Product-5",90000f));  
	}
	
	public void FilteringAndMapping()
	{
        List<Float> productPriceList2 = productsList.stream()  
                .filter(p -> p.price > 30000)// filtering data  
                .map(p->p.price)        // fetching price  
                .collect(Collectors.toList()); // collecting as list  
        		System.out.println(productPriceList2);  
	}
	
	public void ManipulatingUsingForEach()
	{
        productsList.stream().forEach(x -> {				// traversing through productList using forEach
        	x.price = x.price + 100;						// manipulating price
        	System.out.println(x.toString());
        });
	}
	
	public void SortingUsingCustomComparator()
	{
        productsList
        		.stream()
        		.sorted(new PriceComparator())				// sorting using custom comparator
        		.forEach(System.out::println);	
        
	}
	
	public void PrintingUsingMethodReference()
	{
        productsList.stream().forEach(System.out::println);	// printing product list through Method Reference
	}
	
    public static void main(String[] args) 
    {  
    	Java8Features jf = new Java8Features();

        System.out.println("\nFiltering and mapping\n");
        
        jf.FilteringAndMapping();
    	
        System.out.println("\nPrinting products by FOREACH\n");
       
        jf.ManipulatingUsingForEach();
        
        System.out.println("\nPrinting Sorted product list for price\n");
        
        jf.SortingUsingCustomComparator();
       
        System.out.println("\nPrinting product list using Method Reference\n");

        jf.PrintingUsingMethodReference();
    }  
}  