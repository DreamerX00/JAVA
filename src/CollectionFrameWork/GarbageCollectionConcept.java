package CollectionFrameWork;

import java.lang.ref.WeakReference;

public class GarbageCollectionConcept {
	public static void main(String[] args) {
		laptop firstLaptop =  new laptop(100000, "ASUS", "ASUS TUF");	
		System.out.println(firstLaptop);
		firstLaptop = null;

		//new Laptop(100000, "ASUS", "ASUS TUF") JVM will destroy it automatically considering no reference exists.
		System.out.println(firstLaptop);
		
		
		//let's see this in practical using WeakRefrence Class
		WeakReference<laptop> laptopWeakReference = new WeakReference<laptop>(new laptop(200000, "AlienWare", "Gaming Demon"));
		System.out.println(laptopWeakReference.get());// this will work normally as it's invoked 
		System.gc();//called garbage collector to destroy this weak reference
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(laptopWeakReference.get());//output will be null after 10 seconds
	}
}

class laptop{
	private int price;
	private String model;
	private String name;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public laptop(int price, String model, String name) {
		super();
		this.price = price;
		this.model = model;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Model : " + getModel()+"\nName: "+getName()+"\nPrice : "+getPrice();	
	}
	
	
}


