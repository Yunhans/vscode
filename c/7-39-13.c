#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n,i=0,add=0;

    do{
        printf("Please enter a positive even number:");
        scanf("%d",&n);
    }while(n%2!=0||n<=0);

    while(i<n){
        i+=2;
        add+=i;
    }

    printf("2+4+6+...+%d=%d",n,add);

    system("pause");
    return 0;
}