#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    char ch ='a';

    printf("小寫%c為%c\n",ch,ch);
    ch = ch - 32;
    printf("大寫%c為%c\n",ch,ch);
    
    system("pause");
    return 0;
}
