package robot.estados;

/**
 * Interfaz que define los estados que puede adquierir un McRobot.
 */
public interface EstadoRobot {

    /**
     * El robot se suspenderá si su estado actual se lo permite.
     */
    public void suspender();

    /**
     * El robot se activará si su estado actual se lo permite.
     */
    public void activar();

    /**
     * El robot caminará si su estgado actual se lo permite.
     */
    public void caminar();

    /**
     * El robot tomará la orden del cliente si su estado actual se lo permite.
     */
    public void tomarOrden();

    /**
     * El robot cocinará lo que el cliente pida, si su estado actual se lo permite.
     */
    public void cocinar();

    /**
     * Elrobot entregará la orden al cliente si su estado actual se lo permite.
     */
    public void entregarOrden();

    /**
     * Devuelve una cadena describiendo el estado del robot.
     * 
     * @return una cadena describiendo el estado del robot.
     */
    public String toString();
}
