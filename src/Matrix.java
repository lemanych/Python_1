import java.util.Scanner;
 
public class Matrix
{
    
	public static void matrixCalc(Scanner sc) {
        System.out.print("������ ������� �����: ");  
        int row = sc.nextInt();
         
        System.out.print("������ ������� �������: "); 
        int cols = sc.nextInt();
         
        int[][] matrix1 = new int[row][cols];
         
        int[][] matrix2 = new int[row][cols];
         
        int[][] result = new int[row][cols];
         
        System.out.println("������� ������ ��������� ���:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
            	if((((i+1)%2 == 1 && j > i) || ((i+1)%2 == 0 && i > j ))&& (row > 1) && (cols > 1))
            		matrix1[i][j] = 0;
            	else
            		matrix1[i][j] = 1;
            	System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("������ ��� ��� ������� ������ ��������.");
        
        System.out.println("��� ����� �������:");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
            	if( !(((i+1)%2 == 1 && j > i) || ((i+1)%2 == 0 && i > j )))
            		matrix1[i][j] = sc.nextInt();
            }
        }
         
        System.out.println("��� ����� �������:"); 
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
            	if( !((((i+1)%2 == 1 && j > i) || ((i+1)%2 == 0 && i > j ))&& (row > 1) && (cols > 1) ))
            		matrix2[i][j] = sc.nextInt();

            }
        }

        System.out.println("����� ������� = ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix1[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        System.out.println("����� ������� = ");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                System.out.print(matrix2[i][j]+"\t");
            }
             
            System.out.println();
        }
        
        String err = "";
        do {
        System.out.print("������ ���� ��������: ");
        String operation = sc.next();
        switch (operation)  {
        case "+":
        	addition(row, cols, matrix1, matrix2, result);
        	err = "";
        	break;
        	
        case "-":
        	subtraction(row, cols, matrix1, matrix2, result);
        	err = "";
        	break;
        	
        case "*":
        	product(row, cols, matrix1, matrix2, result);
        	err = "";
        	break;
        	
        default:
        	err = "������������ ����!";
        	System.out.println(err);
        } 
        }while (err.equals("������������ ����!"));

	}
	public static void addition(int row, int cols, int[][] matrix1, int[][] matrix2, int[][] sum) 
    {    
      
        System.out.println("���� = ");
         
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                 
                System.out.print(sum[i][j]+"\t");
            }
             
            System.out.println();
        }
    }
	
	public static void subtraction(int row, int cols, int[][] matrix1, int[][] matrix2, int[][] sub) {
	
		System.out.println("г����� = ");
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				sub[i][j] = matrix1[i][j] - matrix2[i][j];
				
				System.out.print(sub[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void product(int row, int cols, int[][] matrix1, int[][] matrix2, int[][] product) {
	
		System.out.println("������� = ");
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				for (int k = 0; k < cols; k++)
				{
					product[i][j] +=  matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				System.out.print(product[i][j]+"\t");
			}
			
			System.out.println();
		}
	}
	
}