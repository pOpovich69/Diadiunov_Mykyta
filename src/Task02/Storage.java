package Task02;

import java.io.*;


/**
 * The class Storage
 */
public class Storage{
    private static final String FILE_NAME = "Data.save";
    private File file = new File(FILE_NAME);


    /**
     *
     * Save
     *
     * @param savedData  the saved data
     * @throws   IOException
     */
    public void Save(Data savedData) throws IOException {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(savedData);
        outputStream.close();
    }

    /**
     *
     * Load
     *
     * @param savedDataByDefault  the saved data by default
     * @return Object
     * @throws   Exception
     */
    public Object Load(Data savedDataByDefault) throws Exception{

        if(file.exists()){
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file));
            return inputStream.readObject();
        }
        Save(savedDataByDefault);
        return savedDataByDefault;
    }
}
