import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner _inputConsole = new Scanner(System.in);

        int _choice = 0;

        do {
            System.out.println("Please select an option\n1)The first option\n2)The second option");
            String _numberOfOptionStr = _inputConsole.nextLine();
            _choice = choosingAnOption(_numberOfOptionStr);
        } while (_choice < 1 || _choice > 2);


        System.out.println("Please enter the text:");
        String _text = _inputConsole.nextLine();


        int _numberForMethods = 0;
        do {
            System.out.println("Please enter a number to work with the methods:");
            String _numberForMethodsStr = _inputConsole.nextLine();
            _numberForMethods = integerCheck(_numberForMethodsStr);
        } while (_numberForMethods <= 0);

        String _result = "";
        int _action = 0;

        if (_choice == 1) {
            KeepWordsLength _worker = new KeepWordsLength();

            do {
                System.out.println("""
                        Please select an action
                        1)A method for deleting words of a given length ending in a vowel letter.
                        2)Leave only the words of the specified length""");
                String _numberOfOptionStr = _inputConsole.nextLine();
                _action = choosingAnOption(_numberOfOptionStr);
            } while (_action < 1 || _action > 2);


            if (_action == 1){
                _result = _worker.removeWordsEndingWith(_text, _numberForMethods);
            } else {
                _result = _worker.keepWordsOfSpecifiedLength(_text, _numberForMethods);
            }
            System.out.println(_result);


        } else {
            RemovingWordsConsonantsEnd _worker = new RemovingWordsConsonantsEnd();

            do {
                System.out.println("""
                        Please select an action
                        1)A method for deleting words of a given length ending in a consonant letter.
                        2)Leave only the words of the specified length""");
                String _numberOfOptionStr = _inputConsole.nextLine();
                _action = choosingAnOption(_numberOfOptionStr);
            } while (_action < 1 || _action > 2);

            if (_action == 1){
                _result = _worker.removeWordsEndingWith(_text, _numberForMethods);
            } else {
                _result = _worker.keepWordsOfSpecifiedLength(_text, _numberForMethods);
            }
            System.out.println(_result);

        }




    }


    private static int integerCheck(String _input) {
        int _result;
        try {
            _result = Integer.parseInt(_input);
            return _result;
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number input, try again");
        }
        return 0;
    }


    private static int choosingAnOption(String _choose) {
        int _operation = integerCheck(_choose);

        if (_operation == 1 || _operation == 2) {
            return _operation;
        }
        return 0;
    }
}