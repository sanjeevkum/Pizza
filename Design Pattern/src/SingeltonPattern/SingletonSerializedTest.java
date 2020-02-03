package SingeltonPattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
			SerializedSingelton instanceFirst = SerializedSingelton.getInstance();
			
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Sanjeev.Kumar\\eclipse-workspace\\Design Pattern\\src\\SingeltonPattern\\filename.txt"));
			out.writeObject(instanceFirst);
			out.close();
			
			//deserialize from file to object
			ObjectInput in = new ObjectInputStream(new FileInputStream("C:\\Users\\Sanjeev.Kumar\\eclipse-workspace\\Design Pattern\\src\\SingeltonPattern\\filename.txt"));
			
			SerializedSingelton instanceSecond = (SerializedSingelton) in.readObject();
			in.close();
			
			System.out.println("instanceFirst HashCode :- "+ instanceFirst.hashCode());
			System.out.println("instanceSecond HashCode :- "+ instanceSecond.hashCode());
			
	}
}
