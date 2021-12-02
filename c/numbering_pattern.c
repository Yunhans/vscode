#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a,b,i;
    printf("--Numberling pattern--\n");
    printf("Length of number sequence:");
    scanf("%d",&a);
    printf("Numbers of column per row:");
    scanf("%d",&b);

    for(i=1;i<=a;i++){
        printf(" %2d ",i);
        if(i%b==0){
            printf("\n");
        }
    }

    //system("pause");
    return 0;
}