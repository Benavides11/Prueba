package usoequipofutbol;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class UsoEquipoFutbol {
    
    

   
    public static void main(String[] args) {
        Equipo x = new Equipo();
        List<Equipo> misEquipos = new ArrayList();
        
        int opc =1;
        while(opc >0 && opc <7){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1.Agrega equipos \n 2.Imprime equipos \n 3.Equipo con mayor campeonatos \n 4.Buscar un equipo especifico \n 5.Verificar si se encuentra \n 6.Cantidad de equipos con mas de 10 campeonatos \n 7.Salir  \n Ingrese la opcion que desee"));
            switch(opc){
                case 1:  
                    String nom = JOptionPane.showInputDialog("Nombre del equipo: ");
                    int anhoFundacion = Integer.parseInt(JOptionPane.showInputDialog("Año de fundacion: "));
                    String direccion = JOptionPane.showInputDialog("Direccion: ");
                    String colorCamisa = JOptionPane.showInputDialog("Color camisa: ");
                    byte campeonatos = Byte.parseByte(JOptionPane.showInputDialog("Campeonatos ganados: "));
                    x.agregaEquipo(misEquipos, nom, anhoFundacion, direccion, colorCamisa, campeonatos);
                break;
                case 2: 
                    if(misEquipos.isEmpty()){
                        System.out.println("No hay equipos");
                    }else
                    x.imprimeEquipos(misEquipos);
                break;
                case 3:if(misEquipos.isEmpty()){
                        System.out.println("No hay equipos");
                    }else 
                        x.mayorCampeonatos(misEquipos);
                break;
                case 4:
                    if(misEquipos.isEmpty()){
                        System.out.println("No hay equipos");
                    }else{
                    String buscar = JOptionPane.showInputDialog("Ingrese el nombre del equipo que quiere buscar");
                    
                    System.out.println(buscar);
                    x.buscarEquipo(misEquipos, buscar);}
                break;
                case 5: 
                    if(misEquipos.isEmpty()){
                        System.out.println("No hay equipos");
                    }else{
                    String buscar = JOptionPane.showInputDialog("Ingrese el nombre del equipo que quiere buscar");
                    if( x.verificaEquipo(misEquipos, buscar)==true){
                        System.out.println("Si se encuentra");
                    } else 
                        System.out.println("No se encuentra");}
                break;
                case 6: 
                    if(misEquipos.isEmpty()){
                        System.out.println("No hay equipos");
                    }else
                    System.out.println(x.cantidadEquiposMasd10Camp(misEquipos));
                break;
                default: System.out.println("Saliendo...");
            }
        }
        
    }
    
}
