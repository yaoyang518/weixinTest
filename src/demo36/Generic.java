package demo36;

public class Generic<T> {
	public T data;

	public Generic(T _data) {
		data = _data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
