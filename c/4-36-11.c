#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int school,age;
    printf("請輸入學號:");
    scanf("%d",&school);
    printf("請輸入年齡:");
    scanf("%d",&age);

    printf("你的學號是：%d而且你的年齡是%d\n",school,age);

    system("pause");
    return 0;
}