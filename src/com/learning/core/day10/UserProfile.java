package com.learning.core.day10;
import java.util.*;
import java.io.*;
public class UserProfile {

    public boolean validateUsername(String name) {
        return (name.matches("[a-zA-Z]+"));
    }

    public boolean validatePassword(String password) {
        // return (password.matches("^(?=.[a-zA-Z])(?=.[0-9]).{8}$"));   
     if(password.length()==8)
     {
    	return(password.matches("[a-zA-Z0-9]+"));
     }
     else
    	 return false;
    
    }
}

   
