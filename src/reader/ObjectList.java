package reader;

import java.util.ArrayList;

public class ObjectList<T> extends ArrayList<T> { //ArrayListの内容をObjectListが継承できる。

	public boolean add(T value) {   //7 ~１４行目意味ない？
		return super.add(value);
	}

	public T get(int index) {
		return super.get(index);
	}
}

