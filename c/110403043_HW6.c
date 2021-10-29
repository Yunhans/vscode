#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    float c,f;
    printf("這是一個華氏溫度轉攝氏溫度的程式\n請輸入華氏溫度: ");
    scanf("%f",&f);
    c = (f-32) * 5/9;
    printf("攝氏溫度為%.1f°C\n",c);
    
    system("pause");
    return 0;
}