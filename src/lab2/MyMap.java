package lab2;

public class MyMap<T> implements HashMap<Object> {

	int size = 0;
	T[] map;

	MyMap() {
		map = (T[]) new MapItem[4];
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public T clear() {
		// TODO Auto-generated method stub

		map = (T[]) new MapItem[4];
		return null;
	}

	@Override
	public <T> String get(String key) {
		// TODO Auto-generated method stub
		String item = null;
		switch (key) {
		case "radius":
			item = String.valueOf(((MapItem<?>) map[0]).get());
			break;
		case "area":
			item = String.valueOf(((MapItem<?>) map[1]).get());
			break;
		case "peremeter":
			item = String.valueOf(((MapItem<?>) map[2]).get());
			break;
		case "deameter":
			item = String.valueOf(((MapItem<?>) map[3]).get());
			break;
		}

		return item;
	}

	@Override
	public String put(String key, String item) {

		MapItem<String> val = new MapItem<String>(key, item);

		switch (key) {
		case "radius":
			map[0] = (T) val;
			break;
		case "area":
			map[1] = (T) val;
			break;
		case "peremeter":
			map[2] = (T) val;
			break;
		case "deameter":
			map[3] = (T) val;
			break;
		}

		return item;
		// TODO Auto-generated method stub

	}

}
