package app;

/**
 * 
 * @custom.application_name App
 * @custom.class_name App
 *  
 * @custom.author Daniel C. Landon Jr.
 * @custom.instructor Dr. Bob Walsh
 * @custom.course CSCI 202 - Introduction to Software Systems
 * @custom.date_started 02.05.2020  
 * @custom.date_due 02.06.2020
 * 
 * @custom.class_notes Entry point/clinet for Matrix Class testing
 * 
 * @custom.pre_condition none
 * 
 * @custom.post_condition none
 * 
 * @custom.javadoc_tags In order to use @custom.tag_name in javadocs you must include the folloinwing in the command line to generate the docs. This part must be after you have indicated what files to process;
 * 
 *  ' -tag custom.tag_name:a:"tag_name" '
 * 
 * The first part identifies the tag in the code, the second part in quotes indentifies what will be printed in the javadocs when they are generated. If you do not include this in the command to generate the docs you will get an error/warning.
 * 
 */

public class App {

    /**
     * 
     * @custom.method_name main
     * 
     * @custom.author Daniel C. Landon Jr.
     * @custom.date_started 02.05.2020
     * 
     * @custom.method_notes entry point, no args
     * 
     * @custom.pre_condition none
     * 
     * @custom.post_condition PROGRAM TERMINATED. END OF LINE.
     * 
     */
    public static void main(String[] args) throws Exception {

        // constants
        final int _ROWS = 2;
        final int _COLUMNS = 2;

        // create base matrix for processing
        Matrix _baseMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\nBase Matrix Used For Processing In Application.\n" + _baseMatrix.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end base matrix creation

        // multiply matrix
        Matrix _multiplyMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\nMatrix used to multiply against _baseMatrix.\n" + _multiplyMatrix.toString());
        System.out.println("\nResults of multiplying _multiplyMatrix against _baseMatrix.\n" + _baseMatrix.matrixMultiply(_multiplyMatrix));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end multiply matrix

        // copy matrix
        Matrix _copyMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\n_copyMatrix before copy operation: \n" + _copyMatrix.toString());
        _copyMatrix.matrixCopy(_baseMatrix);
        System.out.println("\n_copyMatrix after copy operation: \n" + _copyMatrix.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end copy matrix

        // equals matrix
        Matrix _equalsMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\nMatrix used to compare against _baseMatrix:\n" + _equalsMatrix.toString());
        System.out.println("\nDoes _equalsMatrix equal _baseMatrix? " + _baseMatrix.matrixEquals(_equalsMatrix) + "\n");
        System.out.println("\nDoes _baseMatrix equal itself? " + _baseMatrix.matrixEquals(_baseMatrix) + "\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end equals matrix

        // scalar multiply
        int _scalarMultiplier = 2;
        System.out.println("\n_baseMatrix before scalar multiplication operation:\n" + _baseMatrix.toString());
        System.out.println("Multiply _baseMatrix by: " + _scalarMultiplier);
        _baseMatrix.matrixScalarMultiply(_scalarMultiplier);
        System.out.println("\n_baseMatrix after scalar multiplication operation: \n" + _baseMatrix.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end scalar multiply

        // matrix add
        Matrix _addMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\n_baseMatrix before add operation:\n" + _baseMatrix.toString());
        System.out.println("\n_addMatrix before add operation:\n" + _addMatrix.toString());
        _baseMatrix.matrixAdd(_addMatrix);
        System.out.println("\n_baseMatrix after add operation:\n" + _baseMatrix.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end matrix add

    } // end main

}  // end app