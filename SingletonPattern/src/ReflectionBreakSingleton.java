import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class ReflectionBreakSingleton {

	/*
	 * Reflection : Dùng để phá vỡ EagerSingleton
	 */
	public static void main(String[] args)
			throws FileNotFoundException,IOException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, InvocationTargetException {
		System.out.println("Reflection : Dùng để phá vỡ EagerSingleton ");
		EagerSingleton eager1 = EagerSingleton.getInstance();
		EagerSingleton eager2 = EagerSingleton.getInstance();
		EagerSingleton eager3 = null;
		Constructor<?>[] constructor = EagerSingleton.class.getDeclaredConstructors();
		for (Constructor<?> con : constructor) {
			con.setAccessible(true);
			eager3 = (EagerSingleton) con.newInstance();
		}
		System.out.println(eager1.hashCode());
		System.out.println(eager2.hashCode());
		System.out.println(eager3.hashCode());
		
		System.out.println("Reflection : Dùng để phá vỡ BillPughSingleton ");
		BillPughSingleton bi= BillPughSingleton.getInstance();
		BillPughSingleton bi2= BillPughSingleton.getInstance();
		BillPughSingleton bi3=null;
		Constructor<?>[] constructor1 = BillPughSingleton.class.getDeclaredConstructors();
		for (Constructor<?> con : constructor1) {
			con.setAccessible(true);
			bi3 = (BillPughSingleton) con.newInstance();
		}
		System.out.println(bi.hashCode());
		System.out.println(bi2.hashCode());
		System.out.println(bi3.hashCode());
		
		SerializedSingleton se=SerializedSingleton.getInstance();
		EnumSingleton en= EnumSingleton.INSTANCE;
		ObjectOutput out= new ObjectOutputStream(
				new FileOutputStream("SerializedSingleton.txt"));
		out.writeObject(se);
		out.writeObject(en);
		out.close();
		
		ObjectInput in= new ObjectInputStream(
				new FileInputStream("SerializedSingleton.txt"));
		SerializedSingleton se2=(SerializedSingleton)in.readObject();
		EnumSingleton en2= (EnumSingleton)in.readObject();
		in.close();
		System.out.println("SerializedSingleton1 hashCode=" + se.hashCode());
        System.out.println("serializedSingleton2 hashCode=" + se2.hashCode());
        System.out.println("enumSingleton1 hashCode=" + en.hashCode());
        System.out.println("enumSingleton2 hashCode=" + en2.hashCode());
		
	}
}
