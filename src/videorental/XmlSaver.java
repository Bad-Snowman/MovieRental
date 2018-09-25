package videorental;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** Saves and loads data in XML format in a file of a given name.
 * 
 * XML can be read and edited by humans, so this is an easy way ro get test data
 * into a system.
 * 
 * The data must be in an array, and all classes that is intended to
 * be saved and restored must have getters and setters for all fields 
 * that are to be saved and restored.
 * 
 * All classes must also have a default constructor, which is a constructor
 * with no arguments. Or they must have no constructors at all.
 *  
 * @author mortenv.christiansen
 *
 */
public class XmlSaver {
    /**
     * dumps an array of some class into an XML file
     * @param data The array to be saved
     * @param fileName The name of the file
     */
    public static < E > void arrayDump(final E[] data, String fileName) {
        try {
            OutputStream os = new FileOutputStream(fileName);
            XMLEncoder xe = new XMLEncoder(os);
            xe.writeObject(data);
            xe.close();
        } catch (IOException e) {
            //die with an error message
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Loads data back into the system from an XML file.
     * @param fileName
     * @return an Array of data from the file.
     */
    @SuppressWarnings("unchecked")
    public static < E > E[] arrayLoad(String fileName) {
        E[] data=null;
        try {
            InputStream is= new FileInputStream(fileName);
            XMLDecoder xd = new XMLDecoder(is);
            Object o = xd.readObject();
            if (o instanceof Object[])
                data=((E[]) o);
            xd.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
       
        return data;
    }
    
}