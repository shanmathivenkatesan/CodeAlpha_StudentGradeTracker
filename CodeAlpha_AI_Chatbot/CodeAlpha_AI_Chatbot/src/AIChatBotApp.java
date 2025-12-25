import java.util.Scanner;

class ChatBot {

    public String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you?";
        }
        else if (input.contains("how are you")) {
            return "I'm fine! Thanks for asking.";
        }
        else if (input.contains("your name")) {
            return "I am an AI Chatbot built using Java.";
        }
        else if (input.contains("java")) {
            return "Java is an object-oriented programming language.";
        }
        else if (input.contains("bye") || input.contains("exit")) {
            return "Goodbye! Have a nice day.";
        }
        else {
            return "Sorry, I didn't understand that.";
        }
    }
}

public class AIChatBotApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("AI Chatbot Started (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String reply = bot.getResponse(userInput);
            System.out.println("Bot: " + reply);

            if (userInput.equalsIgnoreCase("bye") ||
                userInput.equalsIgnoreCase("exit")) {
                break;
            }
        }
        scanner.close();
    }
}
