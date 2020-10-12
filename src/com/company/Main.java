package com.company;

import java.util.Random;

public class Main {
    public static void display(Queue q) { //queue yazdırmak için
        for (int i = 0; i < q.size(); i++) {
            System.out.print(q.peek() + " ");
            q.enqueue(q.dequeue());
        }
    }

    public static void stackDisplay(Stack s) {
        Stack temp = new Stack(120);
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            temp.push(s.pop());
        }
        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int random = 4;
        Deck d = new Deck();
        Queue q = d.getCards();
        Queue r = new Queue(120); // random doldurulmuş queue
        Stack u1 = new Stack(120); //kullanıcı stackleri
        Stack u2 = new Stack(120);
        int point1 = 0; //puan hesabı için
        int point2 = 0;
        int point = 0;
        String s1 = ""; //karşılaştırma yapmak için puan kontrolunde
        String s2 = "";


        //random queueya atama işlemi
        while (!(q.isEmpty())) {
            int rr = rnd.nextInt(random);
            for (int i = 0; i < rr; i++) {
                if (!(q.isFull()))
                    q.enqueue(q.dequeue());
            }
            if (!(r.isFull()) && q.peek() != null)
                r.enqueue(q.dequeue());
        }

        boolean f1 = false;
        boolean f2 = false;
        String temp = "";
        //oyun kısmı
        while (!(r.isEmpty())) {
            if (r.peek() != null && !(r.isEmpty())) {
                temp = (String) r.peek();
                s1 = temp.substring(0, 1);
                s2 = temp.substring(1, temp.length());

                if (f2 == false && !(r.isEmpty())) {
                    u1.push(r.dequeue());
                    System.out.print("Stack user1: ");
                    stackDisplay(u1);
                    System.out.print("\t\tpoint 1= " + point1 + " ");
                    System.out.println("\tpoint 2= " + point2);
                    if (!(r.isEmpty()))
                        temp = (String) r.peek();
                    if (s1.equals(temp.substring(0, 1))) {
                        point1++;
                        f1 = true;
                    } else if (s2.equals(temp.substring(1, temp.length()))) {
                        point1 += 3;
                        f1 = true;
                    } else
                        f1 = false;
                }
            }

            if (r.peek() != null && !(r.isEmpty())) {
                temp = (String) r.peek();
                s1 = temp.substring(0, 1);
                s2 = temp.substring(1, temp.length());
                if (f1 == false && !(r.isEmpty())) {
                    u2.push(r.dequeue());
                    System.out.print("Stack user2: ");
                    stackDisplay(u2);
                    System.out.print("\t\tpoint 1= " + point1 + " ");
                    System.out.println("\tpoint 2= " + point2);
                    if (!(r.isEmpty()))
                        temp = (String) r.peek();
                    if (s1.equals(temp.substring(0, 1))) {
                        point2++;
                        f2 = true;
                    } else if (s2.equals(temp.substring(1, temp.length()))) {
                        point2 += 3;
                        f2 = true;
                    } else
                        f2 = false;

                }
            }
            System.out.println();


        }

        System.out.println("User1= " + point1 + "\nUser2= " + point2);
        if (point1 > point2)
            System.out.println("User1 winner");
        else if (point1 < point2)
            System.out.println("User2 winner");
        else
            System.out.println("Tie");


    }
}
