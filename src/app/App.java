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
     * <h1>main</h1>
     * 
     * <p><strong><em>Notes: </em></strong>entry point, no args</p>
     * 
     * @custom.precondition none 
     * 
     * @custom.postcondition PROGRAM TERMINATED. END OF LINE.
     */
    public static void main(String[] args) throws Exception {

        // constants
        final int _ROWS = 2;
        final int _COLUMNS = 2;

        // create base matrix for processing
        Matrix _bMatrix = new Matrix(_ROWS, _COLUMNS);

        System.out.println("\nBase Matrix Used For Processing In Application.\n" + _bMatrix.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end base matrix creation

        // multiply matrix
        Matrix _mMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\nMatrix used to multiply against _bMatrix.\n" + _mMatrix.toString());
        System.out.println("\nResults of multiplying _mMatrix against _bMatrix.\n" + _bMatrix.multiplyMatrix(_mMatrix));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end multiply matrix

        // copy matrix
        Matrix _cMatrix = new Matrix(_ROWS, _COLUMNS);
        System.out.println("\n_cMatrix before copy operation\n" + _cMatrix.toString());
        _cMatrix.copyMatrix(_bMatrix);
        System.out.println("\n_cMatrix after copy operation\n" + _cMatrix.toString());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // end copy matrix

    } // end main

}  // end app