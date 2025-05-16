import java.util.*;
import java.io.*;
public class file{
   static void  file(File ff)
    {
        File[] file=ff.listFiles();
        if(file!=null)
        {
            for(File fil:file)
            {
                System.out.println(fil.getName());
                if(fil.isDirectory())
                {
                    file(fil);
                }
            }
        }
    }
}
static boolean search(File fs,String file)
{
    File[] list= fs.listFiles();
    boolean flag=false;
     if(file!=null)
        {
            for(File file:fileList)
            {
                if(file.isFile() && file.getName() equals(filename))
                {
                    System.out.println("Found");
                    return true;
                }
                else if(file.isDirectory()){
                    {
                        flag=search(file, filename);
                    }


                }
            }
            return flag;
        }
    }