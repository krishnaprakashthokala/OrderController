package org.ecommerce.web.frontend.controllers;

import org.ecommerce.config.web.services.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author sergio
 */
@Controller("FrontendHomeController")
public class HomeController {

	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private ProductService productService;

	@GetMapping(value = { "/home", "/" })
	public String index(Model model) {
		logger.info(" index home Controller : " + model);

		// add new arrivals products
		model.addAttribute("arrivals", productService.getNewArrivals());
		// add featured products
		model.addAttribute("featured", productService.getThreeFeaturedProducts());
		// add bestsellers products
		model.addAttribute("bestsellers", productService.getTwoBestsellersProducts());
		return "frontend/index";
	}
}
