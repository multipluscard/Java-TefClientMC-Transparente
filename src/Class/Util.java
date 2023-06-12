package Class;




import com.sun.jna.Native;
import java.awt.Desktop;
import java.io.*;
import java.lang.Runtime.Version;
import java.nio.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.print.DocFlavor;

public class Util {
    
    
    public static void AdicionaLog(String strMsg, String strStackTrace)
    {
        strStackTrace = null;
        CriarArquivo("tef", strMsg, strStackTrace);
    }
    private static void CriarArquivo(String sNomeArquivo, String strMsg, String strStackTrace)
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //yyyyMMdd
        Date date = new Date();
        
        strStackTrace = "";
        
        String aplicacao = System.getProperty("user.dir") ; 
    
        boolean exists = (new File(aplicacao+"/log.txt")).exists();
        
        if(strMsg.isEmpty()&& strStackTrace.isEmpty()) return;
        
        if(exists) return;
        
        if(sNomeArquivo.isEmpty()) return;
        
        if(ArquivoEmUso(aplicacao + "\\" + sNomeArquivo+".log")) return;
      
        try {
            
            File src;
            
            //version arquivo//
            List<Integer> Versao;
            Runtime.Version version = Runtime.version();
            Versao = version.version();
            
            src = new File(aplicacao + "\\" + sNomeArquivo+".log");

            if (src.exists() && src.length() >= 314572800)
            {
                try
                {
                    Path source = FileSystems.getDefault().getPath(aplicacao, sNomeArquivo+".log");
                    Path newdir = FileSystems.getDefault().getPath(aplicacao, sNomeArquivo+"_old.log");
                    Files.delete(newdir);
                    Files.move(source, newdir,REPLACE_EXISTING);   
                }
                catch (Exception e)
                {}
            } 
           
            BufferedWriter objLog = new BufferedWriter(new FileWriter(aplicacao + "\\" + sNomeArquivo+".log", true));

            if (strMsg != "")
            { 
                objLog.write(dateFormat.format(date) + " v. " + Versao + " :: " + strMsg + "\n");   
            }
            
            if (!strStackTrace.isEmpty() && !strStackTrace.isBlank())
            {
                objLog.write(dateFormat.format(date) + " v. " + Versao + " :: " + strStackTrace + "\n");   
            }
            objLog.close();
            
        } catch (Exception e) 
        {}
    }
    
    public static boolean ArquivoEmUso (String caminhoArquivo)
    {
        try
        {    
            File arquivo = new File(caminhoArquivo);
            if(!arquivo.exists()){
              arquivo.createNewFile();
            }else{
                arquivo.canExecute();
            }
            FileInputStream fileactual = new FileInputStream(arquivo);
            
            return false;
        }
        catch (Exception ex)
        {
            return true;
        }
    }

}
