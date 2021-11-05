#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int num;
    printf("Please enter an interger: ");
    scanf("%d",&num);

    if (num>=0)
    {
        printf("%d 絕對值為%d\n",num,num);
    }
    if (num<0)
    {
        printf("%d 絕對值為%d\n",num,-num);
    }
    
    system("pause");
    return 0;
}