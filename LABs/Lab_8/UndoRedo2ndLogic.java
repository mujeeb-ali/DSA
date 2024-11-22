package Lab_8;

import java.util.Scanner;

public class UndoRedo2ndLogic {



        Scanner cin = new Scanner(System.in);
        Stacks_in_LinkedList undo = new Stacks_in_LinkedList();
        Stacks_in_LinkedList redo = new Stacks_in_LinkedList();
        Stacks_in_LinkedList stack = new Stacks_in_LinkedList();

        public void undoRedoProgram(int choice) {
            if (choice == 1) {
                System.out.print("Choice 1 : input ");
                String inp = cin.nextLine();
                stack.push(inp);

            } else if (choice == 2) {
                if (!stack.isEmpty()) {
                    undo.push(stack.pop());
                    System.out.println("Undo Successful ");
                } else {
                    System.out.println("Nothing to undo");
                }
            } else if (choice == 3) {
                if (!undo.isEmpty()) {
                    stack.push(undo.pop());
                    System.out.println("Redo Successful ");
                } else {
                    System.out.println("Nothing to redo");
                }
            } else if (choice == 4) {
                stack.printStack();
                System.out.println("\nThanks For Using this ");
            }

        }

        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            UndoRedo2ndLogic u = new UndoRedo2ndLogic();

            while (true) {
                System.out.print("Enter Your Choise : ");
                int choice = cin.nextInt();
                cin.nextLine();
                u.undoRedoProgram(choice);
                if (choice <= 0 || choice >= 4) {
                    break;
                }
            }
        }
    }


