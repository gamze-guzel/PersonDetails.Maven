package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {

        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        Person[] aArr = new Person[personArray.length];
        while (counter < personArray.length) {
            Person currentPerson = personArray[counter];
            String sPerson = currentPerson.toString();
            result += sPerson;
            counter++;
        }
        return result;
    }


        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop





    public String forLoop() {
        String result = "";
        int counter = 0;
        Person[] aArr = new Person[personArray.length];
        for (int i=0; i< getPersonArray().length; i++) {
            Person currentPerson = personArray[counter];
            String sPerson = currentPerson.toString();
            result += sPerson;
            counter++;
        }
        return result;



        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop


    }



    public String forEachLoop() {
        String result = "";
        int counter = 0;
        Person[] aArr = new Person[personArray.length];
        for (Person s : personArray) {
            String sPerson = s.toString();
            result += sPerson;
            counter++;
        }
        return result;
    }









        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop




    public Person[] getPersonArray() {
        return personArray;
    }
}
