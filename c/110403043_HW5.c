#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int num;
    printf("Please enter a hexadecimal integer:");
    scanf("%x",&num);

    printf("The octal equivalent of the hexadecimal number %x is %o\n",num,num);
    printf("The decimal equivalent of the hexadecimal number %x is %d\n",num,num);
    
    system("pause");
    return 0;
}