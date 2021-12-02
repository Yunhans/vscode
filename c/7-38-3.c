#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int i,n,sum=0;
    printf("Please enter an odd number:");
    scanf("%d",&n);

    for(i=1;i<=n;i+=2){
        sum+=i;
    }
    printf("1+3+5+...+%d=%d",n,sum);

    system("pause");
    return 0;
}