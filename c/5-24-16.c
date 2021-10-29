#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    float pi = 3.14,rad;
    printf("這是用來算球體面積的程式\n請輸入圓球半徑: ");
    scanf("%f",&rad);
    printf("圓球體積為%f立方單位\n",4/3*pi*rad*rad*rad);
    
    system("pause");
    return 0;
}