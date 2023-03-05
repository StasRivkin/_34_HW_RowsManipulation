package telran.controller;


import telran.infra.Execute;

public class RowsManipulationsAppl {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong value of arguments, must be 3...");
            return;
        }
        Execute.execute(args[0], args[1], args[2]);
    }
}
