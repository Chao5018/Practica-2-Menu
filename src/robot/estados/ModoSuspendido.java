package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo: "Suspendido".
 */
public class ModoSuspendido implements EstadoRobot{

    McRobot robot;

    /**
     * Constructor del ModoSuspendido asigna al robot que adquirirá este modo
     * @param robot robot que adquirirá el modo
     */
    public ModoSuspendido(McRobot robot){
        this.robot = robot;
    }

    @Override
    public void suspender() {
        System.out.println("El robot ya está suspendido...");
    }

    @Override
    public void activar() {
        if(robot.getHayCliente()){
           
        }
    }

    @Override
    public void caminar() {
        
    }

    @Override
    public void tomarOrden() {
        
    }

    @Override
    public void cocinar() {
        
    }

    @Override
    public void entregarOrden() {
        
    }
    
}
