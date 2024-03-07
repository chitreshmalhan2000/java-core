package com.learning.core.day4;
import java.util.*;
class CatheyBankException extends Exception {
    public CatheyBankException(String message) {
        super(message);
    }
}

// Validator class
class Validator {
    public void validate(Applicant applicant) throws CatheyBankException {
        if (!isValidApplicantName(applicant.getApplicantName())) 
            throw new CatheyBankException("Invalid Applicant Name");
        
        if (!isValidPost(applicant.getPostApplied())) 
              throw new CatheyBankException("Invalid Post");
        if (!isValidAge(applicant.getApplicantAge())) 
             throw new CatheyBankException("Invalid Age");
        
        System.out.println("All details are valid");
    }

     boolean isValidApplicantName(String name) {
        return name != null && !name.isEmpty();
    }

     boolean isValidPost(String post) {
        return post.equals("Probationary Officer") || post.equals("Assistant") || post.equals("Special Cadre Officer");
    }

     boolean isValidAge(int age) {
        return age > 18 && age < 30;
    }
}

// Applicant class
class Applicant {
     String applicantName;
     String postApplied;
     int applicantAge;

    public Applicant(String applicantName, String postApplied, int applicantAge) {
        this.applicantName = applicantName;
        this.postApplied = postApplied;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public String getPostApplied() {
        return postApplied;
    }

    public int getApplicantAge() {
        return applicantAge;
    }
}

// Main class
//CatheyBank
//D04P03
public class D04P03 {
    public static void main(String[] args) {
        Validator validator = new Validator();

        try { 
             String s,ss;
             int n;
             Scanner sc=new Scanner(System.in);
             s=sc.next();
             ss=sc.next();
             n=sc.nextInt();
            Applicant applicant1 = new Applicant(s,ss,n);
            validator.validate(applicant1);
        } catch (CatheyBankException e) {
            System.out.println(e.getMessage());
        }

       
    }
}


