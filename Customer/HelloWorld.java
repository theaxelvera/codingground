public class HelloWorld{

     public static void main(String []args){
        int[][] EmployeePay = { {294, 92},
                                {897, 100},
                                {345, 57} };
        int sum = 0;
        for (int i = 0; i < EmployeePay.length; i++)
            sum += EmployeePay[i][1];
        double average = (double)sum/EmployeePay.length;
        System.out.println(average);
        
     }
}