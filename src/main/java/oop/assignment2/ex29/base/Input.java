package oop.assignment2.ex29.base;

public class Input {
    private int input;

    public boolean inputSetter(String input){
        try{
            int check = Integer.parseInt(input);
            if(check == 0){
                return false;
            }
            this.input = check;
        }catch (NumberFormatException ne){
            return false;
        }
        return true;
    }

    public int yearsRateOfReturn(){
        return 72 / input;
    }
}
