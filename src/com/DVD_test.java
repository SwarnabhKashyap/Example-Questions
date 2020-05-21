package com;

public class DVD_test {
    public static void main(String[] Args)
    {
        DVD[] dvd_collection = new DVD[15];
        DVD superFast = new DVD("Superfast",2009,"Matthew");
        DVD badTeacher = new DVD("BadTeacher",2010,"Brenda");
        DVD sexEducation = new DVD("SexEducation",2018,"Swarnabh");

        dvd_collection[7] = superFast;
        dvd_collection[9] = badTeacher;
        dvd_collection[2] = sexEducation;

        //for all the indices where dvd is not present, it will print out null/because an object.
        for(DVD dvd:dvd_collection)
        {
            System.out.println(dvd);
        }
    }
}
