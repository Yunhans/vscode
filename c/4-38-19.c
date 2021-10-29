#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    char ch;

    printf("Input a charcter: ");
    ch = getchar();
    printf("ch=%c,ASCII code is %d\n",ch,ch);

    system("pause");
    return 0;
}