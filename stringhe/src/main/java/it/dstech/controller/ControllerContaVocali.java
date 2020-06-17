package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.service.Service;

@Controller
public class ControllerContaVocali {
	@RequestMapping(value = "/contaVocali", method = RequestMethod.POST)
	public ModelAndView risultato(@RequestParam("testo") String testo, Model model) {
		ModelAndView risultato = new ModelAndView();
		risultato.setViewName("risultato");
		risultato.addObject("testo", testo);
		Service s = new Service(testo);
			risultato.addObject("risultato", s.contaVocali());
		
		return risultato;
	}
}
