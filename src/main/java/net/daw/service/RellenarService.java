/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import net.daw.bean.ProductoBean;
import net.daw.bean.UsuarioBean;

public class RellenarService {

    public ArrayList<ProductoBean> fillProducto(int numero) throws Exception {
        ArrayList<ProductoBean> alProdcutoBean = new ArrayList<>();

        String codigo[] = {"A1", "B2", "C3", "K4", "T5", "M6", "P7", "U8"};
        String descUno[] = {"Herramienta", "Generador", "Aparejo", "Utensillo", "Artefacto", "Mecanismo", "Instrumento", "Maquina"};
        String descDos[] = {"Circular", "Cortante", "Electrico", "Manual", "Facil", "Largo", "Pequeno", "de Jardineria"};
        String descTres[] = {"para cortar", "para medir", "para lijar", "para romper", "para desbrozar", "para reposteria", "para carpinteria", "para perforar"};        
        DecimalFormat df = new DecimalFormat("#.##");
        
        
        for (int i = 0; i < numero; i++) {
            ProductoBean oProductoBean = new ProductoBean();
            oProductoBean.setCodigo(codigo[numeroAleatorio(codigo.length)]);
            oProductoBean.setDesc(descUno[numeroAleatorio(descUno.length)] + " " + descDos[numeroAleatorio(descDos.length)] + " " + descTres[numeroAleatorio(descTres.length)]);
            oProductoBean.setExistencias(numeroAleatorio(5)+1);
            oProductoBean.setFoto("fotoProducto");
            oProductoBean.setId_tipoProducto(numeroAleatorio(5));
            oProductoBean.setPrecio((float) (Math.round((Math.random() * 100) * 100) / 100.0 + 1));
            oProductoBean.setId_tipoProducto((int) Math.random()* 5+1);
            alProdcutoBean.add(oProductoBean);
        }
        return alProdcutoBean;
    }
    
    public ArrayList<UsuarioBean> fillUsuario(int numero) throws Exception {
        ArrayList<UsuarioBean> alUsuarioBean = new ArrayList<UsuarioBean>();

        String dni[] = {"04631408j","54698532o","14756425l","7845162f"};
        String nombre[] = {"Pedro","Maria","Marcos","Alex","Lidia","kevin","Hector"};
        String ape1[] = {"Martinez","Perez","Gomez","Belmonte","Escribano","Pozuelo"};
        String ape2[] = {"Martinez","Perez","Gomez","Belmonte","Escribano","Pozuelo"};
        String login[] = {"usu435","usua95f","usua6","us2","usuar5"};
        String pass[] = {null};
        int id_tipoUsuario[]= {1,2};        
        
        for (int i = 0; i < numero; i++) {
            UsuarioBean oUsuarioBean = new UsuarioBean();
            oUsuarioBean.setDni(dni[numeroAleatorio(dni.length)]);
            oUsuarioBean.setNombre(nombre[numeroAleatorio(nombre.length)]);
            oUsuarioBean.setApe1(ape1[numeroAleatorio(ape1.length)]);
            oUsuarioBean.setApe2(ape2[numeroAleatorio(ape2.length)]);
            oUsuarioBean.setLogin(login[numeroAleatorio(login.length)]);
            oUsuarioBean.setPass(pass[numeroAleatorio(pass.length)]);
            oUsuarioBean.setId_tipoUsuario(id_tipoUsuario[numeroAleatorio(id_tipoUsuario.length)]);
            alUsuarioBean.add(oUsuarioBean);
        }
        return alUsuarioBean;
    }
    
    
    

    public int numeroAleatorio(int numero) {
        int aleatorio = (int) (Math.random() * numero);
        return aleatorio;
    }

}
