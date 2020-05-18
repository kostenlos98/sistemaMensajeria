package base;

import interfaces.IBackUp;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashMap;

public class PersistenciaMensajeria implements IBackUp{
    
    private static PersistenciaMensajeria _instancia = null;
    private FileOutputStream fileoutput;
    private FileInputStream fileinput;
    private ObjectOutputStream objectoutput;
    private ObjectInputStream objectinput;
    
    /**
     * Thread-protected Singleton
     * @return
     */
    public synchronized static PersistenciaMensajeria getInstancia()
    {
        if(_instancia == null)
            _instancia = new PersistenciaMensajeria();
        return _instancia;
    }
    
    private PersistenciaMensajeria()
    {
        super();
    }
    
    public void backUp(HashMap<String, ArrayList<String>> mensajesNoEnviados,String fileName)
    {
        try
        {
            fileoutput = new FileOutputStream(fileName);
            objectoutput = new ObjectOutputStream(fileoutput);
            if(objectoutput != null){
                objectoutput.writeObject(mensajesNoEnviados);
                objectoutput.close();
            }
            
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
    public HashMap<String, ArrayList<String>> recuperarDatos(String fileName)
    {
        HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
        try
        {
            fileinput = new FileInputStream(fileName);
            objectinput = new ObjectInputStream(fileinput);
            if(objectinput != null)
            {
                    hm = (HashMap<String, ArrayList<String>>) objectinput.readObject();
                    objectinput.close();
            }
        } 
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (EOFException e)
        {
            System.out.println("El archivo se abrio vacio");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return hm;
    }
}
