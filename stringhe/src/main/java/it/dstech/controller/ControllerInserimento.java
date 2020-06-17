package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerInserimento {
	@RequestMapping(value = "/stringhe", method = RequestMethod.POST)
	public ModelAndView testo(@RequestParam("testo") String testo, Model model) {
		ModelAndView sceltaOperazione = new ModelAndView();
		sceltaOperazione.setViewName("operazione");
		sceltaOperazione.addObject("testo", testo);
		return sceltaOperazione;
	}
}