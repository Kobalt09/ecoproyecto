/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ep.ecoproyecto;

import Entidades.Jugador;
import java.awt.Color;
import java.awt.Graphics2D;
import objetos.ObjetoCofre;
import objetos.ObjetoPuerta;
import objetos.ObjetoRecogible;
import objetos.Objetosclase;

/**
 *
 * @author Cris
 */
public class EmisorObjetos {
    
    PanelJuego gp;
    
    public EmisorObjetos(PanelJuego gp){
        this.gp=gp;
    }
    
    public void establecerObj(){
        //colocar objetos ("nombredelobj",poscionX en casillas, posicionY en casillas)
        gp.obj[0]=new ObjetoRecogible("llave",13*gp.tamanioCasilla,7*gp.tamanioCasilla,gp);
        gp.obj[1]=new ObjetoRecogible("llave",5*gp.tamanioCasilla,7*gp.tamanioCasilla,gp);
        gp.obj[2]=new ObjetoPuerta("puerta",10*gp.tamanioCasilla,8*gp.tamanioCasilla,gp);
        gp.obj[3]=new ObjetoCofre("cofre",2*gp.tamanioCasilla,2*gp.tamanioCasilla,gp);
    }
    
    public void draw(Graphics2D g2,Jugador jugador){
        
            for(int i=0;i<gp.obj.length;i++){
                
                if((gp.obj[i]!=null)&&(gp.obj[i].posicionX>jugador.xMapa && gp.obj[i].posicionX <jugador.xMapa+this.gp.getWidth())){
                    
                    if(gp.obj[i].posicionY>jugador.yMapa && gp.obj[i].posicionY <jugador.yMapa+this.gp.getWidth()){

                        g2.drawImage(gp.obj[i].image,gp.obj[i].posicionX-jugador.xMapa,  gp.obj[i].posicionY-jugador.yMapa, gp.tamanioCasilla,gp.tamanioCasilla,null);

                    }
                    /*
                    g2.setColor(Color.red);
                    g2.fillRect(gp.obj[i].posicionX, gp.obj[i].posicionY, gp.obj[i].AreaobjX, gp.obj[i].AreaobjdefectoY);*/
               }
                
               
                
            }
            
    }  
    
        
}

