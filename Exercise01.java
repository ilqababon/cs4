package exercise01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PHOTON
 */
public class Exercise01 {

    public static void main(String args[]) {
        // no intended resemblance to any real individuals
        // student names
        String s1Name = "Iris";
        String s2Name = "Xangel";
        String s3Name = "Manu";

        // student favorite numbers
        double s1FavNo = 1;
        double s2FavNo = 13;
        double s3FavNo = 19;

        //student favorite subjects
        String s1FavSubj = "Physics";
        String s2FavSubj = "Biology";
        String s3FavSubj = "Lunch";

        // print details of student 1
        System.out.println("Student 1");
        System.out.println("Name: " + s1Name);
        System.out.println("Favorite Number: " + s1FavNo);
        System.out.println("Favorite Subject: " + s1FavSubj + "\n");

        // print details of student 2
        System.out.println("Student 2");
        System.out.println("Name: " + s2Name);
        System.out.println("Favorite Number: " + s2FavNo);
        System.out.println("Favorite Subject: " + s2FavSubj + "\n");

        // print details of student 3
        System.out.println("Student 3");
        System.out.println("Name: " + s3Name);
        System.out.println("Favorite Number: " + s3FavNo);
        System.out.println("Favorite Subject: " + s3FavSubj + "\n");

        System.out.println("Average Fav Number: " + (s1FavNo + s2FavNo + s3FavNo) / 3); // operation: addition and division
        System.out.println("Xangel has a smaller favorite number than Manu: " + (s2FavNo < s3FavNo)); // operation: comparison
        System.out.println("Iris has the biggest favorite number: " + (s1FavNo > s2FavNo && s1FavNo > s3FavNo)); // operation: comparison
    }
}
