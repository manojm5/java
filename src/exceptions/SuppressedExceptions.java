package exceptions;

import java.io.IOException;

public class SuppressedExceptions {

	public static void main(String[] args) {
		try (One one = new One()) {
			throw new Exception("Try");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed:" + t);
			}
		}
	}
}

class One implements AutoCloseable {
	public void close() throws IOException {
		throw new IOException("Closing");
	}
}
