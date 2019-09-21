import java.util.Scanner;
public class clark_p3{
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // I am initializing my topics here
        String[] topics = {"Games", "Books", "Food", "Movies", "Football"};

        //declaring variables here
        int [][] responses = new int [topics.length][];        
        int i, j, numUsers, rating;
        
        // Initialize the all values in array responses to 0
        for(i=0; i<responses.length; i++){
               responses[i] = new int[10];
               
               for(j=0; j<responses[i].length; j++) {
                      responses[i][j] = 0;
               }
        }

        System.out.print("Enter the number of people participating in the survey : ");
        numUsers = scnr.nextInt();

        // Beginning loop for data collection

        for(i=0; i<numUsers; i++) {
               System.out.println("Rate the following 5 topics:");

               for(j=0; j<topics.length; j++) {
                      System.out.print("Person " + (i+1) + " how important is the topic " + topics[j] + " to you (1-10): ");
                      rating = scnr.nextInt();

                      responses[j][rating-1]++; 
               }
        }
        
        //This is to store the average rating
        int avgRating[] = new int[topics.length];
        String highestPointIssue=""; 
        String lowestPointIssue="";
        int highestPointTotal = 0;
        int lowestPointTotal= 0;

        // loop to calculate the average rating, lowest/highest point totals

        for(i=0; i<responses.length; i++){
               avgRating[i] = 0;

               for(j=0; j<responses[i].length; j++) {
                      avgRating[i]+=(responses[i][j] * (j+1));
               }
              
               if(i == 0) { // for first entry initialize the variables
                      highestPointTotal = avgRating[i];
                      lowestPointTotal= avgRating[i];
                      highestPointIssue = topics[i];
                      lowestPointIssue = topics[i];
               }
               else {
                      if(avgRating[i] > highestPointTotal){
                            highestPointIssue = topics[i];
                            highestPointTotal = avgRating[i];
                      }
                      
                      if(avgRating[i] < lowestPointTotal){
                            lowestPointIssue = topics[i];
                            lowestPointTotal= avgRating[i];
                      }
               }  
               avgRating[i] = avgRating[i]/numUsers;
        }

        // Tabular Report
        System.out.printf("\n%-20s","");

        for(i=0;i<10;i++) {
               System.out.printf("%-10d",(i+1));
        }
        
        System.out.printf("%20s","Average Rating");

        for(i=0;i<responses.length;i++) {
               System.out.printf("\n%-20s",topics[i]);

               for(j=0;j<responses[i].length;j++) {
                      System.out.printf("%-10d",responses[i][j]);
               }
               System.out.printf("%20d",avgRating[i]);
        }
        
        // Show the topics with highest and lowest point totals
        System.out.println("\n\nHighest Point total: " + highestPointIssue +" with " + highestPointTotal);
        System.out.println("Lowest Point total: " + lowestPointIssue+" with " + lowestPointTotal);
        scnr.close();
  }
}