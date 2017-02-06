package controllers;

import app.Order;
import app.Person;
import java.util.ArrayList;
import java.util.Collections;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class RestController {

    @RequestMapping(value = "/greet")
    @ResponseBody
    public String greet() {
        return "Hello World!";
    }

    @RequestMapping(value = "/greet/{name}")
    @ResponseBody
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @RequestMapping(value = "/greetbyjson", method = RequestMethod.POST)
    @ResponseBody
    public String greetByJson(@RequestBody Person person) {

        return "Hello, " + person.getName() + "!";
    }

    @RequestMapping(value = "/arrangeorders", method = RequestMethod.POST)
    @ResponseBody
    public String arrangeOrders(@RequestBody ArrayList<Order> orders) {
        Collections.sort(orders);
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<orders.size(); i++){
            sb.append(orders.get(i).getWord());
            if(i != (orders.size() - 1)){
                sb.append(" ");
            }else{
                sb.append(".");
            }
        }
        
        return sb.toString();
    }
   
    @RequestMapping(value = "/getlist")
    @ResponseBody
    public ArrayList<Person> getListOfPersons(){
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("Pera Peric", 21, "Noob Street"));
        list.add(new Person("Nera Neric", 27, "Pro Street"));
        list.add(new Person("Mika Mikic", 40, "Random Street"));
        
        return list;
    }
}
