//Clase:Calculadora.java
//Lee un documento de texto en la dirección C://HDT2// y calcula el resultado de las operaciones definidas}
//en el archivo de texto
//Hecho por:            Ma. Isabel Fernandez      Carnet: 13024 
//			Erick Hernandez 	  Carnet: 13197
//			Andres Lainfiesta	  Carnet: 13072
//Fecha: 25-07-2014
//***************************************************************

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;

public class Calculador {
    public static int cont=0;
    static File archivo = new File("C:\\HDT4\\datos.txt"); //Almacena el archivo en donde se guardaran los datos
    java.io.File directorio = new File("C:\\HDT4");
    public static String data=new String();
    static Stack pila;
    static int result=0;
    static int dat1=0;
    static int dat2=0;
    boolean conti =true;
    int op=0;
    
    public Calculador(){
        while(conti == true){
           op = Integer.parseInt(JOptionPane.showInputDialog("\n1)ArrayList\n2)Vector\n3)lista"));
           if(op>=1 || op <=3){
               conti = false;
           }
        }
        Factory factor = new Factory();
        pila = factor.getStack(op);
    }
    
public void calcular(){
    
    data=leerDatos();
    int largo = data.length();
    for(int i=0;i<largo;i++){
        
        if(Character.toString(data.charAt(i)).equals("*") && !pila.empty()){
            dat1=(int)pila.pop();
            dat2=(int)pila.pop();
            result=dat2*dat1;
            pila.push(result);
        }else if(Character.toString(data.charAt(i)).equals("+") && !pila.empty()){
            dat1=(int)pila.pop();
            dat2=(int)pila.pop();
            result=dat2+dat1;
            pila.push(result);
        }else if(Character.toString(data.charAt(i)).equals("-") && !pila.empty()){
            dat1=(int)pila.pop();
            dat2=(int)pila.pop();
            result=dat2-dat1;
            pila.push(result);
        }else if(Character.toString(data.charAt(i)).equals("/") && !pila.empty()){
            dat1=(int)pila.pop();
            dat2=(int)pila.pop();
            result=dat2/dat1;
            pila.push(result);
        }else if(!Character.toString(data.charAt(i)).equals(" ")){
            int ingresar=(int)data.charAt(i)-48; //gracias JUANA love ya´
            pila.push(ingresar);
            
        }
    }
    System.out.println("el resultado es: "+pila.pop());
}
    private static String leerDatos(){
            FileReader fr = null;
            BufferedReader br = null;
            String datos = new String();
            
            try{
                    fr = new FileReader(archivo);
                    br = new BufferedReader(fr);
                    String linea;
                    if ((linea = br.readLine())!=null){

                        datos=linea;
                        ;
                    }
                    if(datos == null){
                        datos=" ";
                    }
                    
                    return datos;

            }
            catch(Exception e){
                    e.printStackTrace();
            }
            finally{
                    try{
                            if(null != fr ){
                                    fr.close();
                            }
                    }
                    catch(Exception e2){
                            e2.printStackTrace();
                    }

            }
            return datos;
    }

}