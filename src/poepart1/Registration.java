package poepart1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Registration { //start of class
    
    String userName;
    String password;
    String cellphone;
    
    public boolean checkUserName(String username) { //start of username
        return username.contains("@") && username.length()>=3;
        
        public boolean checkMyUserName(String username) { //start of username
        return username.contains("@") && username.length()>=3;
}//end of username method
    
public boolean checkPasswordComplexity(String password){ //start of password method
        return password.length()>=8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\.*") &&
                password.matches(".*[^a-zA-Z0-9].*");

}//end of password method

public boolean checkCellPhoneNumber (String cellphone){
        return cellphone.matches(".*\\+27[0-9){9}")
                || cellphone.matches(",*^0[0-9]{9}");
}//end of cellphone method
//end of cellphone method
//end of cellphone method
//end of cellphone method

public String registerUser(String username, String password, String cellphone){
    //return checkUsername(username)&&
    //checkPasswordComplexity(password)&&
    //checkCellPhoneNumber(cellphone;
    
    if(checkUserName(username)&&
            checkPasswordComplexity(password)&&
            checkCellPhoneNumeric(cellphone)){
        
        this.userName=username;
        this.password=password;
        this.cellphone=cellphone;
        
        return "Registration was a success";
    }else{
        return "Registration was unsuccessful";
    }
}

    private boolean checkCellPhoneNumeric(String cellphone) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}//end of class