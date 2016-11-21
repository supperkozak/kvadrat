package kvadrat.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kvadrat.model.Data;
import kvadrat.service.DataService;

@Controller
public class DataController {
	@Autowired
	private DataService service;
	private String message;
	
	
	@RequestMapping(value = "/show" , method = RequestMethod.GET)
	public String getAllData(Model model) {
		List<Data> data = service.getAllData();
		model.addAttribute("allData", data);
		model.addAttribute("message", message);
		
		return "index";
	}

	@RequestMapping(value = "/showAllData", method = RequestMethod.POST)
	public String createData(
			@RequestParam(value = "a") String a,
			@RequestParam(value = "b") String b, 
			@RequestParam(value = "c") String c) {
		
		
		int aInt;
		int bInt;
		int cInt;
		int x1Int;
		int x2Int;
		
		try{
			aInt = Integer.parseInt(a);
			bInt = Integer.parseInt(b);
			cInt = Integer.parseInt(c);
			
		} catch(NumberFormatException e){
			message = "Enter number, please";
			return "redirect:/show";
		}
		if(aInt == 0)
	     {
	     	 message = "A can't be 0";
	     	 return "redirect:/show";
	     }
		

     int d = bInt*bInt-(4*aInt*cInt);

     if(d < 0)
     {
     	 message = "The equation has no solutions";
     	 return "redirect:/show";
     }
     else if (d == 0)
     {
    	 message = "Ther is one solution\n";

         double x = (-bInt+d)/2*aInt;
         
         x1Int = (int) x;
         x2Int = (int) x;

         message += "and x1 = x2 = " + x1Int;
         service.insertData(aInt, bInt, cInt, x1Int, x2Int);
         return "redirect:/show";
     }
     else if(d > 0)
     {
    	 message = "There are two roots of a quadratic equations\n";

         double doubD = Math.sqrt(d);

         double x1 = (-bInt+doubD)/2*aInt;
         x1Int = (int) x1;
         double x2 = (-bInt-doubD)/2*aInt;
         x2Int = (int) x2;

         message += "and x(1) = " + x1Int +  "è x(2) = " + x2Int;
         
         service.insertData(aInt, bInt, cInt, x1Int, x2Int);
 		 return "redirect:/show";
     }
     
     return "redirect:/show";
	}
	
}
