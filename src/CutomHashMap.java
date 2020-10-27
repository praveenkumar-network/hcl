
public class CutomHashMap {

	int array[];
	int mapCapacity;
	int size;
	
	public CutomHashMap() {
	
	}

	public CutomHashMap(int[] array) {
		this.mapCapacity = 5;
		this.array =new int[mapCapacity];
	}
	
	public void putMethod(int element) {
		if(size<=mapCapacity) {
		array[size]=element;
		size++;
		}
	}
	
	public void display() {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Array element :"+array[i]);
		}
	}
	
	public void getEement(int element) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==element) {
			System.out.println("Array element :"+array[i]);
			}
		}
	}
	
	
	/*
	 * @Override public int hashCode() { return super.hashCode(); }
	 * 
	 * @Override public boolean equals(Object obj) { return super.equals(obj); }
	 */
	
}
