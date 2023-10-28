package usoequipofutbol;

import java.util.List;
import javax.swing.JOptionPane;


public class Equipo {
    private String nomEquipo;
    private int anhoFundacion;
    private String direccion;
    private String colorCamiseta;
    private byte camGanados;

    public Equipo() {
    }

    public Equipo(String nomEquipo, int anhoFundacion, String direccion, String colorCamiseta, byte camGanados) {
        this.nomEquipo = nomEquipo;
        this.anhoFundacion = anhoFundacion;
        this.direccion = direccion;
        this.colorCamiseta = colorCamiseta;
        this.camGanados = camGanados;
    }
 
    public String getNomEquipo() {
        return nomEquipo;
    }

    public void setNomEquipo(String nomEquipo) {
        this.nomEquipo = nomEquipo;
    }

    public int getAnhoFundacion() {
        return anhoFundacion;
    }

    public void setAnhoFundacion(int anhoFundacion) {
        this.anhoFundacion = anhoFundacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public void setColorCamiseta(String colorCamiseta) {
        this.colorCamiseta = colorCamiseta;
    }

    public byte getCamGanados() {
        return camGanados;
    }

    public void setCamGanados(byte camGanados) {
        this.camGanados = camGanados;
    }
    
    public void agregaEquipo(List<Equipo> equiposFutbol, String nomEquipo, int anhoFundacion, String direccion, String colorCamiseta, byte camGanados){
        equiposFutbol.add(new Equipo(nomEquipo, anhoFundacion, direccion, colorCamiseta, camGanados));
        
        
    }
    public void imprimeEquipos(List<Equipo> equiposFutbol){
        for (int i = 0; i < equiposFutbol.size(); i++) {
            System.out.println("Nombre equipo: "+equiposFutbol.get(i).getNomEquipo());
            System.out.println("Direccion equipo: "+ equiposFutbol.get(i).getDireccion());
            System.out.println("Color camiseta: "+equiposFutbol.get(i).getColorCamiseta());
            System.out.println("Año de fundacion: "+equiposFutbol.get(i).getAnhoFundacion());
            System.out.println("Campeonatos ganados: "+equiposFutbol.get(i).getCamGanados());
            System.out.println("---------------------------------");
        }
    }
    
    public void mayorCampeonatos(List<Equipo> equiposFutbol){
        byte aux=0;
        String campeon="";
        for (int i = 0; i < equiposFutbol.size(); i++) {
            if(aux<equiposFutbol.get(i).getCamGanados()){
                aux = equiposFutbol.get(i).getCamGanados();
                campeon = equiposFutbol.get(i).getNomEquipo();
            }
        }
        System.out.println("El equipo con mas campeonatois es: "+ campeon);
        
    }
    
    public void buscarEquipo(List<Equipo> equiposFutbol, String nombreEquipo){
        for (int i = 0; i < equiposFutbol.size(); i++) {
            if(nombreEquipo.equals(equiposFutbol.get(i).getNomEquipo())){
                System.out.println("Nombre equipo: "+equiposFutbol.get(i).getNomEquipo());
                System.out.println("Direccion equipo: "+ equiposFutbol.get(i).getDireccion());
                System.out.println("Color camiseta: "+equiposFutbol.get(i).getColorCamiseta());
                System.out.println("Año de fundacion: "+equiposFutbol.get(i).getAnhoFundacion());
                System.out.println("Campeonatos ganados: "+equiposFutbol.get(i).getCamGanados());
                System.out.println("---------------------------------");
            }     
        
    }
    }
    
    public boolean verificaEquipo(List<Equipo> equiposFutbol, String nombreEquipo){
        for (int i = 0; i < equiposFutbol.size(); i++) {
            if(nombreEquipo.equals(equiposFutbol.get(i).getNomEquipo()))
                return true;
                 
        }
        return false;
    }
    
    
    public int cantidadEquiposMasd10Camp(List<Equipo> equiposFutbol){
        int equipos=0;
        for (int i = 0; i < equiposFutbol.size(); i++) {
            if(equiposFutbol.get(i).getCamGanados()>10)
                equipos++;
        }
        return equipos; 
   }
    
}
