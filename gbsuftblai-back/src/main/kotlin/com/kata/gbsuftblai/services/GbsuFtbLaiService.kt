package com.kata.gbsuftblai.services

import org.springframework.stereotype.Component
import java.util.LinkedList
import java.math.MathContext
import java.util.regex.Pattern

@Component
class GbsuFtbLaiService {

    fun convertNumber(inputNumber: String): String {
		var res: String = "";
		if(isNumeric(inputNumber)){
			
			val inputNumberFromStr = inputNumber.toInt();
			val isContainStr :Pair<Boolean,String> = isContain(inputNumberFromStr)
		
			if( isDivByTrois(inputNumberFromStr) || isDivByCinq(inputNumberFromStr) || isContainStr.component1()){
				if(isDivByTrois(inputNumberFromStr)){
					res = res + "Gbsu";
					println("isDivByTrois" + res)
				}
				if(isDivByCinq(inputNumberFromStr)){
					res = res + "Ftb";
					println("isDivByCinq" + res)
				}
				res = res + isContainStr.component2();
			}else{
				res = inputNumber;
			}
				
		}else{
			res = inputNumber;
		}
		
		
		
		
		
        return res
    }
	
	fun isNumeric( string: String): Boolean {
	    // Checks if the provided string
	    // is a numeric by applying a regular
	    // expression on it.
	    val regex : String = "[0-9]+[\\.]?[0-9]*";
	    return Pattern.matches(regex, string);
	}
	
	
	fun isDivByTrois (input: Int): Boolean  {
		if(input%3 == 0){
			return true;
		}
		return false;
	}
	
	fun isDivByCinq (input: Int): Boolean  {
		if(input%5 == 0){
			return true;
		}
		return false;
	}
	
	
	fun isContain (input: Int): Pair<Boolean, String>  {
		var isContains: Boolean = false;
		var res: String = "";
		var list : LinkedList<Int> = LinkedList<Int>(); // Création d'une Linked list sous forme de pile
                     //conversion chaque nombre en list de digits. ex 37 --> 3;7 pour vérifier si le nombre contient (3, 5 ou 7) 

		var number = input;
		while (number > 0) {
		    list.push( number % 10  ); //insertion de l'élément dans la liste 
		    number = number / 10;
		}
		
		while (!list.isEmpty()) { //la méthode qui vérifie si la liste contient un élément
			var digit: Int = list.poll(); //supprime l'élément de la liste et renvoie le premier de cette liste pour le tester
		
			if(digit == 3){
			    res = res +"Gbsu";
				isContains = true;
			}
		
			if(digit == 5){
			    res = res +"Ftb";
				isContains = true;
			}
		
			if(digit == 7){
				res = res +"Lai";
				isContains = true;
		    }
		}
		
		return Pair(isContains,res);
	}
	
	

}