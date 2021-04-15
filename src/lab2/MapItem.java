package lab2;

public class MapItem<T> {
	T val;
	T item;
	MapItem(T val,T item){
		this.val=val;
		this.item=item;
	}
	
	public T get() {
		return item;
	}
	public void  set(T key,T item) {
		this.val=key;
		this.item=item;
	}
	
}
