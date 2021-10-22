#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    char first[15],last[15];
    printf("Please enter your last name:");
    scanf("%s",last);
    printf("Please enter your first name:");
    scanf("%s",first);

    printf("%s %s\n",first,last);
    
    system("pause");
    return 0;
}