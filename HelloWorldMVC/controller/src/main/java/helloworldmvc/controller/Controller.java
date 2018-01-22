package helloworldmvc.controller;

import helloworldmvc.model.IModel;
import helloworldmvc.model.Model;
import helloworldmvc.view.IView;
import helloworldmvc.view.View;

public class Controller {

	private IView view;
	private IModel model;
	
	public Controller(View v, Model m) {
		model = m;
		view = v;
	}
	
	public void run() throws Throwable {
		view.display(model.getMessage());
	}
	
}
