package jp.ac.uryukyu.ie.e215723;

public class Week1 {
    public static void printMatrix(double[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.printf("%5.1f", matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static double[][] computeAddMatrix(double[][] matrix1, double[][] matrix2){
        if (matrix1.length == matrix2.length){
            if (matrix1[0].length == matrix2[0].length){
                if ( matrix1.length == 3){
                    double[][] sum23 = new double[3][2];
                    for (int i = 0; i < matrix1.length; i++){
                        for (int j = 0; j < matrix1[0].length; j++){
                            sum23[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    
                    return sum23;
                }else{
                    double[][] sum22 = new double[2][2];
                    for (int i = 0; i < matrix1.length; i++){
                        for (int j = 0; j < matrix1[0].length; j++){
                            sum22[i][j] = matrix1[i][j] + matrix2[i][j];
                        }
                    }
                    
                    return sum22;
                }
                
            }else{
                System.err.println("列がおかしい");
                System.exit(0);
                return matrix1;
            }

        }else{
            System.err.println("行がおかしい");
            System.exit(0);
            return matrix1;
        }

    }
    

    public static void main(String[] args){
        double[][] matrix22_1 = {{0., 1.}, {2., 3.}};
        double[][] matrix22_2 = {{4., 5.}, {6., 7.}};
        double[][] matrix23_1 = {{0., 1.}, {2., 3.}, {4., 5.}};
        double[][] matrix23_2 = {{6., 7.}, {8., 9.}, {10., 11.}};


        System.out.println("\n# printMatrixの動作確認");
        printMatrix(matrix22_1);

        //以下は computeAddMatrix メソッドを実装したあとで実行する内容。
        System.out.println("\n# matrix22_1 + matrix22_2");
        double[][] level2_1 = computeAddMatrix(matrix22_1, matrix22_2);
        printMatrix(level2_1);

        System.out.println("\n# matrix23_1 + matrix23_2");
        double[][] level2_2 = computeAddMatrix(matrix23_1, matrix23_2);
        printMatrix(level2_2);

        System.out.println("\n# 行列サイズが異る場合");
        double[][] level2_3 = computeAddMatrix(matrix22_1, matrix23_1);
    }
}