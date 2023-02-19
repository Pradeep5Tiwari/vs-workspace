/* So below is my Employee class having id and name field and now we want to add the training location for 
one of the employee as well. We have one Employee() class constructor and one printMe() method.

Now the worst part what we can do is we can delcare the 'trainingLocation' field in this Employee class itself and add 
the newly added field 'trainingLocation' in constructor parameter as well. Now what would happen that all the code 
which is using the constructor "Employee(int id, String name)" to initialize our employee class would breaks. we 
might have 100 of classes which is using this Employee class to create the employee object and do something with it.
So, if you change your constructor by adding new field trainingLocation and if they might have been using this constructor
then our code will break.So this would be the worse scenario of not using open-closed principle.  

So how would we implement this solution? 
We can follow the above sugested approach where we create seperate class and extend this Employee class by that new class 
 and add the new 'trainingLocation' parameter  and initialize this parameter within newly created class constructor body */

 // This class is CLOSED FOR MODIFICATON as we are not chaning anything in it.

 public class TrainingEmployee {

     private int id;
     private String name;
     // private String trainingLocation;

     public TrainingEmployee(int id, String name) {
         this.id = id;
         this.name = name;
     }

     public void printMe() {
         System.out.println("Employee ID is " + this.id + "Employee name is: " + this.name);
     }

 }
