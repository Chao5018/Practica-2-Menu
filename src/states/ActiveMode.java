package states;

import menus.*;

public class ActiveMode implements State {
    public void walkToClientsTable(){}

    public MenuItem takeClientsOrder(Menu menus){
	return null;
    }

    public void cook(MenuItem item){}

    public void suspend(){}
}
