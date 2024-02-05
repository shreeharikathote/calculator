public class addition {
  float addition(float operand_1,float operand_2)
  {
    return(operand_1+operand_2);
  }
  float subtraction(float operand_1,float operand_2)
  {
    return(operand_1-operand_2);
  }
  float multiplication(float operand_1,float operand_2)
  {
    return(operand_1*operand_2);
  }
  float division(float operand_1,float operand_2)
  {
    return(operand_1/operand_2);
  }
}
public static void main(String args[])
{
    float operand_1 = 10;
    float operand_2 = 5;
    Calculator calc = new calculator();
    float add_result = calc.addition(operand_1, operand_2);
    System.out.println('Result of addition is:'+ add_result);
    float sub_result = calc.subtraction(operand_1, operand_2);
    System.out.println('Result of subtraction is:'+ sub_result);
    float mul_result = calc.multiplication(operand_1, operand_2);
    System.out.println('Result of multiplication is:'+ mul_result);
    float div_result = calc.division(operand_1, operand_2);
    System.out.println('Result of division is:'+ div_result);
}

