package collection;

import java.util.HashMap;
import java.util.Map;

public class HashExample {

	private String message;

	public String getMessage() {
		return message;
	}

	public HashExample(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashExample other = (HashExample) obj;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "HashExample [message=" + message + "]";
	}

	public static void main(String[] args) {
	 HashExample ex = new HashExample("welcome");
	 HashExample ex1 = new HashExample("welcome");
	 System.out.println(ex.hashCode()+"--"+ex1.hashCode());
	 System.out.println(ex.equals(ex1)+"--"+ex.hashCode()+"--"+ex1.hashCode());
	}
	
}
