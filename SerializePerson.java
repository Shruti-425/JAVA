import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable 
{
    private final String name;
    private final int age;

    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    @Override
    public String toString() 
    {
        return "Name: " + name + ", Age: " + age;
    }
}

public class SerializePerson 
{
    public static void main(String[] args) 
    {

        Person originalPerson = new Person("Alice", 25);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.txt"))) 
        {
            out.writeObject(originalPerson);
            System.out.println("Person object has been serialized to person.txt");
        } 
        catch (IOException e) 
        {
            System.out.println("Serialization Error: " + e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.txt"))) 
        {
            Person deserializedPerson = (Person) in.readObject();

            System.out.println("\nDeserialized Person:");
            System.out.println(deserializedPerson);

        } 
        catch (IOException | ClassNotFoundException e) 
        {
            System.out.println("Deserialization Error: " + e.getMessage());
        }
    }
}