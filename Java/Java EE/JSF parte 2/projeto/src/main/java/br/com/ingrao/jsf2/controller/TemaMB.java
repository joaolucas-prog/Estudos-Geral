package br.com.ingrao.jsf2.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


@Named(value = "temaMB")
@SessionScoped
public class TemaMB implements Serializable{
	private static final long serialVersionUID = 8837678074255912745L;

	private String tema = "vader";
	

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	public String[] getTemas() {
		return new String[]{"afterdark", "afternoon", "afterwork", "black-tie", "blitzer", "bluesky", "bootstrap",
                "casablanca", "cruze", "cupertino", "dark-hive", "delta", "dot-luv", "eggplant", "excite-bike", "flick",
                "glass-x", "home", "hot-sneaks", "humanity", "le-frog", "midnight", "mint-choc", "overcast",
                "pepper-grinder", "redmond", "rocket", "sam", "smoothness", "south-street", "start", "sunny",
                "swanky-purse", "trontastic", "ui-darkness", "ui-lightness", "vader"};
	}
	
}
