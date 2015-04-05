/**
 * 
 */
package chapter3;

/**
 * @author MaoTouMaoTou
 *
 */
public class CC1503_7 {
	 String type;
	 Date arrive;
	 String name;
	}
	 
	public class Cats extends Animal{
		public Cats(String name){
			this.name=name;
			type="cats";
		}
	}
	 
	public class Dogs extends Animal{
		public Dogs(String name){
			this.name=name;
			type="dogs";
		}
	}
	 
	public class AnimalQueue{
		Linkedlist<Dog> dogs=new LinkedList<Dog>();
		LinkedList<Cat> cats=new LinkedList<Cat>();
		private int order=0;
		
		public void enqueue(Animal a){
			
			a.setOrder(order);
			order++;
			
			if(a instanceof Dog) 
				{dogs.addLast((Dog) a);
				
				}
			else (a instanceof Cat){
				cats.addLat((Cat)a);
				}
			public Animal dequeue(){
				if(dog.size()==0){
					return dequeueCats();
					}
				else(cats.size()==0){
					return dequeueDogs();
					}
				Dog dog=dogs.peek();
				Cat cat=cats.peek();
				
				if(dog.isOlderThan(at)){
					return dequeueDogs();
				}
				else{
					return dequeueCats();
				}
			
			public Dog dequeueDogs(){
				return dogs.poll();
				}
			
			public Cat dequeueCats(){
				return cats.poll();
			}
			
			}
					
			
	 
		}
		

}
