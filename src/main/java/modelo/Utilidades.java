/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author manue
 */
public class Utilidades {
    public static ArrayList<String> getFotos(String Directorio){
        ArrayList<String> cajaFotos = new ArrayList<String>();
        File directorio = new File (Directorio);
        String[] fotos = directorio.list();
        if(fotos !=null){
            for(int i=0;i<fotos.length;i++){
                if(fotos[i].endsWith(".jpg") || fotos[i].endsWith(".png")){
                    String foto="carrusell"+File.separator+fotos[i];
                    cajaFotos.add(foto);
                }
            }
        }
        return cajaFotos;
    }
}
