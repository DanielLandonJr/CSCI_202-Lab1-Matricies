package app;

/**
 * <h1>Matrix</h1>
 * 
 * <p><strong><em>Notes: </em></strong>This class generates a matrix using a constructor with argumens. It has various methods that can be called to manipulate the matrix</p>
 * 
 * <p><strong>author:</strong> <em>Daniel C. Landon Jr.</em></p>
 * <p><strong>instructor:</strong> <em>Dr. Bob Walsh</em></p>
 * <p><strong>class:</strong> <em>CSCI 202 - Introduction to Software Systems</em></p>
 * <p><strong>date:</strong> <em>01.23.2020</em></p>
 * 
 * @author Daniel C. Landon Jr.
 * @version 0.1
 */

public class Matrix {

    // class variables
    private int _row = 0; // rows
    private int _col = 0; // columns
    private int[][] _data; // Keanu

    /**
     * <h1>Matrix constructor</h1>
     * 
     * <p><strong><em>Notes: </em></strong>Constructor that creates the initial matrix</p>
     * 
     * @custom.precondition create instance of object and supply starting values to create a matrix. 
     * 
     * @custom.postcondition matrix is created
     * @param _row the number of rows to create
     * @param _col the number of columns to create
     */
    public Matrix(int _row, int _col) {
        // set internal variables
        this._row = _row;
        this._col = _col;

        //initialize the matrix
        this._data = new int[this._row][this._col]; // keanu lives

        // loop _loopRow
        for(int _loopRow = 0; _loopRow < this._row; _loopRow++){
            
            // loop _loopCol
            for(int _loopCol = 0; _loopCol < this._col; _loopCol++){

                // populate the matrix
                this._data[_loopRow][_loopCol] = (int)(Math.random() * 4 + 1);

            } // end for _loopCol

        } // end for _loopRow

    } // end Matrix constructor

    /**
     * <h1>toString</h1>
     * 
     * <p><strong><em>Notes: </em></strong>Returns a string that contains the matrice.</p>
     * 
     * @custom.precondition matrix must be created
     * 
     * @custom.postcondition string containg the matrix is returned
     * 
     * @return the matrix in string format
     */
    public String toString(){

        // varaibles
        String _ans = "";

        // loop row
        for(int _loopRow = 0; _loopRow < this._row; _loopRow++){
            
            // loop col
            for(int _loopCol = 0; _loopCol < this._col; _loopCol++){

                // create return for matrix
                _ans+= _data[_loopRow][_loopCol] + "\t";

            } // end for _loopCol

            // create final output
            _ans+= "\n";

        } // end for _loopRow

        return _ans;

    } // end toString

    /**
     * <h1>addMatrix</h1>
     * 
     * <p><strong><em>Notes: </em></strong>Takes two matricies and adds them together</p>
     * 
     * @custom.precondition two matrix must be supplied
     * 
     * @custom.postcondition return a matrix containing the results of adding two supplied matrix together.
     * 
     * @param _matrixArgs matrix to add to _data matrix
     * @return matrix with added values otherwise echos back supplied matrix from args
     */
    public Matrix addMatrix(Matrix _matrixArgs) {

        // if we get here there is a problem so echo _matrixArgs
        return _matrixArgs;
    } // end addMatrix

    /**
     * 
     * @param _matrix
     * @return
     */
    public Matrix copyMatrix(int[] _matrix) {

        return _matrix;

    } // end copyMatrix

    /**
     * <h1>multiplyMatrix</h1>
     * 
     * <p><strong><em>Notes: </em></strong>Takes two Matricies and multiplies them together.</p>
     * 
     * @custom.precondition two matrix must be supplied
     * 
     * @custom.postcondition return a matrix containing the results of multiplying two supplied matrix together.
     * 
     * @param _m2 matrix to multiply against this._data
     * @return matrix containing multipled matrix, if problem will echo back supplied matrix from args
     */
    public Matrix multiplyMatrix(Matrix _m2) {

        try {
            
            // check to see if this._col = _m2._row
            if(this._col != _m2._row){
            
                System.out.println("Matrix Size Incorrect!");
    
                throw new RuntimeException();
            
            } // end if

            // create new matrix to contain new values
            Matrix _m3 = new Matrix(this._row, _m2._col);
    
            // loop row
            for(int _loopRow = 0; _loopRow < this._data.length; _loopRow++){
    
                // loop col
                for(int _loopCol = 0; _loopCol < this._data.length; _loopCol++) {

                    // new matrix contains daat so set to zero
                    _m3._data[_loopRow][_loopCol] = 0;

                    // loop k
                    for(int _x = 0; _x < _m2._data.length; _x++) {
    
                        // do the math and update matrix
                        _m3._data[_loopRow][_loopCol] += this._data[_loopRow][_x] * _m2._data[_x][_loopCol];
    
                    } // end for _x
    
                } // end for _loopCol
    
            } // end for _loopRow
    
            return _m3;

        } // end try 

        catch (Exception e) {
            System.out.println("WOOT BAM! ... Sumo Ninja Strikes");
        } // end catch

        // if we get here the arrays were not multiplied so echo arg array
        return _m2;

    } // end mulltiplyMatrix
    
} // end Matrix