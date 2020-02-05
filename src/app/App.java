package app;

/**
 * <h1>App</h1>
 * 
 * <p><strong><em>Notes: </em></strong>Entry point/clinet for Matrix Class testing</p>
 * 
 * <p><strong>author:</strong> <em>Daniel C. Landon Jr.</em></p>
 * <p><strong>instructor:</strong> <em>Dr. Bob Walsh</em></p>
 * <p><strong>class:</strong> <em>CSCI 202 - Introduction to Software Systems</em></p>
 * <p><strong>date:</strong> <em>01.23.2020</em></p>
 * 
 * @author Daniel C. Landon Jr.
 * @version 0.1
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

    } // end main

}  // end app