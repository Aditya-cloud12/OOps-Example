package aditya.it;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial_DeSerial implements Serializable {

	private static final long serialVersionUID = -9608886529L;
	int id;
	String name;
	String email;
	transient String pwd;
	transient Long creditCard;

	public static void main(String[] args) throws Exception {

		Serial_DeSerial p = new Serial_DeSerial();
		p.id = 101;
		p.name = "Aditya";
		p.email = "aditya123@gmail.com";
		p.creditCard = 1263786366748l;

		System.out.println("=====Serialization Started=====");

		FileOutputStream f = new FileOutputStream("Serial_DeSerial.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(p);
		o.flush();
		o.close();

		System.out.println("=====Serialization Ended=====");

		System.out.println("=====De-Serialization Started=====");

		FileInputStream fis = new FileInputStream("Serial_DeSerial.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		Serial_DeSerial p1 = (Serial_DeSerial) object;
		System.out.println("Id : " + p1.id);
		System.out.println("Name : " + p1.name);
		System.out.println("Email : " + p1.email);
		System.out.println("Password : " + p1.pwd);
		System.out.println("CreditCard : " + p1.creditCard);
		ois.close();

		System.out.println("=====De-Serialization Ended=====");

	}

}
