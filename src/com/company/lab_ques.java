package com.company;

public class lab_ques extends Exception {
    public static void main(String[] args) throws Exception {
        if (args.length > 3)
            throw new Exception("enter less than 3 strings");
        else {
            for (int i = 0; i < args.length; i++) {
                String s = args[i];
                int sumouter = 0;
                for (int j = 0; j < s.length(); j++) {
                    int suminner = 0;
                    for (int p = j; p < s.length(); p++) {
                        suminner = suminner + Character.getNumericValue(s.charAt(p));
                    }

                    sumouter = sumouter + suminner;
                }
                System.out.println(Integer.toString(sumouter));
            }
        }
    }

}
