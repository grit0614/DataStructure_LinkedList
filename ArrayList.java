
public class ArrayList {

	private int[] arr = new int[128];
	private int arrayIndex = 0;
		
	public ArrayList() {
		for(int i=0; i < arr.length; i++) {
			arr[i]=0;
		}
		System.out.println("Array is initialized");
	}
	
	public boolean add(int index, int num) {
		if(arrayIndex >= arr.length) {
			System.out.println("Error : Array is full");
			return false;
		} 
		
		else {
			if(index > arr.length) {
				System.out.println("Error : Invalid Index");
				return false;
			}
			else if(index < arrayIndex) {
				for(int i=arrayIndex; i >= index; i--) arr[i+1]=arr[i];
			}
		}
		arr[index] = num;
		arrayIndex++;
		return true;
	}
	
	public int remove(int index) {
		int res = arr[index];
		if(index > arrayIndex) {
			System.out.println("Error : Invalid Index");
			return -1;
		}
		else if(index<arrayIndex) {
			for(int i = index; i < arrayIndex-1; i++) arr[i]=arr[i+1];
		}
		arrayIndex--;
		return res;
	}
	
	public void printAll() {
		System.out.print("{");
		for(int i=0; i<arrayIndex; i++) {
			System.out.print(arr[i]);
			if(i < arrayIndex-1) System.out.print(", ");
		}
		System.out.println("}");
	}
}
