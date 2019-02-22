package controller;

import model.Message;

import java.util.ArrayDeque;
import java.util.Deque;


public class MessageController {
        Deque<Message> messages = new ArrayDeque<>();

        public void addMessage(String content, String author){
            Message m = new Message(content, author);
            messages.addFirst(m);
            System.out.println("Dodano wiadomosci");

        }
        public void getMessage(){
            messages.getLast();
        }

        public void deleteMessage(){
            messages.removeLast();
        }
        public int getSize(){
            return messages.size();
        }
    }

