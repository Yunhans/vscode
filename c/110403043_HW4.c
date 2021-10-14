// (a) unsigned short int 只有從0~65535,80000超過了,overflow
#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int num=80000;
    printf("%d\n",num);

    system("pause");
    return 0;
}