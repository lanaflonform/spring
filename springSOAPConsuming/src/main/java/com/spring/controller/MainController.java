package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.consumingSOAPwebservice.springSOAPConsuming.HotelClient;



@Controller	// This means that this class is a Controller
@RequestMapping(path="/") 
public class MainController {
	
	@Autowired 
	private HotelClient hotelClient;
	
//	@Autowired // This means to get the bean called userRepository, Which is auto-generated by Spring, we will use it to handle the data
//	private HotelRepository hotelRepository;
//	@Autowired 
//	private AgenceVoyageRepository agenceVoyageRepository;
//	
	@GetMapping(path="/all")
	public String getAllOffres(Model model) {
		List<Hotel> hotels = hotelRepository.findAll();
		//offres = hotelRepository.findHotel(request.getLogin(), request.getPassword(), req
		model.addAttribute("hotels", hotels);
		return "all";
	}
	
//	@GetMapping(path="/find")
//	public String findHotelBy(@RequestParam(name="login",required=false, defaultValue="karim") String login, 
//			@RequestParam(name="password",required=false, defaultValue="dahdouh") String password, Model model) {
//		
//		model.addAttribute("hotels", hotelRepository.findHotel(1));
//		return "all";
//	}
//	/*
//	@GetMapping(path="/find/{name}/{email}")
//	public String getFInUser(@PathVariable String name, 
//			@PathVariable String email, Model model) {
//		model.addAttribute("users", userRepository.findByNameAndEmail(name, email));
//		System.out.print("########################################################################################## "+name);
//		System.out.print("########################################################################################## "+email);
//		return "all";
//	}
//	*/
//
//	@PostMapping(path="/add") // Map ONLY POST Requests
//	public @ResponseBody String addNewUser (@RequestParam String nom, @RequestParam int nombreEtoile) {
//
//		Hotel n = new Hotel();
//		n.setNom(nom);
//		n.setNombreEtoiles(nombreEtoile);
//		hotelRepository.save(n);
//		return "Saved";
//	}

}