package serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	public static void serialization(File file, Serializable object) throws IOException {
		OutputStream output = new FileOutputStream(file);
		ObjectOutputStream objectoutput = new ObjectOutputStream(output);
		objectoutput.writeObject(object);
		objectoutput.close();
	}
	
	public static Serializable deserialization(File file) throws IOException, ClassNotFoundException {
		InputStream input = new FileInputStream(file);
		ObjectInputStream objectinput = new ObjectInputStream(input);
		Serializable object =  (Serializable) objectinput.readObject();
		objectinput.close();
		input.close();
		return object;
	}
}
