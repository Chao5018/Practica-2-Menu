package robot.estados;

import robot.McRobot;

/**
 * Clase que define el comportamiento del robot cuanto esta en modo:
 * "EntregarOrden".
 */
public class ModoEntregarOrden implements EstadoRobot {

    McRobot robot;

    /**
     * Constructor del ModoEntregarOrden asigna al robot que adquirirá este modo
     * 
     * @param robot robot que adquirirá el modo
     */
    public ModoEntregarOrden(McRobot robot) {
        this.robot = robot;
    }

    @Override
    public void suspender() {
        // TODO Auto-generated method stub

    }

    @Override
    public void activar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void caminar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void tomarOrden() {
        // TODO Auto-generated method stub

    }

    @Override
    public void cocinar() {
        // TODO Auto-generated method stub

    }

    @Override
    public void entregarOrden() {
        // TODO Auto-generated method stub

    }

    @Override
    public String toString() {
        return "El robot está en modo: **MODO ENTREGAR ORDEN**";
    }

}
