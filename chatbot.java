import java.util.*;
class chatbot{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Random r=new Random();
        String jokes[]={
            " why math books sad?\nbecause it has too many problem",
             "what is snakes favorite subkect?\n Hiss-tory"
        };
        while(true){
            System.out.print("You: ");
            String ch=sc.nextLine().toLowerCase();
            if(ch.contains("hello") || ch.contains("hi")){
                 System.out.print("Bot: hey!! Hello...\n How can i help you\n");

            }
            else if(ch.contains("what is your name")){
                System.out.print("Bot: I am Your java chatbot\n what is your name?\n");
               
            }
            else if(ch.contains("name")){
                System.out.print("Bot: nice to meet you\n");
            }
            else if(ch.contains("how are you")){
                System.out.print("Bot: I am fine\n How about you\n");
            }
            else if(ch.contains("fine")){
                System.out.print("Bot: nice\n");
            }
            else if(ch.contains("what can you do ")){
                System.out.print("Bot: i can chat with you and\n can answer your question\n");
            }
             else if(ch.contains("bye")){
                System.out.print("Bot: okey good bye\n see you soon\n");
                break;
            }
            else if(ch.contains("nice")){
                System.out.print("Bot: thank you\n");
            }
            else if(ch.contains("joke")){
                System.out.print("Bot: Why do programs do bugs? \n Because they can't Sleep\n");
                
            }
            else if(ch.contains("more")){
                System.out.print("Bot: "+jokes[r.nextInt(jokes.length)]+"\n");
                
            }

            else{
               System.out.print("Bot: Sory i dont under stand\n");
            }

        }
    }
}