package br.com.caelum.ingresso.model;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrinho {
	private List<Ingresso> ingressos= new Arraylist<>();
	
	public void add(Ingresso ingresso) {
		ingressos.add(ingresso);
	}

	public List<Ingresso> getIngresso() {
		return ingressos;
	}

	public void setIngresso(List<Ingresso> ingresso) {
		this.ingressos = ingresso;
	}
}
