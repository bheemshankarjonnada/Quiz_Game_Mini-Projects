import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        String[] Questions = {"What is SMTP stands for ?",
                               "Who invented JAVA ? ",
                               "What is SDLC stands For ?",
                               "Which datatype contains Alphabets in JAVA ? ",
                               "at which Year JAVA was Introduced ?"};
        String[][] Options = {{"1.Simple Mail Transfer Protocol",
                "2.Standard Message Transmission Process",
                "3.Secure Mail Transport Protocol",
                "4.Systematic Mail Transfer Procedure"},
                {"1.Bjarne Stroustrup","2.Dennis Ritchie","3.James Gosling","4.Guido van Rossum"},
                {"1.Software Development Life Cycle ","2.System Data Logic Control ","3. Secure Development Language Concept","4. Standard Development Lifecycle Code"},
                {"1.char ","2.int","3.double","4.boolean"},
                {"1.1984","2.1995","3.2000","4.1990"}};

        int[] Answers={1,3,1,2,2};
        int guess;
        int score = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("##########################");
        System.out.println("WELCOME TO JAVA QUIZ GAME");
        System.out.println("###########################");

for(int i=0; i<Questions.length; i++){
    System.out.println(Questions[i]);

    for(String opt : Options[i]){
        System.out.println(opt);
    }
    System.out.print("enter your Answer :");
    guess=scanner.nextInt();


    if(guess == Answers[i]){
        System.out.println("##########");
        System.out.println(" CORRECT ! ");
        System.out.println("##########");
        score++;
    }
    else{
        System.out.println("##########");
        System.out.println(" WRONG ! ");
        System.out.println("##########");
    }
}
        System.out.println("Your final Score is "+ score + " Out of "+ Questions.length);
scanner.close();
    }

}